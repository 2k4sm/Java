public class recursion{
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int N){
        if (N == 1){
            return 1;
        }
        return sum(N-1)+N;
    }
}