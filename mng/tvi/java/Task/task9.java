package mng.tvi.java.Task;
import static java.lang.Math.*;
public class task9 {
    public static int add(int a, int b) {
        // Your code here
        return Math.addExact(a,b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a,b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a,b);
    }

    public static float divide(int a, int b) {
        return Math.floorDiv(a,b);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations here
        System.out.println(add(45,678));
        System.out.println(subtract(45,678));
        System.out.println(multiply(45,678));
        System.out.println(divide(20,3));
    } 
}
