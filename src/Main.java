import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int myInt = scanner.nextInt();

        System.out.print("Enter a double");
        double myDouble = scanner.nextDouble();

        int sum = myInt + (int) myDouble;
        double product = myInt * myDouble;

        System.out.printf("you entered the integer: %d and the double: %.2f",myInt,myDouble);
        System.out.printf("The sum is %d\n",sum);
        System.out.printf("Their product is: %2f\n",product);
    }
}