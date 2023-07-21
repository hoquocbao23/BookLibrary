/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package booklibrary;

import data.BookList;
import data.Storage;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BookLibrary {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        printMenu();
        Storage SE = new Storage();
       
               
       int choice;
        do {            
            System.out.println("Moi Ban Chon");
             choice = Integer.parseInt(sc.nextLine());
             
            switch (choice) {
                case 1:
                    SE.addABook();
                    break;
                case 2:
                    SE.printfBookList();
                    break;
                case 3:
                    SE.sortPrice();
                    break;
                case 4:
                    SE.searchBook();
                    break;
                case 5:
                    SE.updatePrice();
                    break;
                case 6:
                    SE.removeBook();
                    break;
                }
            
        } while (choice !=7);
       
    }
    public static void printMenu(){
        System.out.println("Moi ban chon thao tac");
        System.out.println("1: Add a Book to sachSE");
        System.out.println("2: Print SE List");
        System.out.println("3: Sort");
        System.out.println("4: Search Book");
        System.out.println("5: Update Price");
        System.out.println("6: Remove book");
        
        System.out.println("7: Quit");
        
    }
  
            
}
