public class Candy extends Sweets{
    private String country;

    Candy(String name, int weight, int price, String country) {
        super(name, weight, price);
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }
}
