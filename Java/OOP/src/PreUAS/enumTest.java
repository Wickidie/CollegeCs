package PreUAS;

public enum enumTest {
    NORTH("N"),
    WEST("W"),
    SOUTH("S"),
    EAST("E");

    // private String direction;
    private final String code;   // in kilograms

    private enumTest(String dir){
        code = dir;
    }

    public String getCode() { return code; }


}
