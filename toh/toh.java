import java.util.Scanner;

public class toh{
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        int N = scan.nextInt();
        t(N,"A","B","C");
        scan.close();
    }

    public static void t(int N, String A, String B, String C){
        if ( N == 0){
            return;
        }

        t(N-1,A,C,B);
        System.out.printf("%s ------> %s\n",A,B);
        t(N-1,C,B,A);
    }
}