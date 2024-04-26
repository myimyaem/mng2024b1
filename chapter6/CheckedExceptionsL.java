package chapter6;
import java.util.*;
import java.io.*;
public class CheckedExceptionsL {
    static FileInputStream readMyFile = null;
    static FileOutputStream writeMyfile = null;
    static File file = new File("chapter6/readmy.txt");
    static void FileNotFoundExceptionL() {
                
        try{
             readMyFile = new FileInputStream(file);
             System.out.println("file found");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        finally{
           
                
        }

    }
    static void IOExceptionL(){
        Scanner input = new Scanner(System.in);
        String readMSG;
        try{
            readMyFile = new FileInputStream(file);
            
            int byteData;
            while ((byteData = readMyFile.read())!=-1){
                // readMSG += (String);
            } 
            System.out.println("\n end of file contents do you want to write?");
            switch (input.nextLine()) {
                case "y":
                case "yes":
                    System.out.println("Enter your message: ");
                    String msg = input.nextLine();
                    writeMyfile = new FileOutputStream(file);
                    writeMyfile.write(msg.getBytes());
                    writeMyfile.close();
                    System.out.println("you added a text: "+msg);
                    break;
            
                default:
                    break;
            }
            readMyFile.close();
       }
       catch(IOException e){
           System.out.println(e);
       }
       finally{
        System.out.println("all input and output are closed");
       }
    }
    public static void main(String[] args) {
        // FileNotFoundExceptionL();
        IOExceptionL();
    }
}
