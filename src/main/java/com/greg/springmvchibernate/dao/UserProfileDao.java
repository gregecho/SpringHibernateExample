package com.greg.springmvchibernate.dao;

import java.util.List;

import com.greg.springmvchibernate.model.UserProfile;

public interface UserProfileDao {
	 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}