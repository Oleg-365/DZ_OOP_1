package Data;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<HotDrinks> drinksList;
    private Authomat authomat;
    private HotDrinks hotDrinks;

    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Group(){}

    public Group(ArrayList<HotDrinks> drinksList, Authomat authomat, Integer id){
        this.drinksList = drinksList;
        this.id = id;
        this.authomat = authomat;
    }

    public void setDrinksList(List<HotDrinks> drinksList) {
        this.drinksList = drinksList;
    }

    public void addDrinks(HotDrinks hotDrinks){
        this.drinksList.add(hotDrinks);
    }

    public void setAuthomat(Authomat authomat) {
        this.authomat = authomat;
    }

    public List<HotDrinks> getDrinksList() {
        return drinksList;
    }

    @Override
    public String toString() {
        return "\nGroup: " +
                "DrinkList: " + drinksList +
                "\nAuthomat: " + authomat +
                "Id Group: " + id +
                '\n';
    }

    public Authomat getAuthomat() {
        return authomat;
    }

    public void createDrinks(String name, Integer price, Integer volume,Integer temp, Integer id){
        hotDrinks.setId(id);
        hotDrinks.setName(name);
        hotDrinks.setPrice(price);
        hotDrinks.setVolume(volume);
        hotDrinks.setTemp(temp);
    }

    public void createAuthomat(String vid, String name, String productType){
        authomat.setName(name);
        authomat.setProductType(productType);
    }
}
