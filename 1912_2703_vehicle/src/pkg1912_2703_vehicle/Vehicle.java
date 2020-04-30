//Một đơn vị cần quản lý các phương tiện giao thông gồm: ô tô, xe máy, xe tải. Mỗi loại gồm các thông tin: 
//Hãng sản xuất, năm sản xuất, giá bán và màu xe.
//Các ô tô có các thuộc tính riêng: số chỗ ngồi, kiểu động cơ.
//Các xe máy có các thuộc tính riêng: công xuất.
//Xe tải cần quản lý thêm: Trọng tải.
//Yêu cầu 1: Xây dựng các lớp để quản lý các phương tiện trên sao cho hiệu quả.
//Yêu cầu 2: Xây dựng lớp VehicleManagement có các chức năng:
//Thêm, xoá các phương tiện thuộc các loại trên.
//Tìm phương tiện theo hãng sản xuất, màu.
//Thoát chương trình.
package pkg1912_2703_vehicle;

/**
 *
 * @author Microsoft Windows
 */
public class Vehicle {
    public static final int TYPE_CAR=1;
    public static final int TYPE_MOTO=2;
    private String brand;
    private int year;
    private double price;
    private String color;

    public Vehicle() {
    }
    
    public void CreateVehicle(){
        System.out.println(" enter brand : ");
        this.brand= VehicleManagement.getScanner().nextLine();
        System.out.println(" enter year : ");
        this.year= VehicleManagement.getScanner().nextInt();
        System.out.println(" enter price : ");
        this.price= VehicleManagement.getScanner().nextDouble();
        System.out.println(" enter color : ");
        this.color= VehicleManagement.getScanner().nextLine();
    }
    public Vehicle(String brand, int year, double price, String color) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand 
                + ", year=" + year + ", price=" 
                + price + ", color=" 
                + color + '}';
    }
    
}
