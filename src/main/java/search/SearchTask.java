package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class SearchTask implements Runnable {

    private final String name;
    private final String filename;

    public SearchTask(String name, String filename) {
        this.name = name;
        this.filename = filename;
    }

    @Override
    public void run() {
        final var resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(filename);
        try (InputStreamReader streamReader = new InputStreamReader(resourceAsStream);
             BufferedReader reader = new BufferedReader(streamReader)) {
            int lineNumber = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(filename + " - " + lineNumber + " - " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
