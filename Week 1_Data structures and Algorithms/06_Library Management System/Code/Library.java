import java.util.*;
public class Library {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void linearSearchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Found (Linear): " + book.title + " by " + book.author);
                found = true;
            }
        }
        if (!found) System.out.println("Book not found with title: " + title);
    }
    public void binarySearchByTitle(String title) {
        books.sort(Comparator.comparing(b -> b.title.toLowerCase()));
        int left = 0, right = books.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            String midTitle = books.get(mid).title.toLowerCase();
            if (midTitle.equals(title.toLowerCase())) {
                System.out.println("Found (Binary): " + books.get(mid).title + " by " + books.get(mid).author);
                return;
            } else if (midTitle.compareTo(title.toLowerCase()) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Book not found with title: " + title);
    }
}
