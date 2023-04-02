package com.Cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

@Component
public class ExeQuery {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int addUser(String email,String name,String password) {
		try 
		{
	    return jdbcTemplate.update(
	      "INSERT INTO User VALUES (?, ?, ?, ?, ?)", email,name ,password, 0,0);
		}
		catch(Exception e) {
			
			return 0;
		}
	}
	
	public User getUser(String email) {
		String query = "select * from user where email = "+"'"+email+"'";
		try
		{
		return jdbcTemplate.query(query,new ResultSetExtractor<User>(){  
		    @Override  
		     public User extractData(ResultSet rs) throws SQLException
		             {  
		    	User user = new User();
                rs.next();
		        user.setEmail(rs.getString("email"));
		        user.setName(rs.getString("name"));
		        user.setPassword(rs.getString("password"));
		        user.setExpense(rs.getInt("expense"));
		        user.setBudget(rs.getInt("Budget"));

		        return user; 
		        }  
		    });  
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public User updateBudget(int budget,String email) {
		
		jdbcTemplate.update(
			      "update user set budget = ?,expense = 0 where email = ?", budget,email);
		
		return getUser(email);
		
	}
	
public User updateExpense(int expense,String email) {
		
		jdbcTemplate.update(
			      "update user set expense = ? where email = ?", expense,email);
		
		return getUser(email);
		
	}
	
	

}
