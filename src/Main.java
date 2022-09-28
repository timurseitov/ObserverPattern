public class Main {
    public static void main(String[] args) {
        //Netflix application
        Netflix netflix = new Netflix();

        Subscriber man1 = new Subscriber("Joe");
        Subscriber man2 = new Subscriber("Bob");

        netflix.addNewFilm("amogus");
        netflix.addNewFilm("amogus2");
        netflix.addNewFilm("amogus3");
        netflix.addNewFilm("amogus4");

        netflix.addObserver(man1);
        netflix.addObserver(man2);

        netflix.addNewFilm("Титаник");
        //netflix.showFilms();

        netflix.removeObserver(man2);

        netflix.removeFilm("Титаник");


        //netflix.showFilms();
    }
}
