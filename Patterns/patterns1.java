import java.util.Scanner;

public class patterns1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int plength = scan.nextInt();
        int spaces = 0;
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
        scan.close();
    }
}