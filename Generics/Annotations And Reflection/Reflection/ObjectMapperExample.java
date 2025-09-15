import java.lang.reflect.*;
import java.util.*;

class User {
    private String name;
    private int age;
    public String toString() { return "User{name='" + name + "', age=" + age + "}"; }
}

public class ObjectMapperExample {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (properties.containsKey(field.getName())) {
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Harshita");
        map.put("age", 22);

        User user = toObject(User.class, map);
        System.out.println(user);
    }
}
