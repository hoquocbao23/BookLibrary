package data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BookList {
    private String name;
    private String author;
    private String id;
    private int yearRelease;
    private double price;

    public BookList(String name,String id, String author, int yearRelease, double price) {
        this.name = name;
        this.author = author;
        this.id= id;
        this.yearRelease = yearRelease;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void showProfile(){
         System.out.printf("|%-8s|%-10s|%4s|%4d|%4.1f|||\n",
                                        name,id, author, yearRelease, price);
    }
    
}
