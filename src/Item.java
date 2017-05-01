public class Item {
    private long id;
    private String type;
    private String description; //opis przychodu
    private double amout; // kwota
    private String date; //data

    public Item(){};

    public Item(long id, String type, String description, double amout, String date) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.amout = amout;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

