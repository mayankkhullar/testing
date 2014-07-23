package com.mayank.MyAppJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.mayank.MyAppDomain.test;

public class UserExtractor implements ResultSetExtractor {

	@Override
	public Object extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		// TODO Auto-generated method stub
		 test t1 = new test();
		
	   
		t1.setAge(rs.getInt("age"));
		t1.setId(rs.getInt("id"));
		t1.setFirstname(rs.getString("firstname"));
		t1.setLastname(rs.getString("lastname"));
		
		
		
		return t1;
	}
	
}


