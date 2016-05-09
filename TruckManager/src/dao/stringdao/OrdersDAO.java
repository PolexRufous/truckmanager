package dao.stringdao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.PoolDBConnector;
import entityes.persons.User;

public class OrdersDAO {

	public static List<List<String>> getOrderListByUser(User user)
	{
		List<List<String>> list = null;
		
		Connection connection = new PoolDBConnector().getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		
		String query = "SELECT trucks.model, drivers.firstname, contragents.shortname, orders.placefrom, orders.placeto, orders.cargo FROM orders " +
				"JOIN trucks ON orders.truck_id = trucks.id " +
				"JOIN drivers ON orders.driver_id = drivers.id " +
				"JOIN contragents ON orders.customer_id = contragents.id " +
				"WHERE manager_id = " + user.getId() + ";";
		
		try
		{
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			list = getListFromResultSet(resultSet);
			connection.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
				
		return list;
	}
	
	private static List<List<String>> getListFromResultSet(ResultSet resultSet) throws SQLException
	{
		List<List<String>> list = new ArrayList<>();
		
		List<String> listItem = new ArrayList<>();
		listItem.add("Truck");
		listItem.add("Driver");
		listItem.add("Customer");
		listItem.add("Place from");
		listItem.add("Place to");
		listItem.add("Cargo");
		list.add(listItem);
		
		while (resultSet.next())
		{
			listItem = new ArrayList<>();
			listItem.add(resultSet.getString(1));
			listItem.add(resultSet.getString(2));
			listItem.add(resultSet.getString(3));
			listItem.add(resultSet.getString(4));
			listItem.add(resultSet.getString(5));
			listItem.add(resultSet.getString(6));
			list.add(listItem);
		}
		
		return list;
	}
}
