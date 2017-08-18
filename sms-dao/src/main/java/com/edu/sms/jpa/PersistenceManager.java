/**
 * 
 */
package com.edu.sms.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sms.context.ApplicationContextHolder;

/**
 * @author ranjit.soni
 *
 */
@Service
public class PersistenceManager implements InitializingBean {
	
	public PersistenceManager()
	{
		super();
	}
	
	private static PersistenceManager persistenceManager;
	
	private static EntityManagerFactory entityManagerFactory;
	
	/*public static EntityManagerFactory getEntityManagerfactoryBean()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("sms-jpa");
		return entityManagerFactory;
		return entityManagerFactory;
	}
	*/
	public static EntityManager getEntityMangerInstance()
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		return em;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("PersistenceManager's afterpropertieSet method called");
	}
	
	public static PersistenceManager getInstance()
	{
		persistenceManager = ApplicationContextHolder.getApplicationContext().getBean(PersistenceManager.class);
		return persistenceManager;
	}
}
