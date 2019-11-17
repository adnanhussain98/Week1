package Day3;

import java.util.HashMap;

public class MapsAndArrays {

	// method that counts all occurances of a char in a string

	public HashMap<Character, Integer> countChars(String aString) {

		// making a hashmap object
		HashMap<Character, Integer> charCounts = new HashMap<>();

		// iterating through aString
		for (int i = 0; i < aString.length(); i++) {
			// checks if it contains key e.g. a/b/c/d
			if (charCounts.containsKey(aString.charAt(i))) {

				// gets previous value of the character
				int count = charCounts.get(aString.charAt(i));
				// increments on to the next number
				count++;
				// charCounts puts
				charCounts.put(aString.charAt(i), count);

			} else {
				// puts it in the HashMap and sets it to 1
				charCounts.put(aString.charAt(i), 1);
			}
		}
		// returns the charCount
		return charCounts;

	}

}
