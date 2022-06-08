import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready; 
    private ArrayList<Item> items = new ArrayList<Item>();

    // constructors //
    public Order() {
        this.name = "guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean getStatus() {
        return this.ready;
    }

    public void setStatus(boolean newStatus) {
        this.ready = newStatus;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item newItem) {
        this.items.add(newItem);
    }

    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double orderTotal = 0.0;
        for (Item item : this.items) {
            orderTotal += item.getPrice();
        }
        return orderTotal;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: " + this.getOrderTotal());
    }
}