package addElement;

public class addElement{
    public static void main(String[] args) {
        
    }

    public static void elementAdd(int[] arr,int element,int lastindex){
        if (lastindex < arr.length-1){
            arr[lastindex+1] = element;
        }else{
            int cpArr[] = arr;
            arr = new int[2*arr.length+1];

            for (int i = 0; i<arr.length;i++){
                if (i<cpArr.length){
                    arr[i] = cpArr[i];
                }
                arr[i] = element;            
            }
        }
        
    }
}