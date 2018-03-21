package org.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SqlData {

	
	public static List<HashMap<String,String>> data() throws Throwable {
		List<HashMap<String,String>> datalist = new ArrayList();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toolsqa","root","1234");
		
		String str ="SELECT * FROM `toolsqa`.`registration`;" ;
		
		PreparedStatement ps = con.prepareStatement(str);
		
		ResultSet rs = ps.executeQuery();
		
		HashMap<String,String> mapdata = new HashMap<String,String>();
		
		while(rs.next()) {
		int empid = rs.getInt("employeeID");
		int day = rs.getInt("day");
		int month = rs.getInt("month");
		int year = rs.getInt("year");
				
		Long phonenumber = rs.getLong("phonenumber");
		mapdata.put("browser",rs.getString("browser"));
		mapdata.put("url",rs.getString("url"));
		mapdata.put("employeeID",Integer.toString(empid));	
		mapdata.put("firstname",rs.getString("firstname"));	
		mapdata.put("lastname",rs.getString("lastname"));	
		mapdata.put("martialstatus",rs.getString("martialstatus"));	
		mapdata.put("hobby",rs.getString("hobby"));	
		mapdata.put("phonenumber",Long.toString(phonenumber));
		mapdata.put("username",rs.getString("username"));	
		mapdata.put("email",rs.getString("email"));	
		mapdata.put("password",rs.getString("password"));	
        mapdata.put("confirmpassword",rs.getString("confirmpassword"));
        mapdata.put("country", rs.getString("country"));
        mapdata.put("day",Integer.toString(day));
        mapdata.put("month",Integer.toString(month));
        mapdata.put("year",Integer.toString(year));
 
		}
		datalist.add(mapdata);
		return datalist;
	}
	
	public static void main(String args[]) throws Throwable {
	
		
		System.out.println(data().get(0).get("firstname"));
		
	}
}
