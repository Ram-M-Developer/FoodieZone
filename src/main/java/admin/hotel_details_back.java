package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class hotel_details_back {

	

	public static ResultSet hotelDetails() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		
        String query="select * from  hotel_list;";
	
        ResultSet rs=state.executeQuery(query);
		

		
		return rs;
		
		
	}
	
	
	
	public static boolean delete(String hotel_name) throws SQLException, ClassNotFoundException {
		boolean ans=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		
		String query = "drop table "+hotel_name;
		int rs=state.executeUpdate(query);
				
		String query1 = "delete from hotel_list where hotelname = '"+hotel_name+"'";
		int rs1=state.executeUpdate(query1);
		
		if(rs==0 && rs1>0) {
			ans=true;
		}
		
		return ans;
		
		
	}
	
}




