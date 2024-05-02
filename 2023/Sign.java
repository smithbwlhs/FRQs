public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width){
        this.message = message;
        this.width = width;
    }

    public int numberOfLines(){
        return -1;
    }

    public String getLines(){
        return null;
    }
}
