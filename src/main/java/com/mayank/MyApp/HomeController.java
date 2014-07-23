package com.mayank.MyApp;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mayank.MyAppDao.UserDao;
import com.mayank.MyAppDomain.test;
import com.mayank.MyAppService.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
@Autowired
UserDao userDao;
@Autowired	
UserService userService;	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
			List<test> list=userService.getList();
			model.addAttribute("list",list);
		
	
		return "home";
	}
		
		
	

	
}
