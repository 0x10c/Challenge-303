package io.github.theacid.challenge182;

class Main {
    private static boolean isPrime(int starting) {
        for(int i = 2; i <= starting/2; i++) {
            if(starting % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int starting = 2;
        int count = 0;
        long allPrimes = 0;

        while(count < 10000) {
            if(isPrime(starting)) {
                allPrimes += starting;
                count++;
            }
            starting++;
        }
        System.out.println(allPrimes);
    }
}
