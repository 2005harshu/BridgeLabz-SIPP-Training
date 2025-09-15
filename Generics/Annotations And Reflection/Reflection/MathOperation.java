import java.lang.reflect.*;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        String methodName = "multiply"; // simulate user input
        int a = 10, b = 20;

        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(obj, a, b);

        System.out.println("Result = " + result);
    }
}
