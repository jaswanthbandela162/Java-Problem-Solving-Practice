package Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8};
        int count =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            count++;
        }
        double average = sum/count;
        System.out.println(sum);
        System.out.println(average);
    }
}
