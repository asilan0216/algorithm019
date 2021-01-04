/**
 * 860. 柠檬水找零
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            int money = bills[i];
            if (money == 5) {
                five++;
            } else if (money == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five = five - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}