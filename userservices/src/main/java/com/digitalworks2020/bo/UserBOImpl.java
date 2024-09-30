package com.digitalworks2020.bo;

import com.digitalworks2020.uto.User;
import com.digitalworks2020.dao.UserDAO;
import com.digitalworks2020.dao.UserDAOImpl;


public class UserBOImpl implements UserBO {

	private static UserDAO dao = new UserDAOImpl();
	@Override
	public void create(User user) {			
		dao.create(user);
	}

	@Override
	public User findUser(int id) {
		return dao.read(id);
	}

}
