// date : 03 July 2023
// name : Marvin Adinata

public enum Major {
    IS("Information System"),
    IT("Information technology"),
    Design("Visual and Communication Design");

    private String name;

    // modified constructor
    // score = 20
    Major(String i) {
        this.name = i;
        // IS for Information System
        // IT for Information technology
        // Design for Visual and Communication Design
    }

    // getter
    public String getName() {
        return name;
    }

}
