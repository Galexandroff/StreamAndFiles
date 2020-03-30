package StreamsFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // -- chete ot konzolata

        try{
            String line = reader.readLine();
            while(!line.equals("null")){
                int sum = 0;
                for (char c: line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
