import java.lang.reflect.*;

class Task {
    public void fastMethod() {
        for (int i = 0; i < 1000; i++); // small loop
    }
    public void slowMethod() {
        for (int i = 0; i < 1000000; i++); // big loop
    }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        for (Method method : Task.class.getDeclaredMethods()) {
            long start = System.nanoTime();
            method.invoke(task);
            long end = System.nanoTime();
            System.out.println(method.getName() + " executed in " + (end - start) + " ns");
        }
    }
}
