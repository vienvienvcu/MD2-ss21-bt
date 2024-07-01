package BT3;

public class Main {
    public static void main(String[] args) {
//        tao cac doi tuong
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter();
        OddNumberPrinter oddNumberPrinter = new OddNumberPrinter();
//         // Tạo các đối tượng Thread với Runnable tương ứng
        Thread evenThread = new Thread(evenNumberPrinter);
        Thread oddThread = new Thread(oddNumberPrinter);
        evenThread.start();
        oddThread.start();
        try {
            // Đợi cho các thread kết thúc
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kết thúc chương trình");
    }
    
}
