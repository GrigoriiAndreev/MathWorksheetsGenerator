package MathPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used to generate Numbers Rounding Worksheets
 * Author: Grigorii Andreev
 * Date: 10 January 2021
 */

public class NumbersRounding {

    String gradeRus;
    String gradeEng;
    String topicRus;
    String topicEng;
    String h2Rus;
    String h2Eng;
    String numberRus;
    String numberEng;
    String shortProblemDescriptionRus;
    String shortProblemDescriptionEng;
    String longProblemDescriptionRus;
    String longProblemDescriptionEng;
    int numbersRangeStart;
    int numbersRangeEnd;
    int totalPageOfWorksheets;

    public NumbersRounding(
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


        General.emptyFolder(General.workingFolder);
        General.emptyFolder(General.readyFilesFolder);
        General.emptyFolder(General.readyFilesFolderPdf);
        General.emptyFolder(General.readyFilesFolderHtml);

//        List<NumbersRounding> allTopicsEvenOdd = new ArrayList<>();
        List<NumbersRounding> allTopics = new ArrayList<>();

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 100.",
                "Round numbers to the nearest 10. Numbers up tо 100.",
                10, 100, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 1000.",
                "Round numbers to the nearest 10. Numbers up tо 1000.",
                10, 1000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 1000.",
                "Round numbers to the nearest hundred. Numbers up tо 1000.",
                100, 1000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 10000.",
                "Round numbers to the nearest 10. Numbers up tо 10000.",
                10, 10000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 10000.",
                "Round numbers to the nearest hundred. Numbers up tо 10000.",
                100, 10000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest thousand. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.",
                "Round numbers to the nearest thousand.",
                "Округли числа до тысяч. Числа до 10000.",
                "Round numbers to the nearest thousand. Numbers up tо 10000.",
                1000, 10000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до десятков. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest ten. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до десятков.",
                "Round numbers to the nearest ten.",
                "Округли числа до десятков. Числа до 100000.",
                "Round numbers to the nearest 10. Numbers up tо 100000.",
                10, 100000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до сотен. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest hundred. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до сотен.",
                "Round numbers to the nearest hundred.",
                "Округли числа до сотен. Числа до 100000.",
                "Round numbers to the nearest hundred. Numbers up tо 100000.",
                100, 100000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest thousand. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.",
                "Round numbers to the nearest thousand.",
                "Округли числа до тысяч. Числа до 100000.",
                "Round numbers to the nearest thousand. Numbers up tо 10000.",
                1000, 100000, 6));

        allTopics.add(new NumbersRounding(
                "", "&nbsp",
                "Числа. Округление чисел.", "Numbers. Rounding numbers.",
                "Задачи по математике на тему:<br />Округление чисел до тысяч. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Round the numbers to the nearest thousand. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Округление чисел до тысяч.",
                "Round numbers to the nearest thousand.",
                "Округли числа до тысяч. Числа до 1000000.",
                "Round numbers to the nearest thousand. Numbers up tо 1000000.",
                10_000, 1000000, 6));


        General.emptyFolder(General.workingFolder);
        General.emptyFolder(General.readyFilesFolder);
        General.emptyFolder(General.readyFilesFolderPdf);
        General.emptyFolder(General.readyFilesFolderHtml);
