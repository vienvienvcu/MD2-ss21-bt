package BT9;

public class CountdownThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Ngủ 1 giây (1000ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Countdown complete!");
    }
    public static void main(String[] args) {
        CountdownThread countdownThread = new CountdownThread();
        countdownThread.start();
    }
}
