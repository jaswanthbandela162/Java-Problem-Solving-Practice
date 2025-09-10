package Arrays;

import java.util.Arrays;

public class EvenAndOddElementsSeparation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        int[] even = new int[evenCount];
        int[] odd = new int[arr.length-evenCount];
        int evenIndex=0;
        int oddIndex=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]%2==0){
                even[evenIndex]=arr[i];
                evenIndex++;
            }
            else{
                odd[oddIndex]=arr[i];
                oddIndex++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
}
