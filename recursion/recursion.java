public class recursion{
    public static void main(String[] args) {
        //printNum(1,5);

        //int[] A = {1,2,4,5,6};

        //printArr(0, A);

        //System.out.println(sumDigit(123456789));

        String A = "abecba";

        System.out.println(isPalindrome(0, A));
    }

    public static int printNum(int S,int N){
        if (S == N+1){
            return 0;
        }
        System.out.println(S);
        return printNum(S+1,N);
    }

    public static void printArr(int index,int[] A){
        if (index == A.length){
            return;
        }
        printArr(index+1, A);
        System.out.println(A[index]);

    }

    public static int sumDigit(int A){
        if (A == 0){
            return 0;
        }

        return A%10 + sumDigit(A/10);
    }

    public static boolean isPalindrome(int sInd,String A){
        if (sInd != A.length()/2){
            if (A.charAt(sInd) != A.charAt(A.length()-1-sInd)){
                return false;
            }
            if (A.charAt(sInd) == A.charAt(A.length()-1-sInd)){
                return isPalindrome(sInd+1, A);
            }

        }
        return true;

    }
}