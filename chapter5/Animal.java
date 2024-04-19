package chapter5;

/**
 * Animal
 */
public abstract class Animal { //extends java.lang.Object
    protected String name;
    protected int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public abstract String getName();
    public abstract int getAge();

    
}