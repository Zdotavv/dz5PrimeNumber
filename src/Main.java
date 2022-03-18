public class Main {
    public static void main(String[] args) {
        System.out.print("Простые числа: ");
        for (int i = 2; i <= 200; i++) {
            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                System.out.print(i+" ");
            }
        }
    }
}
