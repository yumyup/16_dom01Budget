
public class Income extends Item {
    public Income(String type, String description, double amout, String date) {

    }

    public Income() {
    }

    public String show() {
        return getDescription() + getAmout() + getDate();
    }
}

