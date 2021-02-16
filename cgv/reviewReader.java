package kosta.cgv;

import java.io.FileReader;
import java.util.Arrays;

public class reviewReader {

	public void lookReview() {
	
		FileReader reader1 = null;
	char arr[] = new char[10];
	
		try {
		
			reader1 = new FileReader("review.txt");
			while (true) {

				Arrays.fill(arr, ' ');
					int data = reader1.read(arr);
					if (data == -1) {
						break;
					}
					System.out.println(arr);
				}



		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader1.close();

			} catch (Exception e2) {
			}
		}

	}

}
