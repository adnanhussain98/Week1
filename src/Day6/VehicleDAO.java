package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VehicleDAO {
	// 1. Load the driver
	// 2. Define the connection url.
	// 3. establish the connection
	// 4. create a statement object
	// 5. execute a query
	// 6. process the results
	// 7 close the connection

	private Connection getConnection() {

		Connection conn = null;

		try {
			// load driver
			Class.forName("org.sqlite.JDBC");
			// url of the database location
			String url = "jdbc:sqlite:vehicles.sqlite";
			// initialise connection object
			conn = DriverManager.getConnection(url);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// returns conn object
		return conn;
	}
	
	public void getVehicles() throws SQLException {
		// makes the connection local
		// not making it global gives you the connection when it's available
		Connection vehicleConnection = getConnection();
		//create a statement object
		Statement statement = vehicleConnection.createStatement();
		
		//the return of query gets stored into ResultSet (rs is the local object)
		String query1 = "SELECT * FROM vehicles";
		System.out.println(query1);
		
		//the return of query gets stored into ResultSet (rs is the local object)
		ResultSet rs = statement.executeQuery(query1);
		
		while(rs.next()) {
			// declaring a int called id and storing the column name vehicle_id from the result set into the variable.
			int id = rs.getInt("vehicle_id");
			String make = rs.getString("make");
			String model = rs.getString("model");
			int year = rs.getInt("year");

			System.out.println(id + " " + make + " " + model + " " + year);
		}
	
	}

}
