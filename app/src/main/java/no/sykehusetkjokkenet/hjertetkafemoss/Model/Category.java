package no.sykehusetkjokkenet.hjertetkafemoss.Model;

public class Category {
    private int uid;
    private String title;
    private String poster;

    public Category(int uid, String title) {
        this.uid = uid;
        this.title = title;
    }

    public Category(int uid, String title, String poster) {
        this.uid = uid;
        this.title = title;
        this.poster = poster;
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    /*public static ArrayList<Category> getCategories() {
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
    }*/
}
