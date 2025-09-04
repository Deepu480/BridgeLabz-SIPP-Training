package week06_day05_ReflectioninJava;

import java.lang.reflect.*;

class Calculator {
}

public class PrivateMethodExample {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(calc, 5, 6);
        System.out.println("Result: " + result);
    }
}
