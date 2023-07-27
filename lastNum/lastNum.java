package lastNum;

import java.util.Scanner;

public class lastNum{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int Num = scan.nextInt();

        System.out.println("LastNum: "+Num%10);
        scan.close();
    }

     
}

