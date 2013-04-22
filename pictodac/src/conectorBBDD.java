import java.sql.*;

public class conectorBBDD {

	Connection conn = null;
	
	final String url = "jdbc:mysql://localhost:3306/";
	final String dbName = "pictodroid";
	final String driver = "com.mysql.jdbc.Driver";
	final String userName = "root";
	final String password = "naira09";
	
	
	public void conectarBBDD()
	{
		
	try{
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url+dbName, userName, password);
		if (!conn.isClosed())
			System.out.println("Database connection working using TCP/IP...");
		
	}
	catch (Exception e)
	{
		System.err.println("Exception: "+ e.getMessage());
	}
	finally
	{
		try {
			if (conn != null)
				conn.close();
		}
		catch(SQLException e)
		{
			
		}
	}
	}
	
}
