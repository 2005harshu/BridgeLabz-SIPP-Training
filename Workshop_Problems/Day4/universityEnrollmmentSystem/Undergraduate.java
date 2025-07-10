package universityEnrollmmentSystem;

public class Undergraduate extends Student {
    public Undergraduate(String name, int id) {
        super(name, id);
    }

    @Override
    public String getLevel() {
        return "Undergraduate";
    }
}

