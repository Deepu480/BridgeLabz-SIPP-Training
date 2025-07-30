package week04_day03_SubmissionofJavaStreams;

import java.io.*;

public class ReadLargeFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("bigfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
