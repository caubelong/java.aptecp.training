/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1912_2503_book;


public class CompactDisk extends Product{
    private float duration;
    
    public CompactDisk() {
    
    }
    public CompactDisk(float duration, 
            String code, 
            String name,
            String description, 
            String procedure,
            double price) {
        super(code, name, description, procedure, price);
        this.duration = duration;
    }


    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getDuration() {
        return duration;
    }
    
    public void createConpactDisk(){
        super.CreateProduct();
        System.out.println("Enter duration  : ");
        this.duration=(Menu.getScanner().nextFloat());
    }
    @Override
    public String toString() {
        return  super.toString() + " CompactDisk{" + " duration= " + duration + '}';
    }
}
