class Item {
    private String name;
    private int stock;
    private int reorderLevel;
    // Constructor
    Item(String name, int stock, int level) {
        this.name = name;
        this.stock = stock;
        this.reorderLevel = level;
    }
    // Getters & Setters (Encapsulation)
    public String getName() { return name; }
    public int getStock() { return stock; }
    public void reorder(int qty) {
        if (stock <= reorderLevel) {
            stock += qty;
            System.out.println(name + " reordered. New stock: " + stock);
        } else {
            System.out.println(name + " stock OK");
        }
    }
    // toString
    public String toString() {
        return name + " : " + stock;
    }
}
public class WarehouseInventoryCO4 {
    public static void main(String[] args) {
        try {
            Item laptop = new Item("Laptop", 8, 10);
            Item mouse = new Item("Mouse", 25, 15);

            System.out.println(laptop);
            System.out.println(mouse);

            laptop.reorder(20);   // will reorder
            mouse.reorder(10);    // will not

            // Force exception
            if (laptop.getStock() < 0)
                throw new Exception("Invalid stock!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory check finished.");
        }
    }
}