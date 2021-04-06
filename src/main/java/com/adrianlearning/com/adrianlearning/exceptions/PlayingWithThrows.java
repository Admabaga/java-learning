package com.adrianlearning.com.adrianlearning.exceptions;

import java.util.Arrays;
import java.util.List;

public class PlayingWithThrows {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,0,6,5,4,32,2);
        divideChecking(numbers);
    }

    private static void divideChecking(List<Integer> numbers) {
        int staticNumber = 100;
        numbers.forEach(caca -> divide(staticNumber, caca));
    }

    private static void divide(Integer num, Integer divisor) {
        if (divisor == 0 ) {
            throw new AdrianFirstException("You can not divide by zero");
        }
        System.out.println(num/divisor);
    }

}

class AdrianFirstException extends RuntimeException {
    public AdrianFirstException() {
        super();
    }

    public AdrianFirstException(String message) {
        super(message);
    }

    public AdrianFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}
