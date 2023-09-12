package queries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class queries{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = {4,4,4,4,4,4,4,4};
        int B[] = {4,2,4,5,6,4,4,5};

        //printCommonElement(A, B);
        // int Qrr = scan.nextInt();
        // System.out.println(findQrr(A,Qrr));
        scan.close();

         HashSet<Integer> N = unique(B);

        System.out.println(N);
    }

    public static void printCommonElement(int[] A, int[] B) {
        for (int i = 0; i < A.length;i++){
            if (findQrr(A,B[i])){
                System.out.println(B[i]);
            }
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

    public static HashSet<Integer> unique(int[]A){
        HashSet<Integer> newA = new HashSet<Integer>();
        for (int i = 0; i < A.length;i++){
            if (!newA.contains(A[i])){
                newA.add(A[i]);
            }
        }

        return newA;
    }
}