package s23.BookstoreDatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String title, author, isbn;
	private int publicationYear;
	private double price;
	@ManyToOne
	@JoinColumn(name = "categoryid")
	private Category category;
	
	public Book() {
		super();
	}

	public Book(Category category, String title, String author, String isbn, int publicationYear, double price) {
		super();
		this.category = category;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publicationYear = publicationYear;
		this.price = price;
	}

	public Book(String title, String author, int publicationYear, double price) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.price = price;
	}

	public Book(String title, String author, String isbn, int publicationYear, double price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publicationYear = publicationYear;
		this.price = price;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int year) {
		this.publicationYear = publicationYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", category=" + category + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", publicationYear=" + publicationYear
				+ ", price=" + price + "]";
	}
	
}