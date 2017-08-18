/**
 * 
 */
package com.edu.sms.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.edu.sms.context.ApplicationContextHolder;
import com.edu.sms.entity.StudentBean;

/**
 * @author ranjit.soni
 *
 */
public class StudentDaoImpl implements StudentDao, InitializingBean {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	public StudentBean save(StudentBean student) {
		Session session = ApplicationContextHolder.getApplicationContext().getBean(StudentDaoImpl.class).sessionFactory.openSession();
		//Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(student);
		tx.commit();
		session.close();
		
		return student;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("StudentDaoImpl afterPropertiesSet method is calledsss");
	}
}
