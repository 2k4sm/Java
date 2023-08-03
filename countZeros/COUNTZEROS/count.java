package COUNTZEROS;

import java.util.Scanner;

public class count{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int Num = scan.nextInt();
            int N = Num;

            int factZero = 0;
            int cnt = 0;
            for (;Num > 0;Num/=5){
                cnt++;
                factZero += Num/5;
            }
            System.out.printf("Zeroes in the factorial of %d is %d\n",N,factZero);
            System.out.println(cnt);
            scan.close();
        }
    }   
}