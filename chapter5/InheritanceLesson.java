package chapter5;

/**
 * InheritanceLesson
 */
public class InheritanceLesson {
    public static void main(String[] args) {
        Rat rat1 = new Rat("Stuart",2,320,true,15);
        // Mammal mammal1 = new Mammal("unknwon",1,13,false);
        // Animal animal = new Animal();
        // rat1.parentMsg();
        rat1.getMsg();
        rat1.eat();
    }

    
}

class Rat extends Mammal{
    int tailSize;
    int modelID;
    Rat(String name,int age,int numberOfHair,boolean hasTail,int tailSize){
        super(name,age,numberOfHair,hasTail);
        this.tailSize = tailSize;
    
    }
    void parentMsg(){
        System.out.println();
        super.msg ="i'm rat";
        super.getMsg();
    }
    @Override
    public void getMsg(){
        System.out.println(msg);
        System.out.println("this print is overidden by Rat class");
    }
    
    public int getAge(){
        return super.age;
    }
    public int getNumberOfHair(){
        return super.numberOfHair;
    }


}
class Dog extends Mammal{

    Dog(String name, int age, int numberOfHair, boolean hasTail) {
        super(name, age, numberOfHair, hasTail);
    }

    @Override
    public int getNumberOfHair() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumberOfHair'");
    }

    

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAge'");
    }

}
class User{
    // name, mobile number, pin,balance,loan,email,idtype,cardID
}

class Bear {
    public static void eat(){
        System.out.println("Bear is eating");
    }
    public static void sneeze(){
        System.out.println("Bear is sneezing");
    }
    public void hybernate(){
        System.out.println("Bear is hybernating");
    }
}
class Panda extends Bear implements Herbivore,Omnivore, WalksOnFourLegs{
    public static void eat(){
        System.out.println("Panda is eating");
    }
    // public void sneeze(){

    // }
    // public static void hybernate(){

    // }
    void eat2(){
        super.eat();
    }
    public static void main(String[] args) {
        Panda.eat();
        Panda p1 = new Panda();
        p1.eat2();
        p1.eat();
        Bear.eat();
        p1.eatLeaf();
        p1.eatMeat();
        System.out.println(MAX_CAPACITY);
        System.out.println(p1.getLeafTemp());
        Herbivore.eatLeaf(21);
    }

    @Override
    public void eatLeaf() {
       System.out.println("eat leaf");}
    @Override
       public void eatMeat() {
          System.out.println("eat meat");}

   
    
}

interface WalksOnFourLegs{}
interface hasTrunk{}
interface Herbivore{
    static void eatLeaf(int x){
        System.out.println(x++);
    }
}
interface Omnivore{
    int MAX_CAPACITY = 21;
    void eatLeaf();
    void eatMeat();
     default double getLeafTemp(){
        return 10.0;
    }
}


// video implements play, edit, share
// pdf implements view, edit, print, share
// docx implements view, edit, print, share
// image implements view, edit, print, share