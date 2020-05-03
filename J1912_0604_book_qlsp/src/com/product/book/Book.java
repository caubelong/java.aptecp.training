/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.book;

import com.product.Product;


public class Book extends Product {
    private String type;
    private String publisher;

    public Book() {
    }

    public Book(String type, String publisher, long id, String name, int year, float price) {
        super(id, name, year, price);
        this.type = type;
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
    
    @Override
    public void input() {
         // nhap du lieu cho Book
        System.out.println(" Name : ");
        this.name = this.getScanner().nextLine();
        System.out.println(" Year : ");
        this.year  = this.getScanner().nextInt();
        System.out.println(" Price : ");
        this.price = this.getScanner().nextFloat();
        System.out.println(" type : ");
        this.type = this.getScanner().nextLine();
        System.out.println(" publisher : ");
        this.publisher = this.getScanner().nextLine();
        System.out.println("======================");
    }

    @Override
    public void display() {
         // show du lieu
       System.out.println(String.format(" name : %s, year : %d ,"
               + " price : % 3.2f , type : %s , publisher : %s ", this.name , this.year 
               , this.price ,  this.type ,this.publisher));
    }
   
    
    
}
