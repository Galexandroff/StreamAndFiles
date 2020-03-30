package StreamsFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Third {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir") + "\\resources\\Exercises Resources\\input.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(dir));
            String line = reader.readLine();
            PrintWriter writer = new PrintWriter("numberLines.txt");
                for (int i = 1; line != null ; i++) {
                    writer.printf("%d. %s%n",i,line);

                    line = reader.readLine();
                }
                writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
