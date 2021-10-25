package Ques5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/knoldus/Desktop/JavaAdvance-Assignment/src/Ques5/lear.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int words = 0, lines = 0, characters = 0;
        String str;
        while ((str = br.readLine()) != null) {
            characters = characters + str.length();
            String word[] = str.split("\\s");
            words = words + word.length;
            lines++;
        }
        System.out.println("Total Lines = " + lines + "\n" + "Total words = " + words + "\n" + "Total characters = " + characters);
    }
}
