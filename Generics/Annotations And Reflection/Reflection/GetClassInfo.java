import java.lang.reflect.*;

public class GetClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList");

        System.out.println("Fields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(" " + f);
        }

        System.out.println("\nMethods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(" " + m);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(" " + c);
        }
    }
}
