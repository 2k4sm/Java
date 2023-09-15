package Hashmap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        //String str = "agabgggag";

        int[] A = {3,5,1,7,9,12,45,6,2};

        System.out.println(countLeader(A));

    }

    

    public static int countP(String A){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        int count = 0;

        for (int i = 0; i < A.length();i++){
            if (A.charAt(i) == 'a'){
                count++;
            }
            if (A.charAt(i) == 'g' && !hm.containsKey('g')){
                hm.put(A.charAt(i),count);
            }else if (A.charAt(i) == 'g' && hm.containsKey('g')){
                hm.replace(A.charAt(i),hm.get(A.charAt(i))+count);
            }
        }

        int sum = 0;
        for (char i : hm.keySet()){
            sum += hm.get(i);
        }
        return sum;
    }

    public static int countLeader(int[] A){
        int count = 1;
        int maxTillNow = A[0];
        for (int i = 1; i < A.length;i++){
            if (A[i] > maxTillNow){
                maxTillNow = A[i];
                count++;
            }
        }

        return count;

    }

    public static int countToggles(int[] A){
        
    }


}
