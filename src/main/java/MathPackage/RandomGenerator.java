package MathPackage;

import java.util.*;

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

        Set<Integer> numbers3;
        numbers3 = intNumbersRandomRangeSet(20, 150, 300);
        System.out.println(numbers3);

        Set<Integer> numbers4;
        numbers4 = intNumbersRandomRangeTreeSet(20, 150, 300);
        System.out.println(numbers4);

    }

    // Random repeating integer numbers in given range.
    public static List<Integer> intNumbersRandomRangeArray(int totalNumbers, int rangeStart, int rangeEnd) {
        List<Integer> intNumber = new ArrayList<>();

        for (int i = 0; i < totalNumbers; i++ ) {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

    // Random repeating integer numbers.
    public static List<Integer> intNumbersRandomRangeArray2(int totalNumbers, int rangeStart, int rangeEnd) {
        List<Integer> intNumber = new LinkedList<>();

        for (int i = 0; i < totalNumbers; i++ ) {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

    //Random not repeating int numbers set.
    public static Set<Integer> intNumbersRandomRangeSet(int totalNumbers, int rangeStart, int rangeEnd) {
        Set<Integer> intNumber = new HashSet<>();

        while (!(intNumber.size() == totalNumbers))
         {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

    //Random ordered (ascending) int not repeated numbers.
    public static Set<Integer> intNumbersRandomRangeTreeSet(int totalNumbers, int rangeStart, int rangeEnd) {
        Set<Integer> intNumber = new TreeSet<>();

        while (!(intNumber.size() == totalNumbers))
         {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

}
