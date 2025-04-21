public class WithRunnable implements Runnable {

    private static final Object lock = new Object();
    private static boolean printOne = true;
    private final String message;


    public WithRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if ((message.equals("1") && !printOne) || (message.equals("2") && printOne)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                System.out.print(message + " ");
                printOne = !printOne;

                lock.notify();
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
