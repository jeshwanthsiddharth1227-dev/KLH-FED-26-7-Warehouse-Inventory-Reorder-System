import java.nio.file.*;
import java.util.*;
import java.io.*;

class Item implements Comparable<Item> {
    String name;
    int stock;

    Item(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public int compareTo(Item other) {
        return this.stock - other.stock;   // sort by stock
    }

    public String toString() {
        return name + ":" + stock;
    }
}

public class WarehouseInventoryCO5 {
    public static void main(String[] args) {
        try {
            // 1. String operations
            String data = "Laptop,8;Mouse,25;Keyboard,12";
            String[] parts = data.split(";");

            List<Item> list = new ArrayList<>();
            for (String p : parts) {
                String[] t = p.split(",");
                list.add(new Item(t[0].trim(), Integer.parseInt(t[1].trim())));
            }

            // 2. Sorting & Searching
            Collections.sort(list);
            System.out.println("Sorted by stock: " + list);

            // 3. File Write (try-with-resources)
            Path file = Paths.get("inventory.txt");
            try (BufferedWriter bw = Files.newBufferedWriter(file)) {
                for (Item i : list) {
                    bw.write(i.toString());
                    bw.newLine();
                }
            }

            // 4. File Read
            System.out.println("\nFrom file:");
            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                System.out.println(line.toUpperCase());
            }

            // 5. StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append("Total items: ").append(list.size());
            System.out.println(sb);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}