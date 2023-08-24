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
    public static void mirrorMatrix(int mat[][]){
        int switcher = 0;
        for (int row = 0; row<mat.length;row++){
            // int temp = mat[row][switcher];
            // mat[row][switcher] = mat[row][mat.length-1-switcher];
            // mat[row][mat.length-1-switcher] = temp;
            // switcher++;
        }
    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {    
        ArrayList<ArrayList<Integer>> newArr = new ArrayList<ArrayList<Integer>>();   
        //ArrayList<Integer> newArrNum = new ArrayList<Integer> ();

        for(int i = 0; i<A.size();i++){
            for(int j = 0; j<A.get(i).size();j++){
                if((A.get(i).get(j))%2 == 0){
                    newArrNum.add(A.get(i).get(j));
                }
            }
            newArr.add(newArrNum);
        }
        return newArr;
        
   }
}