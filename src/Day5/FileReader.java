package Day5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {

		// data will be appended to this string
		String data = "";

		// try catch is used for dangerous functions
		try {

			Scanner sc = new Scanner(new File("lorem.txt"));

			// After this line is there another line
			while (sc.hasNextLine()) {
				// reads out the first line
				// appends the text to data string
				data += (sc.nextLine()) + "\n";
			}
			// closes scanner. this saves memory
			sc.close();

			// creates new file
			File outPutFile = new File("newdata.txt");
			// file writer opens the connection for the buffered writer to write in.
			FileWriter fw = new FileWriter(outPutFile);
			// buffered writer actually writes to the file fw
			BufferedWriter bw = new BufferedWriter(fw);
			// changes the case of the data to upper case
			data = data.toUpperCase();
			// saves the data
			bw.write(data);

			// prints out the data string
			System.out.println(data);
			bw.close();
			fw.close();

		} catch (IOException e) {
			// this will give you the problem if an error occurs
			e.printStackTrace();
		}
	}
}