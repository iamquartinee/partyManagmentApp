public class Guest {
    private final String name;
    private final String meal;
    private final String phoneNumber;
    private final Boolean isVegan;


    public Guest(String name, String meal, String phoneNumber, Boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getVegan() {
        return isVegan;
    }

    void displayGuestsInfo() {
        System.out.println("Name: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Is vegan: " + isVegan);
    }
}
