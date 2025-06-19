import java.util.Scanner;

public class weight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // weight conversyion program

        // declare variables

        double weight;
        double newWeight;
        int choice;

        // welcome message

        System.out.println("Welcome to the weight converstion program!!!");

        do {
            System.out.println("1: Kgs to Lbs \n2: Lbs to Kgs\n3:Exit");
            System.out.print("Enter your choice:");
            choice = scanner.nextInt();

            // calclulation

            if (choice == 1) {
                System.out.print("Enter your weight in Kgs:  ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.2046;
                System.out.printf("Your weight in Lbs:%.2f lb\n", newWeight);

            } else if (choice == 2) {
                System.out.print("Enter your weight in Lbs:  ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.45359237;
                System.out.printf("Your weight in Kgs:%.2f kg\n", newWeight);

            } else if (choice == 3) {
                System.out.println("##Thank you !! Good Bye !!##");

            } else {
                System.out.println("Enter a valid option\n");
            }

        } while (choice != 3);

        scanner.close();

    }

}
