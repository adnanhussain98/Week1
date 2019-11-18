package Day6;

import java.sql.SQLException;

public class Controller {

	public static void main(String[] args) {

		VehicleDAO dao = new VehicleDAO();
		
		try {
			dao.getVehicles();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
