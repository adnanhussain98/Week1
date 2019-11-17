package Day4;

import java.util.HashMap;

import Day3.Person;

public class Recap {

	public static void main(String[] args) {

		HashMap<Integer, Person> theCrew = new HashMap<>();

		Person saffiyah = new Person("Saffiyah", 1997, "Halifax");
		theCrew.put(15074981, saffiyah);

		theCrew.put(16028929, new Person("Adnan", 1998, "Oldham"));
		theCrew.put(16024003, new Person("Iqra", 1998, "Oldham"));
		theCrew.put(15066618, new Person("Mo", 1996, "Oldham"));
		
		//
		theCrew.entrySet().forEach(entry -> {
			Person p = entry.getValue();
			System.out.println(entry.getKey() + " : " + p.getName() + " " + p.getBirthYear());

		});


	}
}
