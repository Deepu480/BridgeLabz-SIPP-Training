package week06_day05_ReflectioninJava;

import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocationExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = sc.nextLine();

        Class<?> cls = MathOperations.class;
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(obj, 10, 5);

        System.out.println("Result: " + result);
    }
}
