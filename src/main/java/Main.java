public class Main {
    public static void main(String[] args) {

//        // Потоки, наследующие от Thread
//        Thread thread1 = new MyThreadsTwo("1");
//        Thread thread2 = new MyThreadsTwo("2");
//
//        thread1.start();
//        thread2.start();

        // Потоки, наследующие от Runnable
        Thread t1 = new Thread(new WithRunnable("1"));
        Thread t2 = new Thread(new WithRunnable("2"));

        t1.start();
        t2.start();


    }
}
