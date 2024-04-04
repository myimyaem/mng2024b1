package chapter2;

public class OperatorsAndStatements1 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ value:"+ x++);
        System.out.println("x++ after line 6: "+x);
        int y = 20;
        System.out.println("++y value:"+ ++y);
        System.out.println("++y after line 9: "+y);
        System.out.println(4%2);
        // shift operators
        System.out.println(1<<2);
        // 0000 0001 << 2
        // 0000 0100

        // 8 4 2 1
        // 0 1 1 1 = 7
        // 1100 0001
        System.out.println(7>>2);
        float z = 0;
        System.out.println(z+y);
        byte a = 1;
        byte b = 1;
        double c =2;
        System.out.println(a+b+c);
        long q = 10;
        int w = 5;
        // w = w*q;
        w*=q; // w=(int)w*q;
        System.out.println(w);
        long d = 5;
        long e = (d=5*5);
        System.out.println(d);
        System.out.println(e);
        
    }
    
}
