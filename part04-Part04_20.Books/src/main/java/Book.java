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
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
    
    public int getYear() {
        return year;
    }
    
//    public void printEverything() {
//        System.out.println("Title: " + title);
//        System.out.println("Pages: " + pages);
//        System.out.println("Publication year: " + year);
//    }
}
