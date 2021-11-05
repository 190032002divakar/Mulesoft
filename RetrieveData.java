package Divakar;

import java.sql.DriverManager;
import java.sql.*;

public class RetrievingData
{
	public static void main(String mk[]) throws Exception
	{
		
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		String sql="select * from movielist";
		Statement ss=con.createStatement();
		ResultSet rs=ss.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"		"+rs.getString(2)+"			"+rs.getString(3)+"			"+rs.getString(4)+"			"+
		rs.getInt(5)+"			"+rs.getString(6));
		}
		
		
	}

}
