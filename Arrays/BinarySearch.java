package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {11,22,33,44,55,66,77,88,99};
        int start = 0;
        int target = 88;
        int end = nums.length - 1;
        boolean found = false;
        int index = -1; 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                found = true;
                index = mid;
                break;  
            }
        }

        if (found) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}
