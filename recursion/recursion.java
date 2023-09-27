public class recursion{
    public static void main(String[] args) {
        //printNum(1,5);

        int[] A = {1,2,4,5,6};

        printArr(0, A);
    }

    public static int printNum(int S,int N){
        if (S == N+1){
            return 0;
        }
        System.out.println(S);
        return printNum(S+1,N);
    }

    public static int printArr(int index,int[] A){
        if (index == A.length){
            return 0;
        }
        System.out.println(A[index]);
        return printArr(index+1, A);
    }
}