package kosta.cgv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		BufferedReader br = null;
		String name = null;
		int phoneNum = 0;
		int balance = 0;

		while (true) {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("영화를 등록하시겠습니까?");
				System.out.print("y / n : ");
				String answer = br.readLine();

				if (answer.equals("y")) {
					cinema.addMoive();
				} else {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		BufferedReader brc = null;
		try {
			brc = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("이름: ");
			name = brc.readLine();
			brc = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("전화번호: ");
			phoneNum = Integer.parseInt(brc.readLine());
			brc = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("잔액: ");
			balance = Integer.parseInt(brc.readLine());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Customer customer = new Customer(name, phoneNum, balance);

		while (true) {
			cinema.showMovieList();
			BufferedReader br1 = null;
			System.out.println("1.예매 2.티켓출력 3.리뷰");
			String menu = null;
			try {
				br1 = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("메뉴를 선택해 주세요: ");
				menu = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}

			switch (menu) {
			case "1":
				cinema.reservation(customer);
				cinema.pay(customer, customer.getReserve());
				break;
			case "2":
				cinema.printTicket(customer.getReserve());
				break;
			case "3":
				reviewWriter rw = new reviewWriter();
				reviewReader rr = new reviewReader();
				Scanner sc = new Scanner(System.in);
				
				System.out.print("리뷰작성하려면 1번, 리뷰를 보려면 2번을 입력해주세요 : ");
				String n = sc.nextLine();
			
				if (n.equals("1")) {
					System.out.print("리뷰하고 싶은 영화의 제목을 먼저 작성하세요 : ");
					rw.addReview();

				} else if (n.equals("2")) {
					rr.lookReview();
				}
				break;
			}
		}

	}

}