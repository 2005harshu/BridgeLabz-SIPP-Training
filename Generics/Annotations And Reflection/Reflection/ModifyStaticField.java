import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "1234";
}

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "abcd1234"); // static field → pass null
        System.out.println("API_KEY = " + field.get(null));
    }
}
