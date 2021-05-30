package com.webapp.mypolitician.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.mypolitician.module.UserDetailsModule;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetailsModule, Integer> {
	
	UserDetailsModule findById(int id);
	List<UserDetailsModule> findByWardNumber(int wardNumber);
}
