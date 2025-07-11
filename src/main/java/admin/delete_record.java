package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class delete_record {

	public static boolean delete(int chosen_id) throws SQLException, ClassNotFoundException{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
	
	boolean ans=false;
	
	String query="delete from bookings where no = ?" ;
	
	PreparedStatement pst=connect.prepareStatement(query);
	pst.setInt(1, chosen_id);
	int rs= pst.executeUpdate();
	
	if(rs>0) 
		ans=true;
	
	return ans;
	
	
	}
}
