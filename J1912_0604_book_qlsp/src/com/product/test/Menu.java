/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.test;

import com.product.Product;
import com.product.book.Book;
import com.proudct.computer.Computer;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Product> products = new ArrayList<>();
    public  Scanner getScanner(){
        return new Scanner(System.in);
    }
    public void showMenu(){
          int choice;
        do {
            System.out.println(" 1 . Number infomation for n Computer ");
            System.out.println(" 2 . Input infomation for n Book");
            System.out.println(" 3 . Display information of n Computers by sorting the price descending");
            System.out.println(" 4 . Display information of n Books by sorting the publisher ascending");
            System.out.println(" 5 . show all product ");
            System.out.println(" 6 . Exit");
            System.out.println(" moi ban chon ( tu 1- 7 ) : ");
            choice = getScanner().nextInt();
            switch(choice){
                case 1 : 
                    this.inputComputer();
                    break;
                case 2 :
                    this.inputBook();
                    break;
                case 3 :
                    sortComputerByPrice();
                      break;
                case 4 :
                    sortBookByPublisher();
                    break;
                case 5 : 
                    showAllProduct();
                    break;
            }
        }while(choice != 6);
    }
    private void inputComputer(){
        System.out.println(" Enter number Computer create :");
        int numberOfComputer = getScanner().nextInt();
        for(int i=0;i<numberOfComputer;i++){
            Computer newComputer = new Computer();
            newComputer.input();
            products.add(newComputer);
        }
    }
    private void inputBook(){
        System.out.println(" Enter number Book create : ");
        int numberOfBook = getScanner().nextInt();
        for(int i =0 ;i<numberOfBook;i++){
            Book newBook = new Book();
            newBook.input();
            products.add(newBook);
        }
    }
    private void sortComputerByPrice(){
//        ArrayList<Computer>computers = new ArrayList<>();
//        for(Product p : this.products){
//            if(p instanceof Computer){
//                computers.add((Computer)p);
//            }
//        }
//        computers.sort((computer1,computer2) -> {
//            return computer1.getPrice().compareTo(computer2.getPrice());
//        };
        ArrayList<Computer> computers = new ArrayList<>();
        for(Product p: this.products) {
            if(p instanceof Computer) {
                computers.add((Computer)p);
            }
        }
        computers.sort((computer1, computer2) -> {
            return computer1.getName().compareTo(computer2.getName()); // loi ep kieu tu float sang string
        });
        //display
        for(Computer c: computers) {
            c.display();
        }
    }
    private void sortBookByPublisher(){
        ArrayList<Book> books = new ArrayList<>();
        for(Product p : this.products){
            if(p instanceof Book){
                books.add((Book)p);
            }
        }
        for(Book c : books){
            c.display();
        }
        books.sort((book1,book2) -> {
            return  book1.getPublisher().compareTo(book2.getPublisher());
        });
    }
    private void showAllProduct(){
        for(Product item : products){
            if(item instanceof Book){
                item.display();
                System.out.println("============");
            }
            else if(item instanceof Computer){
                item.display();
                System.out.println("============");
            }
        }
    }
}
