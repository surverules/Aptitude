package com.ubs.ms.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DifficultPronounce {

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
        processor(userInput);
    }

    public static void processor(String userInput) {

        String[] array = userInput.split("");
        int countOfVowels = 0;
        int countOfConsonants = 0;
        int serialConsonants = 0;
        String first4ConsucutiveConsonent = "";

        for (int i = 0; i < array.length; i++) {
            if (vowels.contains(array[i])) {
                countOfVowels++;
                serialConsonants = 0;
            } else {
                countOfConsonants++;
                serialConsonants++;
                if (serialConsonants == 4) {
                    for (int j = i - 3; j <= i; j++) {
                        first4ConsucutiveConsonent += array[j];
                    }
                }
            }
        }

        String result = countOfVowels > countOfConsonants ? "V" : countOfVowels == countOfConsonants ? "E" : "V";
        String consecutive = !first4ConsucutiveConsonent.isBlank() ? first4ConsucutiveConsonent : "1";
        System.out.println(" Result :   " +  result + " consecutive : " + consecutive);

    }
}
