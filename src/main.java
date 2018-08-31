import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose a color option for a car below: ");
            System.out.println("--------------------------------------");
            System.out.println(" 1. Matte Black");
            System.out.println(" 2. Chrome Red");
            System.out.println(" 3. Chrome Blue");
            System.out.println(" 4. Matte Purple");
            System.out.println(" 5. Neon Blue");
            System.out.println();
            //System.out.println("Enter: \"1\", \"2\", \"3\", \"4\" or \"5\"");
            choice = in.nextInt();
        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
        switch (choice) {
            case 1:
                System.out.println(" You chose Matte Black, total cost of $900");
                break;
            case 2:
                System.out.println(" You chose Chrome Red, total cost of $500");
                break;
            case 3:
                System.out.println(" You chose Chrome Blue, total cost of $500");
                break;
            case 4:
                System.out.println(" You chose Matte Purple, total cost of $1,000");
                break;
            case 5:
                System.out.println(" You chose Neon Blue, total cost of $1,500");
                break;
        }
        System.out.println(" Thank you for shopping with us!, Have a great day !");
    }}