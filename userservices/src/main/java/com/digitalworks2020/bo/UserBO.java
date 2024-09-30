package com.digitalworks2020.bo;

import com.digitalworks2020.uto.User;

public interface UserBO {
	void create(User user);
	
	User findUser(int id);
}
