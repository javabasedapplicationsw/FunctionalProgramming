package com.inminutes.functionalprogrammig;

import java.util.List;

public class FPNumberRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        numbers.stream().forEach(element-> System.out.println(element));

        int sum = normalSum(numbers);

        int sum2 = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);

        System.out.println();
        System.out.println(sum);
        System.out.println(sum2);
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers)
            sum += number;
        return sum;
    }

}
