package week06_day05_ReflectioninJava;

import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "OLD_KEY";
    public static String getApiKey() { return API_KEY; }
}

public class StaticFieldExample {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Original Key: " + Configuration.getApiKey());
        field.set(null, "NEW_SECRET_KEY");
        System.out.println("Modified Key: " + Configuration.getApiKey());
    }
}
