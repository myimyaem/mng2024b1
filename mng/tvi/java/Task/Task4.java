package mng.tvi.java.Task;

public class Task4 {
    public static void main(String[] args) {
        int grade = 175;
        if((grade>=90)&&(grade<=100))
            System.out.println("A grade");
        else if((grade<=80)&&(grade<=89))
            System.out.println("B grade");
        
        else
            System.out.println("invalid grade");    
    }
}


// A score of 90 to 100 gets an A grade
// A score between 80 to 89 gets a B grade
// A score between 70 to 79 gets a C grade
// A score between 60 to 69 gets a D grade
// A score below 60 gets an F grade