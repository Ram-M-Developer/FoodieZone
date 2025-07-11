package home;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class user_process {
	
	public static boolean check_vault_amount(int total,String vault_id,int vault_pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		boolean ans1=false;
		
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		
		String query="select vaultAmount from vault where vaultid = ? && password = ? ;";
		PreparedStatement pst=connect.prepareStatement(query);
		
		
		pst.setString(1, vault_id);
		pst.setInt(2, vault_pass);
		
		ResultSet rs=pst.executeQuery();
		int vault_amt=0;
		
		if(rs.next()) {
			vault_amt=rs.getInt("vaultAmount");
			
			
			if(vault_amt>total) {
				ans1=true;
				vault_amt-=total;
				
				String query1="update vault set vaultAmount = ? where vaultid = ? && password = ?";
				PreparedStatement pst1=connect.prepareStatement(query1);
				pst1.setInt(1, vault_amt);
				pst1.setString(2, vault_id);
				pst1.setInt(3, vault_pass);
				
				int rs1=pst1.executeUpdate();
				
			}
		}
		return ans1;
		
	}
	
		public static boolean order_details(String name,String phone,String address,String food_name,String hotel_name,String total) throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
			Statement state=connect.createStatement();

			state.execute("use fooddelivery");
			int rows=0;
			boolean ans=false;

			String query0="insert into bookings (name,phone,address,food,hotel,total,booking_date) values (?,?,?,?,?,?,?)";
			PreparedStatement psmt=connect.prepareStatement(query0);
			psmt.setString(1, name);
			psmt.setString(2, phone);
			psmt.setString(3, address);
			psmt.setString(4,food_name);
			psmt.setString(5, hotel_name);
			psmt.setString(6, total);
			psmt.setDate(7, Date.valueOf(LocalDate.now()));

			rows=psmt.executeUpdate();

			if(rows>0)
			  ans=true;

			return ans;
			
			
		
	}

	

}
