package chapter4;

public class MethodOverloadLesson {
    int valInt(){
        return 3;
    }
    public void fly(int numMiles) { 
        System.out.println("int value is "+numMiles);
     } 
    //  public boolean fly(int numMiles,int p) { 
    //     return false;
    //  } 
    public void fly(Integer numMiles) { 
        System.out.println("Integer value is "+numMiles);
    }
    public void fly(short numFeet) { 
        System.out.println("short value is "+numFeet);
     }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception 
    { }
    public void fly(String s) { 
        System.out.println("string "); 
    } 
    public void fly(Object o) { 
        System.out.println("object "); 
    } 
    public static void main(String[] args) {
        MethodOverloadLesson mol = new MethodOverloadLesson();
        short a = 23;
        int b = 43;
        Integer c = 43;
        mol.fly(a);
        mol.fly(b);
        mol.fly(c);
        mol.fly("Hello");
        mol.fly(true);
        
        // mol.fly(1,2);
    }
}
