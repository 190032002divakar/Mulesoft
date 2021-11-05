package Divakar;

import java.sql.DriverManager;
import java.sql.*;

public class CreationTable
{
	public static void main(String mk[]) throws Exception
	{
		
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:product:db");
		String sql="create table movielist(pid int primary key,moviename text,leadactor text,leadactress text,year int, directorname text) ";
		Statement st=con.createStatement();
		st.execute(sql);
		System.out.print("Table Created");
		
	}

}
