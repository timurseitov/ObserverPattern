import java.util.ArrayList;
import java.util.List;

public class Netflix implements Subject {

    private List<MyObserver> subscribers;
    private List<String> films;
    private String film;

    public Netflix() {
        subscribers = new ArrayList<>();
        films = new ArrayList<>();
    }

    public void addNewFilm(String filmName) {
        this.film = filmName;
        films.add(filmName);
        notifyAllObservers();
    }

    public void removeFilm(String filmName) {
        this.film = filmName;
        films.remove(filmName);
        notifyAllObservers();
    }

    @Override
    public void addObserver(MyObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (MyObserver subscriber : subscribers) {
            subscriber.update(film);
        }
    }

    public void showFilms() {
        System.out.println(films.toString());
    }
}
