package com.tarbi.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        
    	
     ApplicationContext factory= new ClassPathXmlApplicationContext("spring.xml");
    	Alien obj1=(Alien)factory.getBean(Alien.class);
    	obj1.code();
    	obj1.age=15;
    	
    	Alien obj2=(Alien)factory.getBean(Alien.class);
    	obj2.code();
    	
    }
}
