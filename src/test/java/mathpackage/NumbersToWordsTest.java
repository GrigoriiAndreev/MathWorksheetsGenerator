package mathpackage;

import org.junit.Before;
import org.junit.Test;
import mathpackage.usefullmethods.NumberToWordsEng;
import mathpackage.usefullmethods.NumberToWordsRus;
import pl.allegro.finance.tradukisto.ValueConverters;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersToWordsTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Test coverage for both language");
    }

    ValueConverters converterRus = ValueConverters.RUSSIAN_INTEGER;
    ValueConverters converterEng = ValueConverters.ENGLISH_INTEGER;

    @Test
    public void testConvertLessThanOneThousandEng() {
        assertThat(converterEng.asWords(1)).isEqualTo("one");
        assertThat(converterEng.asWords(111)).isEqualTo("one hundred eleven");
        assertThat(converterEng.asWords(530)).isEqualTo("five hundred thirty");
    }

    @Test
    public void testConvertLessThanOneThousandRus() {
        assertThat(converterRus.asWords(1)).isEqualTo("один");
        assertThat(converterRus.asWords(111)).isEqualTo("сто одиннадцать");
        assertThat(converterRus.asWords(530)).isEqualTo("пятьсот тридцать");
    }
}
