package Model;

public class Events {
    private int Id;
    private String name;
    private String Description;
    private String Date;
    private String price;

    public Events(String name, String description, String date, String price) {
        this.name = name;
        Description = description;
        Date = date;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
