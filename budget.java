public class budget {
    public static void main(String[] args) {
        if(args.length != 1) {
            throw new IllegalArgumentException("One argument required.");
        }

        String arg = args[0];
        while(!(arg.charAt(0) >= '0' && arg.charAt(0) <= '9')) {
            arg = arg.substring(1);
        }

        double value;
        try{
            value = Double.parseDouble(arg);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Argument is not a valid value.");
        }

        final double NEEDS_RATIO = 0.50;
        final double WANTS_RATIO = 0.30;
        final double SAVINGS_RATIO = 0.20;
        System.out.printf("Needs: %,.2f\n", value * NEEDS_RATIO);
        System.out.printf("Wants: %,.2f\n", value * WANTS_RATIO);
        System.out.printf("Savings: %,.2f\n", value * SAVINGS_RATIO);
    }
}