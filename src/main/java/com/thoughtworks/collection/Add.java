package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
//        if (leftBorder < rightBorder) {
//            return IntStream.rangeClosed(leftBorder, rightBorder).boxed().filter(item -> item % 2 == 0).mapToInt(i -> i).sum();
//        } else {
//            return IntStream.rangeClosed(rightBorder, leftBorder).boxed().filter(item -> item % 2 == 0).mapToInt(i -> i).sum();
//        }
        int left = Integer.min(leftBorder, rightBorder);
        int right = Integer.max(leftBorder, rightBorder);
        return IntStream.range(left, right + 1).filter(x -> x % 2 == 0).sum();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        int left = Integer.min(leftBorder, rightBorder);
        int right = Integer.max(leftBorder, rightBorder);
        return IntStream.range(left, right + 1).filter(x -> x % 2 != 0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
