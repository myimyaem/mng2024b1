package mng.tvi.java.Task;

import java.util.*;
    
public class Task8 {
    static int cumulativeSum(int a,int b, int c){
        return sumOfANumber(a)+sumOfANumber(b)+sumOfANumber(c);
    }
    static int sumOfANumber(int x){
        int sum = 0;
        for(int j=1;j<=x;j++)
            sum+=j;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("the cumulative sum of ("+a+"+"+b+"+"+c+")= "+cumulativeSum(a,b,c));
    }
}
// Write a program featuring an integer variable 
// arguments method. The method should return the sum 
// of all parameters and, for each parameter, 
// the cumulative sum up to that point. For instance,
//  given parameters (4, 5, 10), the program should 
//  compute the total for the first parameter, such as
//   4 = (1+2+3+4), and repeat this process for 
//   subsequent parameters

// 10+15+55