package kosta.cgv;

public class Screen {
	private String name;
	private String seats[][];
	private int price;
	
	public Screen() {}

	public Screen(String name, String[][] seats, int price) {
		super();
		this.name = name;
		this.seats = seats;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[][] getSeats() {
		return seats;
	}

	public void setSeats(String[][] seats) {
		this.seats = seats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
