package Day6;

import java.sql.SQLException;
import java.util.ArrayList;

public class DVDController {

	public static void main(String[] args) {

		//DVD insert = new DVD(9, "Harry Potter", "Stranger Things", 2001);
		//DVD update = new DVD(9, "Joker", "Action", 2019);
		//DVD delete = new DVD(9, "Joker", "Action", 2019);
		MyDAO dao = new MyDAO();
		
		try {
			//dao.insertDVD(insert);
			//dao.updateDVD(update);
			//dao.deleteDVD(delete);
			
			ArrayList<DVD> allDvds = dao.getDVDs();
			
			for(DVD d:allDvds) {
				System.out.println(d.getTitle());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
