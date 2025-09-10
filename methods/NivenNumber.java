package methods;

public class NivenNumber {
    public static void main(String[] args) {
        nivenNumber(16);
    }
    public static void nivenNumber(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n = n / 10;  
        }
        if(original%sum==0){
            System.out.println("The Given number is Niven Number........");
        }
        else{
            System.out.println("The Given number is not a Niven Number.............");
        }
    }
}
