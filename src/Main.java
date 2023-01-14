import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name & age :");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int age = sc.nextInt();
        System.out.println("Your name is "+s);
        System.out.println("Your age is "+age);
    }
}