package io.github.theacid.challenge200;//package io.github.theacid.challenge186;

import java.util.ArrayList;
import java.util.List;

class StringPermutations {
    private static List<String> generatePerm(String input) {
        List<String> stringsList = new ArrayList<>();
        StringPermutations.permutation("", input, stringsList);
        return stringsList;
    }

    private static void permutation(String chars, String input, List<String> container) {
        if(input.isEmpty()) {
            container.add(chars + input);
            return;
        }

        for(int i = 0; i < input.length(); i++) {
            permutation(chars + input.charAt(i), input.substring(0, i) + input.substring(i + 1), container);
        }
    }

    public static void main(String[] args) {
        List<String> output = StringPermutations.generatePerm("1a2b3c");
        System.out.println("Permutations to perform: " + output.size());
        //output.stream().forEach(System.out::println);
        output.stream().forEach(a -> System.out.println(a));
        System.out.println("");
    }
}
