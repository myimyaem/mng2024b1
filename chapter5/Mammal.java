package chapter5;

/**
 * Mammal
 */
public abstract class Mammal extends Animal {
    protected int numberOfHair = 300;
    String msg = "I'm a mammal";
    boolean hasTail = false;
    Mammal(String name,int age,int numberOfHair,boolean hasTail){
        super(name,age);
        this.numberOfHair = numberOfHair;
        this.hasTail = hasTail;
    }
    
    void getMsg(){
        System.out.println(msg);

    }
    public String getName(){
        return super.name;
    }
    public abstract int getNumberOfHair();
    
    
    

    
}