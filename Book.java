/**
 * Represents a book library item, extending the {@link LibraryItem} class.
 * Books can be printed, electronic, or audio format.
 */
public class Book extends LibraryItem {
    private final String variant; // Variant can be "printed", "electronic", or "audio"

    /**
     * Constructs a Book object with the specified attributes.
     * @param id the ID of the book
     * @param title the title of the book
     * @param author the author of the book (an instance of {@link Author})
     * @param publisher the publisher of the book
     * @param ISBN the ISBN of the book
     * @param numberOfCopies the number of copies of the book available
     * @param variant the variant of the book ("printed", "electronic", or "audio")
     * @throws IllegalArgumentException if the variant is not one of "printed", "electronic", or "audio"
     */
    public Book(String id, String title, Author author, String publisher, String ISBN, int numberOfCopies, String variant) {
        super(id, title, author, publisher, ISBN, numberOfCopies);

        if ("printed".equals(variant) || "electronic".equals(variant) || "audio".equals(variant)) {
            this.variant = variant;
        } else {
            throw new IllegalArgumentException("Value must be either 'printed', 'electronic', or 'audio'");
        }
    }

    /**
     * Returns the variant of the book ("printed", "electronic", or "audio").
     * @return the variant of the book
     */
    public String getVariant() {
        return variant;
    }
}
