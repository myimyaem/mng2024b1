package chapter4;

import java.util.Scanner;

public class AccessModifierLesson {
    
    public void callMe(){
        System.out.println("AccessModifierLesson method callMe()");
    }
    private void callMePrivate(){
        System.out.println("AccessModifierLesson method callMePrivate()");
    }
    protected void callMeProtected(){
        System.out.println("AccessModifierLesson method callMeProtected()");
    }
    void callMe1(){
        System.out.println("AccessModifierLesson method default callMe1()");
        
    }
    double get10Percent(int x){

        return (x*0.10);
    }
    String reverString(String x){
       StringBuilder sb = new StringBuilder(x);
       return sb.reverse().toString();
    }
    // String walk6(int a) {
    //     if (a == 4) return "";
    //     }
        
    public static void main(String[] args) {
        AccessModifierLesson aml1 = new AccessModifierLesson();
        aml1.callMePrivate();
        System.out.println("10% of 545 is "+aml1.get10Percent(545));
        System.out.println(aml1.reverString("marc yim"));
    }
}

class Class2{
    public static void main(String[] args) {
        AccessModifierLesson aml1 = new AccessModifierLesson();
        // aml1.callMePrivate(); //error
        aml1.callMe1();
    }
}
class Task6Guide{
    int largestNumber(int x, int y,int z){
        return 0;
    }
    public static void main(String[] args) {
        Task6Guide t = new Task6Guide();
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("input 1st number:");
        a = input.nextInt();
        System.out.println("input 2nd number:");
        b = input.nextInt();
        System.out.println("input 3rd number:");
        c = input.nextInt();
        // if(){
            // System.out.println("all inputs are equal");
        // } //if all are equal
        // else
            System.out.println("The Largest number is "+t.largestNumber(a, b, c));

    }
}
