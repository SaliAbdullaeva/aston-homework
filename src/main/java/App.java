public class App {

    public static void main(String[] args) {
        MyLinkedList<Object> list = new MyLinkedList<>();

        list.add("huy");
        list.add(007);
        list.add('@');
        list.add(null);

        var i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        list.remove("huy");

        System.out.println("После удаления:");

        for (Object item : list) {
            System.out.println(item);
        }
    }
}









//        MyHashSet<String> set = new MyHashSet<>();
//
//        set.add("apple");
//        set.add("banana");
//        set.add("cherry");
//        set.add("banana"); // дубликат, не должен добавиться
//
//        System.out.println("Contains apple? " + set.contains("apple"));   // true
//        System.out.println("Contains banana? " + set.contains("banana")); // true
//        System.out.println("Contains mango? " + set.contains("mango"));   // false
//
//        set.remove("banana");
//
//        System.out.println("Contains banana after remove? " + set.contains("banana")); // false
