package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2"); //s1+"2" - "1"+"2"
        s2.concat("3"); // "12" + "3"
        System.out.println(s2);
        String a = "Volumenometer";
        System.out.println(a+ " length is "+a.length());
        System.out.println(a+ " charAt(0) or first character is "+a.charAt(0));
        System.out.println(a+ " indexOf('u') is: "+a.indexOf('u'));
        System.out.println(a+ " indexOf(\"nome\") is: "+a.indexOf("nome"));
        System.out.println(a+ " indexOf(\"nomer\") is: "+a.indexOf("nomer"));
        
        // int score =96;
        // if(score >=90)
        //     System.out.println("A Grade");
        // else if(score>=85)
        //     System.out.println("B Grade");
    }
}
