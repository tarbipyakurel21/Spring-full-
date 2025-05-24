package com.tarbi.app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser,Integer> {

	AppUser findByUsername(String username);
	
}
