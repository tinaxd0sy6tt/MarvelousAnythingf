import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What mode do you want? (user or test) ");
        String choice = scan.next();
        int times;
        String mode;
        switch (choice) {
            case "user":
                System.out.println("How many times? ");
                times = scan.nextInt();
                while (times < 1) {
                    System.out.println("How many times? ");
                    times = scan.nextInt();
                }
                MontyHall.run_as_user(times);
                break;
            case "test":
                System.out.println("Which mode? (y, n, or random) ");
                mode = scan.next();

                System.out.println("How many times? ");
                times = scan.nextInt();
                while (times < 1) {
                    System.out.println("How many times? ");
                    times = scan.nextInt();
                }
                switch (mode) {
                    case "y":
                        MontyHall.run_test(times, mode);
                        break;
                    case "n":
                        MontyHall.run_test(times, mode);
                        break;
                    case "random":
                        MontyHall.run_test(times, mode);
                        break;
                    default:
                        System.out.println("Invalid choice. Using default: random");
                        MontyHall.run_test(times, "random");
                        break;
                }
                break;
            default:
                break;
        }
    }
}