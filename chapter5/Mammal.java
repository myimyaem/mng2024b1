package chapter5;

/**
 * Mammal
 */
public class Mammal extends Animal {
    private int numberOfHair = 300;
    String msg = "I'm a mammal";
    boolean hasTail = false;
    Mammal(String name,int age,int numberOfHair,boolean hasTail){
        super(name,age);
        this.numberOfHair = numberOfHair;
        this.hasTail = hasTail;
    }
    public static void main(String[] args) {
        // Mammal m1 = new Mammal();
    }
    void getMsg(){
        System.out.println(msg);

    }
    
    

    
}