package mathpackage.counting;

import mathpackage.General;
import mathpackage.Matrix;
import mathpackage.RandomGenerator;
import mathpackage.WorksheetTemplate;
import pl.allegro.finance.tradukisto.ValueConverters;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import static java.lang.String.valueOf;

/**
 * Class generating numbers in digits to numbers in words to worksheets
 * @GrigoriiAnreev
 */

public class DigitsToWordsWorksheets extends WorksheetTemplate {

    public DigitsToWordsWorksheets(
            String gradeRus,
            String gradeEng,
            String topicRus,
            String topicEng,
            String h2Rus,
            String h2Eng,
            String numberRus,
            String numberEng,
            String shortProblemDescriptionRus,
            String shortProblemDescriptionEng,
            String longProblemDescriptionRus,
            String longProblemDescriptionEng,
            int numbersRangeStart,
            int numbersRangeEnd,
            int totalPageOfWorksheets) {
        this.gradeRus = gradeRus;
        this.gradeEng = gradeEng;
        this.h2Rus = h2Rus;
        this.h2Eng = h2Eng;
        this.numberRus = numberRus;
        this.numberEng = numberEng;
        this.topicRus = topicRus;
        this.topicEng = topicEng;
        this.shortProblemDescriptionRus = shortProblemDescriptionRus;
        this.shortProblemDescriptionEng = shortProblemDescriptionEng;
        this.longProblemDescriptionRus = longProblemDescriptionRus;
        this.longProblemDescriptionEng = longProblemDescriptionEng;
        this.numbersRangeStart = numbersRangeStart;
        this.numbersRangeEnd = numbersRangeEnd;
        this.totalPageOfWorksheets = totalPageOfWorksheets;
    }

    public static void main(String[] args) throws Exception {

        List<DigitsToWordsWorksheets> wordsToDigitsWorksheets = new ArrayList<DigitsToWordsWorksheets>();

        General.emptyAllFolders();

        //All topics for primary school.
        wordsToDigitsWorksheets.add(new DigitsToWordsWorksheets(
                "&thinsp;", "&nbsp;",
                "Числа и счет. Запись чисел словами. Числа до 10.", "Counting. Writing numbers in words. Numbers up to 10.",
                "Задачи по математике на тему:<br />Запись чисел словами. Числа до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Counting. Writing numbers in words. Numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Запиши числа словами. Числа до 10.",
                "Writing numbers in words. Numbers up to 10.",
                "Какое число написано словами. Числа до 10.",
                "How do you write this number using words. Numbers up to 10.",
                0, 10, 6));

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus,
                wordsToDigitsWorksheets.get(0).numbersRangeStart, wordsToDigitsWorksheets.get(0).numbersRangeEnd,8, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets, wordsToDigitsWorksheets.get(0).topicRus,
                wordsToDigitsWorksheets.get(0).h2Rus, wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng,
                wordsToDigitsWorksheets.get(0).numbersRangeStart, wordsToDigitsWorksheets.get(0).numbersRangeEnd, 8, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets, wordsToDigitsWorksheets.get(0).topicEng,
                wordsToDigitsWorksheets.get(0).h2Eng, wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);

