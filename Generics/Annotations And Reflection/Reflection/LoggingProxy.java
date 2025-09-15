import java.lang.reflect.*;

interface Greeting {
    void sayHello(String name);
}

class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}

public class LoggingProxy {
    public static void main(String[] args) {
        Greeting g = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class<?>[]{Greeting.class},
            (proxy, method, methodArgs) -> {
                System.out.println("Calling method: " + method.getName());
                return method.invoke(new GreetingImpl(), methodArgs);
            }
        );

        g.sayHello("Harshita");
    }
}
