package org.ytu.sensorvalues.sensorv4;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class dbConnection {
	
	private String kadi = "root";
    private String sifre = "";
    private String dbName = "sensordb";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    
    public dbConnection() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı : " + ex.toString());
        }

        try {
            con = DriverManager.getConnection(url, kadi, sifre);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Bağlantı başarısız.");
        }
    }
    
    
    public boolean veriKaydet(DataModel veri)
    {
    	boolean durum=false;
    	int id = 0;
    	PreparedStatement ps;
		try {
			String devID = veri.getDeviceID();
			ArrayList<SensorDataModel> sensorValues = veri.getSensorModel();
			for(SensorDataModel model: sensorValues)
			{
				String tarih = model.getTarih();
				
				ps = con.prepareStatement("INSERT INTO tbl_header (deviceID,dateTime) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
				ps.setString(1,devID);
				ps.setString(2, tarih);
				
				ps.executeUpdate();
				ResultSet rs=ps.getGeneratedKeys();
				
				if(rs.next()){
					id=rs.getInt(1);
					for(HashMap<String,String> map:model.getSensors())
					{
						String sAd = map.get("SensorName");
		            	String sV = map.get("SensorValue");
		            	
		            	String sorgu = "INSERT INTO tbl_sensorvalues (headerID,sensorName,sensorValue) VALUES ('"+id+"','"+sAd+"','"+sV+"')";
		            	try {
							statement = con.createStatement();
							statement.executeUpdate(sorgu);
							durum=true;
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							durum=false;
							return durum;
						}
						
					}
				}
				
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
    	
    	return durum;
    }
    
    public int cihazKontrol(String dID)
    {
    	String sorgu = "SELECT id FROM tbl_header WHERE deviceID='"+dID+"'";
    	try 
    	{
    		statement = con.createStatement();
    		ResultSet rs = statement.executeQuery(sorgu);
    		if(rs.next())
    		{
    			return rs.getInt("id");
    		}
    		else
    		{
    			return -1;
    		}
    				
    	}
    	catch(Exception throwables)
    	{
    		throwables.printStackTrace();
    	}
    	
    	return 0;
    }
    
    public DataModel veriGetir(String deviceId, String baslangic, String bitis)
    {
    	//Bu alandaki kod parçacığı Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.
    	return (new DataModel());	
    }
    
    public int veriIndex(ArrayList<SensorDataModel> model,String tarih)
    {
    	int i = 0;
    	for(SensorDataModel x : model)
    	{
    		if(x.getTarih().equals(tarih))
    		{
    			return i;
    		}
    		else
    		{
    			i++;    			
    		}
    		
    	}
    	
    	return -1;
    }

}
