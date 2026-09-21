package br.com.lucas.book_service.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable {

    private static final long serialVerionUID = 1L;

    private Long id;
    private String author;
    private String title;
    private Date lauchDate;
    private Double price;
    private String currency;

    public Book() {
    }

    public Book(Long id, String currency, Double price, Date lauchDate, String title, String author) {
        this.id = id;
        this.currency = currency;
        this.price = price;
        this.lauchDate = lauchDate;
        this.title = title;
        this.author = author;
    }

    public Book(long l, String nigelPoulton, String dockerDeepDive, Date date, double v, String brl, String port) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getLauchDate() {
        return lauchDate;
    }

    public void setLauchDate(Date lauchDate) {
        this.lauchDate = lauchDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(lauchDate, book.lauchDate) && Objects.equals(price, book.price) && Objects.equals(currency, book.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, lauchDate, price, currency);
    }
}
