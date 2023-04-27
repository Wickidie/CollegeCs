package inventory;

public class CD extends Product {
    private String artist;
    private int number_of_song;
    private String label;

    public CD(int number, String name, int qty, int price,
            String artist, int num_of_song, String label) {
        super(number, name, qty, price);
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
        String s = "Item Number" + getNumber()
                + "Name : " + getName()
                + "Artist : " + getArtist()
                + "Song on Album : " + getNumber_of_song()
                + "Record Label : " + getLabel()
                + "Quantity in stock : " + getQty()
                + "Price : " + getPrice()
                + "Stock Value : " + getInventoryValue()
                + "Product Status : ";
        if (isStatus()) {
            System.out.print("Active\n");
        } else {
            System.out.print("Discontinued\n");
        }

        return s + getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\n";
    }

}
