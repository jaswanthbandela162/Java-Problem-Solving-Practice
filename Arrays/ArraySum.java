package Arrays;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result=arraySum(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] arraySum(int[] arr){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    sum+=arr[j];
                }
                result[i]=sum;
            }
        }
        return result;
    }
}
