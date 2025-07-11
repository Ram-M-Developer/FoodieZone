package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class order_details_back {

	
	public static ResultSet orderDetails(String date) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		
		String query="select * from bookings ";
		
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		if(date!=null) {
			query += "where booking_date = ?";
			pst=connect.prepareStatement(query);
			pst.setString(1, date);
			rs=pst.executeQuery();
			
		}
		else {
			rs=state.executeQuery(query);
		}
	
		return rs;
	}
	
	
}
