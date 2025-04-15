import java.util.Comparator;

import second.Data;
import second.Book;


public class App {
    public static void main(String[] args) {
        Data.generateStudents()
                .stream()  // преобразуем список студентов в поток
                .filter(student -> student.getBooks().size() >= 5)  // исключаем студентов с меньшим кол-ством книг
                .peek(student -> System.out.println(student))  // выводим каждого студента и его книги
                .flatMap(student -> student.getBooks().stream())  // объединяем книги всех студентов в один поток
                .distinct()  // убираем дубликаты
                .filter(book -> book.getRelease() > 2000)  // оставляем только книги, выпущенные после 2000 года
                .sorted(Comparator.comparing(Book::getPages))  // сортируем книги по количеству страниц (по возрастанию)
                .limit(3)  // ограничиваем поток книг на 3 элемента
                .map(Book::getRelease)  // преобразуем книги в их год выпуска
                .findAny()  // получаем любой год выпуска
                .ifPresentOrElse(
                        year -> System.out.println("\n Год выпуска: " + year),  // если год найден, выводим это
                        () -> System.out.println("\n Книга не найдена.")  // это, если книги не нашли
                );
    }
}

