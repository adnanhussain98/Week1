package Day5;

import java.sql.SQLException;

public class JDBCController {

	public static void main(String[] args) {

		MyDAO dao = new MyDAO();

		try {
			dao.getDVDs();
			//dao.insertDVD();
			dao.deleteDVD();
			//dao.updateDVD();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
