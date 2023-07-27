package PGD;

import java.util.Scanner;

public class PGD {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int Num = scan.nextInt();
        int sum = 0 ;
        sum += Num%10;
        Num /= 10;
        sum += Num%10;



        if ((sum)%5 == 0){
            System.out.println("Platinum");
        }else if ((sum)%3 == 0){
            System.out.println("Gold");

        }else if ((sum)%2 != 0 && sum%3 != 0 && sum%5 != 0){
            System.out.println("Diamond");

        }else{
            System.out.println("None");

        }
        scan.close();

    }
    
}
