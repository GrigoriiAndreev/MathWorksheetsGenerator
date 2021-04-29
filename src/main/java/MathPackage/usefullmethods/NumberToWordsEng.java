package MathPackage.usefullmethods;

/**
 * Class converting number into words. For English.
 */

public class NumberToWordsEng {

    public static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen" };

    public static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
            "seventy", "eighty", "ninety" };

    public static String convertLessThanOneThousandEng(final int number) {
        if (number < 0) {
            return "Minus " + convertLessThanOneThousandEng(-number);
        }

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }

        if (number < 1000) {
            return units[number / 100] + " hundred" + ((number % 100 != 0) ? " " : "") +
                    convertLessThanOneThousandEng(number % 100);
        }

        if (number < 100000) {
            return convertLessThanOneThousandEng(number / 1000) + " Thousand" +
                    ((number % 10000 != 0) ? " " : "") + convertLessThanOneThousandEng(number % 1000);
        }

        if (number < 10000000) {
            return convertLessThanOneThousandEng(number / 100000) + " Lakh" +
                    ((number % 100000 != 0) ? " " : "") + convertLessThanOneThousandEng(number % 100000);
        }

        return convertLessThanOneThousandEng(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " :
                "") + convertLessThanOneThousandEng(number % 10000000);
    }
}
