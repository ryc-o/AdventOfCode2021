package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/day3/input.txt"));
        int lineCounter = 0;
        int[] bitOneCounter = new int[12];
        for(int i : bitOneCounter){
            bitOneCounter[i] = 0;
        }
        while(reader.ready()){
            String[] line = reader.readLine().split("");
            for(int i = 0; i < 12; i++){
                if(line[i].equals("1"))
                    bitOneCounter[i]++;
            }
            lineCounter++;
        }
        reader.close();
        StringBuilder epsilion = new StringBuilder();
        StringBuilder gammaRate = new StringBuilder();
        for(int i = 0; i < 12; i++){
            if(bitOneCounter[i] > (lineCounter/2)){
                epsilion.append("1");
                gammaRate.append("0");
            }
            else{
                epsilion.append("0");
                gammaRate.append("1");
            }
        }
        System.out.println(epsilion); //000011000111 = 199
        System.out.println(gammaRate); //111100111000 = 3896
        System.out.println(199*3896);
    }
}