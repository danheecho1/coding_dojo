import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal() {
        int streakGoal = 0;
        for (int i = 1; i < 11; i++) {
        streakGoal += i;
        }
        return streakGoal;
    }

    public double getOrderTotal(double[] prices) {
        double orderTotal = 0.0;
        for (int i = 0; i < prices.length; i++) {
            orderTotal += prices[i];
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        int i = 0; 
        while (i < menuItems.size()) {
            System.out.println(i + " " + menuItems.get(i));
            i ++;
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "! There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}