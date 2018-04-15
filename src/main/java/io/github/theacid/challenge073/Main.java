package io.github.theacid.challenge073;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File firstPath = new File("/home/theacid/dotnet/LICENSE.txt");
        File secondPath = new File("/home/theacid/dotnet/ThirdPartyNotices.txt");

        if(firstPath.compareTo(secondPath) == 0) {
            System.out.println("Both paths are the same");
        }
        else {
            System.out.println("Paths are not the same");
        }
    }
}
