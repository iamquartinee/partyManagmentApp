import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    List<Guest> guests = new ArrayList();
    private final Scanner scanner = new Scanner(System.in);

    void addGuest() {
        System.out.println("What's your guest's name?");
        String name = scanner.nextLine();
        System.out.println("What your guest want to eat?");
        String meal = scanner.nextLine();
        System.out.println("What's your guest's phone number?");
        String phoneNumber = scanner.nextLine();
        System.out.println("Is your guest vegan? Y-yes | N-No");
        Boolean isVegan = scanner.nextLine().equalsIgnoreCase("Y");
        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        guests.add(guest);
    }

    void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestsInfo();
            System.out.println();
        }
    }


}
