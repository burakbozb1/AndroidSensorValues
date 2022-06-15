package org.ytu.sensorvalues.sensorv4;

import java.text.ParseException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/verigetir")
public class veriGonder {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DataModel veriGonderF(String veriler)
	{
		try
		{
			System.out.println("verigetir isteği geldi");
			dbConnection con = new dbConnection();
			
			Gson gson = new Gson();
	        
			VeriModeliJar model = gson.fromJson(veriler,VeriModeliJar.class);
			
			if(model.getDeviceID()!=null && model.getTarihBaslangic()!=null && model.getTarihBitis()!=null)
			{
				DataModel veri = con.veriGetir(model.getDeviceID(),model.getTarihBaslangic(), model.getTarihBitis());
				return veri;
			}
			else
			{
				return new DataModel();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new DataModel();
			
		}
		
	}
}
