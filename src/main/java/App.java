public class App {

    public static void main(String[] args) {
        // Тестируем MyLinkedList
        MyLinkedList<Object> list = new MyLinkedList<>();

        list.add("huy");
        list.add(007);
        list.add('@');
        list.add(null);

        System.out.println("Содержимое списка:");
        MyLinkedList<Object>.Node currentNode = list.head;  // Начинаем с головы списка
        while (currentNode != null) {
            System.out.println(currentNode.data);  // Выводим данные текущего узла
            currentNode = currentNode.next;  // Переходим к следующему узлу
        }

        list.remove("huy");
        System.out.println("\nПосле удаления элемента 'huy':");

        currentNode = list.head;  // Начинаем снова с головы списка
        while (currentNode != null) {
            System.out.println(currentNode.data);  // Выводим данные текущего узла
            currentNode = currentNode.next;  // Переходим к следующему узлу
        }

        // Тестируем MyHashSet
        MyHashSet<Object> set = new MyHashSet<>();

        set.add("apple");
        set.add("banana");
        set.add(9);
        set.add("banana"); // дубликат, не должен добавиться

        System.out.println("\nТестируем MyHashSet:");
        System.out.println("Содержит apple? " + set.contains("apple"));   // true
        System.out.println("Содержит banana? " + set.contains("banana")); // true
        System.out.println("Содержит 9? " + set.contains(9));             // true
        System.out.println("Содержит mango? " + set.contains("mango"));   // false


        System.out.println("\nПроверка хеш-кодов элементов:");
        System.out.println("Хеш-код 'apple': " + "apple".hashCode());
        System.out.println("Хеш-код 'banana': " + "banana".hashCode());
        System.out.println("Хеш-код 9: " + Integer.hashCode(9));
        System.out.println("Хеш-код 12345: " + Integer.hashCode(12345));

        set.remove("banana");

        System.out.println("\nПосле удаления 'banana':");
        System.out.println("Содержит banana после удаления? " + set.contains("banana")); // false
    }
}
