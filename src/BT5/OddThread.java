package BT5;

public class OddThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("OddThread: " + i);
            try {
                Thread.sleep(10); // Ngủ 10ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
