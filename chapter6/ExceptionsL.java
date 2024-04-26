package chapter6;

import java.util.Scanner;

public class ExceptionsL{
    static void excp() throws RuntimeException{
        throw new RuntimeException();
    } 
    public static void main(String... args) throws Exception,RuntimeException{
        int[] x = new int[9];
        int y =0;
        
        // System.out.println(0);
        switch (y) {
            case 1: throw new RuntimeException();
            case 2: throw new RuntimeException("Ow! I fell.");  
            case 3: throw new Exception();
            case 4: throw new Exception("Ow! I fell.");  
        }
        Scanner input = new Scanner(System.in);
        boolean go = true;
        byte z=0;
        while (go) {
            System.out.println("enter a valid number:");
            try {
                z = Byte.parseByte(input.nextLine());
                go = false;   
                if(z==4)
                    System.exit(0);
            }
             catch (IndexOutOfBoundsException iytuiyuie) {
                System.out.println(iytuiyuie);
            } catch (NumberFormatException e) {
                
                System.out.println(e);
            } 
            catch (RuntimeException e) {
                System.out.println(e);
            } 
            finally{
                System.out.println("always run");
            }
               
        }
        System.out.println(z+" is a valid number");
        // try
        //     System.err.println();
        // catch()
        //     System.err.println();
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            
        }
        
    }
}