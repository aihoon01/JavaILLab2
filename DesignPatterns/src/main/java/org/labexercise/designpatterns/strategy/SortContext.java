package org.labexercise.designpatterns.strategy;

import java.util.Arrays;
import java.util.List;

public class SortContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] numbers) {
        if (strategy != null) {
            strategy.sort(numbers);
            Arrays.stream(numbers).forEach(System.out::println);
        } else {
            System.out.println("Sorting strategy is null");
        }
    }
}
