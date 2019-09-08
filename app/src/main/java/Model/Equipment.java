package Model;

public class Equipment {
    int a;
    private String refrence;
    private String price;
    private String title;


    public Equipment(int a, String refrence, String title, String price) {
        this.refrence = refrence;
        this.title = title;
        this.price = price;
        this.a = a;

    }


    public int getA() {
        return a;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRefrence() {
        return refrence;
    }

    public void setRefrence(String refrence) {
        this.refrence = refrence;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}
