/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.test;

import com.proudct.computer.Computer;
import java.util.stream.Collectors;

/**
 *
 * @author Microsoft Windows
 */
public class Test {

    public static void main(String[] args) {
        Menu newMenu = new Menu();
        newMenu.showMenu();
    }

    public static void functionA() {
        //filter dung ham san co
        ArrayList<Computer> computers = new ArrayList<>();

        //Float speed, String producer, long id, String name, int year, float price
        computers.add(new Computer(235.0f, "bmw", 1, "aa", 2001, 120.0f));
        computers.add(new Computer(335.0f, "ewse", 2, "dd", 2004, 420.0f));
        computers.add(new Computer(5635.0f, "ewe", 3, "cc", 2006, 520.0f));
        computers.add(new Computer(265.0f, "rer", 4, "bb", 2002, 120.0f));
        computers.add(new Computer(265.0f, "hth", 5, "ee", 2009, 720.0f));
        computers.add(new Computer(235.0f, "6tj67y", 6, "xx", 2003, 820.0f));
        ArrayList<Computer> result = (ArrayList<Computer>)computers.stream()
                .filter(computer -> computer.getYear() == 2003)
                .collect(Collectors.toList());
    }

    public static void functionB() {
        //filter bang tay
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer(235.0f, "bmw", 1, "aa", 2001, 120.0f));
        computers.add(new Computer(335.0f, "ewse", 2, "dd", 2004, 420.0f));
        computers.add(new Computer(5635.0f, "ewe", 3, "cc", 2006, 520.0f));
        computers.add(new Computer(265.0f, "rer", 4, "bb", 2002, 120.0f));
        computers.add(new Computer(265.0f, "hth", 5, "ee", 2009, 720.0f));
        computers.add(new Computer(235.0f, "6tj67y", 6, "xx", 2003, 820.0f));
        ArrayList<Computer> result = new ArrayList<>();
        for(Computer c: computers) {
            if (c.getYear() == 2003) {
                result.add(c);
            }
        }
    }
}
