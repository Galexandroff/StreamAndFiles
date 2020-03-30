package StreamsFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fourth {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        String firstPath = dir + "\\resources\\Exercises Resources\\words.txt";
        String secondPath = dir + "\\resources\\Exercises Resources\\text.txt";


        try {
            String[] keys = new BufferedReader(new FileReader(firstPath)).readLine().split(" ");

            Map<String, Integer> words = new HashMap<>();
            for (String key : keys) {
                words.putIfAbsent(key, 0);
            }

            Files.lines(Paths.get(secondPath)).forEach(line -> {
                Arrays.stream(line.split("[,\\-]+")).forEach(str -> {
                    if (words.containsKey(str)) {
                        words.put(str, words.get(str) + 1);
                    }
                });
            });

            PrintWriter writer = new PrintWriter("WordsResult.txt");
            words.entrySet()
                    .stream()
                    .sorted((f, s) -> s.getValue().compareTo(f.getValue()))
                    .forEach(entry -> {
                        writer.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
                    });


            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
