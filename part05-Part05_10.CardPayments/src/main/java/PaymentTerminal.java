
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private double affordableMealValue;
    private double heartyMealValue;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMealValue = 2.50;
        this.heartyMealValue = 4.30;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= affordableMealValue) {
            money += affordableMealValue;
            affordableMeals++;
            return payment - affordableMealValue;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(affordableMealValue)) {
            affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= heartyMealValue) {
            money += heartyMealValue;
            heartyMeals++;
            return payment - heartyMealValue;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(heartyMealValue)) {
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
