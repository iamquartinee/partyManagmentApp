import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stopApp = true;
        Scanner scanner = new Scanner(System.in);
        Party party = new Party();
        int userMenuChoice;
        while (stopApp) {
            System.out.println("Choose option from menu and press Enter.");
            System.out.println("1. Add guest.");
            System.out.println("2. Display guests.");
            System.out.println("3. Display meals.");
            System.out.println("4. Find guest by their phone number.");
            System.out.println("5. Display vegans.");
            System.out.println("6. Display non-vegans.");
            System.out.println("7. Exit.");
            try {
                userMenuChoice = scanner.nextInt();
                switch (userMenuChoice) {
                    case 1 -> party.addGuest();
                    case 2 -> party.displayGuests();
                    case 3 -> party.displayMeals();
                    case 4 -> party.findGuestByTheirPhoneNumber();
                    case 5 -> party.displayVegans();
                    case 6 -> party.displayNoVegans();
                    case 7 -> stopApp=false;
                }
            } catch (Exception e) {
                System.out.println("Something went wrong ;c");
                scanner.next();
            }


        }

    }
}
