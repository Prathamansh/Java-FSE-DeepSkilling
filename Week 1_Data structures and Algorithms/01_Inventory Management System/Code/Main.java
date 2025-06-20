import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InventoryManager ims = new InventoryManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    ims.addProduct(new Product(id, name, qty, price));
                    break;
                case 2:
                    System.out.print("Enter Product ID to update: ");
                    String updateId = sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();
                    ims.updateProduct(updateId, newQty, newPrice);
                    break;
                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    String deleteId = sc.nextLine();
                    ims.deleteProduct(deleteId);
                    break;
                case 4:
                    ims.displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting Inventory Management System...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
