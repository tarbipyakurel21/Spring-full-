package com.tarbi.springmvcboot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tarbi.springmvcboot.model.Alien;

import jakarta.transaction.Transactional;

@Component
public class AlienDao {

	@Autowired
	 private SessionFactory sessionFactory;
	 

@Transactional
public List<Alien> getAliens(){
	
	Session session= sessionFactory.getCurrentSession();
	List<Alien> aliens=session.createQuery("from Alien",Alien.class).list();
	
	return aliens;
	
}

@Transactional
public void addAlien(Alien a) {
	
	Session session= sessionFactory.getCurrentSession();
	session.save(a);
}

@Transactional
public Alien getAlien(int aid) {
	Session session=sessionFactory.getCurrentSession();
	Alien a= session.get(Alien.class,aid);
	return a;
}
	
}
  