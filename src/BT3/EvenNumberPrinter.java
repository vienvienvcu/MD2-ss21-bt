package BT3;

public class EvenNumberPrinter implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); // Tạm dừng 100ms để dễ quan sát kết quả
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
