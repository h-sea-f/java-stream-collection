package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        if (number % 2 == 0) {
            return IntStream.rangeClosed(0, number - 2).boxed().sorted(Comparator.reverseOrder()).filter(item -> item % 2 == 0).collect(Collectors.toList());
        } else {
            return IntStream.rangeClosed(1, number - 2).boxed().sorted(Comparator.reverseOrder()).filter(item -> item % 2 != 0).collect(Collectors.toList());
        }

    }
}
