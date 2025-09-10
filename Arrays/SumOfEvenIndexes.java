package Arrays;

public class SumOfEvenIndexes {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int result = sumOfEvenIndexes(nums);
        System.out.println(result);
    }
    public static int sumOfEvenIndexes(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i+=2){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
