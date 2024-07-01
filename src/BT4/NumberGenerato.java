package BT4;

public class NumberGenerato implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        // Tạo hai đối tượng NumberGenerator
        NumberGenerato generator1 = new NumberGenerato();
        NumberGenerato generator2 = new NumberGenerato();

        // Tạo hai đối tượng Thread với NumberGenerator
        Thread thread1 = new Thread(generator1, "Generator-1");
        Thread thread2 = new Thread(generator2, "Generator-2");

        // Thiết lập priority cho các thread
        thread1.setPriority(Thread.MAX_PRIORITY); // Ưu tiên cao nhất
        thread2.setPriority(Thread.MIN_PRIORITY); // Ưu tiên thấp nhất

        // Bắt đầu các thread
        thread1.start();
        thread2.start();

        try {
            // Đợi cho các thread kết thúc
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kết thúc chương trình");
    }
}
