package mathpackage.additionsubtraction;

import mathpackage.General;
import mathpackage.Matrix;
import mathpackage.WorksheetTemplate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

/**
 * Class generating addition worksheets. Part 1
 * Author: Grigorii Andreev
 * Date: 05 January 2021
 */

public class AdditionWorksheets extends WorksheetTemplate implements Serializable{

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
                "Сложение. Сложение чисел до 10.","Addition. Addition numbers up to 10.",
                "Задачи по математике на тему:<br />Сложение чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10.",
                "Addition of numbers up to 10.",
                "Сложи числа до 10.",
                "Add numbers up to 10.",
                0, 10, 11));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).longProblemDescriptionRus,
                additionWorksheets.get(0).numbersRangeStart, additionWorksheets.get(0).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).longProblemDescriptionEng,
                additionWorksheets.get(0).numbersRangeStart, additionWorksheets.get(0).numbersRangeEnd, 13, 5);
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
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение чисел до 20.","Addition. Addition numbers up to 20.",
                "Задачи по математике на тему:<br />Сложение чисел до 20. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 20. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 20.",
                "Addition of numbers up to 20.",
                "Сложи числа до 20.",
                "Add numbers up to 20.",
                0, 20, 11));



        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).longProblemDescriptionRus,
                additionWorksheets.get(1).numbersRangeStart, additionWorksheets.get(1).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).longProblemDescriptionEng,
                additionWorksheets.get(1).numbersRangeStart, additionWorksheets.get(1).numbersRangeEnd, 13, 5);
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
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение двузначных чисел.","Addition. Two digit numbers addition.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Two-digit numbers addition. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел.",
                "Two-digit numbers addition.",
                "Сложи двузначные числа.",
                "Add two-digit numbers.",
                10, 99, 11));


        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).longProblemDescriptionRus,
                additionWorksheets.get(2).numbersRangeStart, additionWorksheets.get(2).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).longProblemDescriptionEng,
                additionWorksheets.get(2).numbersRangeStart, additionWorksheets.get(2).numbersRangeEnd, 13, 5);
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
                0, 99, 11));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).longProblemDescriptionRus,
                additionWorksheets.get(3).numbersRangeStart, additionWorksheets.get(3).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).longProblemDescriptionEng,
                additionWorksheets.get(3).numbersRangeStart, additionWorksheets.get(3).numbersRangeEnd, 13, 5);
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
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение однозначных чисел.","Addition. Addition 1 digit numbers.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел.",
                "Addition 1 digit numbers.",
                "Сложи однозначные числа.",
                "Add 1 digit numbers.",
                0, 9, 11));






        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).longProblemDescriptionRus,
                additionWorksheets.get(4).numbersRangeStart, additionWorksheets.get(4).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).longProblemDescriptionEng,
                additionWorksheets.get(4).numbersRangeStart, additionWorksheets.get(4).numbersRangeEnd, 13, 5);
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

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение одинаковых чисел до 10.","Addition. Add doubles. Numbers up to 10.",
                "Задачи по математике на тему:<br />Сложение одинаковых чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add doubles. Numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10.",
                "Addition doubles up to 10.",
                "Сложи одинаковые числа до 10.",
                "Add doubles. Numbers up to 10.",
                0, 10, 11));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).longProblemDescriptionRus,
                additionWorksheets.get(5).numbersRangeStart, additionWorksheets.get(5).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).longProblemDescriptionEng,
                additionWorksheets.get(5).numbersRangeStart, additionWorksheets.get(5).numbersRangeEnd, 13, 5);
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


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение четных чисел до 100.","Addition. Add even numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение четных чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add even numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четных чисел до 100.",
                "Addition of even numbers up to 100.",
                "Сложи четные числа до 100.",
                "Add even numbers. Numbers up to 100.",
                0, 100, 11));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).longProblemDescriptionRus,
                additionWorksheets.get(6).numbersRangeStart, additionWorksheets.get(6).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).longProblemDescriptionEng,
                additionWorksheets.get(6).numbersRangeStart, additionWorksheets.get(6).numbersRangeEnd, 13, 5);
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


        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение нечетных чисел до 100.","Addition. Add odd numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение нечетных чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add odd numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение нечетных чисел до 100.",
                "Addition of odd numbers up to 100.",
                "Сложи нечетные числа до 100.",
                "Add odd numbers. Numbers up to 100.",
                0, 100, 11));

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).longProblemDescriptionRus,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).longProblemDescriptionEng,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 13, 5);
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


/*

        Matrix.topWorksheet(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).longProblemDescriptionRus,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 13, 5);
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
        addA1_B1LineWorksheetA4(General.workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).longProblemDescriptionEng,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 13, 5);
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

*/

        General.finalRenameFiles("d:/Java_Math/Html/");
        General.finalRenameFiles("d:/Java_Math/Pdf");
        General.finalRenameFiles("d:/Java_Math/ReadyWorksheets");
        General.saveObject(additionWorksheets);

    }

    public static void addA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String longTaskNameWorksheet,
                                               int numbersRangeStart, int numbersRangeEnd, int problemsLines, int problemsCols) throws IOException {
        System.out.println("Тема: " + longTaskNameWorksheet);


        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {


            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd/10 + numbersRangeStart);
                }

            if (longTaskNameWorksheet.contains("четные")) {
                System.out.println("Четные числа");
                int tempNumber;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlock__" + ".html");
            FileWriter fileAnswerWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlockAnswer__" + ".html");

            for (int i = 0; i < problemsLines; i++) {
                for (int j = 0; j < problemsCols; j++) {

                    outputStream.write(valueOf(argument1[i][j]).getBytes());
                    fileWriter.write(valueOf(argument1[i][j]));
                    fileAnswerWriter.write(valueOf(argument1[i][j]));

                    outputStream.write(' ');
                    outputStream.write('+');
                    outputStream.write(' ');

                    fileWriter.write(" + ");
                    fileAnswerWriter.write(" + ");

                    outputStream.write(valueOf(argument2[i][j]).getBytes());
                    fileWriter.write(valueOf(argument2[i][j]));
                    fileAnswerWriter.write(valueOf(argument2[i][j]));

                    outputStream.write(' ');
                    outputStream.write('=');
                    outputStream.write(' ');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write(' ');
                    outputStream.write(' ');
                    outputStream.write(' ');

                    fileWriter.write(" = ____ &nbsp; &nbsp; &nbsp; ");
                    fileAnswerWriter.write(" = " + (argument1[i][j] + argument2[i][j]) + " &nbsp;  &nbsp; ");
                }
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n\n");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void addA1_B1ColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers,
                                                 String longTaskNameWorksheet,
                                                 int numbersRangeStart, int numbersRangeEnd,
                                                 int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers; k++) {
            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
                }
            if (longTaskNameWorksheet.contains("четные") || longTaskNameWorksheet.contains("even")) {
                System.out.println("Четные числа");
                int tempNumber;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
                    }
            }

            if (longTaskNameWorksheet.contains("нечетные") || longTaskNameWorksheet.contains("odd")) {
                int tempNumber;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
                    }
            }
            FileWriter fileHtmlWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlock__" + ".html");
            FileWriter fileHtmlWriterAnswer = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlockAnswer__" + ".html");
            FileWriter fileTxtWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyTxtBlock__" + ".txt");

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;&nbsp; + " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;&nbsp; + " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> " + (argument1[i][j] + argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }
}