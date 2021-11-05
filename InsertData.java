package Divakar;

import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
public class InsertionOfData {

	public static void main(String[] args) throws Exception
	{
			
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		Scanner sc=new Scanner(System.in);
		String sql="insert into movielist values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		
		int id=sc.nextInt();
		
		String mname=sc.next();
		
		String lac=sc.next();
		String act=sc.next();
		
		int yr=sc.nextInt();
		
		String dname=sc.next();
		ps.setInt(1, id);
		ps.setString(2, mname);
		ps.setString(3, lac);
		ps.setString(4, act);
		ps.setInt(5, yr);
		ps.setString(6, dname);
		ps.executeUpdate();
		System.out.print("Data Inserted Successfully");
	}

}
