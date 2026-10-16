import java.util.Scanner;
public class WarehouseInventoryCO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Check Stock\n2. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Item: ");
                    String name = sc.nextLine();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    System.out.print("Reorder Level: ");
                    int level = sc.nextInt();
                    System.out.print("Reorder Qty: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    if (stock <= level) {
                        stock += qty;
                        System.out.println("Reordered! Cost: ₹" + (qty * price));
                        System.out.println("New Stock of " + name + ": " + stock);
                    } else {
                        System.out.println(name + " stock OK: " + stock);
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 2);
        sc.close();
    }
}