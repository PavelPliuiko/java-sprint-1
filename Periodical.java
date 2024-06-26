/**
 * Represents a periodical library item, extending the {@link LibraryItem} class.
 * Periodicals can be either printed or electronic.
 */
public class Periodical extends LibraryItem {
    private final String variant; // Variant can be "printed" or "electronic"

    /**
     * Constructs a Periodical object with the specified attributes.
     * @param id the ID of the periodical
     * @param title the title of the periodical
     * @param author the author of the periodical (an instance of {@link Author})
     * @param publisher the publisher of the periodical
     * @param ISBN the ISBN of the periodical
     * @param numberOfCopies the number of copies of the periodical available
     * @param variant the variant of the periodical ("printed" or "electronic")
     * @throws IllegalArgumentException if the variant is neither "printed" nor "electronic"
     */
    public Periodical(String id, String title, Author author, String publisher, String ISBN, int numberOfCopies, String variant) {
        super(id, title, author, publisher, ISBN, numberOfCopies);

        if ("printed".equals(variant) || "electronic".equals(variant)) {
            this.variant = variant;
        } else {
            throw new IllegalArgumentException("Value must be either 'printed' or 'electronic'");
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
