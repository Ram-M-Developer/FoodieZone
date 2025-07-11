package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class food_details_back {

	public static ResultSet foodDetails(String HotelName) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		
		String query="select * from "+HotelName;
		
		ResultSet rs=null;
		
		if(HotelName!=null && !HotelName.trim().isEmpty()) {
			String query1="select * from "+ HotelName;
			rs=state.executeQuery(query1);
		}
		else {
			rs=state.executeQuery(query);
		}
		
		return rs;
		
	}
	
	
	
	public static boolean deleteFood(String food_name,String HotelName) throws SQLException, ClassNotFoundException {
		boolean ans=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		
		String query1="delete from "+HotelName+" where food = ?";
		PreparedStatement pst=connect.prepareStatement(query1);
		pst.setString(1, food_name);
		int rs=pst.executeUpdate();
	
		if(rs>0) {
			ans=true;
		}
		
	return ans;
	}
}
