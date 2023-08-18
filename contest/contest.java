package contest;

import java.util.Scanner;

public class contest{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arrMarks[] = new int[10];

        for (int i = 0; i<10;i++){
            arrMarks[i] = scan.nextInt();
        }
        System.out.println("Sum Marks: "+arrMarks(arrMarks));
        scan.close();
    }
    public static double arrMarks(int marks[]){
        int totalmarks = 0;
        int size = marks.length;
        for (int index = 0; index< size;index++){
            totalmarks += marks[index];
        }
        return totalmarks/marks.length;
    }

}