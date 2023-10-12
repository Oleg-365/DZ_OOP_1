package Controller;

import Data.Group;
import Data.HotDrinks;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<Group> stream = new ArrayList<>();


    @Override
    public String toString() {
        return "Controller: " + stream;
    }

    public void addGroup(Group group) {
        stream.add(group);
    }

    public static void setStream(List<Group> stream) {
        Controller.stream = stream;
    }

    public static List<Group> getStream() {
        return stream;
    }

    public static Group getGroupById(Integer id) {
        for (Group group : stream) {
            if (group.getId() == id) {
                return group;
            }
        }
        System.out.println("Такой группы нет");
        return null;
    }


    public void addDrinks(Integer idGroup,String name, Integer price, Integer volume, Integer temp, Integer id) {
        getGroupById(idGroup).addDrinks(new HotDrinks(name, price, volume, temp, id));
    }

    public void addAuthomatToGroup(Integer idGroup,String vid, String productType, String name) {
        getGroupById(idGroup).createAuthomat(vid, productType, name);
    }
}
