package dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PoolDBConnector implements DBConnector
{

	@Override
	public Connection getConnection() {
		
		Connection conn = null;
		
		try
		{
			InitialContext initContext= new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:comp/env/truckmanager");
			conn = ds.getConnection();
		}
		catch (Exception e)
		{
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return conn;
	}

}
