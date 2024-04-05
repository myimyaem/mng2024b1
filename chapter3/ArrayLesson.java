package chapter3;
import java.util.*;
public class ArrayLesson {
    public static void main(String args[]) {
        int [] y = new int[3];
        int x [] = {45,43,66,47}; 
        int[] a,b;
        int q[] = new int[2], e;
        e = 9;
        q[0]=1;
        q[1]=4;
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString());
        // q[2]=5;
        System.out.println("array");
        System.out.println(bugs[2]);
        String[] birds = new String[6];
        System.out.println(birds.length);
        char ch[]= new char[4];
        float[] flt = new float[4];
        double[] dbl = new double[4];
        boolean[] blean = new boolean[4]; 
        // int yy = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;
        
        System.out.println(numbers.toString());
        for(int number:numbers)
            System.out.println(number);
        int sorter[] = {5,87,1215,452,145,2,4,2234,5,224,2456,74,16,8};
        Arrays.sort(sorter);
        for(int number:sorter)
            System.out.println(number);
        System.out.println("*****************");
        String Stringsorter[] = {"5","87","1215","452","145","2","4","2234","5","224","2456","74","16","8"};
        Arrays.sort(Stringsorter);
        for(String StringNumber:Stringsorter)
            System.out.println(StringNumber); 
        // String [][] rectangle = new String[3][2];
        String [][] rectangle = new String[3][2]; 
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
        System.out.println("differentSize[2][1] = "+differentSize[2][1]);  
        int yy = 0;

    }
    
}
