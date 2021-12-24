/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class BookFormatter {
    
    Book book;
    
    public BookFormatter(Book book) {
        this.book = book;
    }
    
    public String allDetails() {
        return book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear();
    } 
    
}
