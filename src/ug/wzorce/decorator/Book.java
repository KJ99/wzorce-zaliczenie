package ug.wzorce.decorator;

public class Book extends LibraryItem {
    private String author;
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void show() {
        System.out.printf("%s, %s%n\n", author, title);
    }
}
