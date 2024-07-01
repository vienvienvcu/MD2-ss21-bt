package BT7;

import java.util.Random;

public class RandomNumberThread extends Thread {

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100); // Tạo số ngẫu nhiên từ 0 đến 99
            System.out.println("Random number generated: " + randomNumber);
            try {
                Thread.sleep(1000); // Ngủ 1 giây (1000ms) sau mỗi lần tạo số ngẫu nhiên
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        // Tạo đối tượng của lớp RandomNumberThread
        RandomNumberThread randomNumberThread = new RandomNumberThread();

        // Gọi phương thức start() để bắt đầu thực thi thread
        randomNumberThread.start();
    }

}
