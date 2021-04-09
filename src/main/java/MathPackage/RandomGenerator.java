package MathPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class generating random numbers (int, float), chars
 * Author: Grigorii Andreev
 * Data: 9 April 2021
 */
public class RandomGenerator{

    @Override
    public String toString() {
        return "RandomGenerator{}";
    }

    public static void main(String[] args) {

        List<Integer> numbers;
        numbers = intNumbersRandomRangeArray(20, 150, 300);
        System.out.println(numbers);

        List<Integer> numbers2;
        numbers2 = intNumbersRandomRangeArray2(20, 150, 300);
        System.out.println(numbers2);

    }

    // Random repeating integer numbers in given range. Based on ArrayList.
    public static List<Integer> intNumbersRandomRangeArray(int totalNumbers, int rangeStart, int rangeEnd) {
        List<Integer> intNumber = new ArrayList<>();

        for (int i = 0; i < totalNumbers; i++ ) {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

    // Random repeating integer numbers. Based on LinkedList.
    public static List<Integer> intNumbersRandomRangeArray2(int totalNumbers, int rangeStart, int rangeEnd) {
        List<Integer> intNumber = new LinkedList<>();

        for (int i = 0; i < totalNumbers; i++ ) {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

    //Random repeating ordered (ascending)

}
