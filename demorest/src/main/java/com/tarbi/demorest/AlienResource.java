package com.tarbi.demorest;

import java.util.Arrays;
import java.util.List;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("aliens")
public class AlienResource {
	
	AlienRepository repo=new AlienRepository();

@GET
@Produces(MediaType.APPLICATION_XML)
public List<Alien> getAliens() {
	

	return repo.getAliens();
	
	
}

@GET
@Path("alien/{id}")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Alien getAlien(@PathParam("id") int id) {
	
	return repo.getAlien(id);
}

@POST
@Path("alien")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Alien createAlien(Alien a1) {
	
	System.out.println(a1);
	repo.create(a1);
	return a1;
	
}
@PUT
@Path("alien")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Alien updateAlien(Alien a1) {
	
	System.out.println(a1);
	if(repo.getAlien(a1.getId()).getId()==0) {
	
		repo.create(a1);
	}
	else{
		repo.update(a1);
	}
	return a1;
	
}

@DELETE
@Path("alien/{id")
public Alien killAlien(@PathParam("id") int id) {
	
	Alien a =repo.getAlien(id);
	
	if(a.getId()!=0) {
	repo.delete(id);
	}
	return a;
	
	
	
}

}
