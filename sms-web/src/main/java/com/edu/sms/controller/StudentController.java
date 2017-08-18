/**
 * 
 */
package com.edu.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edu.sms.logic.StudentLogic;
import com.edu.sms.logicImpl.StudentLogicImpl;
import com.edu.sms.model.Student;

/**
 * @author ranjit.soni
 *
 */

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping(value="/admission", method = RequestMethod.GET)
	public ModelAndView inputForm(ModelMap map)
	{
		ModelAndView modelAndView = new ModelAndView("admissionForm");
		return modelAndView;
	}

	@RequestMapping(value="submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student, BindingResult result)
	{
		ModelAndView modelAndView = null;
		if(result.hasErrors())
		{
			modelAndView = new ModelAndView("admissionForm");
			return modelAndView;
		}		

		StudentLogic studentLogic = new StudentLogicImpl();
		Long studentId = studentLogic.save(student);

		modelAndView = new ModelAndView("output");
		modelAndView.addObject("student", student);
		modelAndView.addObject("studentId", studentId);

		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView sayHello(ModelMap map)
	{
		ModelAndView modelAndView = new ModelAndView("welcome");
		map.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return modelAndView;
	}
	
	@RequestMapping(value="/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
	
}
