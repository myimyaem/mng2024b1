package chapter3;

import java.util.Scanner;

public class StringBuilderLesson {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder c = new StringBuilder("abcdefg");
        StringBuilder b = a.append("de");
        StringBuilder d = new StringBuilder(5);
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a==c);
        System.out.println(a.length());
        System.out.println(a.capacity());
        b.insert(5, "z");
        System.out.println("b=" + b);
        System.out.println(a.reverse());
        System.out.println(b);
        String e = "gfzedcba";
        System.out.println(a.toString().equals(e));
        //task guide
        System.out.println("enter a word:");
        Scanner input = new Scanner(System.in);
        String q = "abc";
        StringBuilder ee = new StringBuilder(input.nextLine());
        
        if(ee.toString().equals(q))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
