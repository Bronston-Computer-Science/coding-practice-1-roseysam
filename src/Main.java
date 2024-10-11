import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int myInt = scanner.nextInt();

        System.out.print("Enter a double");
        double myDouble = scanner.nextDouble();

        System.out.printf("you entered the integer: %d and the double: %.2f",myInt,myDouble);
    }
}