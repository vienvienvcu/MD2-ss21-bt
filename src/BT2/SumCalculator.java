package BT2;

public class SumCalculator implements Runnable{
    private int sum;
    private int end;
    private int start;
    public SumCalculator( int end, int start) {
        this.end = end;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;

        }
        System.out.println("Tổng từ " + start + " đến " + end + " là: " + sum);
    }
    public int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator(1000,1 );
        Thread thread = new Thread(sumCalculator);
        thread.start();

    }

}
