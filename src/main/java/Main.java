import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stopApp = true;
        Scanner scanner = new Scanner(System.in);
        Party party = new Party();
        while (stopApp) {
            System.out.println("Choose option from menu and press Enter.");
            System.out.println("1. Add guest.");
            System.out.println("2. Display guests.");
            int userMenuChoice = scanner.nextInt();
            switch (userMenuChoice) {
                case 1 -> party.addGuest();
                case 2 -> party.displayGuests();


            }
        }

    }
}
