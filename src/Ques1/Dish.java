package Ques1;

public class Dish {
    private int dishId;
    private String dishName;
    private String  time;

    public Dish(int dishId, String dishName, String  time){
        this.dishId = dishId;
        this.dishName = dishName;
        this.time = time;
    }

    public int getDishId(){
        return dishId;
    }

    public String getDishName(){
        return dishName;
    }

    public String  getTime(){
        return time;
    }

    @Override
    public String toString() {
        return "Dish{" + "Dish ID=" + dishId + ", dishName='" + dishName + '\'' + ", time='" + time + '\'' + '}';
    }


}
