public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══\n");

        System.out.println("Creating orders and adding items...");

        // Create Orders
        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");

        // Alice’s order
        try {
            order1.addItem("Pizza", 12.99);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            order1.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Bob’s order
        try {
            order2.addItem("Hotdog", -5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            order2.addItem("", 4.50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Valid items for Bob (total = 32.45, 5 items)
        try {
            order2.addMultipleItems(
                    new String[]{"Sandwich", "Salad", "Juice", "Pastil", "Chocolate"},
                    6.49, 6.49, 6.49, 6.49, 6.49
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Charlie’s order
        try {
            order3.addMultipleItems(new String[]{"Taco", "Soda"}, 12.00, 3.50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display results
        System.out.println("\nOrder Results:");
        System.out.println(order1.displayOrder());
        System.out.println(order2.displayOrder());
        System.out.println(order3.displayOrder());

        // Show total orders created
        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        // Largest order
        System.out.println("Largest order: " + order2.getCustomerName() +
                " ($" + order2.displayOrder().split("\\$")[1].split(",")[0] + ")");
    }
}
