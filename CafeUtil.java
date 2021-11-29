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

    //  //// Get Streak Goal /////////////////////////////////////////
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
}