package BT5;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng OddThread và EvenThread
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Bắt đầu thread OddThread
        oddThread.run();
        evenThread.run();
    }
}
