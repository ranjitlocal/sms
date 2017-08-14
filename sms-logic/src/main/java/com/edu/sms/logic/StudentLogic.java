/**
 * 
 */
package com.edu.sms.logic;

import org.springframework.stereotype.Component;

import com.edu.sms.model.Student;

/**
 * @author ranjit.soni
 *
 */

@Component
public interface StudentLogic {
	public void save(Student student);
}
