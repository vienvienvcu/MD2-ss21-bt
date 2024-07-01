package BT8;

public class CounterManager {
    private int counter = 0; // Biến được chia sẻ

    public synchronized void increase() {
        counter++;
        System.out.println("Increased: " + counter);
    }

    public synchronized void decrease() {
        counter--;
        System.out.println("Decreased: " + counter);
    }
    public static void main(String[] args) {
        CounterManager counterManager = new CounterManager();

        // Tạo và khởi chạy các thread
        Thread increaseThread = new Thread(() -> {
            while (true) {
                counterManager.increase();
                try {
                    Thread.sleep(500); // Ngủ 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decreaseThread = new Thread(() -> {
            while (true) {
                counterManager.decrease();
                try {
                    Thread.sleep(500); // Ngủ 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Bắt đầu các thread
        increaseThread.start();
        decreaseThread.start();
    }
}
