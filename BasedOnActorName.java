package Divakar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;
public class BasedOnActorName {

	public static void main(String[] args) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		String sql="select * from movielist where leadlactor=?";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner sc= new Scanner(System.in);
		String nn=sc.next();
		ps.setString(1, nn);
		ResultSet rs=ps.executeQuery();
		System.out.print("Nd the Movie Name is : ");
		while(rs.next())
		{
			System.out.print(rs.getString(2));
		}
	}

}
