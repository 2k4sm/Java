package Factors;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Num = scan.nextInt();
        boolean NpCond = false;

        for (int i = 2 ;i <= (int)Math.sqrt((double)Num);i++){

            if ( Num %i == 0){
                NpCond = true;
                break;
            }
        }
        if(NpCond){
            System.out.printf("%d is Not-Prime\n",Num);
        }else{
            System.out.printf("%d is Prime\n",Num);
        }
        scan.close();
    }
}
