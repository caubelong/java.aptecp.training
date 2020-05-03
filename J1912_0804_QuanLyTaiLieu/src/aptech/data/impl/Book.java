/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.data.impl;

import aptech.data.Idocument;
import java.util.Scanner;

/**
 *
 * @author Microsoft Windows
 */
public class Book implements Idocument{
    
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
    private static int idBook=0;
    private int id;
    private String bookName;
    private String authorName;
    private float price;

    public Book(int id, String bookName, String authorName, float price) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public Book() {
        idBook++;
        id=idBook; // cho id tu tang nhung khong thanh cong
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
    @Override
    public void input() {
        // neu phai nhap id , sau khi nextIn() song, phai them nextLine() neu k truong trinh se nhay xuong author name, bo qua book name
       System.out.println(" Enter Book Name : ");
       this.bookName=getScanner().nextLine();
       System.out.println(" Enter author name : ");
       this.authorName=getScanner().nextLine();
       System.out.println("Enter price :");
       this.price=getScanner().nextFloat();
    }

    @Override
    public void show() {
        System.out.println(" book : [ "
                + "id :" + id 
                + " name :" + bookName 
                + " author : " + authorName 
                + " price : " + price + "]");
    }
    
}
