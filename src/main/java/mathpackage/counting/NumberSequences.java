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

public class NumberSequences extends WorksheetTemplate {

    public NumberSequences(
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

        List<NumberSequences> numberSequences = new ArrayList<NumberSequences>();

        General.emptyAllFolders();

        //All topics for primary school.
        numberSequences.add(new NumberSequences(
                "&thinsp;", "&nbsp;",
                "Числа и счет. Последовательность чисел, прямой и обратный счет через 1, 2, 3, 5, 10. Числа до 100.",
                "Counting and numbers. Sequences - count up and down by 1, 2, 3, 5, 10. Numbers up to 100.",
                "Задачи по математике на тему:<br />Последовательность чисел, прямой и обратный счет через 1, 2, 3, 5, 10. " +
                        "Числа до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Counting and numbers. Sequences - count up and down by 1, 2, 3, 5, 10. " +
                        "Numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Последовательность чисел, прямой и обратный счет через 1, 2, 3, 5, 10. Числа до 100.",
                "Counting and numbers. Sequences - count up and down by 1, 2, 3, 5, 10. Numbers up to 100.",
                "Заполни пропущенные числа.",
                "Type the missing number in this sequence.",
                0, 100, 6));

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        numberSequencesWorksheetA4(General.workingFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus,
                numberSequences.get(0).numbersRangeStart, numberSequences.get(0).numbersRangeEnd,8, 10);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeRus, numberSequences.get(0).totalPageOfWorksheets, numberSequences.get(0).topicRus,
                numberSequences.get(0).h2Rus, numberSequences.get(0).shortProblemDescriptionRus, numberSequences.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        numberSequencesWorksheetA4(General.workingFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng,
                numberSequences.get(0).numbersRangeStart, numberSequences.get(0).numbersRangeEnd, 8, 10);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets,
                numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(0).gradeEng, numberSequences.get(0).totalPageOfWorksheets, numberSequences.get(0).topicEng,
                numberSequences.get(0).h2Eng, numberSequences.get(0).shortProblemDescriptionEng, numberSequences.get(0).longProblemDescriptionEng);

/*
        numberSequences.add(new NumberSequences(
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

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        digitsToWordsWorksheetA4(General.workingFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus,
                numberSequences.get(1).numbersRangeStart, numberSequences.get(1).numbersRangeEnd,8, 5);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeRus, numberSequences.get(1).totalPageOfWorksheets, numberSequences.get(1).topicRus,
                numberSequences.get(1).h2Rus, numberSequences.get(1).shortProblemDescriptionRus, numberSequences.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        digitsToWordsWorksheetA4(General.workingFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng,
                numberSequences.get(1).numbersRangeStart, numberSequences.get(1).numbersRangeEnd, 8, 5);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets,
                numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(1).gradeEng, numberSequences.get(1).totalPageOfWorksheets, numberSequences.get(1).topicEng,
                numberSequences.get(1).h2Eng, numberSequences.get(1).shortProblemDescriptionEng, numberSequences.get(1).longProblemDescriptionEng);

        numberSequences.add(new NumberSequences(
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

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        digitsToWordsWorksheetA4(General.workingFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus,
                numberSequences.get(2).numbersRangeStart, numberSequences.get(2).numbersRangeEnd,7, 5);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeRus, numberSequences.get(2).totalPageOfWorksheets, numberSequences.get(2).topicRus,
                numberSequences.get(2).h2Rus, numberSequences.get(2).shortProblemDescriptionRus, numberSequences.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        digitsToWordsWorksheetA4(General.workingFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng,
                numberSequences.get(2).numbersRangeStart, numberSequences.get(2).numbersRangeEnd, 7, 5);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets,
                numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(2).gradeEng, numberSequences.get(2).totalPageOfWorksheets, numberSequences.get(2).topicEng,
                numberSequences.get(2).h2Eng, numberSequences.get(2).shortProblemDescriptionEng, numberSequences.get(2).longProblemDescriptionEng);

        numberSequences.add(new NumberSequences(
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

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        digitsToWordsWorksheetA4(General.workingFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus,
                numberSequences.get(3).numbersRangeStart, numberSequences.get(3).numbersRangeEnd,6, 5);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeRus, numberSequences.get(3).totalPageOfWorksheets, numberSequences.get(3).topicRus,
                numberSequences.get(3).h2Rus, numberSequences.get(3).shortProblemDescriptionRus, numberSequences.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        digitsToWordsWorksheetA4(General.workingFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng,
                numberSequences.get(3).numbersRangeStart, numberSequences.get(3).numbersRangeEnd, 6, 5);
        Matrix.bottomWorksheet(General.workingFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets,
                numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, numberSequences.get(3).gradeEng, numberSequences.get(3).totalPageOfWorksheets, numberSequences.get(3).topicEng,
                numberSequences.get(3).h2Eng, numberSequences.get(3).shortProblemDescriptionEng, numberSequences.get(3).longProblemDescriptionEng);
*/

