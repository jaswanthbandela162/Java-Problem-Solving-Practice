package Matrix;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr[0].length;i++){
           for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
           }
           System.out.println();
        }
    }
}
