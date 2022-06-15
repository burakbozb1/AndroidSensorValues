package org.ytu.sensorvalues.sensorv4;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;



@Path("/sensors")
public class veriController {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response.Status statusOK(byte[] value) throws ParseException
	{
		System.out.println("Veri isteği geldi.");
		System.out.println("Gelen veri : " + value);
		
		try
		{
			String cozulenVeri = decompress(value);
			System.out.println("Çözülen veri : " + cozulenVeri);
			Gson gson = new Gson();
            
            DataModel veri = gson.fromJson(cozulenVeri,DataModel.class);

            dbConnection con = new dbConnection();
            boolean durum = con.veriKaydet(veri);
            if(durum)
            {
            	System.out.println("Veri güncellendi");
            }
            else
            {
            	return Response.Status.BAD_REQUEST;
            }
            
            
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return Response.Status.BAD_REQUEST;
		}

    	return Response.Status.OK;
	}
	
	
	public static String decompress(final byte[] compressed) throws IOException {
		//Bu alandaki kod parçacığı Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.
		return "";
    }

    public static boolean isCompressed(final byte[] compressed) {
    	//Bu alandaki kod parçacığı Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.
    	return false;
    }
	

}
