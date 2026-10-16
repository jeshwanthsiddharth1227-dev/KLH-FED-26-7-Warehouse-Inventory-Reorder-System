import java.util.*;
import java.util.stream.*;

public class WarehouseInventoryCO6 {
    public static void main(String[] args) {
        // List + HashMap
        List<String> items = new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Mouse"));
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Laptop", 8);
        stock.put("Mouse", 25);
        stock.put("Keyboard", 12);
        // HashSet – unique items
        Set<String> unique = new HashSet<>(items);
        System.out.println("Unique items: " + unique);
        // Stream – filter low stock + sort
        System.out.println("Low stock items:");
        stock.entrySet().stream()
             .filter(e -> e.getValue() < 15)
             .sorted(Map.Entry.comparingByKey())
             .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        // Lambda + forEach
        stock.forEach((name, qty) -> {
            if (qty < 15) System.out.println("Reorder " + name);
        });
        // Count low stock
        long lowCount = stock.values().stream()
                             .filter(q -> q < 15)
                             .count();
        System.out.println("Items to reorder: " + lowCount);
    }
}