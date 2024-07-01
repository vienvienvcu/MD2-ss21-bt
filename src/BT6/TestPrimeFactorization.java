package BT6;

public class TestPrimeFactorization {
    public static void main(String[] args) {
        // Tạo đối tượng LazyPrimeFactorization và OptimizedPrimeFactorization
        LazyPrimeFactorization lazyRunnable = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedRunnable = new OptimizedPrimeFactorization();

        // Tạo thread cho mỗi Runnable
        Thread lazyThread = new Thread(String.valueOf(lazyRunnable));
        Thread optimizedThread = new Thread(optimizedRunnable);

        // Bắt đầu các thread
        lazyThread.start();
        optimizedThread.start();
    }
}
