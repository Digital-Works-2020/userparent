package com.digitalworks2020.dao;

import com.digitalworks2020.uto.User;

public interface UserDAO {

	void create(User user);
	
	User read(int id);
	
	void update(User user);
	
	void delete(int id);
}
