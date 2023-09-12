package queries;

import java.util.ArrayList;
import java.util.Scanner;

public class queries{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = {4,4,4,4,4,4,4,4};
        // int Qrr = scan.nextInt();
        // System.out.println(findQrr(A,Qrr));
        scan.close();

        ArrayList<Integer> N = unique(A);

        for (int i = 0; i < N.size();i++){
            System.out.println(N.get(i));
        }
    }

    public static boolean findQrr(int[] A,int Qrr){
        for (int i = 0; i < A.length;i++){
            if (A[i] == Qrr){
                return true;
            }
        }
        
        return false;
    }

    public static ArrayList<Integer> unique(int[]A){
        ArrayList<Integer> newA = new ArrayList<Integer>();
        for (int i = 0; i < A.length;i++){
            boolean Present = false;
            for (int j = 0; j < i;j++){
                if(A[i] == A[j]){
                    Present = true;
                    break;
                }
            }
            if (!Present){
                newA.add(A[i]);
            }
        }

        return newA;
    }
}