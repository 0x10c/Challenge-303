package io.github.theacid.challenge163;

public class Main2 {
    private static int findMissing(int...array) {
        int missing = 0;
        boolean founded;

        for (int elementToFind = 0; elementToFind <= array.length; elementToFind++) {
            founded = false;
            for (int elementInArray : array) {
                if(elementToFind == elementInArray) {
                    founded = true;
                    break;
                }
            }
            if(!founded) {
                missing = elementToFind;
                break;
            }
        }
        return missing;
    }
        public static void main(String[] args) {

        }
}
