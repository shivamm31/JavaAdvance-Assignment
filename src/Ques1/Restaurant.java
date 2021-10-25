package Ques1;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Press 1 to display menu");
        System.out.println("Press 2 to Search Dish");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println();
        Menu menu = new Menu();
        if( a == 1){
            int i = 1;
            for (Dish dish: Menu.MenuList){
                System.out.println("Dish -->> " + i + " " + dish.getDishName());
                i++;
            }
        }
        else if ( a == 2 ){
            System.out.println("Enter the Dish ID : ");
            int checkid = sc.nextInt();
            System.out.println();
            for (Dish dish: Menu.MenuList){
                if( checkid == dish.getDishId()){
                    System.out.println("Dish Id -->> " + dish.getDishId());
                    System.out.println("Dish Name -->> " + dish.getDishName());
                    System.out.println("Time -->> " + dish.getTime());
                    break;
                }
            }
        }

        else
            System.out.println("Please enter correct option");
    }

}
