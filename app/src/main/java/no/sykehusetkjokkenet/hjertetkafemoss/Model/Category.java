package no.sykehusetkjokkenet.hjertetkafemoss.Model;

import java.util.ArrayList;

import no.sykehusetkjokkenet.hjertetkafemoss.R;

public class Category {
    private int uid;
    private String title;
    private int poster;
    private String description;
    private Double price;
    private int card;

    public Category(int uid, String title, int poster) {
        this.uid = uid;
        this.title = title;
        this.poster = poster;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public static ArrayList<Category> getCategories() {
        ArrayList categoryData = new ArrayList<Category>();

        int[] images = new int[] {
                R.drawable.salat,
                R.drawable.baguette,
                R.drawable.wraps,
                R.drawable.vaffel,
                R.drawable.rundstykker
        };

        String[] titles = new String[] {
                "Salat",
                "Baguetter",
                "Wraps",
                "Kaker og snacks",
                "Rundstykker"
        };

        // A loop to show the images and titles
        for(int i = 0; i < images.length; i++) {
            Category aCategory = new Category(i, titles[i], images[i]);

            categoryData.add(aCategory);
        }
        return categoryData;
    }
}
