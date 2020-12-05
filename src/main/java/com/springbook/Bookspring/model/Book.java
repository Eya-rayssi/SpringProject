package com.springbook.Bookspring.model;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="books")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column
    public String title;
    @Column
    public String author;
    @Column
    public double price;
    @Column
    public Date releasedate;

    public Book(Book book) {
        this.id = book.id;
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.releasedate = book.releasedate;
    }

    public Book(Long id, String title, String author, double price, Date releasedate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.releasedate = releasedate;
    }

    public Book() {

    }




    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", releasedate="
				+ releasedate + "]";
	}



 }
