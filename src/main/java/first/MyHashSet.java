package first;

public class MyHashSet<T> {

    private MyLinkedList<T>[] data; //массив листов, где каждый элемент это бакет типа first.MyLinkedList

    private static final int INITIAL_CAPACITY = 16;

    public MyHashSet() {
        data = new MyLinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < data.length; i++) {
            data[i] = new MyLinkedList<>();  // инициализируем каждый список в массиве
        }
    }

    // хеш-функция
    private int hash(T key) {
        return Math.abs(key.hashCode() % data.length);
    }

    public void add(T element) {
        int index = hash(element);  // вычисляем индекс
        MyLinkedList<T> list = data[index];  // получаем список на нём

        if (!list.contains(element)) {  // проверка, если элемент уже есть
            list.add(element);  // если нет, добавляем элемент
        }
    }

    public boolean contains(T element) {
        int index = hash(element);
        MyLinkedList<T> list = data[index];
        return list.contains(element);  // проверка на наличие элемента в списке
    }

    public void remove(T element) {
        int index = hash(element);
        MyLinkedList<T> list = data[index];
        list.remove(element);
    }
}
