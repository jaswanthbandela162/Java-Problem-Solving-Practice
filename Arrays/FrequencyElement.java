package Arrays;

public class FrequencyElement {
    public static void main(String[] args) {
        int[] nums = {1,3,3,2,3,4};
        int search = 3;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(search == nums[i]){
                count++;
            }
        }
        System.out.println("Result: "+count);
    }
}
