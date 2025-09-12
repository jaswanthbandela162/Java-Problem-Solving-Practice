package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 9;
        boolean found = false;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Not Found....");
        }
    }
}
