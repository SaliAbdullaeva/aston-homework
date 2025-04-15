package second;

import java.util.Arrays;
import java.util.List;

public class Data {
    public static List<Student> generateStudents() { //возвращаем список объектов типа Student
        List<Book> books = Arrays.asList(
                new Book("Искусство любить", "Эрих Фромм", 1956, 221),
                new Book("Солярис", "Станислав Лем", 1961, 285),
                new Book("Так говорил Заратустра", "Фридрих Ницше", 1885, 350),
                new Book("Наука о данных", "Джон Келлехер", 2018, 214)
//                new Book("Происхождение видов", "Чарльз Дарвин", 1859, 700),
//                new Book("Второй пол", "Симона де Бовуар", 1949, 800)
        );

        return List.of(
                new Student("Антон", books),
                new Student("Сафрон", books),
                new Student("Ларион", books),
                new Student("Пардон", books),
                new Student("Вассарион", books)
        );
    }
}
