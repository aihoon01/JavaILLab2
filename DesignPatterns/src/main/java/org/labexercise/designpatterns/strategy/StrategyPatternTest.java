package org.labexercise.designpatterns.strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext();
        int[] numbers = {64, 44, 84, 94, 54, 24, 74, 34};

        sortContext.setStrategy(new SelectionSort());
        sortContext.sortArray(numbers);
    }
}
