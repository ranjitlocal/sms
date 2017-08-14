/**
 * 
 */
package com.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;

import com.edu.sms.dao.StudentDao;
import com.edu.sms.entity.StudentBean;

/**
 * @author ranjit.soni
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {
	
	public void save(StudentBean studentBean) {
		System.out.println("StudentBean Dao Data :"+studentBean.toString());
	}
}
