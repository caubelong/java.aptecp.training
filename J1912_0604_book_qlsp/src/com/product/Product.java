//Bài 01-Quản lý Sản phẩm - Bài tập luyện tập về Abstract và Interface
//1. Create an abstract class named as Product in package com.product, 
//has following properties: id, name, year, price, with Access Modifier = protected
//Create a class, named Computer in package com.product.computers, extend class Product and added follow properties:
//private Float speed;
//private String producer;
//Create two constructors for this class:
//o One has no argument
//o One has 6 arguments, to set value for inherited and added properties.
//You must used this keyword to call parent constructor which has arguments.
//Create get/set method for added properties.
//Implement input() and display() method, which inherited from Product class.
//o Input(): allows user to enter values for all added and inherited properties of the Computer object.
//o display(): print out all properties of the Computer object
//Create a class, named Book in package com.product.books, extend class Product and added follow properties:
//private String type;
//private String publisher;
//Create two constructors for this class:
//o One has no argument
//o One has 6 arguments, to set value for inherited and added properties. 
//You must used this keyword to call parent constructor which has arguments.
//Create get/set method for added properties.
//Implement input() and display() method, which inherited from Product class.
//o Input(): allows user to enter values for all added and inherited properties of the Book object.
//o display(): print out all added and inherited properties of the Book object

package com.product;

import java.util.Scanner;


public abstract class Product {
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
    protected long id;
    protected String name;
    protected int year;
    protected float price;

    public Product(long id, String name, int year, float price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public Product() {
         // khong muon nhap id , co the randoom , hoac lay thoi gian hien tai = get current time 
        this.id= System.currentTimeMillis();
    }
    public abstract void input();
    public abstract void display();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id
                + ", name=" + name 
                + ", year=" + year 
                + ", price=" + price + '}';
    }
    
    
}
