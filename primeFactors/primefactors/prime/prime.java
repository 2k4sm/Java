package prime;
import java.util.Scanner;

public class prime {
        public static void main(String [] args) {
            try (Scanner scan = new Scanner(System.in)) {
                int A = scan.nextInt();
                int B = scan.nextInt();
                int count = 0;
                int PN = 1;
                for (;A<=B;A++){
                    count++;
                   for (int i = 2;i<A;i++){
                       if(A%i == 0){
                           PN = 0;
                           break;
                       }
                   }
                   if (PN == 1){
                   }
                }
                System.out.println(count);
            }
        }
    
}
