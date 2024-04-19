package chapter5;

public class Primate {
    public boolean hasHair(){
        return true;
    }
    
}
interface HasTail{
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail{

    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age =10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        Object LemurAsObject = lemur;
        System.out.println();

        // System.out.println(hasTail.age);
        // System.out.println(primate.isTailStriped());

    }
}