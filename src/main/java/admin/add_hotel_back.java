package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class add_hotel_back {
 
	
	public static boolean add(String hotel,String phone,String loct) throws SQLException, ClassNotFoundException {
		boolean ans=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		String query="CREATE TABLE "+hotel+" (id int auto_increment primary key,food varchar(30),price int)";
		state.executeUpdate(query);
		
		String query1="insert into hotel_list (hotelname,phonenumber,location) values(?,?,?);";
		PreparedStatement ppt=connect.prepareStatement(query1);
		
		ppt.setString(1,hotel);
		ppt.setString(2,phone);
		ppt.setString(3, loct);
		int rs=ppt.executeUpdate();
		
		if(rs>0) {
			ans=true;
		}
		
		
		return ans;
		
	}
	
}
