import java.util.*;

public class Party {
    List<Guest> guests = new ArrayList();
    List<String> vegans = new ArrayList<>();
    List<String> noVegans = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    Set<String> meals = new HashSet<>();
    Map<String, String> guestsPhoneNumbers = new HashMap<>();
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
        meals.add(meal);
        guestsPhoneNumbers.put(phoneNumber, name);
        System.out.println("Isvegan="+isVegan);
        isVegan = true ? vegans.add(name) : noVegans.add(name);
        guests.add(guest);

    }

    void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestsInfo();
            System.out.println();
        }
    }
    void displayMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    void findGuestByTheirPhoneNumber() {
        System.out.println("What's your missing guest phone number?");
        String phoneNumber = scanner.nextLine();
        for (Guest guest : guests) {
            if(guest.getPhoneNumber().equals(phoneNumber)) { guest.displayGuestsInfo();}
        }
    }
    void displayVegans() {
        for (String vegan : vegans) {
            System.out.println(vegan);
            System.out.println("");
        }
    }
    void displayNoVegans() {
        for (String noVegan : noVegans) {
            System.out.println(noVegan);
            System.out.println("");
        }
    }


}
