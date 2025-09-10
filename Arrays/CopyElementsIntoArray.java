package Arrays;
import java.util.Arrays;

public class CopyElementsIntoArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        copyElementsIntoArray(arr);
    }
    public static void copyElementsIntoArray(int[] arr){
        int[] copyTo = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            copyTo[i]=arr[i];
        }
        System.out.println("The original elements are:"+Arrays.toString(arr));
        System.out.println("Copied Elements are:"+Arrays.toString(copyTo));
        System.out.println(copyTo.length);
    }
}
