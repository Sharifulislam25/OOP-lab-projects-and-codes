
package Shariful;


class Lamborghini extends Car {

    int speed;


    public Lamborghini(String brand, String model, double price, int speed) {
        super(brand, model, price); 
        this.speed = speed;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Top Speed: " + speed );
    }
}