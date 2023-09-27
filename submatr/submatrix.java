public class submatrix{
    public static void main(String[] args) {

        int[][] A = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };

                int[][] C = colPrefix(rowPrefix(A));

                for (int[] i : C){
                    for (int j : i){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
        
    }

    public static int[][] rowPrefix(int[][] A){
        int[][] B = new int[A.length][A[0].length];

        for (int i = 0; i < A.length;i++){
            for (int j = 0; j < A[0].length;j++){
                if (j == 0){
                    B[i][j] = A[i][j];

                }else{
                    B[i][j] = B[i][j-1] + A[i][j];
                }
            }
        }
        return B;
    }

    public static int[][] colPrefix(int[][]A){
        int[][] B = new int[A.length][A[0].length];
        for (int j = 0; j < A[0].length;j++){

            B[0][j] = A[0][j];
            for (int i = 1; i < A.length;i++){
                B[i][j] = A[i][j] + B[i-1][j];
            }
        }


        return B;

    }
}