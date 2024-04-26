package mng.tvi.java.Task;
import java.util.*;
public class Task7 {
    void addTwoNumbers(int a, int b){
        System.out.println("the sum of "+a+"+"+b+"= "+ (a+b));
    }
    void multiplyTwoNumbers(int a, int b){
        System.out.println("the sum of "+a+"+"+b+"= "+ (a+b));
    }
    void minusTwoNumbers(int a, int b){
        System.out.println("the difference of "+a+"-"+b+"= "+ (a-b));
    }
    void divideTwoNumbers(int a, int b){
        System.out.println("the sum of "+a+"+"+b+"= "+ (a+b));
    }
    void arithMethod(int a,int b){
        addTwoNumbers(a, b);
        minusTwoNumbers(a, b);
        divideTwoNumbers(a, b);
        multiplyTwoNumbers(a, b);
    }
    
    
    public static void main(String[] args) {
        Task7 t7 = new Task7();
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        t7.arithMethod(a, b);
        input.close();
        System.exit(0);
    }
    
}
// Create a a program where user inputs two 
// numbers and perform 4 basic arithmetic 
// operations using 4 methods with return types 
// and print the results.