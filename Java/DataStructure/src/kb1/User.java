package kb1;

public class User {
    public static void main(String[] args) {
        Chart chart = new Chart();

        chart.addChart(new Item(01, 1000, 1, "item1"));
        chart.addChart(new Item(02, 2000, 2, "item2"));
        chart.addChart(new Item(03, 3000, 3, "item3"));
        chart.addChart(new Item(04, 4000, 4, "item4"));
        chart.addChart(new Item(05, 5000, 5, "item5"));
        // chart.addChart(new Item(05, 5000, 5, "item6"));
        // chart.addChart(new Item(05, 5000, 5, "item5"));
        // chart.addChart(new Item(05, 5000, 5, "item5"));
        // chart.addChart(new Item(05, 5000, 5, "item5"));
        // chart.addChart(new Item(05, 5000, 5, "item5"));
        // chart.addChart(new Item(05, 5000, 5, "item5"));

        chart.printTotalPrice();
        chart.printTotalAfterDiscount();
        chart.printHighestItemPrice();        
    }
}
