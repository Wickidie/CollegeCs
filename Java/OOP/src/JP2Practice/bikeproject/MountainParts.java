package JP2Practice.bikeproject;

public interface MountainParts {
        //constant declaration
        // public final String TERRAIN = "off_road";
        public final BikeUses TERRAIN = BikeUses.BMX;
    
        //required methods after implementation
        public String getSuspension();
        public void setSuspension(String newValue);
        public String getType();
        public void setType(String newValue);
        
}
