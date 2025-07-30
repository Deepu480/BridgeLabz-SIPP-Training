
package week04_day03_SubmissionofJavaStreams;

import java.io.*;

public class DataStreamStudent {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(1);
            dos.writeUTF("Alice");
            dos.writeDouble(8.5);

            dos.writeInt(2);
            dos.writeUTF("Bob");
            dos.writeDouble(9.1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"))) {
            while (dis.available() > 0) {
                int id = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println(id + " " + name + " " + gpa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

