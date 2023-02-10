import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, please: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", I am your robot overlord.");
        sc.close();
        //plutot stylé
    }

    public static void division(int a, int b) {
        System.out.println(a / b);
    }
















}