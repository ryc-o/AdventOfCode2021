package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static int depht = 0;
    public static int hPosition = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/day2/input.txt"));

        while(reader.ready()){
            checkPosition(reader.readLine().split(" "));
        }
        System.out.println(depht*hPosition);
    }

    public static void checkPosition(String[] args){
        switch (args[0]) {
            case ("forward") -> depht += Integer.parseInt(args[1]);
            case ("down") -> hPosition += Integer.parseInt(args[1]);
            case ("up") -> hPosition -= Integer.parseInt(args[1]);
        }
    }
}
