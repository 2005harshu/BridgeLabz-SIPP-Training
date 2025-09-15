import java.lang.reflect.*;

class Employee {
    private String name = "Ravi";
    private int salary = 50000;
}

public class JsonGenerator {
    public static String toJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            sb.append("\"").append(fields[i].getName()).append("\": \"").append(fields[i].get(obj)).append("\"");
            if (i < fields.length - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        System.out.println(toJson(emp));
    }
}