        General.finalRenameFiles(General.readyFilesFolderPdf);
        General.finalRenameFiles(General.readyFilesFolderHtml);

    }

    public static void numberSequencesWorksheetA4(String workingFolder, String grade, int totalPageNumbers,
                                                String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                int numbersRangeStart, int numbersRangeEnd, int problemsLines,
                                                int problemsCols) throws IOException {

        int[] missingNumber = new int[problemsLines + 1];
        int[][] numberSequences = new int[problemsLines + 1][problemsCols + 1];
//        HashSet<Integer> tempRandomNumbers;

        int pageNumber;
        for (int k = 1; k < totalPageNumbers; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i = i + 2) {
                numberSequences[i][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                missingNumber[i] = (int) (Math.random() * problemsCols);
                for (int j = 1; j <= problemsCols; j++) {
                    numberSequences[i][j] = numberSequences[i][0] + j;
                }
                numberSequences[i + 1][0] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                for (int j = 1; j <= problemsCols; j++) {
                    numberSequences[i + 1][j] = numberSequences[i][0] + j * 2;
                }
            }

            //Writing generated arrays to files
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
            FileWriter fileAnswerWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");

            for (int i = 0; i < problemsLines; i++) {
                fileWriter.write("<table style=\"border-collapse: collapse;\" border=\"0\">\n" +
                        "<tbody><tr>\n");
                for (int j = 0; j <= problemsCols; j++) {
//                    fileWriter.write("<td style=\"width: 10%;\">" + numberSequences[i][j] + "</td>\n");
                    if (missingNumber[problemsLines] == j) {
                        fileWriter.write("<td> ___ , &nbsp; </td>\n");
                    } else {
                        fileWriter.write("<td>" + numberSequences[i][j] + ", &nbsp; </td>\n");
                    }
                }
//                fileWriter.write("</tr>\n");

/*
                fileAnswerWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\">\n" +
                        "<tbody><tr>\n" +
                        "<td style=\"width: 50%;\" colspan=\"6\"><strong>");
                if (grade.contains("&thinsp;") || grade.contains("класс")) {
                    fileAnswerWriter.write(numberSequences[i][digitNumber[i]] + " = " + converterRus.asWords(numberSequences[i][digitNumber[i]]));
                } else {
                    fileAnswerWriter.write(numberSequences[i][digitNumber[i]] + " = " + converterEng.asWords(numberSequences[i][digitNumber[i]]));
                }
                fileAnswerWriter.write("</strong></td>\n" +
                        "</tr>\n");
*/
/*
                fileWriter.write("<br />\n\n");
                fileAnswerWriter.write("<br />\n\n");
                if (grade.contains("&thinsp;") || grade.contains("класс")) {
                    fileWriter.write("<tr>");
                    for (int j = 0; j < problemsCols; j++) {
                        fileWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
//                                convertLessThanOneThousandRus(numberSequences[i][j]) + "</td>\n");
                                converterRus.asWords(numberSequences[i][j]) + "</td>\n");
                        fileAnswerWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
//                                convertLessThanOneThousandRus(numberSequences[i][j]) + "</td>\n");
                                converterRus.asWords(numberSequences[i][j]) + "</td>\n");
                        outputStream.write(valueOf(numberSequences[i][j]).getBytes());
                    }
                } else {

                    fileWriter.write("<tr>");
                    for (int j = 0; j < problemsCols; j++) {
                        fileWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
                                converterEng.asWords(numberSequences[i][j]) + "</td>\n");
                        fileAnswerWriter.write("<td style=\"width: 8%; padding-right:10px;\">" +
                                converterEng.asWords(numberSequences[i][j]) + "</td>\n");
                        outputStream.write(valueOf(numberSequences[i][j]).getBytes());
                    }
                }
*/
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
