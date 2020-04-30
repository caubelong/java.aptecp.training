package pkg1912_2703_vehicle;

/**
 *
 * @author Microsoft Windows
 */
public class Car extends Vehicle {

    private int numberOfSeats;
    private String engineType;

    public Car() {
    }

    public Car(int numberOfSeats,
            String engineType,
            String brand, int year,
            double price,
            String color) {
        super(brand, year, price, color);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public void createCar(){
        super.CreateVehicle();
        System.out.println(" enter number Of Seats :");
        this.numberOfSeats= VehicleManagement.getScanner().nextInt();
        System.out.println(" enter engine type :");
        this.engineType= VehicleManagement.getScanner().nextLine();
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "numberOfSeats=" 
                + numberOfSeats 
                + ", engineType="
                + engineType + '}';
    }

}
