package chapter6;
import java.util.*;
public class RuntimeExceptionsL {
    static void ArithmeticExceptionL(){
        System.out.println(123/0);
    }
    static void ArrayIndexOutOfBoundsExceptionL(){
        int[] p = new int[9];
        // [0]-[8]
        System.out.println(p[9]);
    }
    static void ClassCastExceptionL(){
        Parent c = new ChildOfParent();
        Object a = c;
        Relative d = (Relative) a;
        System.out.println(d);
    }
    static void IllegalArgumentExceptionL(int x){
        if(x<0)
            throw new IllegalArgumentException("x must have a positive number");
        System.out.println("x is a valid positive integer");
    }
    static void NullPointerExceptionL(){
        String Name =null;
        System.out.println(Name.length());
    }
    static void NumberFormatExceptionL(){
        System.out.println("enter a valid number");
        Scanner input= new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        System.out.println(x);

    }
    public static void main(String[] args) {
        // ArithmeticExceptionL();
        // ArrayIndexOutOfBoundsExceptionL();
        // ClassCastExceptionL();
        // IllegalArgumentExceptionL(-1);
        // NullPointerExceptionL();
        NumberFormatExceptionL();
    }
    
}
class Parent{

}
class ChildOfParent extends Parent{

}
class Relative{

}