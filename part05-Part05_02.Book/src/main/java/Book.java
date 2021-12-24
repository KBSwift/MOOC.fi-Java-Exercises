/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Book {
    private String title;
    private String author;
    private int pageCount;
    
    public Book(String author, String title, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getName() {
        return title;
    }
    
    public int getPages() {
        return pageCount;
    }
    
    @Override
    public String toString() {
        return author + ", " + title + ", " + pageCount + " pages";
    }
    
}
