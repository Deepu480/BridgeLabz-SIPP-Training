package week04_day03_SubmissionofJavaStreams;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        File source = new File("largeFile.txt");
        File destination = new File("bufferedCopy.txt");

        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (end - start) / 1_000_000 + " ms");
    }
}
