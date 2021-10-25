package Ques15;

import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/knoldus/Desktop/JavaAdvance-Assignment/src/Ques15/LastModifiedTime.txt");
        Date date = new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
    }
}
