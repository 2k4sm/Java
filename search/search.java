package search;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter length of the array: ");
        int arrLength = scan.nextInt();
        int arrNum[] = new int[arrLength];
        
        for (int i = 0; i< arrLength; i++){
            System.out.printf("Enter Number %d: ",i+1);
            arrNum[i] = scan.nextInt();
        }
        
        System.out.print("Enter the Number to Search For: ");
        int searchNum = scan.nextInt();

        System.out.printf("Search result: %b\n",Search(arrNum,searchNum));
        System.out.print("Enter No to count Freq: ");
        int countNum = scan.nextInt();
        System.out.print("Freq: ");
        System.out.println(frequency(arrNum, countNum));
        scan.close();
    }
    public static int frequency(int Nums[], int countNum){
        int count = 0;
        for (int i = 0; i<Nums.length; i++){
            if (Nums[i] == countNum){
                count++;
            }
        }
        return count;
    }
    public static boolean Search(int Nums[], int searchNum){
        for (int i = 0; i<Nums.length; i++){
            if (Nums[i] == searchNum){
                return true;
            }
        }
        return false;
    }
}
