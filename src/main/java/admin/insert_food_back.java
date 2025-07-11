package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class insert_food_back {

	
	public static boolean insert(String hotel,String food,int price1) throws SQLException, ClassNotFoundException {
		boolean ans=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		Statement state=connect.createStatement();
		
		String query1="insert into "+hotel+" (Food,Price) values(?,?);";
		PreparedStatement state1=connect.prepareStatement(query1);
		
		state1.setString(1, food);
		state1.setInt(2, price1);
		
		int result=state1.executeUpdate();
		
		if(result>0) {
			ans=true;
		}
	
		
		return ans;
		
	}
}
