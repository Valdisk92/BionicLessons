package bioniclessons.week5.wednesday.task1.entities;

import java.io.Serializable;

/**
 * Created by Владислав on 05.11.2014.
 */
public class Book implements Serializable{
    private int id;
    private String  author;
    private String title;
    private String publishingYear;

    public Book(int id, String author, String title, String publishingYear) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    private Book() {

    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishingYear() {
        return publishingYear;
    }
}
