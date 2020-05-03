/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proudct.computer;

import com.product.Product;

/**
 *
 * @author Microsoft Windows
 */
public class Computer extends Product {
    private Float speed;
    private String producer;

    public Computer() {
    
    }

    public Computer(Float speed, String producer, long id, String name, int year, float price) {
        super(id, name, year, price);
        this.speed = speed;
        this.producer = producer;
    }

    
    

    public Float getSpeed() {
        return speed;
    }

    public String getProducer() {
        return producer;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void input() {
        
        // nhap du lieu cho computer
        System.out.println(" Name : ");
        this.name = this.getScanner().nextLine();
        System.out.println(" Year : ");
        this.year  = this.getScanner().nextInt();
        System.out.println(" Price : ");
        this.price = this.getScanner().nextFloat();
        System.out.println(" Speed : ");
        this.speed = this.getScanner().nextFloat();
        System.out.println(" Procedure : ");
        this.producer = this.getScanner().nextLine();
        System.out.println("======================");
    }

    @Override
    public void display() {
       // show du lieu
       System.out.println(String.format(" name : %s, year : %d ,"
               + " price : % 3.2f , speed : %4.1f , procudere : %s", this.name , this.year 
               , this.price ,  this.speed ,this.producer));
       
    }
    
    
}
