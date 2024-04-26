package chapter6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class MoreTryCatchL {
    void explore(){
        try {
            fall();
            seeAnimals();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp(e.getMessage());
        }
        finally{
            seeMoreAnimal();
        }
        System.out.println("go home it's getting dark");
    }

     void seeMoreAnimal() {
        System.out.println("explore another place for animals");
        }

     void seeAnimals() {
        Random r = new Random();
        if(r.nextInt(10)%2==0)
            throw new AnimalsOutForAWalk();
        }

     void getUp(String msg) {
        System.out.println(msg);
        }

     void fall() {
        
        throw new RuntimeException("we 'fall' in to something");
    }
    void sample2(){
        String s = "";
        try{
            s+="t";
        } catch(Exception e){
            s+="c";
        } finally{
            s+="f";
        }
        s+="a";
        System.out.println(s); //tfa
    }
    public void visitPorcupine() {

        try { seeAnimals(); 
            System.out.println("you saw a cute Porcupine");
        }
        catch (AnimalsOutForAWalk e) {
        
        // first catch block
        
        System.out.print("try back later"); }
        
        catch (ExhibitClosed e) {
        
        // second catch block
        
        System.out.print("not today");
        
        } }
        
    public static void main(String[] args) {
        MoreTryCatchL ml = new MoreTryCatchL();
        // ml.explore();
        // ml.sample2();
        ml.visitPorcupine();
    }
}
class AnimalsOutForAWalk extends
RuntimeException { }

class ExhibitClosed extends
RuntimeException { }

class ExhibitClosedForLunch
extends ExhibitClosed { }

class FileReaderSample{
    
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
                }
            }

            //  try {
            //         throw new RuntimeException();
            //      } catch (RuntimeException e) {
            //         throw new RuntimeException();
            //      } finally {
            //         throw new Exception();
            //      }
    }
    private static FileReader read()
    throws IOException {
        return null;
    // CODE GOES HERE
    }
}