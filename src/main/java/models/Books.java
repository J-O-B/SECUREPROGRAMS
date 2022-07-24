package models;

import java.util.ArrayList;
import java.util.List;

public class Books {
	
	private List<Book> books;
	
	public Books() {
		this.books = new ArrayList<>();
	}

	public List<Book> getBooks() {
		return books;
	}

}
