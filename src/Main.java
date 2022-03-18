public class Main {
    public static void main(String[] args) {
        System.out.println("Простые числа в диапазоне от 2 до 100: ");
        for (int i = 2; i <= 200; i++) {
            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                System.out.println(i);
            }
        }
    }
}
