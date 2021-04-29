package MathPackage.usefullmethods;

import java.util.ArrayList;
import java.util.List;

/**
 * Class generating various type of number lines
 * @GrigoriiAnreev
 */
public class NumberLines {

    public static void main(String[] args) {
        System.out.println(numberLinesInt(10, 50, 3));
        System.out.println(numberLinesFloat(10, 50, 2));

    }

    //Generating float number lines (skip-counting by step)
    public static List<Float> numberLinesFloat(float startRange, float endRange, float step) {

        List<Float> numberLines = new ArrayList<>();
        float currentNumber = startRange;
        while (currentNumber <= endRange) {
            numberLines.add(currentNumber);
            currentNumber += step;
        }
        return numberLines;
    }

    //Generating int types number lines (skip-counting by step)
    public static List<Integer> numberLinesInt(int startRange, int endRange, int step) {

        List<Integer> numberLines = new ArrayList<>();
        int currentNumber = startRange;
        while (currentNumber <= endRange) {
            numberLines.add(currentNumber);
            currentNumber += step;
        }
        return numberLines;
    }
}
