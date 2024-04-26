package mng.tvi.java.Task;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a word");
        String inputWord = input.nextLine();
        StringBuilder sb = new StringBuilder(inputWord);
        String message = ((inputWord.equals(sb.reverse().toString())))? "The input string is a palindrome.": "The input string is not a palindrome.";
        System.out.println(message);
    }
    
}


// Write a program that takes a string as input and checks if it is a palindrome. A palindrome is a word, number, or other sequence of characters that reads the same forward and backward.
// Your program should perform the following steps:
// Use StringBuilder to create a new string that is a reverse of the input string.
// Use the equals() method to check if the input string and the reversed string are the same.
// If the strings are the same, print "The input string is a palindrome."
// If the strings are not the same, print "The input string is not a palindrome."