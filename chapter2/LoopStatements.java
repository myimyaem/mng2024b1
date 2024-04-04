package chapter2;

public class LoopStatements {
    public static void main(String[] args) {
        int x = 0;
        while(x<10)
            System.out.println(x++);
        System.out.println("end of while loop "+ x);

        do
            System.out.println(x--);
        while (x>0);
        System.out.println("end of do while program "+ x);

        for(int a  = 0;a<10;a++)
            System.out.println("for loop a ="+a);
        System.out.println("end of for loop program "+ x);
        String[] colors = {"red","blue","green","black","white","pink","yellow"};
        for(String color: colors)
            System.out.println("this is color: "+color);
        
        System.out.println("the winning lotto numbers are:");
        int[] lottoNumbers = {22,45,56,07,8,33};
LOTTOLOOP:        for(int lottoNumber: lottoNumbers)
            System.out.print(lottoNumber+" ");
        System.out.println("\nCongratulations!!!!!");

ROW:        for(int row = 1;row<=7;row++){
COL:                for(int col = 1;col<=row;col++){
                        if(row==5)
                            break COL;
                        else if(col==2)
                            continue COL;
                        System.out.print(col*row);
                    }
                    System.out.println();
        }
    }
}
