/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1912_2703_vehicle;

//Một đơn vị cần quản lý các phương tiện giao thông gồm: ô tô, xe máy, xe tải. Mỗi loại gồm các thông tin: Hãng sản xuất, năm sản xuất, giá bán và màu xe.
//Các ô tô có các thuộc tính riêng: số chỗ ngồi, kiểu động cơ.
//Các xe máy có các thuộc tính riêng: công xuất.
//Xe tải cần quản lý thêm: Trọng tải.
//Yêu cầu 1: Xây dựng các lớp để quản lý các phương tiện trên sao cho hiệu quả.
//Yêu cầu 2: Xây dựng lớp VehicleManagement có các chức năng:
//Thêm, xoá các phương tiện thuộc các loại trên.
//Tìm phương tiện theo hãng sản xuất, màu.
//Thoát chương trình.
public class Main {

  
    public static void main(String[] args) {
        System.out.println(" quan li phuong tien ");
        VehicleManagement menu = new VehicleManagement();
        menu.showMenu();
    }
    
}
