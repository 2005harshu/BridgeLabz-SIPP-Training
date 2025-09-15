import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Harshita")
class Book {}

public class RetrieveAnnotation {
    public static void main(String[] args) {
        Author author = Book.class.getAnnotation(Author.class);
        if (author != null) {
            System.out.println("Author: " + author.name());
        }
    }
}
