package uas;
public class Cards {

    private CardsEnum gambar;
    private int angka;

    public void showCard() {
        switch (angka) {
            case 1:
                System.out.println("Ace of " + gambar);
                break;
            case 11:
                System.out.println("Jack of " + gambar);
                break;
            case 12:
                System.out.println("Queen of " + gambar);
                break;
            case 13:
                System.out.println("King of " + gambar);
                break;
            default:
                System.out.println
                (String.valueOf(angka) + " " + gambar);
                break;
        }
    }
    public void setGambar(CardsEnum s) {
        gambar = s;
    }
    public CardsEnum getGambar() {
        return gambar;
    }
    public void setAngka(int num) {
        angka = num;
    }
    public int getAngka() {
        return angka;
    }
}