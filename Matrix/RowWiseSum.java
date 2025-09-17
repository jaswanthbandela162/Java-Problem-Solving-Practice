package Matrix;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
         int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements into matrix:");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println((i+1) +" Row Sum:"+sum);
        }

    }
}
