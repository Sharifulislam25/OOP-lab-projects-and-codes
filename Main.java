// Defines the Car class (blueprint for creating car objects)
class Car {
    // Private instance variables (data members) to store car properties.
    // Declared as private to follow the concept of encapsulation.
    private String model;  // Stores the model of the car (e.g., "Model S")
    private String brand;  // Stores the brand of the car (e.g., "Tesla")
    private int year;      // Stores the manufacturing year (e.g., 2022)
    private double price;  // Stores the price of the car (e.g., 79999.99)

    // Constructor: Initializes all instance variables when an object is created.
    // The 'this' keyword is used to differentiate between instance variables and parameters.
    public Car(String model, String brand, int year, double price) {
        this.model = model;   // Assigns the provided model to the instance variable
        this.brand = brand;   // Assigns the provided brand to the instance variable
        this.year = year;     // Assigns the provided year to the instance variable
        this.price = price;   // Assigns the provided price to the instance variable
    }

    // Setter Methods (Mutators): Used to update the private instance variables.

    public void setModel(String model) {
        this.model = model;   // Updates the model of the car
    }

    public void setBrand(String brand) {
        this.brand = brand;   // Updates the brand of the car
    }

    public void setYear(int year) {
        this.year = year;     // Updates the manufacturing year of the car
    }

    public void setPrice(double price) {
        this.price = price;   // Updates the price of the car
    }

    // Getter Methods (Accessors): Used to retrieve the values of private instance variables.

    public String getModel() {
        return model;  // Returns the car model
    }

    public String getBrand() {
        return brand;  // Returns the car brand
    }

    public int getYear() {
        return year;   // Returns the car's manufacturing year
    }

    public double getPrice() {
        return price;  // Returns the car's price
    }
}

// Defines the Main class, which contains the program's entry point
public class Main {

    // The main() method is the starting point of execution in any Java program
    public static void main(String[] args) {

        // Creating an object of the Car class named teslaModelS
        // Using the constructor to initialize values
        Car teslaModelS = new Car("Model S", "Tesla", 2022, 79999.99);

        // Printing car details using getter methods
        System.out.println("Car Details:");  // Prints a heading for better readability

        // Fetches and prints the brand of the car using the getBrand() method
        System.out.println("Brand: " + teslaModelS.getBrand());

        // Fetches and prints the model of the car using the getModel() method
        System.out.println("Model: " + teslaModelS.getModel());

        // Fetches and prints the manufacturing year of the car using the getYear() method
        System.out.println("Year: " + teslaModelS.getYear());

        // Fetches and prints the price of the car using the getPrice() method
        System.out.println("Price: $" + teslaModelS.getPrice());
    }
}

