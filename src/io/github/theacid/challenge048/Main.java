package io.github.theacid.challenge048;

class TwinNumber {
    private static boolean isPrime(int n) {
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 2; i < 500; i++) {
            if(isPrime(i) && isPrime(i + 2)) {
                System.out.print(i + " " + (i + 2) + " ");
            }
        }
    }
}
