import java.util.Date;

/**
 * Main testing class
 *
 * @author Pavel Pliuiko
 */
public class Test {
    public static void main(String[] args) {
        // Authors Test
        testAuthorClass();
        // Library Items Test
        testLibraryItemClass();
        // Patrons Test
        testPatronClass();

        // E2E Test
        Library library = new Library();

        Author StephenKing = new Author("Stephen King", new Date());
        Author ErnestHemingway = new Author("Ernest Hemingway", new Date());
        Author GeorgeOrwell = new Author("George Orwell", new Date());

        library.addAuthor(StephenKing);
        library.addAuthor(ErnestHemingway);
        library.addAuthor(GeorgeOrwell);

        Book book1 = new Book("id-123", "Introduction to Programming", StephenKing, "TechBooks Co.", "978-1234567890", 25, "audio");
        Book book2 = new Book("id-456", "Data Structures and Algorithms", ErnestHemingway, "CompSci Publishers", "978-9876543210", 50, "electronic");
        Book book3 = new Book("id-789", "History of Ancient Civilizations", GeorgeOrwell, "Archaeo Press", "978-5432109876", 15, "printed");
        Book book4 = new Book("id-321", "Cooking Basics: Recipes for Beginners", StephenKing, "Foodie Editions", "978-2468013579", 30, "printed");
        Book book5 = new Book("id-654", "Financial Management 101", GeorgeOrwell, "Finance Experts", "978-1357902468", 20, "printed");
        Book book6 = new Book("id-987", "The Art of Photography", ErnestHemingway, "Capture Books", "978-9753106428", 45, "printed");
        Book book7 = new Book("id-234", "Astrophysics: Exploring the Universe", StephenKing, "Space Publications", "978-8642097531", 22, "printed");
        Book book8 = new Book("id-567", "Fictional Worlds: Creating Imaginary Realities", GeorgeOrwell, "Imagination Press", "978-7531904682", 18, "printed");
        Book book9 = new Book("id-890", "Health and Fitness: Achieving Wellness", ErnestHemingway, "Fit Life Publishers", "978-3698521470", 27, "printed");
        Book book10 = new Book("id-432", "Environmental Science: Sustainable Practices", ErnestHemingway, "Green Earth Books", "978-5790318642", 35, "printed");

        Periodical periodical1 = new Periodical("id-001", "Tech Review", StephenKing, "Tech Journals Inc.", "123-456-789", 10, "printed");
        Periodical periodical2 = new Periodical("id-002", "Science Today", ErnestHemingway, "Science Publishers", "987-654-321", 20, "electronic");
        Periodical periodical3 = new Periodical("id-003", "Health Weekly", GeorgeOrwell, "Health Media", "456-789-012", 15, "printed");
        Periodical periodical4 = new Periodical("id-004", "Fashion Insights", StephenKing, "Style Publications", "321-654-987", 12, "electronic");
        Periodical periodical5 = new Periodical("id-005", "Business Digest", GeorgeOrwell, "Commerce Press", "654-321-987", 18, "printed");
        Periodical periodical6 = new Periodical("id-006", "Artistic Expressions", StephenKing, "Creative Studios", "789-012-345", 25, "electronic");
        Periodical periodical7 = new Periodical("id-007", "Sports Gazette", ErnestHemingway, "Sports News Ltd.", "210-987-654", 30, "printed");
        Periodical periodical8 = new Periodical("id-008", "Travel Chronicles", StephenKing, "Adventure Books", "543-210-987", 22, "electronic");
        Periodical periodical9 = new Periodical("id-009", "Cooking Insights", GeorgeOrwell, "Foodie Editions", "876-543-210", 17, "printed");
        Periodical periodical10 = new Periodical("id-010", "Music Review", ErnestHemingway, "Melody Media", "135-792-468", 14, "electronic");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(book4);
        library.addItem(book5);
        library.addItem(book6);
        library.addItem(book7);
        library.addItem(book8);
        library.addItem(book9);
        library.addItem(book10);
        library.addItem(periodical1);
        library.addItem(periodical2);
        library.addItem(periodical3);
        library.addItem(periodical4);
        library.addItem(periodical5);
        library.addItem(periodical6);
        library.addItem(periodical7);
        library.addItem(periodical8);
        library.addItem(periodical9);
        library.addItem(periodical10);

        System.out.println("Books and Periodical count: " + library.getItems().size());
        System.out.println();

        Patron patron = new Patron("Pavel", "St. John's", "+17098000000", "student");

        library.addPatron(patron);
        System.out.println("Before borrow: " + periodical1.getNumberOfCopies());
        System.out.println("Pavel borrows 9!");
        patron.borrowItem(periodical1, 9);
        System.out.println("After borrow: " + periodical1.getNumberOfCopies());
        System.out.println();

        System.out.println("Before borrow: " + book8.getNumberOfCopies());
        System.out.println("Pavel tries to borrow 20!");
        patron.borrowItem(book8, 20);
        System.out.println("After borrow: " + book8.getNumberOfCopies());
        System.out.println();

        System.out.println("Before return: " + periodical1.getNumberOfCopies());
        System.out.println("Pavel has: " + patron.getBorrowedCount(periodical1));
        System.out.println("Pavel tries to return 10!");
        patron.returnItem(periodical1, 10);
        System.out.println("After return: " + periodical1.getNumberOfCopies());
        System.out.println();

        System.out.println("Before return: " + periodical1.getNumberOfCopies());
        System.out.println("Pavel has: " + patron.getBorrowedCount(periodical1));
        System.out.println("Pavel tries to return 5!");
        patron.returnItem(periodical1, 5);
        System.out.println("Pavel has: " + patron.getBorrowedCount(periodical1));
        System.out.println("After return: " + periodical1.getNumberOfCopies());
        System.out.println();

        System.out.println("Before return: " + periodical1.getNumberOfCopies());
        System.out.println("Pavel has: " + patron.getBorrowedCount(periodical1));
        System.out.println("Pavel tries to return 4!");
        patron.returnItem(periodical1, 4);
        System.out.println("Pavel has: " + patron.getBorrowedCount(periodical1));
        System.out.println("After return: " + periodical1.getNumberOfCopies());
        System.out.println();

        LibraryItem foundLibraryItem = library.searchItemByTitle("Introduction to Programming");
        System.out.println(foundLibraryItem);
        System.out.println(library.searchItemByTitle("Not existing book"));
        System.out.println();

        System.out.println("Before borrow: " + foundLibraryItem.getNumberOfCopies());
        System.out.println("Pavel tries to borrow 1!");
        patron.borrowItem(foundLibraryItem, 1);
        System.out.println("After borrow: " + foundLibraryItem.getNumberOfCopies());
        System.out.println();

        System.out.println("Before return: " + foundLibraryItem.getNumberOfCopies());
        System.out.println("Pavel has: " + patron.getBorrowedCount(periodical1));
        System.out.println("Pavel tries to return 1!");
        patron.returnItem(foundLibraryItem, 1);
        System.out.println("Pavel has: " + patron.getBorrowedCount(periodical1));
        System.out.println("After return: " + foundLibraryItem.getNumberOfCopies());
        System.out.println();
    }

