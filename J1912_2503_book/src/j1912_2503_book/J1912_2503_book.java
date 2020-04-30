/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1912_2503_book;

//Một công ty chuyên sản xuất sách và băng đĩa phục vụ học tập trong
//nhà trường phổ thông. Mỗi sản phẩm đều có mã sản phẩm, tên sản phẩm, mô
//tả sản phẩm, nhà sản xuất, giá bán. Ngoài ra:
//o Sách có thêm thông tin số trang.
//o Băng đĩa có thêm thông tin độ dài thời gian phát.
//Xây dựng lớp cho phép quản lý danh sách sản phẩm tại công ty có các chức
//năng.
//o Nhập thêm sản phẩm vào danh sách.
//o Xóa sản phẩm khỏi danh sách.
//o Xuất thông tin sản phẩm. Mỗi sản phẩm yêu cầu hiển thị đầy đủ thông tin từng
//thuộc tính của sản phẩm đó, mỗi thuộc tính hiển thị trên một dòng.
//o Tìm kiếm thông tin sản phẩm thông qua tên, mô tả, ngày phát hành sản phẩm, loại
//sản phẩm (sách hoặc băng đĩa).
//o Sắp xếp danh sách sản phẩm giảm dần theo giá.
//Viết phương thức main() chứa menu sau để người dùng chọn chức năng
//thực hiện.
public class J1912_2503_book {

    public static void main(String[] args) {
        System.out.println("Quan ly sach va bang dia");
        Menu menu = new Menu();
        menu.showMenu();
    }
    
}
