package Arrays;

import java.util.Arrays;

public class ArrayProduct {
     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result=productSum(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] productSum(int[] arr){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int product =1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product*=arr[j];
                }
                result[i]=product;
            }
        }
        return result;
    }
}
