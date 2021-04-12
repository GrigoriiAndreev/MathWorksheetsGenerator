package MathPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is created to generate long division Worksheets (html and pdf format)
 * Author: Grigorii Andreev
 * Date: 9 April 2021
 */

public class DivisionTopic extends MainAbstractClass {

    public DivisionTopic(
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

        readyFilesFolder = "d:/Java_Math/ReadyWorksheets/Division";
        readyFilesFolderPdf = "d:/Java_Math/Pdf/Division";
        readyFilesFolderHtml = "d:/Java_Math/Html/Division";
    }

    public static void main(String[] args) throws Exception {

        General.emptyAllFolders();

        //Numbers division in columns
        List<AllTopics> allTopicsLongDivide = new ArrayList<>();

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 1 .","Dividing 2 digit numbers by 1.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 1. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел на 1.",
                "Division. Dividing 2 digit numbers by 1.",
                "Раздели число на 1.",
                "Divide number by 1.",
                11, 89, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus,
                allTopicsLongDivide.get(0).numbersRangeStart, allTopicsLongDivide.get(0).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets, allTopicsLongDivide.get(0).topicRus,
                allTopicsLongDivide.get(0).h2Rus, allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng,
                allTopicsLongDivide.get(0).numbersRangeStart, allTopicsLongDivide.get(0).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets, allTopicsLongDivide.get(0).topicEng,
                allTopicsLongDivide.get(0).h2Eng, allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 2.","Dividing 2 digit numbers by 2.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 2. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел на 2.",
                "Division. Dividing 2 digit numbers by 2.",
                "Раздели число на 2.",
                "Divide number by 2.",
                12, 88, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus,
                allTopicsLongDivide.get(1).numbersRangeStart, allTopicsLongDivide.get(1).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets, allTopicsLongDivide.get(1).topicRus,
                allTopicsLongDivide.get(1).h2Rus, allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng,
                allTopicsLongDivide.get(1).numbersRangeStart, allTopicsLongDivide.get(1).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets, allTopicsLongDivide.get(1).topicEng,
                allTopicsLongDivide.get(1).h2Eng, allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 3.","Dividing 2 digit numbers by 3.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 3. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел на 3.",
                "Division. Dividing 2 digit numbers by 3.",
                "Раздели число на 3.",
                "Divide number by 3.",
                13, 87, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus,
                allTopicsLongDivide.get(2).numbersRangeStart, allTopicsLongDivide.get(2).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets, allTopicsLongDivide.get(2).topicRus,
                allTopicsLongDivide.get(2).h2Rus, allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng,
                allTopicsLongDivide.get(2).numbersRangeStart, allTopicsLongDivide.get(2).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets, allTopicsLongDivide.get(2).topicEng,
                allTopicsLongDivide.get(2).h2Eng, allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 4.","Dividing 2 digit numbers by 4.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 4. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел на 4.",
                "Division. Dividing 2 digit numbers by 4.",
                "Раздели число на 4.",
                "Divide number by 4.",
                14, 86, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus,
                allTopicsLongDivide.get(3).numbersRangeStart, allTopicsLongDivide.get(3).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets, allTopicsLongDivide.get(3).topicRus,
                allTopicsLongDivide.get(3).h2Rus, allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng,
                allTopicsLongDivide.get(3).numbersRangeStart, allTopicsLongDivide.get(3).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets, allTopicsLongDivide.get(3).topicEng,
                allTopicsLongDivide.get(3).h2Eng, allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 5.","Dividing 2 digit numbers by 5.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 5. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел на 5.",
                "Division. Dividing 2 digit numbers by 5.",
                "Раздели число на 5.",
                "Divide number by 5.",
                15, 85, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus,
                allTopicsLongDivide.get(4).numbersRangeStart, allTopicsLongDivide.get(4).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets, allTopicsLongDivide.get(4).topicRus,
                allTopicsLongDivide.get(4).h2Rus, allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng,
                allTopicsLongDivide.get(4).numbersRangeStart, allTopicsLongDivide.get(4).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets, allTopicsLongDivide.get(4).topicEng,
                allTopicsLongDivide.get(4).h2Eng, allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 6.","Dividing 2 digit numbers by 6.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 6. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел на 6.",
                "Division. Dividing 2 digit numbers by 6.",
                "Раздели число на 6.",
                "Divide number by 6.",
                16, 84, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus,
                allTopicsLongDivide.get(5).numbersRangeStart, allTopicsLongDivide.get(5).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets, allTopicsLongDivide.get(5).topicRus,
                allTopicsLongDivide.get(5).h2Rus, allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng,
                allTopicsLongDivide.get(5).numbersRangeStart, allTopicsLongDivide.get(5).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets, allTopicsLongDivide.get(5).topicEng,
                allTopicsLongDivide.get(5).h2Eng, allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 7.","Dividing 2 digit numbers by 7.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 7. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел на 7.",
                "Division. Dividing 2 digit numbers by 7.",
                "Раздели число на 7.",
                "Divide number by 7.",
                17, 83, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus,
                allTopicsLongDivide.get(6).numbersRangeStart, allTopicsLongDivide.get(6).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets, allTopicsLongDivide.get(6).topicRus,
                allTopicsLongDivide.get(6).h2Rus, allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng,
                allTopicsLongDivide.get(6).numbersRangeStart, allTopicsLongDivide.get(6).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets, allTopicsLongDivide.get(6).topicEng,
                allTopicsLongDivide.get(6).h2Eng, allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 8.","Dividing 2 digit numbers by 8.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 8. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел 8.",
                "Division. Dividing 2 digit numbers by 8.",
                "Раздели число на 8.",
                "Divide number by 8.",
                18, 82, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus,
                allTopicsLongDivide.get(7).numbersRangeStart, allTopicsLongDivide.get(7).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets, allTopicsLongDivide.get(7).topicRus,
                allTopicsLongDivide.get(7).h2Rus, allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng,
                allTopicsLongDivide.get(7).numbersRangeStart, allTopicsLongDivide.get(7).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets, allTopicsLongDivide.get(7).topicEng,
                allTopicsLongDivide.get(7).h2Eng, allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 9.","Dividing 2 digit numbers by 9.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 9. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел 9.",
                "Division. Dividing 2 digit numbers by 9.",
                "Раздели число на 9.",
                "Divide number by 9.",
                19, 81, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus,
                allTopicsLongDivide.get(8).numbersRangeStart, allTopicsLongDivide.get(8).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets, allTopicsLongDivide.get(8).topicRus,
                allTopicsLongDivide.get(8).h2Rus, allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng,
                allTopicsLongDivide.get(8).numbersRangeStart, allTopicsLongDivide.get(8).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets, allTopicsLongDivide.get(8).topicEng,
                allTopicsLongDivide.get(8).h2Eng, allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление двузначных чисел на 10.","Dividing 2 digit numbers by 10.",
                "Задачи по математике на тему:<br />Деление двузначных чисел на 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 2 digit numbers by 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление двузначных чисел 10.",
                "Division. Dividing 2 digit numbers by 10.",
                "Раздели число на 10.",
                "Divide number by 10.",
                20, 80, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus,
                allTopicsLongDivide.get(9).numbersRangeStart, allTopicsLongDivide.get(9).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets, allTopicsLongDivide.get(9).topicRus,
                allTopicsLongDivide.get(9).h2Rus, allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng,
                allTopicsLongDivide.get(9).numbersRangeStart, allTopicsLongDivide.get(9).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets, allTopicsLongDivide.get(9).topicEng,
                allTopicsLongDivide.get(9).h2Eng, allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);


//Деление трехзначных чисел

