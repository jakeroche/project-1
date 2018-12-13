package files;

/**
 * title project 2
 * @author 92019528 jakeroche
 */
public class objects2 {

    private String name;
    private int rating;
    private String address;

    // getter methods
    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public String getAddress() {
        return this.address;
    }

    public objects2(String newName, int newRating, String newAddress) {
        this.name = newName;
        this.rating = newRating;
        this.address = newAddress;
    }

    @Override
    public String toString() {
        return ("\n" + this.name + " "
                + this.rating + " "
                + this.address);
    }
}
