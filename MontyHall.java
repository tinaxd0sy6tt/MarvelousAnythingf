import java.util.Scanner;
import java.lang.Math;

class MontyHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] prizes = new String[3];
        int winning_door = (int) (Math.random() * ((2 - 0) + 1)) + 0;
        prizes[winning_door] = "car";
        for (int i = 0; i < prizes.length; i++) {
            if (i != winning_door) {
                prizes[i] = "goat";
            }
        }
        System.out.println("Pick a door(1 - 3):");
        int choice = scan.nextInt() - 1;
        while (choice < 0 || choice >= 3) {
            System.out.println("Pick a door(1 - 3):");
            choice = scan.nextInt() - 1;
        }
        int open_door = -1;
        int last_door = -1;
        for (int i = 0; i < 3; i++) {
            if (prizes[i].equals("car") || i == choice || i == last_door || open_door != -1) {
                ;
            } else {
                open_door = i;
            }
            if (i == open_door || i == choice) {
                ;
            } else {
                last_door = i;
            }
        }
        System.out.println("Door " + (open_door + 1) + " is a goat.");
        System.out.print(
                "You have door " + (choice + 1) + ". Do you want to pick door " + (last_door + 1) + "? (y or n) ");
        switch (scan.next().toLowerCase()) {
            case "y":
                int temp = choice;
                choice = last_door;
                last_door = temp;
                break;
            case "n":
                break;
            default:
                break;
        }
        System.out.println("You win a " + prizes[choice]);
        scan.close();
    }
}