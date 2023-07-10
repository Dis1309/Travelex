package com.example.finalProject.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.finalProject.model.userApi;

public interface Userservice extends CrudRepository<userApi,String> 
{
	@Query("from userApi")
	List<userApi> all();
    
}