
public class PaymentTerminal {

    private final double affordablePrice = 2.50;
    private final double heartyPrice = 4.30;
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = 0;
        if (payment >= affordablePrice) {
            change = payment - affordablePrice;
            this.money = this.money + affordablePrice;
            this.affordableMeals++;
        } else {
            change = payment;
        }
        return change;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = 0;
        if (payment >= heartyPrice) {
            change = payment - heartyPrice;
            this.money = this.money + heartyPrice;
            this.heartyMeals++;
        } else {
            change = payment;
        }
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= affordablePrice) {
            card.takeMoney(affordablePrice);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= heartyPrice) {
            card.takeMoney(heartyPrice);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            this.money = this.money + sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
