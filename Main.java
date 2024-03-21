// this is the main class file that prints Hello MNG TVI
/*
 * dfgdfgd dfgdfgdfg dfgdfgdfg d fgdfgdfgdf dfgdfgdfg 
 * dfgdfgdfgdfgdf dfgdfgdfg dfgdfg
 * dfgdfgdfg dfgdfgd
 * dfgdfgdfg
 */

import java.util.Random;

import mng.tvi.java.*;

/**
 * this is just a test source code for java basics
 * part 1 for MNG batch 1 2024
*/
public class Main{
    public static void main(String[] args) {
        Random r = new Random();
        int x = Integer.parseInt(args[0]);
        System.out.println(r.nextInt(x));
        System.out.println("Hello MNG TVI");
        Hello h1 = new Hello();
        h1.greet();
        Hi h2 = new Hi();
        h2.greet();
    }
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

    }
}
