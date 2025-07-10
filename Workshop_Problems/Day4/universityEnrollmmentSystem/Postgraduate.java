package universityEnrollmmentSystem;

public class Postgraduate extends Student {
    public Postgraduate(String name, int id) {
        super(name, id);
    }

    @Override
    public String getLevel() {
        return "Postgraduate";
    }
}
