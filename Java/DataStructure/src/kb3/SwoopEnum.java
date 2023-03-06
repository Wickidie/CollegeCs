package kb3;
public enum SwoopEnum{

    HAPPY("Happy",'H'),
    SAD("Sad",'S');

    private String mode;
    private char md;
    

    SwoopEnum(String s, char ch){
        mode = s;
        md = ch;
    }

    public void setMode(String s){
        mode = s; 
    }
    public void setMd(char s){
        md = s; 
    }
    public String getMode(){
        return mode;
    }
    public char getMd(){
        return md;
    }

}