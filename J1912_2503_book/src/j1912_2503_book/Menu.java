/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1912_2503_book;
//Xây dựng lớp cho phép quản lý danh sách sản phẩm tại công ty có các chức
//năng.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

//o Nhập thêm sản phẩm vào danh sách.
//o Xóa sản phẩm khỏi danh sách.
//o Xuất thông tin sản phẩm. Mỗi sản phẩm yêu cầu hiển thị đầy đủ thông tin từng
//thuộc tính của sản phẩm đó, mỗi thuộc tính hiển thị trên một dòng.
//o Tìm kiếm thông tin sản phẩm thông qua tên, mô tả, ngày phát hành sản phẩm, loại
//sản phẩm (sách hoặc băng đĩa).
//o Sắp xếp danh sách sản phẩm giảm dần theo giá.
//Viết phương thức main() chứa menu sau để người dùng chọn chức năng
//thực hiện.

public class Menu {

    private ArrayList <Product> products = new ArrayList<>();
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
    
    public void showMenu(){
        int choice = -1;
        while(choice != 6){
            System.out.println(" 1. nhap them san pham vao danh sach ");
            System.out.println(" 2. xoa san pham  ");
            System.out.println(" 3. xuat thong tin san pham  ");
            System.out.println(" 4. tim kiem thong tin san pham thong qua ten ");
            System.out.println(" 5. sap xep giam dan theo gia ");
            System.out.println(" 6. thoat ");
            System.out.println(" moi ban chon tu 1-6 ");
            choice=getScanner().nextInt();
            switch(choice){
                case 1 : createNew_Product();
                break;
                case 2: DeleteProduct();
                break;
                case 3: showAllProduct();
                break;
                case 4:SearchProduct();
                break;
                case 5: sortProductByPrice();
                break;
            }
        }
        System.out.println(" the end ");
    }
    private void createNew_Product(){
        System.out.println(" Enter number proudct : ");
        int numberOfProduct =getScanner().nextInt();
        for(int i =0; i<numberOfProduct; i++){
            System.out.println(" you create book(1) or compactDisk(2) : ");
            int type =getScanner().nextInt();
            if(type== Product.TYPE_BOOK){
                // cong viec nhap du lieu la cong viec cua book
               Book newBook = new Book();
               newBook.createBook();
               products.add(newBook);
            }else if(type==Product.TYPE_CD){
                CompactDisk newCompactDist= new CompactDisk();
                newCompactDist.createConpactDisk();
                products.add(newCompactDist);
            }
        }
    }
    private void DeleteProduct(){
        System.out.println(" Enter product Code : ");
        String productCode = getScanner().nextLine();
         //Ben trong remove if la 1 ham, dau vao la tung product trong danh sach
        //dau ra tra ve true / false 
       Boolean result= products.removeIf(item -> item.getCode().equalsIgnoreCase(productCode)); 
       // removeIf dung de xoa phan tu trong arr thoa man dieu kien . item dai dien cho phan tu giong trong js
       // equalsIgnoreCase dung de so sanh 2 chuoi vs gia tri dua ra, khong phan biet chu hoa chu thuong
       // getCode() lay o class Product;
        if(result==true){
            System.out.println(" xoa thanh cong ");
        }else {
            System.out.println("xoa that bai ");
        }
       
        
    }
    private void showAllProduct(){
        for(Product item : products){
            if(item instanceof Book){
               System.out.println(((Book)item).toString());
            }else if(item instanceof CompactDisk){
               System.out.println(((CompactDisk)item).toString());
            }
        }
    }
    private void SearchProduct(){
        // b1: filter tao 1 danh sach ms chua ket qua
        // getName lay o class product
        System.out.println(" nhap ten san pham can tim kiem : ");
        String productName =getScanner().nextLine();
        ArrayList<Product> result = (ArrayList<Product>) products.stream()
                .filter(item -> item.getName().equalsIgnoreCase(productName))
                .collect(Collectors.toList());
        if(result == null || result.isEmpty()){
            System.out.println("khong tim thay san pham nao ");
            return;
        }
        // b2: duyet danh sach nay va hien thi ra
        for(Product item : result){
            if(item instanceof Book){ // instanceof kiem tra xem co phai la cua class k
               System.out.println(((Book)item).toString());
            }else if(item instanceof CompactDisk){
               System.out.println(((CompactDisk)item).toString());
            }
        }
    }
    private void sortProductByPrice(){
       this.products
                .sort((item1, item2) 
                        -> item1.getPrice().compareTo(item2.getPrice())); // loi ep kieu chua xu li duoc
    } 
}
