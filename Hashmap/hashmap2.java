package Hashmap;

public class hashmap2 {
    public static void main(String[] args) {
        int[] A = {2,3,5,1,3,5,6,9};

        int []B = {1,1,1,1,1,1,1,1,1,1,1};
        //int[][] Queries = {{1,5},{3,4},{5,5},{4,6},{0,4}};

        // OrangeSum(Queries, A);

        //evenRange(Queries, A);
        equilibrium(A);        
        equilibrium(B);

    }

    public static void rangeSum(int[][] Queries,int[] A){
        for (int[] Query : Queries){
            int sum = 0;
            for (int i = Query[0] ; i <= Query[1];i++){
                sum += A[i];
            }
            System.out.println(sum);
        }
    }
    
    public static void OrangeSum(int[][] Queries,int[] A){
        int [] QsumArr = new int[A.length];


        for (int i = 0; i < A.length;i++){
            if (i > 0){
                QsumArr[i] = A[i] + QsumArr[i-1];
            }else{
                QsumArr[i] = A[i];
            }
             
        }
        
        for (int[] query : Queries){
            int Li = query[0];
            int Ri = query[1];
            int RangeSum = 0;
            if (Li == 0){
                RangeSum = QsumArr[Ri];
            }else{
                RangeSum = QsumArr[Ri]-QsumArr[Li-1];
            }

            System.out.println(RangeSum);

        }
    }

    public static void evenRange(int[][] Queries, int[] A){
        for (int i = 0; i < A.length;i++){
            if (A[i] %2 ==0 ){
               A[i] = 1;
            }else{
                A[i] = 0;
            }
        }


        for (int i : A){
            System.out.println(i);
        }
    }

    public static void equilibrium(int[] A){
        int N = A.length;
        int[] Qsum = new int[N];

        for (int i = 0; i < Qsum.length;i++){
            if (i > 0){
                Qsum[i] = Qsum[i-1] + A[i];
            }else{
                Qsum[i] = A[i];
            }
        }

        int Ccount = 0; 
        for (int i = 1; i < N;i++){
            if (Qsum[i-1] == Qsum[N-1]-Qsum[i]){
                Ccount++;
            }
        }

        System.out.println(Ccount);
    }
}
