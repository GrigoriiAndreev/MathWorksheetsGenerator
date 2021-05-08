package mathpackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used to test the separate methods
 */

public class Solution {

    public static void main(String[] args) {

        List<Integer> generics = new ArrayList<>();

        generics.add(12);
        generics.add(22);
        generics.add(32);

        System.out.println(oddNumbersCounting(generics));
    }

    public static int oddNumbersCounting(List<Integer> generics) {

        int oddNumbersCounter = 0;

        for(Integer number : generics) {
            if(number % 2 == 1) {
                oddNumbersCounter++;
            }
        }
        return oddNumbersCounter;
    }
}

