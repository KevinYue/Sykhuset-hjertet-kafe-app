package no.sykehusetkjokkenet.hjertetkafemoss.Model;

public class food {

    private int uid;
    private String title;
    private String poster;
    private String description;
    private int price;
    private int card;

    public food (int uid, String title, String description, int price, String poster){
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.price = price;
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

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }
}
