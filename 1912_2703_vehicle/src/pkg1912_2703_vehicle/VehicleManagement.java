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

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleManagement {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void showMenu() {
        int choice = -1;
        while (choice != 5) {
            System.out.println(" 1. them phuong tien ");
            System.out.println(" 2. xoa phuong tien ");
            System.out.println(" 3. xem danh sach phuong tien ");
            System.out.println(" 4. tim phuong tien theo ten hang sx hoac mau ");
            System.out.println(" 5. thoat ");
            System.out.println(" moi ban chon ( tu 1-5) ");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1: 
                    createNewVehicle();
                    break;
                
                case 2: 
                    deleteVehicle();
                    break;
                
                case 3: 
                    showList();
                    break;
                
                case 4: 
                    findVehicle();
                    break;
                }
            }
        System.out.println(" the end ");
        }
    private void createNewVehicle(){
        System.out.println(" Enter number create Vehicle : ");
        int numberVehicle = getScanner().nextInt();
        for(int i =0; i< numberVehicle;i++){
            System.out.println(" You Create Car(1) or Moto(2) :");
            int type= getScanner().nextInt();
            if(type == Vehicle.TYPE_CAR){
              Car newCar= new Car();
                newCar.createCar();
                vehicles.add(newCar);
            }else if (type== Vehicle.TYPE_MOTO){
                Motobike newMoto = new Motobike();
                 newMoto.createMoto();
                 vehicles.add(newMoto);
            }
        }
    }
    private void deleteVehicle(){
        System.out.println(" enter name or color : ");
        String search = getScanner().nextLine();
        boolean result= vehicles.removeIf(item -> item.getBrand().equalsIgnoreCase(search));
        boolean results= vehicles.removeIf(item -> item.getColor().equalsIgnoreCase(search));
        if(result == true || results == true){
            System.out.println(" xoa thanh cong ");
        }else{
            System.out.println(" xoa that bai ");
        }
    }
    private void showList(){
        for(Vehicle item : vehicles ){
            if(item instanceof Car){
                System.out.println(((Car)item).toString());
            }else if(item instanceof Motobike){
                System.out.println(((Motobike)item).toString());
            }
        }
    }
    private void findVehicle(){
        System.out.println(" nhap ten hang sx  : ");
        String vehicleName= getScanner().nextLine();
        ArrayList<Vehicle> result= (ArrayList<Vehicle>) vehicles.stream()
                .filter(item -> item.getBrand().equalsIgnoreCase(vehicleName))
                .collect(Collectors.toList());
        if(result == null || result.isEmpty()){
            System.out.println(" khong tim thay ");
            return ;
        }
        // b2; duyet danh sach va hien thi ra
        for(Vehicle item : result){
            if(item instanceof Car){
                System.out.println(((Car)item).toString());
            }else if( item instanceof  Motobike){
                 System.out.println(((Motobike)item).toString());
            }
        }
    }
}

