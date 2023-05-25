package JP2Practice.bikeproject;

public enum BikeUses {
    BMX("Freestyle"),
    ONTEL("OG");

    private String uses;

    private BikeUses(String s){
        this.uses = s;
    }

    public String getUses() {
        return this.uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }
    

}
