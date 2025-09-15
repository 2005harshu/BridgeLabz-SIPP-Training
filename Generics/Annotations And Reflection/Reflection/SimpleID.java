import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    public void serve() { System.out.println("Service is working!"); }
}

class Client {
    @Inject
    private Service service;

    public void doWork() { service.serve(); }
}

public class SimpleDI {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        for (Field field : Client.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, field.getType().getDeclaredConstructor().newInstance());
            }
        }
        client.doWork();
    }
}
