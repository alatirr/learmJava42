/**
 * Created by Владимир on 18.02.2018.
 */
public class Toffee extends Sweets{
    private  String sort;

    Toffee(String name, int weight, int price, String sort) {
        super(name, weight, price);
        this.sort = sort;
    }

    public String getSort(){
        return this.sort;
    }
    public void setSort(String sort){
        this.sort = sort;
    }

}
