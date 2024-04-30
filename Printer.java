public class Printer {
    private final IFormat format;

    public Printer(IFormat format) {
        this.format = format;
    }

    public <T> String print(T input) {
        return this.format.getFormat().formatted(input);
    }
}
