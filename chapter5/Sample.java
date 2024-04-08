package chapter5;
import chapter4.AccessModifierLesson;
public class Sample {
    public static void main(String[] args) {
        AccessModifierLesson aml1 = new AccessModifierLesson();
        aml1.callMe(); 
        // aml1.callMeProtected(); // error
    }
    
}
class Class3 extends AccessModifierLesson{
    public static void main(String[] args) {
        Class3 c1 = new Class3();
        c1.callMeProtected();
    }
}