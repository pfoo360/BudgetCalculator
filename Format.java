public class Format implements IFormat{
    private String format;

    public Format(String format) {
        this.format = format;
    }

    @Override
    public String getFormat() {
        return this.format;
    }
}
