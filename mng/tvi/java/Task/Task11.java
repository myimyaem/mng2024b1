package mng.tvi.java.Task;

public class Task11 {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Territory", 2021, 4);
        Car car2 = new Car("Porsche", "911", 2018, 2);
        car1.displayDetails();
        car2.displayDetails();
    }
    
}
class Vehicle{
    
    String make;
    String model;
    int year;
    Vehicle(String make,String model,int year){
        this.make =make;
        this.model =model;
        this.year =year;
    }
}
// Car Details: 
// Make: Toyota 
// Model: Camry 
// Year: 2022 
// Number of Doors: 4
class Car extends Vehicle{
    int numberOfDoors;
    Car(String make,String model,int year,int numberOfDoors){
        super(make,model,year);
        this.numberOfDoors = numberOfDoors;
    }
    void displayDetails(){
        System.out.println("Car Details:\nMake: "+this.make+
        "\nModel: "+this.model+
        "\nYear: "+this.year+
        "\nNumber of doors: "+this.numberOfDoors+"\n");
    }
}
// 1. Create a base class called Vehicle with the following attributes:
// make (String): The make of the vehicle.
// model (String): The model of the vehicle.
// year (int): The manufacturing year of the vehicle
// 2. Create a derived class called Car that extends the Vehicle class. The Car class should have an additional attribute:
// numberOfDoors (int): The number of doors in the car.
// 3. Create an instance of the Car class and set values for its attributes.
// 4. Implement a method in the Car class called displayDetails() that prints out the details of the car, including the inherited attributes from the Vehicle class.