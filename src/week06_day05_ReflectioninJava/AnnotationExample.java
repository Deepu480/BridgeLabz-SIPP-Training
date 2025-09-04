package week06_day05_ReflectioninJava;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name="John Doe")
class Book {}

public class AnnotationExample {
    public static void main(String[] args) {
        Class<Book> cls = Book.class;
        if (cls.isAnnotationPresent(Author.class)) {
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}
