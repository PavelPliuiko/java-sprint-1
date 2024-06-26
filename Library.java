import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages library items, authors, and patrons.
 * The library allows adding, deleting, and searching for library items, authors, and patrons.
 *
 * @author Pavel Pliuiko
 */
public class Library {
    private final List<LibraryItem> items = new ArrayList<>();
    private final List<Author> authors = new ArrayList<>();
    private final List<Patron> patrons = new ArrayList<>();

    /**
     * Adds a library item to the library.
     *
     * @param item the library item to add
     */
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    /**
     * Adds an author to the library.
     *
     * @param author the author to add
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     * Adds a patron to the library.
     *
     * @param patron the patron to add
     */
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    /**
     * Deletes a library item from the library.
     * @param item the library item to delete
     * @return the updated list of library items after deletion
     */
    public List<LibraryItem> deleteItem(LibraryItem item) {
        items.remove(item);
        return items;
    }

    /**
     * Deletes an author from the library.
     * @param author the author to delete
     * @return the updated list of authors after deletion
     */
    public List<Author> deleteAuthor(Author author) {
        authors.remove(author);
        return authors;
    }

    /**
     * Deletes a patron from the library.
     * @param patron the patron to delete
     * @return the updated list of patrons after deletion
     */
    public List<Patron> deletePatron(Patron patron) {
        patrons.remove(patron);
        return patrons;
    }

    /**
     * Retrieves the list of library items in the library.
     * @return the list of library items
     */
    public List<LibraryItem> getItems() {
        return items;
    }

    /**
     * Retrieves the list of authors in the library.
     * @return the list of authors
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * Retrieves the list of patrons in the library.
     * @return the list of patrons
     */
    public List<Patron> getPatrons() {
        return patrons;
    }

    /**
     * Searches for a library item by its title.
     * @param title the title of the library item to search for
     * @return the library item with the specified title, or null if not found
     */
    public LibraryItem searchItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }

        System.out.println("Item with title - '" + title + "' not found.");
        return null;
    }

    /**
     * Searches for a library item by its author.
     * @param author the author of the library item to search for
     * @return the library item written by the specified author, or null if not found
     */
    public LibraryItem searchItemByAuthor(Author author) {
        for (LibraryItem item : items) {
            if (item.getAuthor().equals(author)) {
                return item;
            }
        }

        System.out.println("Item written by - '" + author.getName() + "' not found.");
        return null;
    }

    /**
     * Searches for a library item by its ISBN.
     * @param ISBN the ISBN of the library item to search for
     * @return the library item with the specified ISBN, or null if not found
     */
    public LibraryItem searchItemByISBN(String ISBN) {
        for (LibraryItem item : items) {
            if (item.getISBN().equals(ISBN)) {
                return item;
            }
        }

        System.out.println("Item with ISBN - '" + ISBN + "' not found.");
        return null;
    }
}
