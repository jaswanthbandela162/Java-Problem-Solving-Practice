package methods;

public class Intro2 {
    public static void main(String[] args) {
        hai();
    }
    public static void hai()
    {
         System.out.println("hai");
         Intro2 i = new Intro2();
         i.hai1();
        
    }
    public static void hello(){
        System.out.println("hello");
    }
    public void hai1(){
        System.out.println("hai1");
        hello1();
    }
    public void hello1(){
        System.out.println("hello2");
        hello();
    }
}
