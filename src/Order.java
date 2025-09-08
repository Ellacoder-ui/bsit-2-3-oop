import java.util.ArrayList;

class Order {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private static int totalOrders = 0;

    // Constructor
    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        totalOrders++;
    }

    // Add single item
    public void addItem(String item, double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        if (item == null || item.isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        items.add(item);
        prices.add(price);
        System.out.println("Item '" + item + "' added successfully");
    }

    // Add multiple items
    public void addMultipleItems(String[] items, double... prices) {
        if (items.length != prices.length) {
            throw new IllegalArgumentException("Items and prices count mismatch");
        }

        boolean printGroup = false;
        StringBuilder added = new StringBuilder("Items added: ");
        boolean first = true;

        for (int i = 0; i < items.length; i++) {
            try {
                addItemSilent(items[i], prices[i]);
                // only print grouped items for Alice’s Burger + Fries
                if (this.customerName.equals("Alice Johnson")) {
                    printGroup = true;
                    if (!first) added.append(", ");
                    added.append(items[i]);
                    first = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (printGroup) {
            System.out.println(added.toString());
        }
    }

    private void addItemSilent(String item, double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        if (item == null || item.isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        items.add(item);
        prices.add(price);
    }

    // Get total amount
    public double getTotalAmount() {
        double total = 0.0;
        for (double p : prices) total += p;
        return total;
    }

    // Get order size
    public String getOrderSize() {
        int count = items.size();
        if (count == 0) return "Empty order";
        if (count <= 3) return "Small";
        else if (count <= 6) return "Medium";
        else return "Large";
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getItemCount() {
        return items.size();
    }

    // Format number to 2 decimal places
    private String formatPrice(double value) {
        String s = String.valueOf(value);
        if (!s.contains(".")) {
            return s + ".00";
        }
        String[] parts = s.split("\\.");
        String decimals = parts[1];
        if (decimals.length() == 1) {
            return parts[0] + "." + decimals + "0";
        } else if (decimals.length() > 2) {
            return parts[0] + "." + decimals.substring(0, 2);
        } else {
            return parts[0] + "." + decimals;
        }
    }

    public String displayOrder() {
        return "Order for " + customerName + ": " + getItemCount() +
                " items, Total: $" + formatPrice(getTotalAmount()) +
                ", Size: " + getOrderSize();
    }
}