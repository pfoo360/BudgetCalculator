public class Budget {
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

        Needs needs = new Needs(value);
        Wants wants = new Wants(value);
        Savings savings = new Savings(value);

        Format format = new Format("%,.2f\n");
        Printer printer = new Printer(format);

        System.out.print("Needs: ");
        System.out.print(printer.print(needs.calculateAmount()));

        System.out.print("Wants: ");
        System.out.print(printer.print(wants.calculateAmount()));

        System.out.print("Savings: ");
        System.out.print(printer.print(savings.calculateAmount()));
    }
}