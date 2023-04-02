package com.Cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Cognizant.dao.User;
import com.Cognizant.service.Service;

@Controller
public class HomeController {
	
	@Autowired
	Service service;
	
	
	
	     @RequestMapping("/LOGIN")
         public String method_1() {
	    	 return "login";
	     }
	     
	     @RequestMapping("/SIGNUP")
         public String method_2() {
	    	 return "signup";
	     }
	     
	     @PostMapping("LOGIN_INTO")
	     public ModelAndView login(@RequestParam("email") String email,@RequestParam("password") String password,ModelAndView mv) {
	    	 
	    	
	    	 return service.login(email, password);
	    	 
	     }
	     @PostMapping("SIGNUP_INTO")
	     public ModelAndView signup(@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("name") String name,ModelAndView mv) {
	    	 
	    	
	    	
	    	 return service.signup(email, password, name);
	    	 
	     }
	     
	     @PostMapping("setbudget")
	     public ModelAndView setBudget(@RequestParam("budget") int budget) {
	    	 
	    	return service.budgetSetter(budget);
	    	 
	     }
	     
	     @PostMapping("setexpense")
	     public ModelAndView setExpense(@RequestParam("expense") int expense) {
	    	 return service.expenseSetter(expense);
	     }
	     
}
