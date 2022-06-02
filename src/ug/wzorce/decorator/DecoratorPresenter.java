package ug.wzorce.decorator;

public class DecoratorPresenter {
    public void present() {
        System.out.println("8. Dekorator");
        var book = new Book();
        book.setAuthor("Jan Kowalski");
        book.setTitle("Książka 1");
        book.setCountOfCopies(10);
        var hireableBook = new Hireable(book);
        hireableBook.hire("Marian Kowalski");
        hireableBook.hire("Anna Nowak");
        hireableBook.hire("Józef Mariacki");
        var movie = new Movie();
        movie.setDirector("Jan Kowalski");
        movie.setTitle("Film 1");
        movie.setTime(9000L);
        movie.setCountOfCopies(10);
        var hireableMovie = new Hireable(movie);
        hireableMovie.hire("Franciszek Pawlak");
        hireableMovie.hire("Roman Gromski");
        hireableMovie.hire("Grzegorz Brzęczyszczykiewicz");

        hireableBook.show();
        hireableMovie.show();
    }
}
