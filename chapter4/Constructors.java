package chapter4;

public class Constructors {
    // public Constructors(){}
    public static void main(String[] args) {
        Bunny b1 = new Bunny();
        Bunny b2;
        Bunny b3 = b1;
        Bunny b4 = new Bunny("red");
        Bunny b5 = new Bunny("brown",2);
        
    }
}

class Bunny{
    private String color;
    int age;
    
    // public Bunny(String color) { // red
    //     this.color = color; } 
    public Bunny(String color) { // red
        this(color,1);    
         }
    public Bunny(String color,int age) { // red
            this.color = color; 
            this.age = age;
        } 
    
    public Bunny(){
        this("white",1);
           
        System.out.println("Bunny Constructor is called");
        
    }
   
    
}

class InitializationOrderSimple {
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    { System.out.println(COUNT); }
    { COUNT += 10; System.out.println(COUNT); }
    public InitializationOrderSimple() {
        System.out.println("constructor");
    }}
    class CallInitializationOrderSimple {
        public static void main(String[]  args) {
        InitializationOrderSimple init = new InitializationOrderSimple(); } }