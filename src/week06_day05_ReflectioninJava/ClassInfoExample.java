package week06_day05_ReflectioninJava;

import java.lang.reflect.*;

public class ClassInfoExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");

        System.out.println("Class: " + cls.getName());

        System.out.println("\nMethods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("\nFields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> c : cls.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}
