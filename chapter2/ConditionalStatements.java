package chapter2;

public class ConditionalStatements {
    public static void main(String[] args) {
        int HourOfDay = 18;
        int greetCounter =0;
        if(HourOfDay<12){
            System.out.println("Good Morning");
            greetCounter++;
        }
        else if(HourOfDay<18){
            System.out.println("Good Afternoon");
            greetCounter++;
        }
        else{
            System.out.println("Good Evening");
            greetCounter++;
        }
        System.out.println(greetCounter);
        int dayOfWeek = 2;
        switch (dayOfWeek) {
            
            case 1:
                System.out.println("Monday");
                break;
           
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Sunday");
                break;
            
        }
        
    }
}
