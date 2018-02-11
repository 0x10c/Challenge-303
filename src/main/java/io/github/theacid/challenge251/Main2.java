package io.github.theacid.challenge251;

class BubbleSortWithFlag {
    public static void sort(int[] arraysToSort) {
        // pobieranie ilosci elementow tablicy
        int n = arraysToSort.length;

        // licznik iteracji po tablicy
        int iterator = 0;

        boolean swapped = true;

        while(iterator < n - 1 && swapped) {
            // przechodzimy po wszystkich elementach tablicy(porownujemyelementy parami)
            swapped = false;
            for(int i = 0; i < n - 1; i++) {
                // jesli pierwszy element jest wiekszy od nastepnego
                // musimy zamienic je miejscami
                if(arraysToSort[i] > arraysToSort[i+1]) {
                    swapElement(arraysToSort, i, i+1);
                    swapped = true;
                }
            }
            iterator++;
        }
    }

    private static void swapElement(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
