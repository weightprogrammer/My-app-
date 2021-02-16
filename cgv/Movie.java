package kosta.cgv;

public class Movie {
	private String title;
	private String info;
	Review review;
	
	public Movie() {}
	
	public Movie(String title, String info) {
		super();
		this.title = title;
		this.info = info;
	}

	public Movie(String title, String info, Review review) {
		super();
		this.title = title;
		this.info = info;
		this.review = review;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
	
}
