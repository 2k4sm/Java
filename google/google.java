import java.util.ArrayList;
import java.util.List;

public class google{
    public static void main(String[] args) {
        int[] A = new int[5];
        int[][] Q = {
            {1,3,3},
            {0,1,2},
            {2,2,-1},
            {2,4,5}
        };

        int[] ans = indSum(A, Q);

        for (int i : ans){
            System.out.print(i+ " ");
        }
        System.out.println();
        
    }
    public static int[] indSum(int[] A,int[][] Q){
        int[] indSum = new int[A.length];

        for (int i = 0; i < Q.length;i++){
            int Sind = Q[i][0];
            int Eind = Q[i][1];
            int val = Q[i][2];
            indSum[Sind] += val;
            indSum[Eind] += -val;
        }
        
        return indSum;
    }
}