package com.ngs.REST_Jersey_GET_XML_Repository;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "persons" path)
 */
@Path("persons")
public class MyResource {

	PersonRepository repo=new PersonRepository();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Person> getPersons() {
    	  	
        return repo.getPersons();
    }
}
