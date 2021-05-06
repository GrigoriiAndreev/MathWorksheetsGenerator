package mathpackage.usefullmethods;

//import com.google.common.base.Joiner;
//import pl.allegro.finance.tradukisto.internal.GenderAwareIntegerToStringConverter;
//import pl.allegro.finance.tradukisto.internal.IntegerToStringConverter;
//import pl.allegro.finance.tradukisto.internal.ToStringConverter;
//import pl.allegro.finance.tradukisto.internal.languages.PluralForms;
//import pl.allegro.finance.tradukisto.internal.support.NumberChunking;

import pl.allegro.finance.tradukisto.ValueConverters;

/**
 * Class converting numbers into words. For Russian
 */

public class NumberToWordsRus {

    public static void main(String[] args) {
//        System.out.println(convertLessThanOneThousandRus(1));
//        System.out.println(convertLessThanOneThousandRus(23));
//        System.out.println(convertLessThanOneThousandRus(87));
//        System.out.println(convertLessThanOneThousandRus(100));
//        System.out.println(convertLessThanOneThousandRus(136));
//        System.out.println(convertLessThanOneThousandRus(874));
//        System.out.println(convertLessThanOneThousandRus(999));
        System.out.println(convertLessThanOneThousandRus(150));

//        System.out.println(Number.toString(123));
        ValueConverters converter = ValueConverters.RUSSIAN_INTEGER;
        System.out.println(converter.asWords(1_234));




    }

    public static String convertLessThanOneThousandRus(int number) {
        String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
                "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать"};
        String[] TENS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
                "семьдесят", "восемьдесят", "девяносто"};
        String[] HUNDREDS = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
                "семьсот", "восемьсот", "девятьсот"};
        String soFar;

        if (number % 100 < 20 && number != 100){
            soFar = BELOW_TWENTY[number % 100];
            number /= 100;
        }
        else {
            if (number == 100) {
                return (TENS[0]);
            }
            soFar = BELOW_TWENTY[number % 10];
            number /= 10;

            soFar = TENS[number % 10] + " " + soFar;
            number /= 10;
        }
        if (number == 0) return soFar;
        return HUNDREDS[number] + " " + soFar;
    }
}
