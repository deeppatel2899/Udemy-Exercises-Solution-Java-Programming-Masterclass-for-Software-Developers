public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;
    
    public Lamp(String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned On");
    }
    public String getStyle(){
        return this.style;
    }
    public boolean isBattery(){
        return this.battery;
    }
    public int getGlobRating(){
        return this.globRating;
    }
}
