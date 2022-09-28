import java.util.List;
import java.util.Observer;

public interface Subject {
    void addObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notifyAllObservers();
}
