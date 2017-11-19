package challenge080;

import java.util.Scanner;

public class Main extends PasswordDependency {

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Input password: ");
        String typePassword = inputValue.nextLine();

        if(doPasswordIsCorrect(typePassword)) {
            System.out.println("Password is ok! " + inputValue);
        }
        else {
            System.out.println("Password is incorrect! " + inputValue);
        }
    }
}