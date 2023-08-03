import java.util.Scanner;

public class patterns3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tlength = scan.nextInt();
        int stars = 1;
        int spaces = (2*tlength)-1;
        for ( int i = 0; i< tlength; i++){
            for(int j = 0; j < spaces;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < stars;j++){
                System.out.print("*");
            }
            for(int j = 0; j < spaces;j++){
                System.out.print(" ");
            }
            System.out.println();
            stars+=2;
            spaces--;
        }
        int nstars = (3*tlength)+tlength-1;
        int spc = 0;
        for (int i = 0; i < tlength; i++){
            for (int k = 0; k < spc; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < nstars; j++){
                System.out.print("*");
            }
            spc++;
            nstars-=2;
            System.out.println();

        }
        for ( int i = 0; i< tlength; i++){
            for(int j = 0; j < spaces;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < stars;j++){
                System.out.print("*");
            }
            for(int j = 0; j < spaces;j++){
                System.out.print(" ");
            }
            System.out.println();
            stars+=2;
            spaces--;
        }
        
        for (int i = 0; i < tlength; i++){
            for (int k = 0; k < spc; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < nstars; j++){
                System.out.print("*");
            }
            spc++;
            nstars-=2;
            System.out.println();

        }
        

    }
}
