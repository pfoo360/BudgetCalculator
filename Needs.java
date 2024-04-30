public class Needs implements Calculate {
    private final double NEEDS_RATIO = 0.50;
    private final double amount;

    public Needs(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateAmount() {
        return this.amount * this.NEEDS_RATIO;
    }
}
