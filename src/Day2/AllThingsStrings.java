package Day2;

public class AllThingsStrings {

	public void printSingleChars(String theString) {
		for (int i = 0; i < theString.length(); i++) {
			System.out.println(theString.charAt(i));
		}
	}

	public String crazyString(String theString) {

		// empty to hold results
		String result = "";

		// initialise for loop to go through every character of the string.
		// itterates over the length of the string
		for (int i = 0; i < theString.length(); i++) {

			// checks each index if it is divisble by two
			if (i % 2 == 0) {
				// if it's even, then uppercase the charact,bher.
				// += appends the result to the string
				result += theString.toUpperCase().charAt(i);
			} else {
				// if it's odd then lowercase the character
				result += theString.toLowerCase().charAt(i);
			}

		}
		// returns the result
		return result;
	}

	public String crazyWords(String theString) {
		String result = "";
		// splits theString string by the blank space and puts in into an array
		String[] words = theString.split(" ");

		for (int i = 0; i < words.length; i++) {

			// checks each index if it is divisble by two
			if (i % 2 == 0) {
				// if it's even, then uppercase the charachter.
				// += appends the result to the string
				result += words[i].toUpperCase();
			} else {
				// if it's odd then lowercase the character
				result += words[i].toLowerCase();
			}
			result += " ";

		}
		return result;
	}

	public String printCharBackwards(String theString) {
		String result = "";
		// .length calculates the length of the string. we -1 because it is in an array
		// and we don't want to include the 0.
		for (int i = theString.length() - 1; i >= 0; i--) {
			result += theString.charAt(i);
		}
		return result;
	}

//	public String printWordBackwards(String theString) {
//		String result = "";
//		String[] words = theString.split(" ");
//
//		//.length calculates the length of the string. we -1 because it is in an array and we don't want to include the 0.
//		for (int i = 0; i = words.length; i++) {
//			String currentWord = words[i];
//			
//			result += theString.charAt(i);
//		}
//		return result;
//	}
	
	//method that takes the string as an argument and returns how many chars are in the string
	public int charCount (String theString) {
		return theString.length();
	}
	
	public int wordCount (String theString) {
		String[] words = theString.split(" ");
		return theString.length();
	}

}
