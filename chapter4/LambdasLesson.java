package chapter4;

import java.util.*;

public class LambdasLesson {
    // static void printAnimals(List<Animal> animals, CheckTrait checker ){
    //     for(Animal animal:animals){
    //         if(checker.test(animal))
    //             System.out.println(animal);
    //     }
    // }

    static void printAnimals(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal))
                System.out.println(animal);
        }
    }
    static void printFruits(List<Fruit> fruits, Predicate<Fruit> checker){
        for(Fruit fruit:fruits){
            if(checker.test(fruit))
                System.out.println(fruit);
        }
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        animals.add(new Animal("frog", true, true));
        animals.add(new Animal("kaola", false, false));
        System.out.println("Can Hop:");
        // printAnimals(animals, new CheckIfHopper());
        printAnimals(animals, a -> a.canHop());
        System.out.println("Can Swim:");
        // printAnimals(animals, new CheckIfSwimmer());
        printAnimals(animals, a-> a.canSwim());
        System.out.println("Can Hop and can swim:");
        printAnimals(animals, a -> a.canHop() && a.canSwim());
        System.out.println("Can't Hop and can't swim:");
        printAnimals(animals, a -> !a.canHop() && !a.canSwim());
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Orange", true, false));
        fruits.add(new Fruit("Water Melon", true, false));
        fruits.add(new Fruit("Dalanghita", false, true));
        fruits.add(new Fruit("Sampaloc", false, true));
        System.out.println("sweet fruits:");
        printFruits(fruits, a-> a.isSweet());
        System.out.println("bitter fruits:");
        printFruits(fruits, a-> a.isBitter());
    }
}
class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, 
                    boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer; }
    
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
}
class Fruit {
    private String species;
    private boolean isSweet;
    private boolean isBitter;
    public Fruit(String speciesName, 
                    boolean sweet, boolean bitter){
        species = speciesName;
        isSweet = sweet;
        isBitter = bitter; }
    
    public boolean isSweet() { return isSweet; }
    public boolean isBitter() { return isBitter; }
    public String toString() { return species; }
}
// interface CheckTrait {
//     boolean test(Animal a); }
interface Predicate<T> { 
    boolean test(T t); }
// class CheckIfHopper implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canHop(); 
//     } 
// }
// class CheckIfSwimmer implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canSwim(); 
//     } 
// }