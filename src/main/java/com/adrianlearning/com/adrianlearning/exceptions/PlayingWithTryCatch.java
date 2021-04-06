package com.adrianlearning.com.adrianlearning.exceptions;

import java.util.Arrays;
import java.util.List;

public class PlayingWithTryCatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,0,6,5,4,32,2);
        divide(numbers);
    }

    private static void divide(List<Integer> numbers) {
        Integer staticNumber = 100;
        Integer result;
        for (int i=0; i < numbers.size(); i++){
            try{
                result= staticNumber/numbers.get(i);
                System.out.println(result);
            }catch (Exception e){
                System.out.println("La division por 0 no es posible");
            }finally {
                System.out.println(" Im in the finally");
            }

        }

    }
}
