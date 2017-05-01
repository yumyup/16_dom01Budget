public class Item {
    private String description; //opis przychodu
    private double amout; // kwota
    private String date; //data

    public Item(){};
    public Item(String description, double amout, String date) {
        this.description = description;
        this.amout = amout;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}

