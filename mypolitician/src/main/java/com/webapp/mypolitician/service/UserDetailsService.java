package com.webapp.mypolitician.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.mypolitician.module.UserDetailsModule;
import com.webapp.mypolitician.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	public UserDetailsModule saveUserDetails(UserDetailsModule userDetailsModule) {
	
		return userDetailsRepository.save(userDetailsModule);
	}

	public List<UserDetailsModule> getAllUserDetails() {
		
		return (List<UserDetailsModule>)userDetailsRepository.findAll();
	}

	public UserDetailsModule getUserDetailsById(int id) {
		// TODO Auto-generated method stub
		return userDetailsRepository.findById(id);
	}

	public UserDetailsModule updateUserDetailsModule(UserDetailsModule userDetailsModule) {
	
		return userDetailsRepository.save(userDetailsModule);
	}

	public void deleteAllUserDetails() {
		userDetailsRepository.deleteAll();
		
	}

	public void deleteuserDetailsById(int id) {
		userDetailsRepository.deleteById(id);
		
	}

	public List<UserDetailsModule> getAllUserDetailsByWard(int wardNumber) {
	
		return (List<UserDetailsModule>)userDetailsRepository.findByWardNumber(wardNumber);
	}

	 
	

}
