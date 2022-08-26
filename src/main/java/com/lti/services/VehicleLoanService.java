package com.lti.services;

import java.util.List;

import com.lti.entity.User;

public interface VehicleLoanService {
	
	public User createUser(User user);
	
	public List<User> viewAllUser();
	
	public User updateUser(int userId, User user);

}
