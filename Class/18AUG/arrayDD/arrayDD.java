package arrayDD;

import java.util.Scanner;

public class arrayDD{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i<N;i++){
            for (int j = 0; j<M;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        // for (int i = 0; i<N;i++){
        //     for (int j = 0; j<M;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // scan.close();
        
        // System.out.println("Max is:"+max(arr));
        // scan.close();

        //System.out.println("Sum Is Present:"+isSum(arr, 20));
        
        for (int i = 0; i<N;i++){
            for (int j = 0; j<M;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();

        for (int i = N-1; i>=0;i--){
            for (int j = M-1; j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();


        //System.out.println("maxIndex: "+rowMaxInd(arr));
        




    }

    public static boolean isSum(int[][]arr,int sum){
        for (int i = 0; i<arr.length;i++){
            for (int j = 0;j<arr[i].length-1;j++){
                if (arr[i][j]+arr[i][j+1] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    public static int max(int[][] arr){
        int maxtemp = 0;
        for (int i = 0; i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                if (arr[i][j] > maxtemp){
                    maxtemp = arr[i][j];
                }
            }
        }
        return maxtemp;
    }

    public static int rowMaxInd(int[][]arr,int B){
        int indexMax = 0;
        int max = 0;
        for (int i = 0; i<arr.length;i++){
            int sum = 0;
            for (int j = 0; j<arr.length;j++){
                sum += arr[i][j];

            }
            if (sum > max){
                max = sum;
                indexMax = i;
            }
            if (indexMax == B){
                return max;
            }
        }

        return indexMax;
    }


    
}