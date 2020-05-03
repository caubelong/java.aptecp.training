/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.data.manager;

import aptech.data.impl.Book;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DocumentManager {

    ArrayList<Book> books = new ArrayList<>();

    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void showMenu() {
        int choice = 0;
        do {
            System.out.println("==========================");
            System.out.println("Quan li san pham : ");
            System.out.println(" 1. Create book ");
            System.out.println(" 2. show all book ");
            System.out.println(" 3. Search Books By Author Name ");
            System.out.println(" 4. Sort book by name ");
            System.out.println(" 5. Delete  ");
            System.out.println(" 6. Thoat  ");
            System.out.println(" Moi ban chon tu 1 - 6 : ");
            System.out.println("==========================");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    showAllBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    sortBookByName();
                    break;
                case 5:
                    deleteBook();
                    break;
            }
        } while (choice != 6);
    }

    private void addNewBook() {
        int numberBook;
        System.out.println("Enter the number of books you want to create : ");
        numberBook = getScanner().nextInt();
        for (int i = 0; i < numberBook; i++) {
            System.out.println(" Book " + (i + 1));
            Book newBook = new Book();
            newBook.input();
            books.add(newBook);
        }
    }

    private void showAllBook() {
        System.out.println("---------Display----------");
        for (Book item : books) {
            item.show();
            System.out.println("--------------------------");
        }
    }

    private void searchBook() {
        String searchAuthorName;
        System.out.println(" enter author name of book muon search : ");
        searchAuthorName = getScanner().nextLine();
        ArrayList<Book> result = (ArrayList<Book>) books.stream()
                .filter(item -> item.getAuthorName().equalsIgnoreCase(searchAuthorName))
                .collect(Collectors.toList()); // cach 1
        // cach 2 : viet bang tay 
//        for(Book item : books){
//            if(item.getBookName().equalsIgnoreCase(searchAuthorName)){
//                result.add(item);
//            }
//        }
        if (result == null || result.isEmpty()) {
            System.out.println("khong tim thay san pham nao");
            return;
            
        }
        // show mang ra 
        for (Book item : result) {
            System.out.println("---------Display----------");
            item.show();
            System.out.println("--------------------------");
        }

    }

    private void sortBookByName() {
        this.books.sort((item1, item2) -> {
            return item1.getBookName().compareTo(item2.getBookName());
        });
    }

    private void deleteBook() {
        System.out.println(" enter  book name  muon delete : ");
        String nameBook = getScanner().nextLine();
        boolean result = books.removeIf(item -> item.getBookName().equalsIgnoreCase(nameBook));
        if (result == true) {
            System.out.println(" xoa thanh cong ");
        } else {
            System.out.println(" xoa that bai , kiem tra lai ten book ");
        }
    }
}
