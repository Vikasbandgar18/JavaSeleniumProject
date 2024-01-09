package day1RestAssured;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Selectquery {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_vikas","root","Vbandgar@1807");

	java.sql.Statement stmt =  con.createStatement();
	String s = "Select E_Id,E_name,E_Deparment,E_Address from employee_details ";
	
	ResultSet rs = stmt.executeQuery(s);
	
	
	while(rs.next())
	{
		int E_id = rs.getInt("E_Id");
		String E_Name = rs.getString("E_Name");
		String E_Deparment= rs.getString("E_Deparment");	
		String E_Address = rs.getString("E_Address");
		
		System.out.println(E_id+"   "+E_Name+"   "+E_Deparment+"   "+E_Address);
	
		
	}
	
	
	con.close();
	System.out.println("--------------------------------------------");
	System.out.println("Query Execute success");
	
		
	}

}
