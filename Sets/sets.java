package Sets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class sets{
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(10);
        A.add(5);
        A.add(3);
        A.add(4);
        A.add(3);
        A.add(5);
        A.add(6);
        A.add(2);
        
        String str = "sdf";
        HashMap <Character,Character> hm = new HashMap<Character,Character>();

        for (char i : hm.keySet()){

        }
        hm.

        
        // int K = 9;
        // int k = 10;
        // System.out.println(pairSum(A, K));
        // System.out.println(pairSum(A, k));

        firstRepeatingElement(A);

        
    }
    public static boolean pairSum(int[] A,int K){
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < A.length;i++){
            int pair = K-A[i];

            if (hs.contains(pair)){
                return true;
            }else{
                hs.add(A[i]);
            }
        }
        return false;
    }

    public static void oddFreq(int[]A){
        HashMap<Cha,Integer> hm = new HashMap<Integer,Integer>();

        for (int i = 0; i < A.length;i++){
            if (!hm.containsKey(A[i])){
                hm.put(A[i], 1);
            }else{
                int freq = hm.get(A[i]);
                freq ++;
                hm.replace(A[i], freq);
            }
        }



    }

    public static void firstRepeatingElement(ArrayList<Integer> A){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i = 0; i < A.size();i++){
            
            if (hm.containsKey(A.get(i))){
                int count = hm.get(A.get(i));
                count++;
                hm.con(A.get(i),count);
                Character
            }else{
                hm.put(A.get(i), 1);
            }
        }

        System.out.println(hm);

        for (int i : hm.keySet()){
            System.out.print(i+" ");
            System.out.print(hm.get(i));
            System.out.println();
            for (char i : )
        }
        
        

        
    }
}

