/**
 * Represents a library item with basic information such as ID, title, author, publisher, ISBN, and number of copies.
 */
public class LibraryItem {
    private String id;
    private String title;
    private Author author;
    private String publisher;
    private String ISBN;
    private int numberOfCopies;

    /**
     * Constructs a new LibraryItem with the specified details.
     *
     * @param id            The unique identifier of the library item.
     * @param title         The title of the library item.
     * @param author        The author of the library item.
     * @param publisher     The publisher of the library item.
     * @param ISBN          The ISBN of the library item.
     * @param numberOfCopies The number of copies available for the library item.
     */
    public LibraryItem(String id, String title, Author author, String publisher, String ISBN, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.numberOfCopies = numberOfCopies;
    }

    /**
     * Returns the ID of the library item.
     *
     * @return The ID of the library item.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the library item.
     *
     * @param id The new ID of the library item.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the title of the library item.
     *
     * @return The title of the library item.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the library item.
     *
     * @param title The new title of the library item.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the author of the library item.
     *
     * @return The author of the library item.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Sets the author of the library item.
     *
     * @param author The new author of the library item.
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Returns the publisher of the library item.
     *
     * @return The publisher of the library item.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher of the library item.
     *
     * @param publisher The new publisher of the library item.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Returns the ISBN of the library item.
     *
     * @return The ISBN of the library item.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the library item.
     *
     * @param ISBN The new ISBN of the library item.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Returns the number of copies available for the library item.
     *
     * @return The number of copies available for the library item.
     */
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    /**
     * Sets the number of copies available for the library item.
     *
     * @param numberOfCopies The new number of copies available for the library item.
     */
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    /**
     * Returns a string representation of the LibraryItem object.
     *
     * @return A string representation of the LibraryItem object.
     */
    @Override
    public String toString() {
        return "LibraryItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
