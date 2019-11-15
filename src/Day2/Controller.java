package Day2;

public class Controller {

	public static void main(String[] args) {

		String testString = "The quick brown fox jumps over the lazy dog";

		// AllThingsStrings is the class, ats is the object of that class. =new
		// AllThingsString is new object of that class.
		AllThingsStrings ats = new AllThingsStrings();
		ats.printSingleChars(testString);

		System.out.println(ats.crazyString(testString));

		// prints crazyWords method. sysout, then point to the class object and then the
		// method.
		System.out.println(ats.crazyWords(testString));
		

//		for (int i = 0; i < 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + " even");
//			} else {
//				System.out.println(i + " odd");
//			}
//
//		}

		// tokenisation
		// this splits anything that has a space
		String[] words = testString.split(" ");

		// loops through testString and prints the words.
		for (String w : words) {
			System.out.println(w);
		}
		
		System.out.println(ats.printCharBackwards(testString));
		
		System.out.println(ats.charCount(testString));
		
		System.out.println(ats.wordCount(testString));
	}

}
