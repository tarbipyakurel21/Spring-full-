package com.tarbi.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tarbi.demo2.model.Alien;
import com.tarbi.demo2.repo.AlienRepo;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= SpringApplication.run(App.class,args);
    	
    	Alien alien1= context.getBean(Alien.class);
    	alien1.setId(1);
    	alien1.setName("Navin");
    	alien1.setTech("Engineer");
    	
    	AlienRepo repo= context.getBean(AlienRepo.class);
    	repo.save(alien1);
    	
    	System.out.println(repo.findAll());
    	
    }
}
 

