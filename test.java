import java.util.Scanner;

public class test {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        /* 
        long SumNum1 = scan.nextInt();
        long Number2 = scan.nextInt();

        for (long i = SumNum1+1; i <= Number2;i++){
            SumNum1+=i;
        }
        System.out.println(SumNum1);
        scan.close();
        */
        /*
        long SumNum1 = scan.nextInt();
        long Number2 = scan.nextInt();

        for (long i = SumNum1+1; i <= Number2;){
            if(i%2 == 0){
                SumNum1+=i;
                i+=2;

            }else{
                i++;
            }
        }
        System.out.println(SumNum1-1);
        scan.close();
        */

        int Num1 = scan.nextInt();
        int revNum = 0;

        for (;Num1 > 0;){
            revNum = revNum*10 + (Num1%10);
            Num1 /=10;
        }
        System.out.println(revNum);

        scan.close();

        
        
    }
}
