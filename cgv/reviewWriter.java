package kosta.cgv;

import java.io.FileWriter;
import java.util.Scanner;

public class reviewWriter {

	public void addReview() {

		// ���ڿ��Է¹޾� ���Ͽ� ����
		// Q������ ���Ͼ��� ����
	
		FileWriter writer1 = null;
		Scanner sc = new Scanner(System.in);
		String str = "";
		String pen = "";
		
		while (!(str=sc.nextLine()).equals("q")) {
				pen += str;
				pen += "\n";


		}
		System.out.println("�����ۼ� �� ����Ǿ����ϴ�.");

		try {
			
			writer1 = new FileWriter("review.txt");

			writer1.write(pen);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer1.close();

			} catch (Exception e2) {
			}
		}
	}

}
