import java.util.Scanner;

public class p1p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int plength = scan.nextInt();
        int spaces = 0;
        int pl = plength;
        int stars = 1;
        int spc = 2*plength-stars-1;
        for (;plength != 0;plength--){
            for (int i = 0; i < plength;i++){
                System.out.print("*");
            }
            for (int j = 0; j < spaces;j++){
                System.out.print(" ");
            }
            for (int i = 0; i < plength;i++){
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }

        for(;pl != 0; pl--){
            for (int i = 0; i < stars;i++){
                System.out.print("*");
            }
            for (int j = 0; j < spc;j++){
                System.out.print(" ");
            }
            for (int i = 0; i < stars;i++){
                System.out.print("*");
            }
            spc-=2;
            stars++;
            System.out.println();
        }
        scan.close();
    }
}