        wordsToDigitsWorksheets.add(new DigitsToWordsWorksheets(
                "&thinsp;", "&nbsp;",
                "Числа и счет. Запись чисел словами. Числа до 100.", "Counting. Writing numbers in words. Numbers up to 100.",
                "Задачи по математике на тему:<br />Запись чисел словами. Числа до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Counting. Writing numbers in words. Numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Запись чисел словами. Числа до 100.",
                "Writing numbers in words. Numbers up to 100.",
                "Какое число написано словами. Числа до 100.",
                "How do you write this number using words. Numbers up to 100.",
                0, 100, 6));

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus,
                wordsToDigitsWorksheets.get(1).numbersRangeStart, wordsToDigitsWorksheets.get(1).numbersRangeEnd,8, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets, wordsToDigitsWorksheets.get(1).topicRus,
                wordsToDigitsWorksheets.get(1).h2Rus, wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng,
                wordsToDigitsWorksheets.get(1).numbersRangeStart, wordsToDigitsWorksheets.get(1).numbersRangeEnd, 8, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets, wordsToDigitsWorksheets.get(1).topicEng,
                wordsToDigitsWorksheets.get(1).h2Eng, wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);

        wordsToDigitsWorksheets.add(new DigitsToWordsWorksheets(
                "&thinsp;", "&nbsp;",
                "Числа и счет. Запись чисел словами. Числа до 1000.", "Counting. Writing numbers in words. Numbers up to 1000.",
                "Задачи по математике на тему:<br />Запись чисел словами. Числа до 1000. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Counting. Writing numbers in words. Numbers up to 1000. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Запись чисел словами. Числа до 1000.",
                "Writing numbers in words. Numbers up to 1000.",
                "Какое число написано словами. Числа до 1000.",
                "How do you write this number using words. Numbers up to 1000.",
                0, 1000, 6));

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus,
                wordsToDigitsWorksheets.get(2).numbersRangeStart, wordsToDigitsWorksheets.get(2).numbersRangeEnd,7, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets, wordsToDigitsWorksheets.get(2).topicRus,
                wordsToDigitsWorksheets.get(2).h2Rus, wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng,
                wordsToDigitsWorksheets.get(2).numbersRangeStart, wordsToDigitsWorksheets.get(2).numbersRangeEnd, 7, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets, wordsToDigitsWorksheets.get(2).topicEng,
                wordsToDigitsWorksheets.get(2).h2Eng, wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);

        wordsToDigitsWorksheets.add(new DigitsToWordsWorksheets(
                "&thinsp;", "&nbsp;",
                "Числа и счет. Запись чисел словами. Числа до 10000.", "Counting. Writing numbers in words. Numbers up to 10000.",
                "Задачи по математике на тему:<br />Запись чисел словами. Числа до 10000. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Counting. Writing numbers in words. Numbers up to 10000. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Запись чисел словами. Числа до 10000.",
                "Writing numbers in words. Numbers up to 10000.",
                "Какое число написано словами. Числа до 10000.",
                "How do you write this number using words. Numbers up to 10000.",
                0, 10000, 6));

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus,
                wordsToDigitsWorksheets.get(3).numbersRangeStart, wordsToDigitsWorksheets.get(3).numbersRangeEnd,6, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeRus, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets, wordsToDigitsWorksheets.get(3).topicRus,
                wordsToDigitsWorksheets.get(3).h2Rus, wordsToDigitsWorksheets.get(3).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        digitsToWordsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng,
                wordsToDigitsWorksheets.get(3).numbersRangeStart, wordsToDigitsWorksheets.get(3).numbersRangeEnd, 6, 5);
        Matrix.bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(3).gradeEng, wordsToDigitsWorksheets.get(3).totalPageOfWorksheets, wordsToDigitsWorksheets.get(3).topicEng,
                wordsToDigitsWorksheets.get(3).h2Eng, wordsToDigitsWorksheets.get(3).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(3).longProblemDescriptionEng);

        General.finalRenameFiles(General.readyFilesFolderPdf);
        General.finalRenameFiles(General.readyFilesFolderHtml);

    }

    public static void digitsToWordsWorksheetA4(String workingFolder, String grade, int totalPageNumbers,
                                                String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                int numbersRangeStart, int numbersRangeEnd, int problemsLines,
                                                int problemsCols) throws IOException {

        int[] digitNumber = new int[problemsLines];
        int[][] wordNumbers = new int[problemsLines][problemsCols];
        HashSet<Integer> tempRandomNumbers;

        int pageNumber;
        for (int k = 1; k < totalPageNumbers; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
                digitNumber[i] = (int) (Math.random() * problemsCols);
                tempRandomNumbers = RandomGenerator.intNumbersRandomRangeSetSameNumbers(problemsCols, numbersRangeStart, numbersRangeEnd);
                Iterator<Integer> iterator = tempRandomNumbers.iterator();

                int j = 0;
                while (iterator.hasNext()) {
                    wordNumbers[i][j] = iterator.next();
                    j++;
                }
            }

            //Writing generated arrays to files
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
            FileWriter fileAnswerWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");

            //Connected the external class to convert numbers to words
            ValueConverters converterRus = ValueConverters.RUSSIAN_INTEGER;
            ValueConverters converterEng = ValueConverters.ENGLISH_INTEGER;

            for (int i = 0; i < problemsLines; i++) {
                fileWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\">\n" +
                        "<tbody><tr>\n" +
                        "<td style=\"width: 50%;\" colspan=\"6\"><strong>" +
                        wordNumbers[i][digitNumber[i]] +
                        "</strong></td>\n" +
                        "</tr>\n");
                fileAnswerWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\">\n" +
                        "<tbody><tr>\n" +
                        "<td style=\"width: 50%;\" colspan=\"6\"><strong>");
                if (grade.contains("&thinsp;") || grade.contains("класс")) {
                    fileAnswerWriter.write(wordNumbers[i][digitNumber[i]] + " = " + converterRus.asWords(wordNumbers[i][digitNumber[i]]));
                } else {
                    fileAnswerWriter.write(wordNumbers[i][digitNumber[i]] + " = " + converterEng.asWords(wordNumbers[i][digitNumber[i]]));
                }
                fileAnswerWriter.write("</strong></td>\n" +
                        "</tr>\n");
                fileWriter.write("<br />\n\n");
                fileAnswerWriter.write("<br />\n\n");
                if (grade.contains("&thinsp;") || grade.contains("класс")) {
                    fileWriter.write("<tr>");
                    for (int j = 0; j < problemsCols; j++) {
                        fileWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
//                                convertLessThanOneThousandRus(wordNumbers[i][j]) + "</td>\n");
                                converterRus.asWords(wordNumbers[i][j]) + "</td>\n");
                        fileAnswerWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
//                                convertLessThanOneThousandRus(wordNumbers[i][j]) + "</td>\n");
                                converterRus.asWords(wordNumbers[i][j]) + "</td>\n");
                        outputStream.write(valueOf(wordNumbers[i][j]).getBytes());
                    }
                } else {

                    fileWriter.write("<tr>");
                    for (int j = 0; j < problemsCols; j++) {
                        fileWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
                                converterEng.asWords(wordNumbers[i][j]) + "</td>\n");
                        fileAnswerWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
                                converterEng.asWords(wordNumbers[i][j]) + "</td>\n");
                        outputStream.write(valueOf(wordNumbers[i][j]).getBytes());
                    }
                }
                fileWriter.write(" </tr>\n" +
                        "</tbody>\n" +
                        "</table>\n");
                fileAnswerWriter.write(" </tr>\n" +
                        "</tbody>\n" +
                        "</table>\n");

                outputStream.write('\n');
                fileWriter.write("<br /><br />\n\n\n");
                fileAnswerWriter.write("<br /><br />\n\n\n");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }


}
