public class Savings implements Calculate{
    private final double SAVINGS_RATIO = 0.20;
    private final double amount;

    public Savings(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateAmount() {
        return this.amount * this.SAVINGS_RATIO;
    }
}
