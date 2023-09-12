package matrix;


public class matrix{
    public static void main(String[] args) {
        
        int A[][] = {
                    {2,3,5},
                    {4,6,8},
                    {8,2,5}
                };
        int B[][] = {
                    {2,3,4,6},
                    {6,7,8,9},
                    {2,4,7,9},
                    {4,7,2,3}
        };

        printMatrix(A);
        transposeMatrix(A);
        System.out.println();
        printMatrix(A);

                
        System.out.println();
        
        printMatrix(B);
        transposeMatrix(B);
        System.out.println();
        printMatrix(B);

    }
    
    public static void printMatrix(int A[][]){
        for (int row = 0; row<A.length;row++){
            for (int col = 0; col<A.length;col++){
                System.out.print(A[row][col]);
            }
            System.out.println();
        }
    }
    public static void printDiagonalEle(int A[][]){
        for (int row = 0; row<A.length;row++){
            for(int col = 0; col<A[0].length;col++){
                if (row == col || row+col == A.length-1){
                    System.out.print(A[row][col]+" ");
                }
            }
        }
        System.out.println();
    }
    public static void transposeMatrix(int A[][]){
        for (int row = 0; row<A.length;row++){
            for(int col = 0; col<row;col++){
                int temp = A[row][col];
                A[row][col] = A[col][row];
                A[col][row] = temp;
            }
        }
    }
}