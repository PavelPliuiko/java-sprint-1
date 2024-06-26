import java.util.Map;
import java.util.HashMap;

/**
 * Represents a library patron with basic information and borrowed items.
 */
public class Patron {
    private String name;
    private String address;
    private String phone;
    private String type;
    private final Map<LibraryItem, Integer> borrowedItems = new HashMap<>();

    /**
     * Constructs a new Patron with the specified details.
     *
     * @param name    The name of the patron.
     * @param address The address of the patron.
     * @param phone   The phone number of the patron.
     * @param type    The type of the patron, either 'student' or 'employee'.
     * @throws IllegalArgumentException if the type is neither 'student' nor 'employee'.
     */
    public Patron(String name, String address, String phone, String type) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        checkType(type);
        this.type = type;
    }

    /**
     * Returns the name of the patron.
     *
     * @return The name of the patron.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the patron.
     *
     * @param name The new name of the patron.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the patron.
     *
     * @return The address of the patron.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the patron.
     *
     * @param address The new address of the patron.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the phone number of the patron.
     *
     * @return The phone number of the patron.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the patron.
     *
     * @param phone The new phone number of the patron.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the type of the patron ('student' or 'employee').
     *
     * @return The type of the patron.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the patron.
     *
     * @param type The new type of the patron, either 'student' or 'employee'.
     * @throws IllegalArgumentException if the type is neither 'student' nor 'employee'.
     */
    public void setType(String type) {
        checkType(type);
        this.type = type;
    }

    /**
     * Returns the number of copies of the specified LibraryItem that the patron has borrowed.
     *
     * @param item The LibraryItem to check.
     * @return The number of copies of the item borrowed by the patron.
     */
    public int getBorrowedCount(LibraryItem item) {
        return borrowedItems.getOrDefault(item, 0);
    }

    /**
     * Allows the patron to borrow a specified number of copies of a LibraryItem.
     *
     * @param item  The LibraryItem to borrow.
     * @param count The number of copies to borrow.
     */
    public void borrowItem(LibraryItem item, int count) {
        if (item.getNumberOfCopies() >= count) {
            item.setNumberOfCopies(item.getNumberOfCopies() - count);
            borrowedItems.put(item, borrowedItems.getOrDefault(item, 0) + count);
        } else {
            System.out.println("Item is currently checked out.");
        }
    }

    /**
     * Allows the patron to return a specified number of copies of a LibraryItem.
     *
     * @param item  The LibraryItem to return.
     * @param count The number of copies to return.
     */
    public void returnItem(LibraryItem item, int count) {
        if (borrowedItems.containsKey(item)) {
            if (borrowedItems.get(item) >= count) {
                item.setNumberOfCopies(item.getNumberOfCopies() + count);
                borrowedItems.put(item, borrowedItems.get(item) - count);
            } else {
                System.out.println("You don't have enough items.");
            }
        } else {
            System.out.println("You don't have this item.");
        }
    }

    /**
     * Checks if the provided type is valid ('student' or 'employee').
     *
     * @param type The type to check.
     * @throws IllegalArgumentException if the type is neither 'student' nor 'employee'.
     */
    private void checkType(String type) {
        if (!"student".equals(type) && !"employee".equals(type)) {
            throw new IllegalArgumentException("Value must be either 'student' or 'employee'");
        }
    }
}
