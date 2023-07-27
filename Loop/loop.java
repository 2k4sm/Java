package Loop;

import java.util.Scanner;

public class loop {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int Num1 = scan.nextInt();
        int Num2 = scan.nextInt();
        int count = 0;

        for (int i = Num1; i <= Num2+1; i+=2){
            count++;
            if (i%2 == 0){
                System.out.println(i);
                

            }else{
                i++;
                System.out.println(i);
            }
        }
        System.out.printf("Count: %d\n",count);
        scan.close();
    }
}
