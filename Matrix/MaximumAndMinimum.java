package Matrix;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
         int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements into matrix:");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max = arr[0][0];
        int min = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
