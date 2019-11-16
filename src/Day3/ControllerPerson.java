package Day3;

import java.util.ArrayList;

public class ControllerPerson {

	public static void main(String[] args) {

		Person mo = new Person("Mo", 1997, "Longsight");
		Person iqra = new Person("Iqra", 1997, "Cheetham Hill");
		Person adnan = new Person("Adnan", 1998, "Oldham");
		Person kaleem = new Person("Kaleem", 1985, "Rocdhale");
		Person azzara = new Person("Azzara", 1990, "Cheetham Hill");
		Person saffiya = new Person("Saffiya", 1996, "Rochdale");
		Person aya = new Person("Aya", 1996, "Wythenshawe");
		
		//constructor with one value
		Person a = new Person("test");
		//setter allows me to set the name
		a.setName("test");

		ArrayList<Person> pers = new ArrayList<>();
		// adds person to the array list
		pers.add(mo);
		pers.add(iqra);
		pers.add(adnan);
		pers.add(kaleem);
		pers.add(azzara);
		pers.add(saffiya);
		pers.add(aya);
		pers.add(a);
		
//		//gets the person make from pers object 
//		System.out.println(pers.get(0).getName());
//		System.out.println(pers.get(1).getName());

		for (int i = 0; i < pers.size(); i++) {

			pers.get(i).introduceYourself();
		}
	}

}
