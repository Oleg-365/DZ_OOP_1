package Data;

import java.util.ArrayList;
import java.util.List;

public class Authomat implements IAuthomat {

    List<HotDrinks> hotDrinks = new ArrayList<>();
    List<HotDrinks> list = new ArrayList<>();
    private String vid;
    private String productType;
    private String name;

    public Authomat(String vid, String productType, String name) {
        this.vid = vid;
        this.productType = productType;
        this.name = name;
    }
    public Authomat(){
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    @Override
    public String toString() {
        return " Authomat: " +
                " Vid: " + vid + '\'' +
                " ProductType: " + productType + '\'' +
                " Name: " + name + '\'' +
                ' ';
    }


    @Override
    public void initProduct() {
    }
    public void initProduct(List<HotDrinks> list) {
        this.hotDrinks = list;
    }
    @Override
    public String getProduct() {
        return null;
    }
    public String getProduct(String name) {
        list.clear();
        for (HotDrinks el : hotDrinks) {
            if (el.getName().equals(name)) list.add(el);
        }
        return list.toString();
    }
    public String getProduct(int temp) {
        list.clear();
        for (HotDrinks el : hotDrinks) {
            if (el.getTemp() <= temp) list.add(el);
        }
        return list.toString();
    }
    public String getProductPrice(int Price) {
        list.clear();
        for (HotDrinks el : hotDrinks) {
            if (el.getPrice() <= Price) list.add(el);
        }
        return list.toString();
    }
}
