package BT10;

import java.util.Scanner;

public class SleepThread extends Thread {
    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        // Nhập số giây từ người dùng
        System.out.print("Nhập số giây để thread ngủ: ");
        int seconds = scanner.nextInt();

        System.out.println("Thread sẽ ngủ trong " + seconds + " giây...");
        try {
            Thread.sleep(seconds * 1000); // Chuyển đổi giây sang milliseconds và ngủ
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread đã ngủ xong sau " + seconds + " giây.");
        scanner.close();
    }

    public static void main(String[] args) {
        SleepThread sleepThread = new SleepThread();
        sleepThread.start();
    }
}
