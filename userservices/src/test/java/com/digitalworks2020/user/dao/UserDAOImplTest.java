package com.digitalworks2020.user.dao;

import com.digitalworks2020.uto.User;
import com.digitalworks2020.dao.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserDAOImplTest {
	
	@Test
	public void createShouldCreateAUser() {
		UserDAO dao = new UserDAOImpl();
		User user = new User();
		user.setId(1);
		user.setName("Manideep");
		user.setEmail("manideep@gmail.com");
		dao.create(user);
		
		User result = dao.read(1);
		assertNotNull(result);
		assertEquals("Manideep",result.getName());
	}
}
