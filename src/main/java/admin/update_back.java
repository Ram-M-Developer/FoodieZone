package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update_back {
	
	
	public static boolean update(String HotelName,String FoodName,int NewPrice) throws ClassNotFoundException, SQLException {
		boolean ans=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		String query="update "+HotelName+" set price = "+NewPrice+" where food = '"+FoodName+"'";
		int rs=state.executeUpdate(query);
		
		if(rs>0) {
			ans=true;
		}
		
		return ans;
	}

}
