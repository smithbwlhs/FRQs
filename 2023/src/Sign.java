public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width){
        this.message = message;
        this.width = width;
    }

    public int numberOfLines(){
        if(message.length() % width == 0){
            return message.length()/width;
        }
        else{
            return message.length()/width + 1;
        }
    }

    public String getLines(){
        int numLines = numberOfLines();
        if(numLines == 0){
            return null;
        }
        String lines = "";
        for(int i = 1; i<numLines; i++){
            lines += message.substring((i-1)*width,i*width)+";";
        }
        return lines + message.substring((numLines-1)*width);
    }
}
