/**
 * 
 */
package com.edu.sms.daoImpl;

import org.springframework.stereotype.Repository;

import com.edu.sms.entity.StudentBean;

/**
 * @author ranjit.soni
 *
 */
@Repository
public interface StudentDao {
	
	public StudentBean save(StudentBean studentBean);
}
