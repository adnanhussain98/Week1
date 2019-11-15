package Day1;

public class Loops {

	public static void main(String[] args) {

		// array
		int[] ageOfPeopleInThisRoom = { 34, 23, 23, 21, 22, 23, 22, 21, 24 }; // each number in the array has index
																				// number. 0,1,2,3

		String[] namesOfPeople = new String[10];

		namesOfPeople[0] = "kaleem";
		namesOfPeople[1] = "hassan";
		namesOfPeople[2] = "ladoo";
		namesOfPeople[3] = "kaleem";
		namesOfPeople[4] = "iqra";
		namesOfPeople[5] = "saffiyah";
		namesOfPeople[6] = "aya";
		namesOfPeople[7] = "mo";
		namesOfPeople[8] = "adnan";
		namesOfPeople[9] = "azarra";

//		for (int i = 0; i < namesOfPeople.length; i++) {
//			System.out.println(namesOfPeople[i]);
//		}\

		// enhanced for loop
		// String n = collection type,
		for (String n : namesOfPeople) {
			System.out.println(n);
		}

		for (int a : ageOfPeopleInThisRoom) {
			System.out.println(a);
		}

//		//prints out length of array.
//		System.out.println(ageOfPeopleInThisRoom.length);
//		
//		//int i = which index number to start off at
//		//i++ = increments, is i still equal to the length of this array
//		//i < ageofPeopleinThisRoom.length = loop will run until it reaches all indexes
//		for (int i = 0; i < ageOfPeopleInThisRoom.length; i++) {
//			System.out.println(ageOfPeopleInThisRoom[i]);
//		}

		int counter = 0; // starts off a 0
		while (counter < namesOfPeople.length) {
			System.out.println(namesOfPeople[counter]);
			counter++; // increments the counter so it goes to next index number
		}

		int counterForDoLoop = 0;
		do {
			System.out.println(namesOfPeople[counterForDoLoop]);
			counterForDoLoop++;
		} while (counterForDoLoop < namesOfPeople.length);
	}

}
