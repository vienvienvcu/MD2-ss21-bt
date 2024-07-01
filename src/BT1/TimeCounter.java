package BT1;

public class TimeCounter implements Runnable{

    public static void main(String[] args) {
//        tao mot doi
        Thread t = new Thread(new TimeCounter());
        t.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Time is " + i);
        }
        try {
//            TAM DUNG THREAD TRONG 1 GIAY
            Thread.sleep(1000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Time is end");
    }

}
