/**
 * 
 */
package com.edu.sms.logicImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.edu.sms.daoImpl.StudentDao;
import com.edu.sms.daoImpl.StudentDaoImpl;
import com.edu.sms.entity.StudentBean;
import com.edu.sms.logic.StudentLogic;
import com.edu.sms.model.Student;

/**
 * @author ranjit.soni
 *
 */
@Component
public class StudentLogicImpl implements StudentLogic, InitializingBean {

	public Long save(Student student) {
		StudentBean studentBean = new StudentBean();
		BeanUtils.copyProperties(student, studentBean);
		System.out.println("studentBean Logic Data :"+studentBean.toString());
		StudentDao studentDao = new StudentDaoImpl();
		studentBean = studentDao.save(studentBean);
		return studentBean.getStudentId();
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterProperties Set method called");
	}

	

}
