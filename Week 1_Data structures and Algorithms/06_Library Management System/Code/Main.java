public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book(1, "Java Basics", "Prathamansh"));
        lib.addBook(new Book(2, "Data Structures", "Jasrotia"));
        lib.addBook(new Book(3, "Algorithms", "Cognizant"));
        lib.addBook(new Book(4, "Operating Systems", "Java-FSE"));
        lib.linearSearchByTitle("Data Structures");
        lib.binarySearchByTitle("Data Structures");
        lib.linearSearchByTitle("Java Basics");
        lib.binarySearchByTitle("Java Basics");
    }
}
