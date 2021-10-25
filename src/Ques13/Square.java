package Ques13;

public class Square implements Runnable{
    int x;

    public Square(int x){
        this.x = x;
    }
    @Override
    public void run() {
        System.out.println("Square of the number = " + x*x);

    }
}
