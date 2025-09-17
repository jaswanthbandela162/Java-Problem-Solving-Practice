package Matrix;

import java.util.Scanner;

public class RowAndColumnOrder {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements into matrix:");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //row wise.....
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //column order
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[j][i]+" ");
            }
        }
    }
}
