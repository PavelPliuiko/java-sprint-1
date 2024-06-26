import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents an author with basic information such as name, date of birth, and a list of authored library items.
 */
public class Author {
    private String name;
    private Date dateOfBirth;
    private final List<LibraryItem> items = new ArrayList<>();

    /**
     * Constructs a new Author with the specified name and date of birth.
     *
     * @param name       The name of the author.
     * @param dateOfBirth The date of birth of the author.
     */
    public Author(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the name of the author.
     *
     * @return The name of the author.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the author.
     *
     * @param name The new name of the author.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the date of birth of the author.
     *
     * @param dateOfBirth The new date of birth of the author.
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the date of birth of the author.
     *
     * @return The date of birth of the author.
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Returns the list of library items authored by the author.
     *
     * @return The list of library items authored by the author.
     */
    public List<LibraryItem> getItems() {
        return items;
    }

    /**
     * Adds a library item to the list of items authored by the author.
     *
     * @param item The library item to add.
     */
    public void addItem(LibraryItem item) {
        items.add(item);
    }
}
