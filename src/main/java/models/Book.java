package models;

public class Book {
	
	private int id;
	private String bookName;
	private String author;
	private int yearPublished;

	public Book(int id, String bookName, String author, int yearPublished) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.yearPublished = yearPublished;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
}
