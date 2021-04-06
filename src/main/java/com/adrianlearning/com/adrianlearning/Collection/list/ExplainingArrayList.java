package com.adrianlearning.com.adrianlearning.Collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ExplainingArrayList {

    public static void main(String[] args) {
        /**
         * Apply the same that we did with ArrayList but using LinkedList -> Please understand how it works LinkedList because you're going to create your own LinkedList.
         */
        //firstStepArrayList();
        //Linked();
        List<Integer> exampleList = new ArrayList<>();
        exampleList.add(8);
        exampleList.add(4);
        exampleList.add(5);
        exampleList.add(2);
        exampleList.add(9);
        exampleList.add(3);
        exampleList.add(2);
        exampleList.stream().sorted().forEach(x -> System.out.println(x));
        for (int i = 0; i < exampleList.size(); i++) {
            int minValueIndex = i;
            for (int j = i; j < exampleList.size(); j++) {
                if (exampleList.get(j) < exampleList.get(minValueIndex)) {
                    minValueIndex = j;
                }
            }
            int aux = exampleList.get(i);
            exampleList.set(i, exampleList.get(minValueIndex));
            exampleList.set(minValueIndex, aux);
        }
        System.out.println(exampleList);
    }



    private static void Linked() {
        List<Integer> arrayLinked = new LinkedList<>();
        int sumPosition = 0;

        int sumEvenPosition=0;
        for (int i=0; i < 6; i++){
            arrayLinked.add(i);
        }
        for (int i=0; i < 6; i++){
            sumPosition = sumPosition + arrayLinked.get(i);
            if (arrayLinked.get(i) % 2 == 0){
                sumEvenPosition = sumEvenPosition + arrayLinked.get(i);
            }
        }

        for (int i =0; i<5; i ++) {
            for (int j =0; j<5; j ++) {

            }
        }

        System.out.println(sumEvenPosition);
        System.out.println(sumPosition);
    }

    private static void firstStepArrayList() {
        removingElementArrayLit();

    }

    private static void removingElementArrayLit() {
        /**
         * Tasks
         * You're going to use ArrayList for the next tasks.
         * 1. Create a ArrayList and set 100 position from 1.. n
         * 2. Calculate the sum of each position
         * 3. Calculate the sum of the even position
         */
        List<Integer> arraylistNumnbers = new ArrayList<>();

        int sumPosition = 0;
        int sumEvenPosition=0;
        for (int i=0; i < 6; i++){
            arraylistNumnbers.add(i);

        }
        System.out.println(arraylistNumnbers);
//        for (int i=0; i < 100; i++){
//
//           sumPosition= sumPosition + arraylistNumnbers.get(i);
//           if (arraylistNumnbers.get(i)% 2  == 0){
//               sumEvenPosition = sumEvenPosition + arraylistNumnbers.get(i);
//           }
//        }
//        System.out.println(sumPosition);
//        System.out.println(sumEvenPosition);
    }

}
