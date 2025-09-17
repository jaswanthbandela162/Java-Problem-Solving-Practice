package Matrix;

import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements into matrix:");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
