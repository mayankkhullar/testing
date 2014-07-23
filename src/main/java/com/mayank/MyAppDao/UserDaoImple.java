package com.mayank.MyAppDao;
import javax.sql.DataSource;
import com.mayank.MyAppDomain.*;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mayank.MyAppJdbc.UserRowMapper;


public class UserDaoImple implements UserDao {
@Autowired 
DataSource dataSource;


	@Override
	public List<test> getList() {
		List<test>  list= new ArrayList<test>();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "Select * from test" ;
		
		list =jdbcTemplate.query(sql , new UserRowMapper());
				
return list;
	
	}	

}