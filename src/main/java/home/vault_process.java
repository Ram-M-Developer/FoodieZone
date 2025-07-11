package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class vault_process {

	
	public static boolean add_amount(String vault_id,int vault_pass,int amount) throws SQLException {
		
		boolean ans=false;
		
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery","root","ram7");
		
		String query="select vaultAmount from vault where vaultid = ? && password = ?";
		PreparedStatement pst=connect.prepareStatement(query);
		pst.setString(1, vault_id);
		pst.setInt(2, vault_pass);
		ResultSet rs=pst.executeQuery();
		
		
		int balance=0;
		int rs1=0;
		
		if(rs.next()) {
			balance=rs.getInt("vaultAmount");
			balance+=amount;
			
			String query1="update vault set vaultAmount = ? where vaultid = ? && password = ?";
			PreparedStatement pst1=connect.prepareStatement(query1);
			pst1.setInt(1,balance);
			pst1.setString(2, vault_id);
			pst1.setInt(3,vault_pass);
			rs1=pst1.executeUpdate();
			
		}
		
		if(rs1>0) {
			ans=true;
		}
		return ans;
		
		
	}
	
	

}
