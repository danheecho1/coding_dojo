import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("Mocha", 4.70);
        Item item2 = new Item("Latte", 4.70); 
        Item item3 = new Item("Drip Coffee", 4.50);
        Item item4 = new Item("Capuccino", 4.60);

        // Create 2 orders for unspecified guests (without specifying a name).
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overladed constructor to give each a name for the order. 
        Order order3 = new Order("Aaron");
        Order order4 = new Order("Boyle");
        Order order5 = new Order("Chester");

        // Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item2);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item4);

        // Implement the getStatusMessage method within the Order class
        order1.getStatus();
        order2.getStatus();
        order3.getStatus();
        order4.getStatus();
        order5.getStatus();

        // Implement the getOrderTotal method within the Order class
        order1.getOrderTotal();
        order2.getOrderTotal();
        order3.getOrderTotal();
        order4.getOrderTotal();
        order5.getOrderTotal();

        // Implement the display method within the Order class
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}