
package Shariful;


public class Main {
    public static void main(String[] args) {
      
        Audi audi = new Audi("Audi", "A6", 50000, 85);
        Ferrari ferrari = new Ferrari("Ferrari", "488", 250000, 80);
        Lamborghini lamborghini = new Lamborghini("Lamborghini", "Aventador", 400000, 350);


        System.out.println("Audi Details:");
        audi.displayInfo();
        
        System.out.println();
        
        System.out.println("Ferrari Details:");
        ferrari.displayInfo(); 
        
        System.out.println();
        
        System.out.println("Lamborghini Details:");
        lamborghini.displayInfo(); 
    }
}