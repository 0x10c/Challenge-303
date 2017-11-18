package challenge080;

public class PasswordDependency {
    private static final int PASSWORD_LENGTH = 10;

    private static boolean ifPasswordHasLetters(char letterChar) {
        letterChar = Character.toLowerCase(letterChar);
        return (letterChar >= 'A' && letterChar <= 'Z');
    }

    private static boolean ifPasswordNumeric(char numericChar) {
        return (numericChar >= '0' && numericChar <= '9');
    }

    public static boolean isPasswordCorrect(String password) {
        int chars = 0;
        int nums = 0;

        for (int i = 0; i < password.length(); i++) {
            char chr = password.charAt(i);

            if (ifPasswordHasLetters(chr)) {
                chars++;
            } else if (ifPasswordNumeric(chr)) {
                nums++;
            }
            else {
                return false;
            }
        }

        if (password.length() < PASSWORD_LENGTH) {
            return false;
        }

        return (chars >= 3 && nums >= 3);
    }
}
