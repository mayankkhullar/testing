package com.mayank.MyAppJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.mayank.MyAppDomain.*;

public class UserRowMapper implements RowMapper<test> {

	@Override
	public test mapRow(ResultSet rs, int RowNum) throws SQLException {
		UserExtractor userExtractor = new UserExtractor();
		return  (test) userExtractor.extractData(rs);
		
		
		// TODO Auto-generated method stub
	
	}
	



}
