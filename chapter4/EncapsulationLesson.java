package chapter4;
import java.util.*;
public class EncapsulationLesson {
    public static void main(String[] args) {
        Swan tita = new Swan();
        Scanner numberEggsInput = new Scanner(System.in);
        System.out.println("Enter Number of eggs:");
        System.out.println(tita.getNumberEggs());
        tita.setNumberEggs(numberEggsInput.nextInt());
        System.out.println(tita.getNumberEggs());
        ImmutableSwan Ate = new ImmutableSwan(25);
        System.out.println(Ate.getNumberEggs());
        Ate = new ImmutableSwan(70);
        System.out.println(Ate.getNumberEggs());
        

    }
    
}
class Swan {
    private int numberEggs; // private
    public int getNumberEggs() { // getter
        return numberEggs;
    }
    public void setNumberEggs(int numberEggs) { // setter
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs; 
        else
            System.out.println("invalid amount");
    } 
}

class ImmutableSwan { 
    private int numberEggs;
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs; 
    }
    
    public int getNumberEggs() {
        return numberEggs; 
    } 
    }