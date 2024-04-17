public enum ChargeLevel {
    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    int sections;
    String color;

    ChargeLevel(int sections, String color) {
        this.color = color;
        this.sections = sections;
    }

    public String getColor() {
        return color;
    }

    public int getsections() {
        return sections;
    }
}
