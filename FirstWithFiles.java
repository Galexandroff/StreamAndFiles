package StreamsFiles;

import java.io.*;

public class FirstWithFiles {
    public static void main(String[] args) {

        String dir = System.getProperty("user.dir") + "\\resources\\input.txt";
        File f = new File(dir);


        try{
            BufferedReader reader = new BufferedReader(new FileReader(f)); // --  chete ot file
            String line = reader.readLine();
            while(line != null){
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