        //List<AllTopics> allTopicsLongDivide = new ArrayList<>();

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 1 .","Dividing 3 digit numbers by 1.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 1. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел на 1.",
                "Division. Dividing 3 digit numbers by 1.",
                "Раздели число на 1.",
                "Divide number by 1.",
                101, 899, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus,
                allTopicsLongDivide.get(0).numbersRangeStart, allTopicsLongDivide.get(0).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeRus, allTopicsLongDivide.get(0).totalPageOfWorksheets, allTopicsLongDivide.get(0).topicRus,
                allTopicsLongDivide.get(0).h2Rus, allTopicsLongDivide.get(0).shortProblemDescriptionRus, allTopicsLongDivide.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng,
                allTopicsLongDivide.get(0).numbersRangeStart, allTopicsLongDivide.get(0).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets,
                allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(0).gradeEng, allTopicsLongDivide.get(0).totalPageOfWorksheets, allTopicsLongDivide.get(0).topicEng,
                allTopicsLongDivide.get(0).h2Eng, allTopicsLongDivide.get(0).shortProblemDescriptionEng, allTopicsLongDivide.get(0).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 2.","Dividing 3 digit numbers by 2.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 2. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел на 2.",
                "Division. Dividing 3 digit numbers by 2.",
                "Раздели число на 2.",
                "Divide number by 2.",
                102, 898, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus,
                allTopicsLongDivide.get(1).numbersRangeStart, allTopicsLongDivide.get(1).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeRus, allTopicsLongDivide.get(1).totalPageOfWorksheets, allTopicsLongDivide.get(1).topicRus,
                allTopicsLongDivide.get(1).h2Rus, allTopicsLongDivide.get(1).shortProblemDescriptionRus, allTopicsLongDivide.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng,
                allTopicsLongDivide.get(1).numbersRangeStart, allTopicsLongDivide.get(1).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets,
                allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(1).gradeEng, allTopicsLongDivide.get(1).totalPageOfWorksheets, allTopicsLongDivide.get(1).topicEng,
                allTopicsLongDivide.get(1).h2Eng, allTopicsLongDivide.get(1).shortProblemDescriptionEng, allTopicsLongDivide.get(1).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 3.","Dividing 3 digit numbers by 3.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 3. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел на 3.",
                "Division. Dividing 3 digit numbers by 3.",
                "Раздели число на 3.",
                "Divide number by 3.",
                103, 897, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus,
                allTopicsLongDivide.get(2).numbersRangeStart, allTopicsLongDivide.get(2).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeRus, allTopicsLongDivide.get(2).totalPageOfWorksheets, allTopicsLongDivide.get(2).topicRus,
                allTopicsLongDivide.get(2).h2Rus, allTopicsLongDivide.get(2).shortProblemDescriptionRus, allTopicsLongDivide.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng,
                allTopicsLongDivide.get(2).numbersRangeStart, allTopicsLongDivide.get(2).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets,
                allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(2).gradeEng, allTopicsLongDivide.get(2).totalPageOfWorksheets, allTopicsLongDivide.get(2).topicEng,
                allTopicsLongDivide.get(2).h2Eng, allTopicsLongDivide.get(2).shortProblemDescriptionEng, allTopicsLongDivide.get(2).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 4.","Dividing 3 digit numbers by 4.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 4. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел на 4.",
                "Division. Dividing 3 digit numbers by 4.",
                "Раздели число на 4.",
                "Divide number by 4.",
                104, 896, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus,
                allTopicsLongDivide.get(3).numbersRangeStart, allTopicsLongDivide.get(3).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeRus, allTopicsLongDivide.get(3).totalPageOfWorksheets, allTopicsLongDivide.get(3).topicRus,
                allTopicsLongDivide.get(3).h2Rus, allTopicsLongDivide.get(3).shortProblemDescriptionRus, allTopicsLongDivide.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng,
                allTopicsLongDivide.get(3).numbersRangeStart, allTopicsLongDivide.get(3).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets,
                allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(3).gradeEng, allTopicsLongDivide.get(3).totalPageOfWorksheets, allTopicsLongDivide.get(3).topicEng,
                allTopicsLongDivide.get(3).h2Eng, allTopicsLongDivide.get(3).shortProblemDescriptionEng, allTopicsLongDivide.get(3).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 5.","Dividing 3 digit numbers by 5.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 5. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел на 5.",
                "Division. Dividing 3 digit numbers by 5.",
                "Раздели число на 5.",
                "Divide number by 5.",
                105, 895, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus,
                allTopicsLongDivide.get(4).numbersRangeStart, allTopicsLongDivide.get(4).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeRus, allTopicsLongDivide.get(4).totalPageOfWorksheets, allTopicsLongDivide.get(4).topicRus,
                allTopicsLongDivide.get(4).h2Rus, allTopicsLongDivide.get(4).shortProblemDescriptionRus, allTopicsLongDivide.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng,
                allTopicsLongDivide.get(4).numbersRangeStart, allTopicsLongDivide.get(4).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets,
                allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(4).gradeEng, allTopicsLongDivide.get(4).totalPageOfWorksheets, allTopicsLongDivide.get(4).topicEng,
                allTopicsLongDivide.get(4).h2Eng, allTopicsLongDivide.get(4).shortProblemDescriptionEng, allTopicsLongDivide.get(4).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 6.","Dividing 3 digit numbers by 6.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 6. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел на 6.",
                "Division. Dividing 3 digit numbers by 6.",
                "Раздели число на 6.",
                "Divide number by 6.",
                106, 894, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus,
                allTopicsLongDivide.get(5).numbersRangeStart, allTopicsLongDivide.get(5).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeRus, allTopicsLongDivide.get(5).totalPageOfWorksheets, allTopicsLongDivide.get(5).topicRus,
                allTopicsLongDivide.get(5).h2Rus, allTopicsLongDivide.get(5).shortProblemDescriptionRus, allTopicsLongDivide.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng,
                allTopicsLongDivide.get(5).numbersRangeStart, allTopicsLongDivide.get(5).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets,
                allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(5).gradeEng, allTopicsLongDivide.get(5).totalPageOfWorksheets, allTopicsLongDivide.get(5).topicEng,
                allTopicsLongDivide.get(5).h2Eng, allTopicsLongDivide.get(5).shortProblemDescriptionEng, allTopicsLongDivide.get(5).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 7.","Dividing 3 digit numbers by 7.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 7. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел на 7.",
                "Division. Dividing 3 digit numbers by 7.",
                "Раздели число на 7.",
                "Divide number by 7.",
                107, 893, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus,
                allTopicsLongDivide.get(6).numbersRangeStart, allTopicsLongDivide.get(6).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeRus, allTopicsLongDivide.get(6).totalPageOfWorksheets, allTopicsLongDivide.get(6).topicRus,
                allTopicsLongDivide.get(6).h2Rus, allTopicsLongDivide.get(6).shortProblemDescriptionRus, allTopicsLongDivide.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng,
                allTopicsLongDivide.get(6).numbersRangeStart, allTopicsLongDivide.get(6).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets,
                allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(6).gradeEng, allTopicsLongDivide.get(6).totalPageOfWorksheets, allTopicsLongDivide.get(6).topicEng,
                allTopicsLongDivide.get(6).h2Eng, allTopicsLongDivide.get(6).shortProblemDescriptionEng, allTopicsLongDivide.get(6).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 8.","Dividing 3 digit numbers by 8.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 8. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел 8.",
                "Division. Dividing 3 digit numbers by 8.",
                "Раздели число на 8.",
                "Divide number by 8.",
                108, 892, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus,
                allTopicsLongDivide.get(7).numbersRangeStart, allTopicsLongDivide.get(7).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeRus, allTopicsLongDivide.get(7).totalPageOfWorksheets, allTopicsLongDivide.get(7).topicRus,
                allTopicsLongDivide.get(7).h2Rus, allTopicsLongDivide.get(7).shortProblemDescriptionRus, allTopicsLongDivide.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng,
                allTopicsLongDivide.get(7).numbersRangeStart, allTopicsLongDivide.get(7).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets,
                allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(7).gradeEng, allTopicsLongDivide.get(7).totalPageOfWorksheets, allTopicsLongDivide.get(7).topicEng,
                allTopicsLongDivide.get(7).h2Eng, allTopicsLongDivide.get(7).shortProblemDescriptionEng, allTopicsLongDivide.get(7).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 9.","Dividing 3 digit numbers by 9.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 9. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел 9.",
                "Division. Dividing 3 digit numbers by 9.",
                "Раздели число на 9.",
                "Divide number by 9.",
                109, 891, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus,
                allTopicsLongDivide.get(8).numbersRangeStart, allTopicsLongDivide.get(8).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeRus, allTopicsLongDivide.get(8).totalPageOfWorksheets, allTopicsLongDivide.get(8).topicRus,
                allTopicsLongDivide.get(8).h2Rus, allTopicsLongDivide.get(8).shortProblemDescriptionRus, allTopicsLongDivide.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng,
                allTopicsLongDivide.get(8).numbersRangeStart, allTopicsLongDivide.get(8).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets,
                allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(8).gradeEng, allTopicsLongDivide.get(8).totalPageOfWorksheets, allTopicsLongDivide.get(8).topicEng,
                allTopicsLongDivide.get(8).h2Eng, allTopicsLongDivide.get(8).shortProblemDescriptionEng, allTopicsLongDivide.get(8).longProblemDescriptionEng);

        allTopicsLongDivide.add( new AllTopics(
                "&ensp;", "&nbsp;",
                "Деление трехзначных чисел на 10.","Dividing 3 digit numbers by 10.",
                "Задачи по математике на тему:<br />Деление трехзначных чисел на 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing 3 digit numbers by 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление трехзначных чисел 10.",
                "Division. Dividing 3 digit numbers by 10.",
                "Раздели число на 10.",
                "Divide number by 10.",
                120, 890, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus,
                allTopicsLongDivide.get(9).numbersRangeStart, allTopicsLongDivide.get(9).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeRus, allTopicsLongDivide.get(9).totalPageOfWorksheets, allTopicsLongDivide.get(9).topicRus,
                allTopicsLongDivide.get(9).h2Rus, allTopicsLongDivide.get(9).shortProblemDescriptionRus, allTopicsLongDivide.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng );
        Matrix.longDivision2d_1d1WorksheetA4(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng,
                allTopicsLongDivide.get(9).numbersRangeStart, allTopicsLongDivide.get(9).numbersRangeEnd, 10, 8, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets,
                allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsLongDivide.get(9).gradeEng, allTopicsLongDivide.get(9).totalPageOfWorksheets, allTopicsLongDivide.get(9).topicEng,
                allTopicsLongDivide.get(9).h2Eng, allTopicsLongDivide.get(9).shortProblemDescriptionEng, allTopicsLongDivide.get(9).longProblemDescriptionEng);

//Деление в строчку - готово!
        List<AllTopics> allTopicsDivide = new ArrayList<>();

        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 1.","Dividing number by 1.",
                "Задачи по математике на тему:<br />Деление числа на 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 1. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 1.",
                "Division. Dividing number by 1.",
                "Раздели число на 1.",
                "Divide number by 1.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus,
                allTopicsDivide.get(0).numbersRangeStart, allTopicsDivide.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeRus, allTopicsDivide.get(0).totalPageOfWorksheets, allTopicsDivide.get(0).topicRus,
                allTopicsDivide.get(0).h2Rus, allTopicsDivide.get(0).shortProblemDescriptionRus, allTopicsDivide.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng,
                allTopicsDivide.get(0).numbersRangeStart, allTopicsDivide.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets,
                allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(0).gradeEng, allTopicsDivide.get(0).totalPageOfWorksheets, allTopicsDivide.get(0).topicEng,
                allTopicsDivide.get(0).h2Eng, allTopicsDivide.get(0).shortProblemDescriptionEng, allTopicsDivide.get(0).longProblemDescriptionEng);

        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 2.","Dividing number by 2.",
                "Задачи по математике на тему:<br />Деление числа на 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 2. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 2.",
                "Division. Dividing number by 2.",
                "Раздели число на 2.",
                "Divide number by 2.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus,
                allTopicsDivide.get(1).numbersRangeStart, allTopicsDivide.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeRus, allTopicsDivide.get(1).totalPageOfWorksheets, allTopicsDivide.get(1).topicRus,
                allTopicsDivide.get(1).h2Rus, allTopicsDivide.get(1).shortProblemDescriptionRus, allTopicsDivide.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng,
                allTopicsDivide.get(1).numbersRangeStart, allTopicsDivide.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets,
                allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(1).gradeEng, allTopicsDivide.get(1).totalPageOfWorksheets, allTopicsDivide.get(1).topicEng,
                allTopicsDivide.get(1).h2Eng, allTopicsDivide.get(1).shortProblemDescriptionEng, allTopicsDivide.get(1).longProblemDescriptionEng);

        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 3.","Dividing number by 3.",
                "Задачи по математике на тему:<br />Деление числа на 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 3. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 3.",
                "Division. Dividing number by 3.",
                "Раздели число на 3.",
                "Divide number by 3.",
                0, 99, 6));


        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus,
                allTopicsDivide.get(2).numbersRangeStart, allTopicsDivide.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeRus, allTopicsDivide.get(2).totalPageOfWorksheets, allTopicsDivide.get(2).topicRus,
                allTopicsDivide.get(2).h2Rus, allTopicsDivide.get(2).shortProblemDescriptionRus, allTopicsDivide.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng,
                allTopicsDivide.get(2).numbersRangeStart, allTopicsDivide.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets,
                allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(2).gradeEng, allTopicsDivide.get(2).totalPageOfWorksheets, allTopicsDivide.get(2).topicEng,
                allTopicsDivide.get(2).h2Eng, allTopicsDivide.get(2).shortProblemDescriptionEng, allTopicsDivide.get(2).longProblemDescriptionEng);


        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 4.","Dividing number by 4.",
                "Задачи по математике на тему:<br />Деление числа на 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 4. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 4.",
                "Division. Dividing number by 4.",
                "Раздели число на 4.",
                "Divide number by 4.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus,
                allTopicsDivide.get(3).numbersRangeStart, allTopicsDivide.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeRus, allTopicsDivide.get(3).totalPageOfWorksheets, allTopicsDivide.get(3).topicRus,
                allTopicsDivide.get(3).h2Rus, allTopicsDivide.get(3).shortProblemDescriptionRus, allTopicsDivide.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng,
                allTopicsDivide.get(3).numbersRangeStart, allTopicsDivide.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets,
                allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(3).gradeEng, allTopicsDivide.get(3).totalPageOfWorksheets, allTopicsDivide.get(3).topicEng,
                allTopicsDivide.get(3).h2Eng, allTopicsDivide.get(3).shortProblemDescriptionEng, allTopicsDivide.get(3).longProblemDescriptionEng);



        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 5.","Dividing number by 5.",
                "Задачи по математике на тему:<br />Деление числа на 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 5. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 5.",
                "Division. Dividing number by 5.",
                "Раздели число на 5.",
                "Divide number by 5.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus,
                allTopicsDivide.get(4).numbersRangeStart, allTopicsDivide.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeRus, allTopicsDivide.get(4).totalPageOfWorksheets, allTopicsDivide.get(4).topicRus,
                allTopicsDivide.get(4).h2Rus, allTopicsDivide.get(4).shortProblemDescriptionRus, allTopicsDivide.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng,
                allTopicsDivide.get(4).numbersRangeStart, allTopicsDivide.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets,
                allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(4).gradeEng, allTopicsDivide.get(4).totalPageOfWorksheets, allTopicsDivide.get(4).topicEng,
                allTopicsDivide.get(4).h2Eng, allTopicsDivide.get(4).shortProblemDescriptionEng, allTopicsDivide.get(4).longProblemDescriptionEng);


        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 6.","Dividing number by 6.",
                "Задачи по математике на тему:<br />Деление числа на 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 6. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 6.",
                "Division. Dividing number by 6.",
                "Раздели число на 6.",
                "Divide number by 6.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus,
                allTopicsDivide.get(5).numbersRangeStart, allTopicsDivide.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeRus, allTopicsDivide.get(5).totalPageOfWorksheets, allTopicsDivide.get(5).topicRus,
                allTopicsDivide.get(5).h2Rus, allTopicsDivide.get(5).shortProblemDescriptionRus, allTopicsDivide.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng,
                allTopicsDivide.get(5).numbersRangeStart, allTopicsDivide.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets,
                allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(5).gradeEng, allTopicsDivide.get(5).totalPageOfWorksheets, allTopicsDivide.get(5).topicEng,
                allTopicsDivide.get(5).h2Eng, allTopicsDivide.get(5).shortProblemDescriptionEng, allTopicsDivide.get(5).longProblemDescriptionEng);


        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 7.","Dividing number by 7.",
                "Задачи по математике на тему:<br />Деление числа на 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 7. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 7.",
                "Division. Dividing number by 7.",
                "Раздели число на 7.",
                "Divide number by 7.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus,
                allTopicsDivide.get(6).numbersRangeStart, allTopicsDivide.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeRus, allTopicsDivide.get(6).totalPageOfWorksheets, allTopicsDivide.get(6).topicRus,
                allTopicsDivide.get(6).h2Rus, allTopicsDivide.get(6).shortProblemDescriptionRus, allTopicsDivide.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng,
                allTopicsDivide.get(6).numbersRangeStart, allTopicsDivide.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets,
                allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(6).gradeEng, allTopicsDivide.get(6).totalPageOfWorksheets, allTopicsDivide.get(6).topicEng,
                allTopicsDivide.get(6).h2Eng, allTopicsDivide.get(6).shortProblemDescriptionEng, allTopicsDivide.get(6).longProblemDescriptionEng);

        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 8.","Dividing number by 8.",
                "Задачи по математике на тему:<br />Деление числа на 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 8. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 8.",
                "Division. Dividing number by 8.",
                "Раздели число на 8.",
                "Divide number by 8.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus,
                allTopicsDivide.get(7).numbersRangeStart, allTopicsDivide.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeRus, allTopicsDivide.get(7).totalPageOfWorksheets, allTopicsDivide.get(7).topicRus,
                allTopicsDivide.get(7).h2Rus, allTopicsDivide.get(7).shortProblemDescriptionRus, allTopicsDivide.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng,
                allTopicsDivide.get(7).numbersRangeStart, allTopicsDivide.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets,
                allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(7).gradeEng, allTopicsDivide.get(7).totalPageOfWorksheets, allTopicsDivide.get(7).topicEng,
                allTopicsDivide.get(7).h2Eng, allTopicsDivide.get(7).shortProblemDescriptionEng, allTopicsDivide.get(7).longProblemDescriptionEng);

        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 9.","Dividing number by 9.",
                "Задачи по математике на тему:<br />Деление числа на 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 9. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 9.",
                "Division. Dividing number by 9.",
                "Раздели число на 9.",
                "Divide number by 9.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus,
                allTopicsDivide.get(8).numbersRangeStart, allTopicsDivide.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeRus, allTopicsDivide.get(8).totalPageOfWorksheets, allTopicsDivide.get(8).topicRus,
                allTopicsDivide.get(8).h2Rus, allTopicsDivide.get(8).shortProblemDescriptionRus, allTopicsDivide.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng,
                allTopicsDivide.get(8).numbersRangeStart, allTopicsDivide.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets,
                allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(8).gradeEng, allTopicsDivide.get(8).totalPageOfWorksheets, allTopicsDivide.get(8).topicEng,
                allTopicsDivide.get(8).h2Eng, allTopicsDivide.get(8).shortProblemDescriptionEng, allTopicsDivide.get(8).longProblemDescriptionEng);

        allTopicsDivide.add( new AllTopics(
                "", "&nbsp",
                "Деление числа на 10.","Dividing number by 10.",
                "Задачи по математике на тему:<br />Деление числа на 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Dividing number by 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Деление. Деление числа на 10.",
                "Division. Dividing number by 10.",
                "Раздели число на 10.",
                "Divide number by 10.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus,
                allTopicsDivide.get(9).numbersRangeStart, allTopicsDivide.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeRus, allTopicsDivide.get(9).totalPageOfWorksheets, allTopicsDivide.get(9).topicRus,
                allTopicsDivide.get(9).h2Rus, allTopicsDivide.get(9).shortProblemDescriptionRus, allTopicsDivide.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng );
        Matrix.divideA1_B1LineWorksheetA4(General.workingFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng,
                allTopicsDivide.get(9).numbersRangeStart, allTopicsDivide.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets,
                allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsDivide.get(9).gradeEng, allTopicsDivide.get(9).totalPageOfWorksheets, allTopicsDivide.get(9).topicEng,
                allTopicsDivide.get(9).h2Eng, allTopicsDivide.get(9).shortProblemDescriptionEng, allTopicsDivide.get(9).longProblemDescriptionEng);

    }
}
