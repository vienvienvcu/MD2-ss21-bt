package BT5;

public class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("EvenThread: " + i);
            try {
                Thread.sleep(15); // Ngủ 15ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
