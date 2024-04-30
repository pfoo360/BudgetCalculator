public class Wants implements Calculate{
    private final double WANTS_RATIO = 0.30;
    private final double amount;

    public Wants(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateAmount() {
        return this.amount * this.WANTS_RATIO;
    }
}
