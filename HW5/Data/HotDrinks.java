package Data;

public class HotDrinks extends Product {

    private Integer temp;
    private Integer id;
    public HotDrinks(String name, Integer price, Integer volume,Integer temp, Integer id){
        super(name, price, volume);
        this.temp = temp;
        this.id = id;
    }

    public int getTemp() {
        return temp;
    }

    public int setTemp(int temp) {
        this.temp = temp;
        return temp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nHotDrinks: " +
                " Name: " + name +
                " Volume: " + volume +
                " Price: " + price +
                " Temp: " + temp +
                ' ';
    }
}
