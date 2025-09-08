import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        System.out.println("Enter the String only in lower Case:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = isPangram(str);
        if(result== true){
            System.out.println("Given String is Pangram");
        }
        else{
            System.out.println("Given String is not a Pangram");
        }
    }
    public static boolean isPangram(String sentence){
         boolean[] character = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(ch>='a' && ch<='z'){
                character[ch-'a']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(!character[i]){
                return false;
            }
        }
        return true;
    }
    
}
