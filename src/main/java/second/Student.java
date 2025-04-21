package second;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Student {

    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                " и его книги: " + books;
    }
}
