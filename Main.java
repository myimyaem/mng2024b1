// this is the main class file that prints Hello MNG TVI
/*
 * dfgdfgd dfgdfgdfg dfgdfgdfg d fgdfgdfgdf dfgdfgdfg 
 * dfgdfgdfgdfgdf dfgdfgdfg dfgdfg
 * dfgdfgdfg dfgdfgd
 * dfgdfgdfg
 */

import java.util.Random;


import mng.tvi.java.*;
import mng.tvi.Hi;

/**
 * this is just a test source code for java basics
 * part 1 for MNG batch 1 2024
*/
public class Main{
    int x = 10;

    public Main(){
        System.out.println("this is a string from Main constructor ");
        System.out.println("this is also a string from Main constructor");
    }
    public void Main(){
        System.out.println("this is a string from Main void method ");
        System.out.println("this is also a string from Main void method");
    }
    { System.out.println("this is intance ini block 1");}
    public static void main(String[] args) {
        Random r = new Random();
        // Randomizer rr = new Randomizer();
        int x = Integer.parseInt(args[0]);
        System.out.println(r.nextInt(x));
        System.out.println("Hello MNG TVI");
        Hello h1 = new Hello();
        h1.greet();
        mng.tvi.java.Hi h2 = new mng.tvi.java.Hi();
        Hi hi3 = new Hi();
        h2.greet();
        Main m1 = new Main();
        m1.Main();
    }
    { System.out.println("this is intance ini block 2");}
}

 class Plant{
    public int NumberOfLeaves = 3;
    String color = "Green";
    public void setNumberOfLeaves(int numberOfLeaves) {
        NumberOfLeaves+=numberOfLeaves;
    }
    public void isSunny(boolean sunny){
        if(sunny)
            setNumberOfLeaves(1);
    }
    public void getNumberOfLeaves(){
        System.out.println(NumberOfLeaves);
    }
    public static void main(String[] args) {
        System.out.println("I am groot");
        Plant snakePlant = new Plant();
        snakePlant.color = "Yellow Green";
        snakePlant.isSunny(true);
        snakePlant.getNumberOfLeaves();
        Plant Kamote = new Plant();
        Kamote.color = "Voilet";
        Kamote.isSunny(true);
        Kamote.isSunny(true);
        Kamote.isSunny(true);
        Kamote.isSunny(true);
        Kamote.getNumberOfLeaves();
        Main m1 = new Main();
        Name name1 = new Name();
        System.out.println(name1.full);
        Name name2 = new Name();
        name2.first = "Marc";
        name2.last = "Yim";
        System.out.println(name2.full);
        // Plant p4 = new Plant(4,"Yellow");
        // Plant p5 = new Plant(51,"red green");
    }
}
    class Name {
        String first = "Theodore";
        String last = "Moose";
        String full = first + last;
        }
