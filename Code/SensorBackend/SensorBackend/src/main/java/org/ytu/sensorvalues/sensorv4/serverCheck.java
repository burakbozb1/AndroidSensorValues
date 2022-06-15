package org.ytu.sensorvalues.sensorv4;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import java.io.*;



@Path("/control")
public class serverCheck {

    
	@GET
	public Response.Status statusOK()
	{
		System.out.println("Kontrol isteği geldi");
		
		dbConnection con = new dbConnection();
		
		return Response.Status.OK;
	}
	
    
}

