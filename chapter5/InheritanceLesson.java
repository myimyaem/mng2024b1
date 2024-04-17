package chapter5;

/**
 * InheritanceLesson
 */
public class InheritanceLesson {
    public static void main(String[] args) {
        Rat rat1 = new Rat("Stuart",2,320,true,15);
        Mammal mammal1 = new Mammal("unknwon",1,13,false);
        // rat1.parentMsg();
        rat1.getMsg();
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
    

}

class User{
    // name, mobile number, pin,balance,loan,email,idtype,cardID
}