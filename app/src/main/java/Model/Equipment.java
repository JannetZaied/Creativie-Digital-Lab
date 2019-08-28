package Model;

public class Equipment {
    private int refrence;
    private String title, description;
    private String price;


    public Equipment(int refrence, String title, String description, String price) {
        this.refrence = refrence;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getRefrence() {
        return refrence;
    }

    public void setRefrence(int refrence) {
        this.refrence = refrence;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}
