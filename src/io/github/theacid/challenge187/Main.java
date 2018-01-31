package io.github.theacid.challenge187;//package io.github.theacid.challenge186;

class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        int array[] = {1, 3, 5, 5, 6, 8, 14, 15, 15, 16, 21, 21, 21, 28, 64, 108, 108, 109, 110, 111};
        int output[] = removeDuplicates(array);

        for(int i : output) {
            System.out.println(" " + i);
        }
    }

    private static int[] removeDuplicates(int array[]) {
        int a = 0; int b = 0;

        if(array.length == 1) {
            return array;
        }
        while(a < array.length) {
            if(array[a] == array[b]) {
                a++;
            }
            else {
                array[++b] = array[a++];
            }
        }
        int output[] = new int[b + 1];
        for(int n = 0; n < output.length; n++) {
            output[n] = array[n];
        }

        return output;
    }
}
