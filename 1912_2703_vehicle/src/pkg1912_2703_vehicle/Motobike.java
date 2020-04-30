/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1912_2703_vehicle;


public class Motobike extends Vehicle{
    private double power; // công xuất

    public Motobike() {
    }

    public Motobike(int production, String brand, 
            int year, 
            double price,
            String color) {
        super(brand, year, price, color);
        this.power = production;
    }

    public double getPower() {
        return power;
    }
    public void createMoto(){
        super.CreateVehicle();
        System.out.println(" enter power :");
        this.power= VehicleManagement.getScanner().nextDouble();
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motobike{"  + super.toString() + "production=" + power + '}';
    }
    
    
}
