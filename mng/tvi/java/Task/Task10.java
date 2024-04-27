package mng.tvi.java.Task;

public class Task10 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
        System.out.println("Book 1:\nTitle: "+book1.title+"\nAuthor: "+book1.author+"\nYear Published: "+book1.yearPublished+"\nPrice: $"+book1.price);
    }
}
// Book 1:
// Title: "Java Programming"
// Author: "John Smith"
// Year Published: 2021
// Price: $39.99

class Book{
    String title;
    String author;
    int yearPublished;
    double price;
    Book(String title,String author,int yearPublished,double price){
        this.title = title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.price=price;
    }
}
// Create a new Java class called "Book" with the 
// following attributes:
// String title
// String author
// int yearPublished
// double price

// Implement a constructor in the Book class that 
// takes four parameters corresponding to the 
// attributes and initializes them.Create a main 
// method in a separate class to test the constructor:
// Instantiate three Book objects with different 
// values using the constructor.
// Print out the details of each book
//  (title, author, yearPublished, and price) using System.out.println().