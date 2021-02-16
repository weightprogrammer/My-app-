package kosta.cgv;

public class Review {
	private String userName;
	private String contents;
	
	public Review() {}

	public Review(String userName, String contents) {
		super();
		this.userName = userName;
		this.contents = contents;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
}
