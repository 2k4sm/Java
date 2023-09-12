package bubblesort;

public class bubbleSort{
    public static void main(String[] args) {

        int[][] arr = {{2,3,5},{6,8,4},{9,1,7}};


        Coordinates val = returnMatchCoord(arr, 9);
        System.out.printf("row:%d,col:%d\n",val.row,val.col);
        
        
    }
    static class Coordinates{
            int row;
            int col;
    }

    public static Coordinates returnMatchCoord(int[][] arr, int findval){

        Coordinates coord = new Coordinates();
        
        coord.row = -1;
        coord.col = -1;
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                if(arr[i][j] == findval){
                    coord.row = i;
                    coord.col = j;
                    return coord;
                }
            }
        }

        return coord;
    }

    public static int countVowels(String s){
        int count = 0;
        
        for(int i = 0; i< s.length();i++){
            
        }
        return count;
    }

    
}