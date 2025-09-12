package Patterns;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        int rows = 4;
        int k =1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
