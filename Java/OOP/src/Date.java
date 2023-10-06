// nim : 312110009
// date : 03 July 2023

public class Date {
    private int day;
    private int month;
    private int year;

    Date(int d, int m, int y){
        set(d, m, y);
    }

    // getter and setter as needed
    // day = 1 .. 28,29,30,31 according to month and year
    // month = 1 .. 12
    // year = 1900 - 2023
    // score = 20
    public void set(int d, int m, int y) {
        boolean isValid = false;
        boolean isKabisat = false;
        boolean isFeb = false;
        // System.out.println(d);
        // System.out.println(m);
        // System.out.println(y);

        if ((d >= 1 && d <= 31) && (m >= 1 && m <= 12) && (y >= 1900 && y <= 2023)) {
            isValid = true;
        }
        if (isValid) {
            this.month = m;
            this.year = y;
            if(m == 2){isFeb = true;}
            if(y % 4 == 0){isKabisat = true;}
            if (isFeb) {
                System.out.println("Bulan February");
                if (isKabisat) {
                    System.out.println("Tahun Kabisat");
                    if (d >= 30) {
                        System.out.println("Hari harus < 30 karena Feb & Kabisat");
                    }else{
                        this.day = d;
                    }
                }else{
                    System.out.println("Bukan Kabisat");
                    if (d >= 29) {
                        System.out.println("Hari harus < 29 karena Feb & Bukan Kabisat");
                    }else{
                        this.day = d;
                    }
                }
            }else{
                if (m % 2 == 0) {
                    if (d >= 31) {
                        System.out.println("Hari harus < 31 karena Bulan Genap");
                    }else{
                        this.day = d;
                    }
                }else{
                    if (d >= 32) {
                        System.out.println("Hari harus < 32 karena Bulan Ganjil");
                    }else{
                        this.day = d;
                    }
                    
                }
            }
        }else{
            System.out.println("Input Invalid");
        }
        
    }

    // return format = dd/mm/yyyy
    public String toString() {
        return new String(day + "/" + month + "/" + year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

}
