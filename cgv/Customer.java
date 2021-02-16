package kosta.cgv;

public class Customer {
	private String name;
	private int phoneNum;
	private int balance;
	private int reserve;
	
	public Customer() {}
	
	public Customer(String name, int phoneNum, int balance) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.balance = balance;
	}
	
	public Customer(String name, int phoneNum, int balance, int reserve) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.balance = balance;
		this.reserve = reserve;
	}

	public void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getReserve() {
		return reserve;
	}

	public void setReserve(int reserve) {
		this.reserve = reserve;
	}
	
	
}
