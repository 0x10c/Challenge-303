package challenge080;

public class PasswordDependency {
    private static final int PASSWORD_LENGTH = 10;

    private static boolean doPasswordHasLetters(char letterChar) {
        letterChar = Character.toLowerCase(letterChar);
        return (letterChar >= 'A' && letterChar <= 'Z');
    }

    private static boolean doPasswordHasNumerics(char numericChar) {
        return (numericChar >= '0' && numericChar <= '9');
    }

    protected static boolean doPasswordIsCorrect(String password) {
        int chars = 0;
        int nums = 0;

        for (int i = 0; i < password.length(); i++) {
            char chr = password.charAt(i);

            if (doPasswordHasLetters(chr)) {
                chars++;
            } else if (doPasswordHasNumerics(chr)) {
                nums++;
            }
            else {
                return false;
            }
        }

        //return password.length() >= PASSWORD_LENGTH && (chars >= 3 && nums >= 3);
        if (password.length() < PASSWORD_LENGTH) {
            return false;
        }

        return (chars >= 7 && nums >= 3);
    }
}
