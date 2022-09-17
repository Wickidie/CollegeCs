package uas;
public enum CardsEnum{

    HEART("Heart",'H'),
    DIAMOND("Diamond",'D'),
    SPADE("Spade",'S'),
    CLUB("Club",'C');
    
    private String image;
    private char img;
    
    CardsEnum(String s, char ch){
        image = s;
        img = ch;
    }

    public void setImage(String s){
        image = s; 
    }
    public String getImage(){
        return image;
    }
    public void setImg(char ch){
        img = ch; 
    }
    public char getImg(){
        return img;
    }
}
