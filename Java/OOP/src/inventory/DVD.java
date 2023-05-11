package inventory;

public class DVD extends Product {
    private int length;
    private int age_rating;
    private String film_studio;

    public DVD(int number, String name, int qty, double tempPrice,
            int length, int age_rating, String film_studio) {
        super(number, name, qty, tempPrice);
        this.length = length;
        this.age_rating = age_rating;
        this.film_studio = film_studio;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAge_rating() {
        return age_rating;
    }

    public void setAge_rating(int age_rating) {
        this.age_rating = age_rating;
    }

    public String getFilm_studio() {
        return film_studio;
    }

    public void setFilm_studio(String film_studio) {
        this.film_studio = film_studio;
    }

    @Override
    public double getInventoryValue() {
        return getQty() * getPrice() * 1.05;
    }

    @Override
    public String toString() {
        String s = "\nItem Number : " + getNumber()
                + "\nName : " + getName()
                + "\nMovie lenght : " + getLength()
                + "\nAge rating : " + getAge_rating()
                + "\nFilm Studio : " + getFilm_studio()
                + "\nQuantity in stock : " + getQty()
                + "\nPrice : " + getPrice()
                + "\nStock Value : " + getInventoryValue()
                + "\nProduct Status : ";
        if (isStatus()) {
            s += "Active\n";
        } else {
            s += "Discontinued\n";
        }

        return s + getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\n";
    }

}
