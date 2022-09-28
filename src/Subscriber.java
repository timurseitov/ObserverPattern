import java.util.List;

public class Subscriber implements MyObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(String film) {
        System.out.println("I got notification! There's some update: " + "\n" + film);
    }
}
