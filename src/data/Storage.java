/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Storage {

    private Scanner sc = new Scanner(System.in);
    private List<BookList> arr = new ArrayList();

    public Storage() {
    }

    //add sách vào tủ
    public void addABook() {
        String id;
        System.out.println("BOOKPROFILE #" + (arr.size() + 1));
        System.out.print("Name: ");
        String name = sc.nextLine();
        while (true) {
            System.out.print("ID: ");
            id = sc.nextLine();
            if (checkBook(id) == 1) {
                break;
            } else {
                System.out.println("ID da ton tai!");
            }
        }
        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Year Release: ");
        int yearRelease = Integer.parseInt(sc.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine());
        BookList book = new BookList(name, id, author, yearRelease, price);
        arr.add(book);
            System.out.println("THE NEW BOOK HAS BEEN ADDED SUCCESSFULLY");
    }

    public void printfBookList() {
        if (arr.isEmpty()) {
            System.out.println("The book list is empty");
            return;
        }
        System.out.println("The Book List:");
        for (BookList x : arr) {
            x.showProfile();
        }
    }

    public void sortPrice() {
        if (arr.isEmpty()) {
            System.out.println("The book list is empty");
            return;
        }
        for (int i = 0; i < (arr.size() - 1); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getPrice() > arr.get(j).getPrice()) {
                    BookList tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
        for (BookList x : arr) {
            x.showProfile();
        }
    }

    // hàm này dùng để lấy về thông tin tác giả
    public BookList searchBook(String id) {
        if (arr.isEmpty()) {
            return null;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        return null;
    }

    // hàm này dùng để in ra thông tin của tác giả
    public void searchBook() {
        String keyword;
        System.out.println("Input the book id you want to find");
        keyword = sc.nextLine();
        BookList xxx = searchBook(keyword);
        if (xxx == null) {
            System.out.println("NOT FOUND!");
        } else {
            xxx.showProfile();
        }
    }

    public int checkBook(String id) {
        BookList xxx = searchBook(id);
        if (xxx == null) {
            return 1;
        }
        return 0;
    }
    
   // update giá theo id
    public void updatePrice(){
        String keyword;
        double newPrice;
        System.out.println("Input the book id you want to update");
        keyword = sc.nextLine();
        BookList xxx = searchBook(keyword);
        if (xxx == null){
            System.out.println("NOT FOUND");
        }else {
            System.out.println("Nhap gia moi");
            newPrice = Double.parseDouble(sc.nextLine());
            xxx.setPrice(newPrice);
             xxx.showProfile();
            }
      //  xxx.showProfile();  không show profile ở đây vì nếu null thì không có xxx để show.
    }
    
    // remove sách theo id
    public void removeBook(){
        String keyword;
        System.out.println("Input the book id you want to remove");
        keyword = sc.nextLine();
        BookList xxx = searchBook(keyword);
        if ( xxx == null ){
            System.out.println("Not Found");
        }else {
            arr.remove(xxx);
            System.out.println("REMOVE SECCESSFULLY!");
         }
    }

}
