package com.tarbi.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarbi.springmvcboot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>{

public List<Alien> findByAname(String aname);	//Query DSL
	

	
} 
