// Mỗi sản phẩm đều có mã sản phẩm, tên sản phẩm, mô
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
package j1912_2503_book;
public class Product {
    public static final int TYPE_BOOK=1;
    public static final int TYPE_CD=2;
    private String code;
    private String name;
    private String description; // mo ta san pham
    private String procedure;
    private double price;

    public Product() {
    }

    public Product(String code, String name, String description, String procedure, double price) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.procedure = procedure;
        this.price = price;
    }
    
    public void CreateProduct(){
        System.out.println("Enter code : ");
        this.code=(Menu.getScanner().nextLine());
        System.out.println("Enter name : ");
        this.name=(Menu.getScanner().nextLine());
        System.out.println("Enter Description : ");
        this.description=(Menu.getScanner().nextLine());
        System.out.println("Enter Procedure: ");
        this.procedure=(Menu.getScanner().nextLine());
        System.out.println("Enter Price: ");
        this.price=(Menu.getScanner().nextDouble());
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getProcedure() {
        return procedure;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "code="
                + code + ", name=" + name 
                + ", description=" + description 
                + ", procedure=" + procedure
                + ", price=" + price + '}';
    }
}
