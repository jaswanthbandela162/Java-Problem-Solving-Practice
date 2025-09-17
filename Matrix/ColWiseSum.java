package Matrix;
import java.util.Scanner;
public class ColWiseSum {
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
                sum+=arr[j][i];
            }
            System.out.println((i+1) +" Col Sum:"+sum);
        }
    }
}
