package com.ubs.ms.java;

import java.util.*;

public class SnapCrowd {

    public static void main(String[] args) {

        //All Inputs will be saved into userInput List (Arraylist of child of List>
        ArrayList<String> userInput = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Data : ");

        //first line counter always contains how many lines are there.
        int count = scanner.nextInt();
        //this consumes the Enter key pressed after entering count
        scanner.nextLine();

        for (int i = 0 ; i < count ; i++ ) {
            String lines = scanner.nextLine();
            userInput.add(lines);
        }
        process(userInput);
    }

    public static void process(ArrayList<String> lists) {
        //This HashMap will save Key, Value -- I.e. each number and how many times it occured
        HashMap<Long, Long> occuranceOfInteger = new HashMap<>();

        //We are marking Captcha as true
        boolean captchaResult = true;

        //Iterate thru user Input line to determine which line is Numeric (Digit) Line
        for(int i= 0 ; i < lists.size() ; i++) {
            try {

                //This will check if the value is Numeric .. if Not Numeric then it will throw exception which we are catching in Catch
                //Statement below. Thats when we have try Catch block introduced as we expect exception that line may not be number and want
                //to handle it.
                if (Long.valueOf(lists.get(i)) > 0) {
                    String[] nubmers = lists.get(i).split("");

                    //if the Array is Odd Number size then its not equal and dont have to loop below
                    if (nubmers.length % 2 != 0) {
                        captchaResult = false;
                        break;
                    }

                    //Below for loop will run only when Array size is Sum
                    for (int j = 0; j < nubmers.length; j++) {
                        Long num = Long.valueOf(nubmers[j]);
                        if (occuranceOfInteger.containsKey(num)) {
                            long value = occuranceOfInteger.get(num);
                            value++;
                            occuranceOfInteger.put(num,value);
                        } else {
                            occuranceOfInteger.put(num,1l);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(" Ignoring as its not a number line  is " + i);
            }
        }

        //This is called as Enhanced ForLoop - when we dont need occurance position then we can use it.
        // This can be used above as well.
        for (Object value: occuranceOfInteger.values()) {
             if (Integer.valueOf(value.toString()) % 2 != 0) {
                 captchaResult = false;
                 break;
             }
        }

        System.out.println(" Captcha is " + captchaResult);
    }

}
