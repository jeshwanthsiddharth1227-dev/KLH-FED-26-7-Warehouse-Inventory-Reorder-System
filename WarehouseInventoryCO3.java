public class WarehouseInventoryCO3 {
    // Simple method
    static int reorder(int stock, int level, int qty) {
        return (stock <= level) ? stock + qty : stock;
    }
    // Recursion example
    static int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        String[] items = {"Laptop", "Mouse", "Keyboard"};
        int[] stock = {40, 8, 15};

        // Print using for-each
        System.out.println("Items:");
        for (String i : items) System.out.print(i + " ");
        System.out.println("\nStock:");
        for (int s : stock) System.out.print(s + " ");
        // Average
        int sum = 0;
        for (int s : stock) sum += s;
        System.out.println("\nAverage: " + sum / stock.length);
        // Reorder low stock
        stock[1] = reorder(stock[1], 10, 20);
        System.out.println("Mouse new stock: " + stock[1]);
        // Recursion demo
        System.out.println("Fact(4): " + fact(4));
    }
}