package Ques1;

import java.util.ArrayList;

public class Menu {
    static ArrayList<Dish> MenuList = new ArrayList<Dish>();
    static {
        MenuList.add(new Dish(1,"Chikken Tikka","16:45"));
        MenuList.add(new Dish(2,"Matar Paneer","19:00"));
        MenuList.add(new Dish(3,"Garlic Bread","18:20"));
        MenuList.add(new Dish(4,"White Sauce Pasta","21:18"));
    }
}
