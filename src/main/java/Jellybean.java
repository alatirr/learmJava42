/**
 * Created by Владимир on 18.02.2018.
 */
public class Jellybean extends Sweets{
    private boolean stuffing;
    Jellybean(String name, int weight, int price, boolean stuffing){
        super(name, weight, price);
        this.stuffing = stuffing;
    }
    public boolean getStuffing(){
        return this.stuffing;
    }
    public void setStuffing(boolean stuffing){
        this.stuffing = stuffing;
    }
}
