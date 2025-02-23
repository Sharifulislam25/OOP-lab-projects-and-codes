
package Shariful;

class Audi extends Car {
    
    int batteryCapacity;

    
    public Audi(String brand, String model, double price, int batteryCapacity) {
        super(brand, model, price); 
        this.batteryCapacity = batteryCapacity;
    }

    
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Battery Capacity: " + batteryCapacity );
    }
}