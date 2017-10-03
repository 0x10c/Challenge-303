package challenge020;

public class Main {
    public static void main(String[] args) {
        String words[] = {"Adrian", "John", "Michael", "Jonathan", "Ana", "monique"};
        int numbers[] = {0, 7, 3, 23, 6, 8, 10, 11, 34, 10, 5, 4};
        int a, b, e;
        int wordsToSort = 5;
        int numbersToSort = 12;

        System.out.println("Words before sorting ");
        for(int i = 0; i < wordsToSort; i++) {
            System.out.print(words[i] + ", ");
        }

        System.out.println("\nNumbers before sorting: ");
        for(int i = 0; i < numbersToSort; i++) {
            System.out.print(numbers[i] + ", ");
        }

        // Sortowanie
//        for(a = 1; a < wordsToSort; a++) {
//            for(b = wordsToSort - 1; b >= a; b--) {
//                if(words[b-1] > words[b]) {
//
//                }
//            }
//        }

        System.out.println("Words after sorting: ");
        for(int i = 0; i < wordsToSort; i++) {
            System.out.print(words[i] + ", ");
        }

        System.out.println("\nNumbers after sorting: ");
        for(int i = 0; i < numbersToSort; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
