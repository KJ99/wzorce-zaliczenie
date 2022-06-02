package ug.wzorce.decorator;

public class Movie extends LibraryItem {
    private long time;
    private String director;
    private String title;


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void show() {
        System.out.printf("%s, %s, %d%n\n", title, director, time);
    }
}
