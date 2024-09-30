package com.digitalworks2020.dao;

import java.util.HashMap;
import java.util.Map;

import com.digitalworks2020.uto.User;

public class UserDAOImpl implements UserDAO {

	Map<Integer,User> users = new HashMap<>();
	
	@Override
	public void create(User user) {
		users.put(user.getId(), user);
	}

	@Override
	public User read(int id) {
		return users.get(id);
	}

	@Override
	public void update(User user) {
	}

	@Override
	public void delete(int id) {
	}

}
