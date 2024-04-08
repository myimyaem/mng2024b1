package chapter4;

public class Sample2 {
    
    public static void main(String[] args) {
        AccessModifierLesson aml1 = new AccessModifierLesson();
        aml1.callMe();
        aml1.callMeProtected();
        aml1.callMe1();
        // aml1.callMePrivate(); //error
    }
}
