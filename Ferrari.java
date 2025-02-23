
package Shariful;


class Ferrari extends Car {
   
    int fuelTankCapacity;

    
    public Ferrari(String brand, String model, double price, int fuelTankCapacity) {
        super(brand, model, price); 
        this.fuelTankCapacity = fuelTankCapacity;
    }

   
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity );
    }
}