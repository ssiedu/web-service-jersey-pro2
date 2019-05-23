package com.ssi.firstws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("testing")
public class TestResource {

	@Path("company")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showMessage(){
		return "Welcome To SSI";
	}
	
	@Path("address")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showAddress(){
		return "Bhanwar Kua ,Indore";
	}
	
}
