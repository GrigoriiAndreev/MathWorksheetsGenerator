package mathpackage;

import java.util.*;

//import static jdk.vm.ci.code.CodeUtil.isEven;

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
        numbers = intNumbersRandomRangeArrayList(20, 150, 300);
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

        Set<Integer> numbers5;
        numbers5 = intNumbersRandomRangeSetSameNumbers(10, 0, 100);
        System.out.println(numbers5);

        Set<Integer> numbers6;
        numbers6 = intNumbersRandomRangeSetSameNumbers(5, 110, 1000);
        System.out.println(numbers6);

    }

    // Random repeating integer numbers in given range.
    public static List<Integer> intNumbersRandomRangeArrayList(int totalNumbers, int rangeStart, int rangeEnd) {
        List<Integer> intNumber = new ArrayList<>();

        for (int i = 0; i < totalNumbers; i++ ) {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

    // Random repeating not ordered integer numbers.
    public static List<Integer> intNumbersRandomRangeArray2(int totalNumbers, int rangeStart, int rangeEnd) {
        List<Integer> intNumber = new LinkedList<>();

        for (int i = 0; i < totalNumbers; i++ ) {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

    //Random not ordered not repeating int numbers set.
    public static HashSet intNumbersRandomRangeSet(int totalNumbers, int rangeStart, int rangeEnd) {
        Set<Integer> intNumber = new LinkedHashSet<>();

        while (!(intNumber.size() == totalNumbers))
         {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return (HashSet) intNumber;
    }

    //Random not ordered not repeating int numbers set. Same numbers
    public static HashSet intNumbersRandomRangeSetSameNumbers(int totalNumbers, int rangeStart, int rangeEnd) {
        Set<Integer> intNumber = new LinkedHashSet<>();
        Set<Integer> finalNumber = new LinkedHashSet<>();
        int temp;

        while (intNumber.size() <= totalNumbers)
         {
            temp = ((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
            intNumber.add(temp);
            if (temp % 2 == 0) {
                temp++;
                if (temp > rangeEnd) temp = temp - 10;
            } else {
                temp--;
                if (temp < rangeStart) temp = temp + 10;
            }
            intNumber.add(temp);
            if (rangeEnd > 10 && rangeEnd <= 100) {
                temp += 10;
                intNumber.add(temp);
                temp -= 20;
                intNumber.add(temp);
            }
            if (rangeEnd > 100 && rangeEnd <= 1000) {
                temp += 10;
                intNumber.add(temp);
                temp -= 20;
                intNumber.add(temp);
                temp += 100;
                intNumber.add(temp);
                temp -= 200;
                intNumber.add(temp);
            }
            if (rangeEnd > 1000 && rangeEnd <= 10000) {
                temp += 10;
                intNumber.add(temp);
                temp -= 20;
                intNumber.add(temp);
                temp += 100;
                intNumber.add(temp);
                temp -=200;
                intNumber.add(temp);
                temp += 1000;
                intNumber.add(temp);
                temp -= 2000;
                intNumber.add(temp);
            }

        }
        System.out.println(intNumber);
       while (intNumber.size() > totalNumbers) {
           intNumber.remove(intNumber.size());
       }
        return (HashSet) intNumber;
    }

    //Random ordered (ascending) not repeating int numbers.
    public static Set<Integer> intNumbersRandomRangeTreeSet(int totalNumbers, int rangeStart, int rangeEnd) {
        Set<Integer> intNumber = new TreeSet<>();

        while (!(intNumber.size() == totalNumbers))
         {
            intNumber.add((int) (Math.random() * (rangeEnd - rangeStart) + rangeStart));
        }
        return intNumber;
    }

}
