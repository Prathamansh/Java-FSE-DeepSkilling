import java.util.*;

public class SearchEngine {

    // Linear Search
    public static Product linearSearch(List<Product> products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(List<Product> products, String targetName) {
        int low = 0;
        int high = products.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = products.get(mid).productName.toLowerCase();

            if (midName.equals(targetName.toLowerCase())) {
                return products.get(mid);
            } else if (midName.compareTo(targetName.toLowerCase()) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Shoes", "Footwear"));
        products.add(new Product(102, "Laptop", "Electronics"));
        products.add(new Product(103, "T-Shirt", "Apparel"));
        products.add(new Product(104, "Smartphone", "Electronics"));
        products.add(new Product(105, "Jeans", "Apparel"));

        // Linear Search Test
        System.out.println("Linear Search: " + linearSearch(products, "Laptop"));

        // first sort for binary search as it works only for the sorted ones
        products.sort(Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search Test
        System.out.println("Binary Search: " + binarySearch(products, "Laptop"));
    }
}
