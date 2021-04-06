package com.adrianlearning.com.adrianlearning.Functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstTryFunctional {
    public static void main(String[] args) {
        //firstProblem();
        /**
         * You have a List of String with names, you must rertieve just those name that the number of letter is even
         */
        List<String> names = Arrays.asList("Hi", "Sea", "Three", "Bed", "House", "Room", "Keyboard", "Board", "Bear");
        //methodImperative(names);
        methodDeclarative(names);

    }

    private static void methodDeclarative(List<String> names) {
        List<String> arrayPairs = names.stream()
                .filter(pairs -> pairs.length() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(arrayPairs);


    }

    private static  void methodImperative(List<String> names){
        List<String> arrayPairs = new ArrayList<>();
           for(int i=0; i < names.size();i++){
               if(names.get(i).length() % 2 == 0){
                   arrayPairs.add(names.get(i));
               }
           }
        System.out.println(arrayPairs);
    }

    private static void firstProblem() {
        /**
         * First problem
         * 1. I have a list of String, I need to have a list with the same string but all uppercase.
         */
        List<String> names = Arrays.asList("Adrian", "Felipe", "Mauricio", "Andréss");
        //imperativeStyle(names);
        //declarativeStyle(names);
    }

    private static void declarativeStyle(List<String> names) {
        List<String> strings = names.stream()
                .map(name -> name.toUpperCase())
                .filter(name -> name.startsWith("A"))
                .filter(xx -> xx.length()>6)
                .collect(Collectors.toList());

        printList(strings);
    }

    private static void imperativeStyle(List<String> names) {
        printList(names);
        List<String> returnSecondList = returnuppercase(names);
        printList(returnSecondList);
    }

    private static void printList(List<String> list) {
        System.out.println(list);
    }

    private static List<String> returnuppercase(List<String> names) {
        List<String> arrayUpper= new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String upperName = names.get(i).toUpperCase();
            arrayUpper.add(upperName);
        }
        return arrayUpper;
    }
}

