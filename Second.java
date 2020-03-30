package StreamsFiles;

import java.io.*;


public class Second {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir") + "\\resources\\input.txt";


        BufferedReader reader = null;
        try{
            File file = new File("myOutput.txt");

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            reader = new BufferedReader(new FileReader(dir));
            String line = reader.readLine();
            while(line != null){
                String upper = line.toUpperCase();

                writer.write(upper);
                writer.newLine();

                line = reader.readLine();
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
