package com.Cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.Cognizant.dao.ExeQuery;
import com.Cognizant.dao.User;



@Component
public class Service {
	
	static User obj ;
	
	@Autowired
	ExeQuery query;
	public ModelAndView login(String email,String password) {
		obj = query.getUser(email);
		
		if(obj!=null && obj.getPassword().equals(password)) {
			ModelAndView mv = MvSetter();
		    return mv;
		}
		else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("login");
		    mv.addObject("Message", "Login failed");
		    return mv;
		}
	}
	
	public ModelAndView signup(String email,String password,String name) {
		
		if(query.addUser(email, name, password)>0) {
			obj = new User(email,name,password,0,0);
			ModelAndView mv = MvSetter();
		    return mv;
		}
		else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signup");
		    mv.addObject("Message", "Signup failed");
		    return mv;
		}
	}
	
	public ModelAndView budgetSetter(int budget) {
		
		query.updateBudget(budget, obj.getEmail());
		obj = query.getUser(obj.getEmail());
		
		return MvSetter();
		
	}
	
	public ModelAndView expenseSetter(int expense) {
		expense = expense+obj.getExpense();
		if(expense>obj.getBudget()) {
			 
			
			ModelAndView mv = MvSetter();
			mv.addObject("output", "Your expense exceeded your budget");
			return mv;
		}
		else {
			query.updateExpense(expense, obj.getEmail());
			obj = query.getUser(obj.getEmail());
			
			return MvSetter();
		}
	}
	
	public ModelAndView MvSetter() {
		 ModelAndView mv = new ModelAndView();
		mv.setViewName("Dashboard");
	    mv.addObject("Budget", obj.getBudget());
	    mv.addObject("Expense", obj.getExpense());
	    mv.addObject("name", obj.getName());
	    mv.addObject("output", "");
	    return mv;
	   
	}

}
