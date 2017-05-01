public class Expension extends Item {

    public Expension(String description, double amout, String date) {
        super(description, amout, date);
    }

    public String show() {
        return getDescription() + getAmout() + getDate();
    }
}