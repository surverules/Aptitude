package com.ubs.ms.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DifficultPronouce {

    public static Set<String> vowels = new HashSet<>();

    static {
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter String ");
        String userInput = scanner.nextLine();
    }

    public void processor(String userInput ) {

        String[] array = userInput.split("");
        int countOfVowels = 0;
        int countOfConsonent = 0;

        for(int i=0; i < array.length; i++) {
            if (vowels.contains(array[i])) {

            }
        }

    }

}
