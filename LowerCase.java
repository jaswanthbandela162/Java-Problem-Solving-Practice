public class LowerCase {
    public static void main(String[] args) {
        String str = "mY name iS chintU";
        str = str.toLowerCase();
        String str2 = "";

        System.out.println(str);

        str2 += Character.toUpperCase(str.charAt(0));
        for(int i =1;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                str2+=ch;
                str2+=Character.toUpperCase(str.charAt(i+1));
                i++;
            }
            else{
                str2+=ch;
            }
        }
        System.out.println(str2);
    } 
}
