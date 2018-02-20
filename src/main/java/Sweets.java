/**
 * Created by Владимир on 18.02.2018.
 */
public abstract class Sweets {
    private String name;
    private int weight;
    private int price;

    Sweets(String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

