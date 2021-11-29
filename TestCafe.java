import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ///////////////////////////////////////////////////////////////////
//  TEST CAFE
//  By: Virgilio D. Cabading Jr.    Created at: November 28, 2021 2345
// ///////////////////////////////////////////////////////////////////

public class TestCafe {
  // //// MAIN EXECUTABLE SECTTION ///////////////////////////////////
  public static void main(String[] args) {
    System.out.println("/////////////////////////////////////////////////////");
    System.out.println("TEST CAFE");

    CafeUtil appTest = new CafeUtil();                                  // Create a new instance of Cafe Util

    /* ============ App Test Cases ============= */

    System.out.println("\n----- Streak Goal Test -----");
    System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));

    // System.out.println("----- Order Total Test-----");
    // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
    // System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

    // System.out.println("----- Display Menu Test-----");

    // List<String> loadMenu = Arrays.asList(
    // "drip coffee",
    // "cappucino",
    // "latte",
    // "mocha"
    // );
    // ArrayList<String> menu = new ArrayList<String>();
    // menu.addAll(loadMenu);
    // appTest.displayMenu(menu);

    // System.out.println("\n----- Add Customer Test-----");
    // ArrayList<String> customers = new ArrayList<String>();
    // // --- Test 4 times ---
    // for (int i = 0; i < 4; i++) {
    // appTest.addCustomer(customers);
    // System.out.println("\n");
    // }
  }
}
