import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Check if the age is 21 or older and display a message accordingly
        if (age >= 21) {
            System.out.println("Congratulations! You get a wristband.");
        }

        scanner.close();
    }
}