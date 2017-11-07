package challenge027;

public class Main {
    public static void main(String[] args) {
        long timeStart = System.nanoTime();

        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        long estimatedTime = System.nanoTime() - timeStart;
        System.out.println("It took " + estimatedTime + " nanoseconds to generate 10 numbers");
    }
}
