package View;

import Controller.Controller;
import Data.Group;

public class View {
    Controller controller = new Controller();
    public void createGroup(Group group){
        controller.addGroup(group);
    }

    public void createDrinks(Integer groupId,String name, Integer price, Integer volume, Integer temp, Integer id){
        controller.addDrinks( groupId, name,  price,  volume, temp,  id);
    }

    public void printInfo(){
        System.out.println(controller);
    }
    @Override
    public String toString() {
        return "View: " +
                controller +
                ' ';
    }
}



