package kosta.cgv;

public class Reserve {
	private String screen;
	private String title;
	private int time;
	private String seatNum;
	private int numOfPeople;
	private int price;
	
	public Reserve() {}
	
	public Reserve(String screen, String title, int time, String seatNum, int numOfPeople, int price) {
		super();
		this.screen = screen;
		this.title = title;
		this.time = time;
		this.seatNum = seatNum;
		this.numOfPeople = numOfPeople;
		this.price = price;
	}
	
	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public int getNumOfPeople() {
		return numOfPeople;
	}

	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
