import java.util.Scanner;

public class Intro {
    public static void main(String args[]){
        System.out.println("hello world");
        Scanner c = new Scanner(System.in);
        String str = c.next();
        System.out.println(str);
        c.close();
    }
}