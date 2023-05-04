package inventory;

public class CD extends Product {
    private String artist;
    private int number_of_song;
    private String label;

    public CD(int number, String name, int qty, double tempPrice,
            String artist, int num_of_song, String label) {
        super(number, name, qty, tempPrice);
        this.artist = artist;
        this.number_of_song = num_of_song;
        this.label = label;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumber_of_song() {
        return number_of_song;
    }

    public void setNumber_of_song(int number_of_song) {
        this.number_of_song = number_of_song;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        String s = "\nItem Number : " + getNumber()
                + "\nName : " + getName()
                + "\nArtist : " + getArtist()
                + "\nSong on Album : " + getNumber_of_song()
                + "\nRecord Label : " + getLabel()
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
