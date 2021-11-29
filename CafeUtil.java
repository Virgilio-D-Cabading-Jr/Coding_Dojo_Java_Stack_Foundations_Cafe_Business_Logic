import java.io.Console;
import java.util.ArrayList;

// ///////////////////////////////////////////////////////////////////
//  CAFE UTIL
//  By: Virgilio D. Cabading Jr.    Created at: November 28, 2021 2145
// ///////////////////////////////////////////////////////////////////

/**
 * CafeUtil
 */
public class CafeUtil {

    //  //// Get Streak Goal /////////////////////////////////////////
    //  Each week, a customer needs to purchase 1 more drink than they bought the previous week 
    //      to get some free drinks after 10 weeks
    //  @return: int (sum from 1 to 10)
    public int getStreakGoal() {
        int sum = 0;
        for (int i=1 ; i<=10; i++) {
            sum += i;
        }
        return sum;
    }

    //  //// Get Streak Goal | @param int numWeeks ///////////////////
    //  Each week, a customer needs to purchase 1 more drink than they bought the previous week 
    //      to get some free drinks after specified number of weeks
    //  @return: int (sum from 1 to numWeeks)
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i=1 ; i<=numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    //  //// Get Order Total /////////////////////////////////////////
    //      Given an array of order prices, sum the prices and return the total 
    //  @param: double[] prices
    //  @return: double
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) {               // Iterate through each price in the prices array
            sum += price;                           // Add each price to the sum
        }
        return sum;                                 // Return the sum total
    }

    //  //// Display Menu  ///////////////////////////////////////////
    //      Given an ArrayList of menu items (strings), print out each index and menu item.
    //  @param: ArrayList<String> menuItems
    public void displayMenu(ArrayList<String> menuItems) {
        for ( int i=0; i<menuItems.size(); i++) {
            System.out.printf("%d %s\n", i, menuItems.get(i));
        }
    }

    //  //// Add Customer  ///////////////////////////////////////////
    //      Add a customer to the customers in the queue
    //      then display how many people are ahead in the queue
    //      then display the entire queue
    public void addCustomer(ArrayList<String> customersInLine) {
        // System.out.println("Please enter your name: ");

        String userName = System.console().readLine("Please, enter your name: ");   // Get the User name from the user on the console
        System.out.printf("Hello, %s!\n", userName);

    }
}