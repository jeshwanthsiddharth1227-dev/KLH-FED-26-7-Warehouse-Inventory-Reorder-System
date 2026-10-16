import java.util.Scanner;
public class WarehouseInventoryCO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Item name: ");
        String name = sc.nextLine();
        System.out.print("Current stock: ");
        int stock = sc.nextInt();
        System.out.print("Reorder level: ");
        int level = sc.nextInt();
        System.out.print("Reorder qty: ");
        int qty = sc.nextInt();
        System.out.print("Unit price: ");
        double price = sc.nextDouble();
        if (stock <= level) {
            stock += qty;
            System.out.println("Reorder done! Cost: ₹" + (qty * price));
            System.out.println("New stock of " + name + ": " + stock);
        } else {
            System.out.println(name + " stock OK: " + stock);
        }
        sc.close();
    }
}