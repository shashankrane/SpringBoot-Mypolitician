package com.webapp.mypolitician.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.mypolitician.module.UserDetailsModule;
import com.webapp.mypolitician.service.UserDetailsService;

@RestController
@RequestMapping("/api")
public class UserDetailsController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("/save_user_details")
	public UserDetailsModule saveUserDetails(@RequestBody UserDetailsModule userDetailsModule) {
		UserDetailsModule user = userDetailsService.saveUserDetails(userDetailsModule);
		return user;
		
	}
	
	@GetMapping("/getAll_user_details")
	public List<UserDetailsModule> getAllUserDetails(){
		List<UserDetailsModule> user = userDetailsService.getAllUserDetails();
		return user;
	}
	
	
	@GetMapping("/get_user_details_by_id/{id}")
	public UserDetailsModule getUserDetailsById(@PathVariable int id) {
		UserDetailsModule user = userDetailsService.getUserDetailsById(id);
		return user;
	}
	
	@GetMapping("/get_user_details_by_ward/{wardNumber}")
	public List<UserDetailsModule> getAllUserDetailsByWard(@PathVariable int wardNumber){
		List<UserDetailsModule> user = userDetailsService.getAllUserDetailsByWard(wardNumber);
		return user;
	}
	
	@PutMapping("/update_user_details")
	public UserDetailsModule updateUserDetailsModule(@RequestBody UserDetailsModule userDetailsModule) {
		UserDetailsModule user = userDetailsService.updateUserDetailsModule(userDetailsModule);
		return user;
	}
	
	@DeleteMapping("/delete_all_user_details")
	public void deleteAllUserDetails() {
	userDetailsService.deleteAllUserDetails();
	}
	
	@DeleteMapping("/delete_user_details_by_id/{id}")
	public void deleteuserDetailsById(@PathVariable int id) {
		userDetailsService.deleteuserDetailsById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
