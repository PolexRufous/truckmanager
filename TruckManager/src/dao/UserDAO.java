package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entityes.persons.User;

public class UserDAO {

	public static User getUserByLogin(String login)
	{
		User user = null;
		
		Connection connection = new PoolDBConnector().getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			statement = connection.createStatement();
			resultSet= statement.executeQuery("SELECT * FROM users WHERE login=\"" + login + "\";");
			user = getUserFromResultSet(resultSet);
			connection.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return user;
	}
	
	private static User getUserFromResultSet(ResultSet resultSet) throws SQLException
	{
		User user = null;
		
		if(resultSet.next())
		{			
				int ID = resultSet.getInt(1);
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString(3);
				String login = resultSet.getString(4);
				String password = resultSet.getString(5);
				user = new User(ID, firstName, lastName, login, password);
		}
		
		return user;
	}
	
}
