package Puzzle;

import java.util.Scanner;

public class puzzle {
    public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);

        int Num = scan.nextInt();
        int ldigit = 0;
        int count = 0;
        for (;Num != 0; Num/=10){
            ldigit = Num%10;
            count ++;
            System.out.printf("Digit %d: %d\n",count,ldigit);
        }
        scan.close();

    }
    

}