//        General.emptyAFolder(General.readyFilesFolderHtml);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus,
                allTopics.get(0).numbersRangeStart, allTopics.get(0).numbersRangeEnd, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeRus, allTopics.get(0).totalPageOfWorksheets, allTopics.get(0).topicRus,
                allTopics.get(0).h2Rus, allTopics.get(0).shortProblemDescriptionRus, allTopics.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus,
                allTopics.get(1).numbersRangeStart, allTopics.get(1).numbersRangeEnd, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeRus, allTopics.get(1).totalPageOfWorksheets, allTopics.get(1).topicRus,
                allTopics.get(1).h2Rus, allTopics.get(1).shortProblemDescriptionRus, allTopics.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus,
                allTopics.get(2).numbersRangeStart, allTopics.get(2).numbersRangeEnd, 100, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeRus, allTopics.get(2).totalPageOfWorksheets, allTopics.get(2).topicRus,
                allTopics.get(2).h2Rus, allTopics.get(2).shortProblemDescriptionRus, allTopics.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus,
                allTopics.get(3).numbersRangeStart, allTopics.get(3).numbersRangeEnd, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeRus, allTopics.get(3).totalPageOfWorksheets, allTopics.get(3).topicRus,
                allTopics.get(3).h2Rus, allTopics.get(3).shortProblemDescriptionRus, allTopics.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus,
                allTopics.get(4).numbersRangeStart, allTopics.get(4).numbersRangeEnd, 100, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeRus, allTopics.get(4).totalPageOfWorksheets, allTopics.get(4).topicRus,
                allTopics.get(4).h2Rus, allTopics.get(4).shortProblemDescriptionRus, allTopics.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus,
                allTopics.get(5).numbersRangeStart, allTopics.get(5).numbersRangeEnd, 1000, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeRus, allTopics.get(5).totalPageOfWorksheets, allTopics.get(5).topicRus,
                allTopics.get(5).h2Rus, allTopics.get(5).shortProblemDescriptionRus, allTopics.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus,
                allTopics.get(6).numbersRangeStart, allTopics.get(6).numbersRangeEnd, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeRus, allTopics.get(6).totalPageOfWorksheets, allTopics.get(6).topicRus,
                allTopics.get(6).h2Rus, allTopics.get(6).shortProblemDescriptionRus, allTopics.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus,
                allTopics.get(7).numbersRangeStart, allTopics.get(7).numbersRangeEnd, 100, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeRus, allTopics.get(7).totalPageOfWorksheets, allTopics.get(7).topicRus,
                allTopics.get(7).h2Rus, allTopics.get(7).shortProblemDescriptionRus, allTopics.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus,
                allTopics.get(8).numbersRangeStart, allTopics.get(8).numbersRangeEnd, 1000, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeRus, allTopics.get(8).totalPageOfWorksheets, allTopics.get(8).topicRus,
                allTopics.get(8).h2Rus, allTopics.get(8).shortProblemDescriptionRus, allTopics.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus,
                allTopics.get(9).numbersRangeStart, allTopics.get(9).numbersRangeEnd, 10000, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeRus, allTopics.get(9).totalPageOfWorksheets, allTopics.get(9).topicRus,
                allTopics.get(9).h2Rus, allTopics.get(9).shortProblemDescriptionRus, allTopics.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng,
                allTopics.get(0).numbersRangeStart, allTopics.get(0).numbersRangeEnd, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets,
                allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(0).gradeEng, allTopics.get(0).totalPageOfWorksheets, allTopics.get(0).topicEng,
                allTopics.get(0).h2Eng, allTopics.get(0).shortProblemDescriptionEng, allTopics.get(0).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng,
                allTopics.get(1).numbersRangeStart, allTopics.get(1).numbersRangeEnd, 100, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets,
                allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(1).gradeEng, allTopics.get(1).totalPageOfWorksheets, allTopics.get(1).topicEng,
                allTopics.get(1).h2Eng, allTopics.get(1).shortProblemDescriptionEng, allTopics.get(1).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng,
                allTopics.get(2).numbersRangeStart, allTopics.get(2).numbersRangeEnd, 1000, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets,
                allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(2).gradeEng, allTopics.get(2).totalPageOfWorksheets, allTopics.get(2).topicEng,
                allTopics.get(2).h2Eng, allTopics.get(2).shortProblemDescriptionEng, allTopics.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng,
                allTopics.get(3).numbersRangeStart, allTopics.get(3).numbersRangeEnd, 100, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets,
                allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(3).gradeEng, allTopics.get(3).totalPageOfWorksheets, allTopics.get(3).topicEng,
                allTopics.get(3).h2Eng, allTopics.get(3).shortProblemDescriptionEng, allTopics.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng,
                allTopics.get(4).numbersRangeStart, allTopics.get(4).numbersRangeEnd, 100, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets,
                allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(4).gradeEng, allTopics.get(4).totalPageOfWorksheets, allTopics.get(4).topicEng,
                allTopics.get(4).h2Eng, allTopics.get(4).shortProblemDescriptionEng, allTopics.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng,
                allTopics.get(5).numbersRangeStart, allTopics.get(5).numbersRangeEnd, 1000, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets,
                allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(5).gradeEng, allTopics.get(5).totalPageOfWorksheets, allTopics.get(5).topicEng,
                allTopics.get(5).h2Eng, allTopics.get(5).shortProblemDescriptionEng, allTopics.get(5).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng,
                allTopics.get(6).numbersRangeStart, allTopics.get(6).numbersRangeEnd, 10, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets,
                allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(6).gradeEng, allTopics.get(6).totalPageOfWorksheets, allTopics.get(6).topicEng,
                allTopics.get(6).h2Eng, allTopics.get(6).shortProblemDescriptionEng, allTopics.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng,
                allTopics.get(7).numbersRangeStart, allTopics.get(7).numbersRangeEnd, 100, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets,
                allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(7).gradeEng, allTopics.get(7).totalPageOfWorksheets, allTopics.get(7).topicEng,
                allTopics.get(7).h2Eng, allTopics.get(7).shortProblemDescriptionEng, allTopics.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng,
                allTopics.get(8).numbersRangeStart, allTopics.get(8).numbersRangeEnd, 1000, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets,
                allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(8).gradeEng, allTopics.get(8).totalPageOfWorksheets, allTopics.get(8).topicEng,
                allTopics.get(8).h2Eng, allTopics.get(8).shortProblemDescriptionEng, allTopics.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.numbersRoundingLineWorksheetA4(General.workingFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng,
                allTopics.get(9).numbersRangeStart, allTopics.get(9).numbersRangeEnd, 10000, 13, 4);
        Matrix.bottomWorksheet(General.workingFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets,
                allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopics.get(9).gradeEng, allTopics.get(9).totalPageOfWorksheets, allTopics.get(9).topicEng,
                allTopics.get(9).h2Eng, allTopics.get(9).shortProblemDescriptionEng, allTopics.get(9).longProblemDescriptionEng);
    }
}
