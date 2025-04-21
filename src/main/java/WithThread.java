public class WithThread extends Thread {

    private static final Object lock = new Object();
    private static boolean printOne = true;
    // также можно указать флаг для контроля остановки, если по какому-то событию надо преостановить поток


    private final String message;

    // принимаем сообщение для вывода
    public WithThread(String message) {
            this.message = message;
    }

    @Override
    public void run() {
        while (true) { // здесь можно изменить условие, использовав флаг
            synchronized (lock) { //потоки будут течь синхронно один за другим
                // если поток должен ждать своей очереди, мы вызываем wait()
                if ((message.equals("1") && !printOne) || (message.equals("2") && printOne)) {
                    try {
                        lock.wait(); // ждём своей очереди
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                System.out.print(message + " ");
                printOne = !printOne; // меняем флаг

                lock.notify(); // разблокируем другой поток
            }

            try {
                Thread.sleep(100); // немного ждём, чтобы вывод был виден
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
