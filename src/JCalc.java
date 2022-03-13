import java.util.Scanner;

public class JCalc {
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double input1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the second number: ");
        double input2 = Double.parseDouble(scanner.nextLine());

        double sum = input1 + input2;
        System.out.println(input1 + " + " + input2 + " = " + sum);
    }
}
