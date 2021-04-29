package MathPackage.additionsubtraction;

import MathPackage.General;
import MathPackage.Matrix;
import MathPackage.WorksheetTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Class generating addition worksheets. Part 1
 * Author: Grigorii Andreev
 * Date: 05 January 2021
 */

public class AdditionWorksheets extends WorksheetTemplate {

    public AdditionWorksheets(
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

        List<AdditionWorksheets> additionWorksheets = new ArrayList<>();

        General.emptyAllFolders();

        //All topics for primary school. Addition in line
        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение чисел до 100.","Addition. Addition numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100.",
                "Addition of numbers up to 100.",
                "Сложи числа до 100.",
                "Add numbers up to 100.",
                0, 99, 6));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus,
                additionWorksheets.get(0).numbersRangeStart, additionWorksheets.get(0).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets, additionWorksheets.get(0).topicRus,
                additionWorksheets.get(0).h2Rus, additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng,
                additionWorksheets.get(0).numbersRangeStart, additionWorksheets.get(0).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets, additionWorksheets.get(0).topicEng,
                additionWorksheets.get(0).h2Eng, additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение однозначных чисел.","Addition. Addition 1 digit numbers in columns.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers in columns. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел.",
                "Addition 1 digit numbers in columns.",
                "Сложи однозначные числа.",
                "Add 1 digit numbers in columns.",
                0, 9, 6));


        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus,
                additionWorksheets.get(1).numbersRangeStart, additionWorksheets.get(1).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets, additionWorksheets.get(1).topicRus,
                additionWorksheets.get(1).h2Rus, additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng,
                additionWorksheets.get(1).numbersRangeStart, additionWorksheets.get(1).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets, additionWorksheets.get(1).topicEng,
                additionWorksheets.get(1).h2Eng, additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);



        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение двузначных чисел.","Addition. Two digit numbers addition.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Two-digit numbers addition. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел.",
                "Two-digit numbers addition.",
                "Сложи двузначные числа.",
                "Add two-digit numbers.",
                10, 99, 6));


        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus,
                additionWorksheets.get(2).numbersRangeStart, additionWorksheets.get(2).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets, additionWorksheets.get(2).topicRus,
                additionWorksheets.get(2).h2Rus, additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng,
                additionWorksheets.get(2).numbersRangeStart, additionWorksheets.get(2).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets, additionWorksheets.get(2).topicEng,
                additionWorksheets.get(2).h2Eng, additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);

        //Addition in columns
        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение однозначных чисел в стролбик.","Addition. Addition 1 digit numbers in columns in column.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers in columns in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел в столбик.",
                "Addition 1 digit numbers in columns in column.",
                "Сложи однозначные числа в столбик.",
                "Add 1 digit numbers in columns in column.",
                0, 9, 6));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus,
                additionWorksheets.get(3).numbersRangeStart, additionWorksheets.get(3).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets, additionWorksheets.get(3).topicRus,
                additionWorksheets.get(3).h2Rus, additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng,
                additionWorksheets.get(3).numbersRangeStart, additionWorksheets.get(3).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets, additionWorksheets.get(3).topicEng,
                additionWorksheets.get(3).h2Eng, additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);



        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение двузначных чисел в стролбик.","Addition. Addition 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел в столбик.",
                "Addition two digit numbers in column.",
                "Сложи двузначные числа в столбик.",
                "Add two digit numbers in column.",
                10, 99, 6));

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение трехзначных чисел в стролбик.","Addition. Addition 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение трехначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 3 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение трехзначных чисел в столбик.",
                "Addition three digit numbers in column.",
                "Сложи трехзначные числа в столбик.",
                "Add three digit numbers in column.",
                100, 999, 6));

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение четырехзначных чисел в стролбик.","Addition. Addition 4 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение четырехзначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 4 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четырехзначных чисел в столбик.",
                "Addition four digit numbers in column.",
                "Сложи четырехзначные числа в столбик.",
                "Add four digit numbers in column.",
                1000, 9999, 6));

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение многозначных чисел в стролбик.","Addition. Addition multi digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение многозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition multi digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение многозначных чисел в столбик.",
                "Addition multi digit numbers in column.",
                "Сложи многозначные числа в столбик.",
                "Add multi digit numbers in column.",
                100000, 9999999, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение четных чисел в стролбик.","Addition. Addition even numbers in column.",
                "Задачи по математике на тему:<br />Сложение четных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition even numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четных чисел в столбик.",
                "Addition even numbers in column.",
                "Сложи четные числа в столбик.",
                "Add even numbers in column.",
                100, 9999, 6));

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение нечетных чисел в стролбик.","Addition. Addition odd numbers in column.",
                "Задачи по математике на тему:<br />Сложение нечетных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition odd numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение нечетных чисел в столбик.",
                "Addition odd numbers in column.",
                "Сложи нечетные числа в столбик.",
                "Add odd numbers in column.",
                100, 9999, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 10.","Addition. Addition numbers up to 10 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 10 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10 в столбик.",
                "Addition numbers up to 10 in column.",
                "Сложи числа до 10.",
                "Add numbers up to 10 in column.",
                0, 10, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 20.","Addition. Addition numbers up to 20 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 20 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 20 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 20 в столбик.",
                "Addition numbers up to 20 in column.",
                "Сложи числа до 20.",
                "Add numbers up to 20 in column.",
                0, 20, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 50.","Addition. Addition numbers up to 50 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 50 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 50 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 50 в столбик.",
                "Addition numbers up to 50 in column.",
                "Сложи числа до 50.",
                "Add numbers up to 50 in column.",
                0, 50, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 100.","Addition. Addition numbers up to 100 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 100 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100 в столбик.",
                "Addition numbers up to 100 in column.",
                "Сложи числа до 100 в столбик.",
                "Add numbers up to 100 in column.",
                0, 100, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 1000.","Addition. Addition numbers up to 1000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 1000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 1000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 1000 в столбик.",
                "Addition numbers up to 1000 in column.",
                "Сложи числа до 1000.",
                "Add numbers up to 1000 in column.",
                0, 1000, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 10000.","Addition. Addition numbers up to 1000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 10000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10000 в столбик.",
                "Addition numbers up to 10000 in column.",
                "Сложи числа до 10000.",
                "Add numbers up to 10000 in column.",
                0, 10000, 6));


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 100000.","Addition. Addition numbers up to 10000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 100000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100000 в столбик.",
                "Addition numbers up to 100000 in column.",
                "Сложи числа до 100000.",
                "Add numbers up to 100000 in column.",
                0, 100000, 6));

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp",
                "Сложение. Сложение чисел до 1000000.","Addition. Addition numbers up to 100000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 1000000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 1000000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 1000000 в столбик.",
                "Addition numbers up to 1000000 in column.",
                "Сложи числа до 1000000.",
                "Add numbers up to 1000000 in column.",
                0, 1000000, 6));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus,
                additionWorksheets.get(4).numbersRangeStart, additionWorksheets.get(4).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets, additionWorksheets.get(4).topicRus,
                additionWorksheets.get(4).h2Rus, additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng,
                additionWorksheets.get(4).numbersRangeStart, additionWorksheets.get(4).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets, additionWorksheets.get(4).topicEng,
                additionWorksheets.get(4).h2Eng, additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus,
                additionWorksheets.get(5).numbersRangeStart, additionWorksheets.get(5).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets, additionWorksheets.get(5).topicRus,
                additionWorksheets.get(5).h2Rus, additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng,
                additionWorksheets.get(5).numbersRangeStart, additionWorksheets.get(5).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets, additionWorksheets.get(5).topicEng,
                additionWorksheets.get(5).h2Eng, additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus,
                additionWorksheets.get(6).numbersRangeStart, additionWorksheets.get(6).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets, additionWorksheets.get(6).topicRus,
                additionWorksheets.get(6).h2Rus, additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng,
                additionWorksheets.get(6).numbersRangeStart, additionWorksheets.get(6).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets, additionWorksheets.get(6).topicEng,
                additionWorksheets.get(6).h2Eng, additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets, additionWorksheets.get(7).topicRus,
                additionWorksheets.get(7).h2Rus, additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets, additionWorksheets.get(7).topicEng,
                additionWorksheets.get(7).h2Eng, additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus,
                additionWorksheets.get(8).numbersRangeStart, additionWorksheets.get(8).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets, additionWorksheets.get(8).topicRus,
                additionWorksheets.get(8).h2Rus, additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng,
                additionWorksheets.get(8).numbersRangeStart, additionWorksheets.get(8).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets, additionWorksheets.get(8).topicEng,
                additionWorksheets.get(8).h2Eng, additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus,
                additionWorksheets.get(9).numbersRangeStart, additionWorksheets.get(9).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets, additionWorksheets.get(9).topicRus,
                additionWorksheets.get(9).h2Rus, additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng,
                additionWorksheets.get(9).numbersRangeStart, additionWorksheets.get(9).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets, additionWorksheets.get(9).topicEng,
                additionWorksheets.get(9).h2Eng, additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus,
                additionWorksheets.get(10).numbersRangeStart, additionWorksheets.get(10).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets, additionWorksheets.get(10).topicRus,
                additionWorksheets.get(10).h2Rus, additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng,
                additionWorksheets.get(10).numbersRangeStart, additionWorksheets.get(10).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets, additionWorksheets.get(10).topicEng,
                additionWorksheets.get(10).h2Eng, additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus,
                additionWorksheets.get(11).numbersRangeStart, additionWorksheets.get(11).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets, additionWorksheets.get(11).topicRus,
                additionWorksheets.get(11).h2Rus, additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng,
                additionWorksheets.get(11).numbersRangeStart, additionWorksheets.get(11).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets, additionWorksheets.get(11).topicEng,
                additionWorksheets.get(11).h2Eng, additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus,
                additionWorksheets.get(12).numbersRangeStart, additionWorksheets.get(12).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets, additionWorksheets.get(12).topicRus,
                additionWorksheets.get(12).h2Rus, additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng,
                additionWorksheets.get(12).numbersRangeStart, additionWorksheets.get(12).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets, additionWorksheets.get(12).topicEng,
                additionWorksheets.get(12).h2Eng, additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus,
                additionWorksheets.get(13).numbersRangeStart, additionWorksheets.get(13).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeRus, additionWorksheets.get(13).totalPageOfWorksheets, additionWorksheets.get(13).topicRus,
                additionWorksheets.get(13).h2Rus, additionWorksheets.get(13).shortProblemDescriptionRus, additionWorksheets.get(13).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng,
                additionWorksheets.get(13).numbersRangeStart, additionWorksheets.get(13).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets,
                additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(13).gradeEng, additionWorksheets.get(13).totalPageOfWorksheets, additionWorksheets.get(13).topicEng,
                additionWorksheets.get(13).h2Eng, additionWorksheets.get(13).shortProblemDescriptionEng, additionWorksheets.get(13).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus,
                additionWorksheets.get(14).numbersRangeStart, additionWorksheets.get(14).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeRus, additionWorksheets.get(14).totalPageOfWorksheets, additionWorksheets.get(14).topicRus,
                additionWorksheets.get(14).h2Rus, additionWorksheets.get(14).shortProblemDescriptionRus, additionWorksheets.get(14).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng,
                additionWorksheets.get(14).numbersRangeStart, additionWorksheets.get(14).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets,
                additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(14).gradeEng, additionWorksheets.get(14).totalPageOfWorksheets, additionWorksheets.get(14).topicEng,
                additionWorksheets.get(14).h2Eng, additionWorksheets.get(14).shortProblemDescriptionEng, additionWorksheets.get(14).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus,
                additionWorksheets.get(15).numbersRangeStart, additionWorksheets.get(15).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeRus, additionWorksheets.get(15).totalPageOfWorksheets, additionWorksheets.get(15).topicRus,
                additionWorksheets.get(15).h2Rus, additionWorksheets.get(15).shortProblemDescriptionRus, additionWorksheets.get(15).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng,
                additionWorksheets.get(15).numbersRangeStart, additionWorksheets.get(15).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets,
                additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(15).gradeEng, additionWorksheets.get(15).totalPageOfWorksheets, additionWorksheets.get(15).topicEng,
                additionWorksheets.get(15).h2Eng, additionWorksheets.get(15).shortProblemDescriptionEng, additionWorksheets.get(15).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus,
                additionWorksheets.get(16).numbersRangeStart, additionWorksheets.get(16).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeRus, additionWorksheets.get(16).totalPageOfWorksheets, additionWorksheets.get(16).topicRus,
                additionWorksheets.get(16).h2Rus, additionWorksheets.get(16).shortProblemDescriptionRus, additionWorksheets.get(16).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng,
                additionWorksheets.get(16).numbersRangeStart, additionWorksheets.get(16).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets,
                additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(16).gradeEng, additionWorksheets.get(16).totalPageOfWorksheets, additionWorksheets.get(16).topicEng,
                additionWorksheets.get(16).h2Eng, additionWorksheets.get(16).shortProblemDescriptionEng, additionWorksheets.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus,
                additionWorksheets.get(17).numbersRangeStart, additionWorksheets.get(17).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeRus, additionWorksheets.get(17).totalPageOfWorksheets, additionWorksheets.get(17).topicRus,
                additionWorksheets.get(17).h2Rus, additionWorksheets.get(17).shortProblemDescriptionRus, additionWorksheets.get(17).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng,
                additionWorksheets.get(17).numbersRangeStart, additionWorksheets.get(17).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets,
                additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionWorksheets.get(17).gradeEng, additionWorksheets.get(17).totalPageOfWorksheets, additionWorksheets.get(17).topicEng,
                additionWorksheets.get(17).h2Eng, additionWorksheets.get(17).shortProblemDescriptionEng, additionWorksheets.get(17).longProblemDescriptionEng);

        General.finalRenameFiles("d:/Java_Math/Html/");
        General.finalRenameFiles("D:\\Java_Math\\Pdf");

    }
}