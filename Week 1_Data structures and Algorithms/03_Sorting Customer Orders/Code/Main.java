import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order[] orders = {
            new Order("O101", "Alice", 250.50),
            new Order("O102", "Bob", 125.75),
            new Order("O103", "Charlie", 320.00),
            new Order("O104", "Diana", 89.99),
            new Order("O105", "Eve", 450.00)
        };
        System.out.println("Choose Sorting Method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            Sorter.bubbleSort(orders);
            System.out.println("\nOrders sorted using Bubble Sort:");
        } else if (choice == 2) {
            Sorter.quickSort(orders, 0, orders.length - 1);
            System.out.println("\nOrders sorted using Quick Sort:");
        } else {
            System.out.println("Invalid choice.");
            return;
        }
        for (Order order : orders) {
            order.display();
        }
        sc.close();
    }
}
