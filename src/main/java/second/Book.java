package second;

import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@EqualsAndHashCode

public class Book {
    private String title;
    private String author;
    private int release;
    private int pages;


    public Book(String title, String author, int release, int pages) {
        this.title = title;
        this.author = author;
        this.release = release;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return  "'" + title + '\'' +
                ", автор: " + author +
                ", впервые опубликован в " + release + "-ом году" +
                ", " + pages + " страниц" +
                " ;";
    }
}
