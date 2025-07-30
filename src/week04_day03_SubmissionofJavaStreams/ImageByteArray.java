package week04_day03_SubmissionofJavaStreams;

import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {
        File inputImage = new File("image.jpg");
        File outputImage = new File("copy_image.jpg");

        try (FileInputStream fis = new FileInputStream(inputImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int read;
            while ((read = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, read);
            }

            byte[] imageBytes = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(outputImage)) {
                while ((read = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
