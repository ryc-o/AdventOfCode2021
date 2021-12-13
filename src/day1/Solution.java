package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/day1/input.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        int sumCounter = 0;
        while(reader.ready()){
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();
        for(int i = 1; i < list.size(); i++){
            if(list.get(i - 1) < list.get(i))
                counter++;
        }
        for(int i = 0; i < list.size() - 3; i++){
            int firstSum = list.get(i) + list.get(i + 1) + list.get(i + 2);
            int secondSum = list.get(i + 1) + list.get(i + 2) + list.get(i + 3);
            if(firstSum < secondSum)
                sumCounter++;
        }

        System.out.println(counter);
        System.out.println(sumCounter);
    }
}
