package challenge035;

class CompareArrays {
    public static void main(String[] args) {
        int someNumbers[] = { -5, 3, 8, 10, 15, 18, 19 };
        // int someNumbers[] = { -5, 3, 8, 10, 15, 18, 19 };
        int someNumbers2[] = { 22, 25, 27, 31, 35, 38, 40 };
        boolean state = false;

        if(someNumbers.length == someNumbers2.length) {
            if (someNumbers.length == someNumbers2.length) {
                for (int i = 0; i < someNumbers.length; i++) {
                    if (someNumbers[i] == someNumbers2[i]) {
                        state = true;
                    }
                }
            }
        }
        else {
            state = false;
        }

        System.out.println(state);
    }
}
