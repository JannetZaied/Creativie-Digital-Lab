package Model;

import java.util.concurrent.atomic.AtomicInteger;

public class Events {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int Id;
    private String name;
    private String Description;
    private String Date;
    private String price;
    private String DeadlineToApply;
    private String Formateur;

    public Events(String name, String description, String date, String price, String deadlineToApply, String formateur) {
        Id = count.incrementAndGet();
        this.name = name;
        Description = description;
        Date = date;
        this.price = price;
        DeadlineToApply = deadlineToApply;
        Formateur = formateur;
    }

    public String getFormateur() {
        return Formateur;
    }

    public void setFormateur(String formateur) {
        this.Formateur = formateur;
    }

    public int getId() {
        return Id;
    }

    public String getDeadlineToApply() {
        return DeadlineToApply;
    }

    public void setDeadlineToApply(String deadlineToApply) {
        DeadlineToApply = deadlineToApply;
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