    /**
     * Author Class Test
     */
    public static void testAuthorClass() {
        // Test data setup
        Date dob = new Date();
        Author author = new Author("John Doe", dob);

        // Test assertions
        assert author.getName().equals("John Doe");
        assert author.getDateOfBirth().equals(dob);
        assert author.getItems().isEmpty();

        // Modify and retest
        author.setName("Jane Doe");
        assert author.getName().equals("Jane Doe");

        Date newDob = new Date(dob.getTime() + 1000);
        author.setDateOfBirth(newDob);
        assert author.getDateOfBirth().equals(newDob);

        LibraryItem item = new LibraryItem("id", "Title", author, "publisher", "123", 100);
        author.addItem(item);
        assert author.getItems().size() == 1;
        assert author.getItems().getFirst().getTitle().equals("Sample Book");

        System.out.println("All tests passed successfully.");
    }

    /**
     * LibraryItem Class Test
     */
    public static void testLibraryItemClass() {
        // Test data setup
        Author author = new Author("John Doe", new Date());
        LibraryItem item = new LibraryItem("1", "Sample Book", author, "Publisher XYZ", "123-456-789", 10);

        // Test assertions
        assert item.getId().equals("1");
        assert item.getTitle().equals("Sample Book");
        assert item.getAuthor().getName().equals("John Doe");
        assert item.getPublisher().equals("Publisher XYZ");
        assert item.getISBN().equals("123-456-789");
        assert item.getNumberOfCopies() == 10;

        // Modify and retest
        item.setTitle("Updated Book");
        assert item.getTitle().equals("Updated Book");

        item.setNumberOfCopies(5);
        assert item.getNumberOfCopies() == 5;

        System.out.println("All tests passed successfully.");
    }

    /**
     * Patron Class Test
     */
    public static void testPatronClass() {
        // Test data setup
        Patron patron = new Patron("John Doe", "123 Main St", "555-1234", "student");
        LibraryItem item = new LibraryItem("1", "Sample Book", null, "Publisher XYZ", "123-456-789", 10);

        // Test borrowItem method
        patron.borrowItem(item, 2);
        assert item.getNumberOfCopies() == 8;

        // Test returnItem method
        patron.returnItem(item, 1);
        assert item.getNumberOfCopies() == 9;

        // Test setType method
        patron.setType("employee");
        assert patron.getType().equals("employee");

        System.out.println("All tests passed successfully.");
    }
}
