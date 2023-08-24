package addElement;

public class addElement{
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,8};
        int newArr[] = elementAdd(A, 67, A.length-1);
        for (int i = 0; i<newArr.length;i++){
             System.out.print(newArr[i]+" ");
        }

    }

    public static int[] elementAdd(int[] arr,int element,int lastindex){
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
        return arr;
        
    }
}