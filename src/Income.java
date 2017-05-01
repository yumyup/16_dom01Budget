
public class Income extends Item {
    public Income(String description, double amout, String date) {
        super(description, amout, date);
    }

    public String show() {
        return getDescription() + getAmout() + getDate();
    }
}

