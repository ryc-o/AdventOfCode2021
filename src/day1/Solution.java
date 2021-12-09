package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/day1/input.txt"));
        int counter = 0;
        int firstValue = Integer.parseInt(reader.readLine());
        while(reader.ready()){
            int secondValue = Integer.parseInt(reader.readLine());
            if(secondValue > firstValue)
                counter++;
            firstValue = secondValue;
        }
        reader.close();
        System.out.print(counter);
    }
}
