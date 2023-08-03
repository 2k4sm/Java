import java.util.Scanner;

public class patterns2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int plength = scan.nextInt();
            int stars = 1;
            int spaces = 2*plength-stars-1;
            for (;plength != 0;plength--){
                for (int i = 0; i < stars;i++){
                    System.out.print("*");
                }
                for (int j = 0; j < spaces;j++){
                    System.out.print(" ");
                }
                for (int i = 0; i < stars;i++){
                    System.out.print("*");
                }
                spaces-=2;
                stars++;
                System.out.println();
            }
            scan.close();
        }
    }
}
