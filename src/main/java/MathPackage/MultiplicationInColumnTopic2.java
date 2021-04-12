package MathPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Class generating Multiplication in column topics. Part 2
 * Author: Grigorii Andreev
 * Date: 03 January
 */

public class MultiplicationInColumnTopic2 {

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

    public MultiplicationInColumnTopic2(
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
        this.totalPageOfWorksheets = totalPageOfWorksheets;}


    public static void main(String[] args) throws Exception {

        General.emptyAllFolders();
//Multiplication in columns. Part 2
/*
        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);
        Matrix.emptyFolder(General.readyFilesFolderPdf);
        Matrix.emptyFolder(General.readyFilesFolderHtml);
*/

        List<AllTopics> allTopicsMultiplyColumn2 = new ArrayList<>();

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 0 в столбик.","Multiplication 0 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 0 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 0 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 0 в столбик.",
                "Multiplication. Multiply 0 by a 2 digit numbers in column.",
                "Умножь число 0 на заданное двузначное число.",
                "Multiply 0 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 1 в столбик.","Multiplication 1 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 1 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 1 в столбик.",
                "Multiplication. Multiply 1 by a 2 digit numbers in column.",
                "Умножь число 1 на заданное двузначное число.",
                "Multiply 1 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 2 в столбик.","Multiplication 2 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 2 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 2 в столбик.",
                "Multiplication. Multiply 2 by a 2 digit numbers in column.",
                "Умножь число 2 на заданное двузначное число.",
                "Multiply 2 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 3 в столбик.","Multiplication 3 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 3 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 3 в столбик.",
                "Multiplication. Multiply 3 by a 2 digit numbers in column.",
                "Умножь число 3 на заданное двузначное число.",
                "Multiply 3 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 4 в столбик.","Multiplication 4 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 4 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 4 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 4 в столбик.",
                "Multiplication. Multiply 4 by a 2 digit numbers in column.",
                "Умножь число 4 на заданное двузначное число.",
                "Multiply 4 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 0 в столбик.","Multiplication 5 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 5 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 5 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 5 в столбик.",
                "Multiplication. Multiply 5 by a 2 digit numbers in column.",
                "Умножь число 5 на заданное двузначное число.",
                "Multiply 5 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 0 в столбик.","Multiplication 6 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 6 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 6 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 6 в столбик.",
                "Multiplication. Multiply 6 by a 2 digit numbers in column.",
                "Умножь число 6 на заданное двузначное число.",
                "Multiply 6 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 7 в столбик.","Multiplication 7 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 7 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 7 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 7 в столбик.",
                "Multiplication. Multiply 7 by a 2 digit numbers in column.",
                "Умножь число 7 на заданное двузначное число.",
                "Multiply 7 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 8 в столбик.","Multiplication 8 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 8 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 8 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 8 в столбик.",
                "Multiplication. Multiply 8 by a 2 digit numbers in column.",
                "Умножь число 8 на заданное двузначное число.",
                "Multiply 8 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 9 в столбик.","Multiplication 9 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 9 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 9 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 9 в столбик.",
                "Multiplication. Multiply 9 by a 2 digit numbers in column.",
                "Умножь число 9 на заданное двузначное число.",
                "Multiply 9 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "Умножение двузначного числа на число 10 в столбик.","Multiplication 10 by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на число 10 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 10 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на число 10 в столбик.",
                "Multiplication. Multiply 10 by a 2 digit numbers in column.",
                "Умножь число 10 на заданное двузначное число.",
                "Multiply 10 by a 2 digit numbers in column.",
                10, 99, 6));

        //--------------------------

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(0).numbersRangeStart, allTopicsMultiplyColumn2.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(0).topicRus,
                allTopicsMultiplyColumn2.get(0).h2Rus, allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(1).numbersRangeStart, allTopicsMultiplyColumn2.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(1).topicRus,
                allTopicsMultiplyColumn2.get(1).h2Rus, allTopicsMultiplyColumn2.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(2).numbersRangeStart, allTopicsMultiplyColumn2.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(2).topicRus,
                allTopicsMultiplyColumn2.get(2).h2Rus, allTopicsMultiplyColumn2.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(3).numbersRangeStart, allTopicsMultiplyColumn2.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(3).topicRus,
                allTopicsMultiplyColumn2.get(3).h2Rus, allTopicsMultiplyColumn2.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(4).numbersRangeStart, allTopicsMultiplyColumn2.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(4).topicRus,
                allTopicsMultiplyColumn2.get(4).h2Rus, allTopicsMultiplyColumn2.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(5).numbersRangeStart, allTopicsMultiplyColumn2.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(5).topicRus,
                allTopicsMultiplyColumn2.get(5).h2Rus, allTopicsMultiplyColumn2.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(6).numbersRangeStart, allTopicsMultiplyColumn2.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(6).topicRus,
                allTopicsMultiplyColumn2.get(6).h2Rus, allTopicsMultiplyColumn2.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(7).numbersRangeStart, allTopicsMultiplyColumn2.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(7).topicRus,
                allTopicsMultiplyColumn2.get(7).h2Rus, allTopicsMultiplyColumn2.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(8).numbersRangeStart, allTopicsMultiplyColumn2.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(8).topicRus,
                allTopicsMultiplyColumn2.get(8).h2Rus, allTopicsMultiplyColumn2.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(9).numbersRangeStart, allTopicsMultiplyColumn2.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(9).topicRus,
                allTopicsMultiplyColumn2.get(9).h2Rus, allTopicsMultiplyColumn2.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus,
                allTopicsMultiplyColumn2.get(10).numbersRangeStart, allTopicsMultiplyColumn2.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(10).topicRus,
                allTopicsMultiplyColumn2.get(10).h2Rus, allTopicsMultiplyColumn2.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(10).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(0).numbersRangeStart, allTopicsMultiplyColumn2.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(0).topicEng,
                allTopicsMultiplyColumn2.get(0).h2Eng, allTopicsMultiplyColumn2.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(1).numbersRangeStart, allTopicsMultiplyColumn2.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(1).topicEng,
                allTopicsMultiplyColumn2.get(1).h2Eng, allTopicsMultiplyColumn2.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(2).numbersRangeStart, allTopicsMultiplyColumn2.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(2).topicEng,
                allTopicsMultiplyColumn2.get(2).h2Eng, allTopicsMultiplyColumn2.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(3).numbersRangeStart, allTopicsMultiplyColumn2.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(3).topicEng,
                allTopicsMultiplyColumn2.get(3).h2Eng, allTopicsMultiplyColumn2.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(4).numbersRangeStart, allTopicsMultiplyColumn2.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(4).topicEng,
                allTopicsMultiplyColumn2.get(4).h2Eng, allTopicsMultiplyColumn2.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(5).numbersRangeStart, allTopicsMultiplyColumn2.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(5).topicEng,
                allTopicsMultiplyColumn2.get(5).h2Eng, allTopicsMultiplyColumn2.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(6).numbersRangeStart, allTopicsMultiplyColumn2.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(6).topicEng,
                allTopicsMultiplyColumn2.get(6).h2Eng, allTopicsMultiplyColumn2.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(7).numbersRangeStart, allTopicsMultiplyColumn2.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(7).topicEng,
                allTopicsMultiplyColumn2.get(7).h2Eng, allTopicsMultiplyColumn2.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(8).numbersRangeStart, allTopicsMultiplyColumn2.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(8).topicEng,
                allTopicsMultiplyColumn2.get(8).h2Eng, allTopicsMultiplyColumn2.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(9).numbersRangeStart, allTopicsMultiplyColumn2.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(9).topicEng,
                allTopicsMultiplyColumn2.get(9).h2Eng, allTopicsMultiplyColumn2.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng,
                allTopicsMultiplyColumn2.get(10).numbersRangeStart, allTopicsMultiplyColumn2.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets, allTopicsMultiplyColumn2.get(10).topicEng,
                allTopicsMultiplyColumn2.get(10).h2Eng, allTopicsMultiplyColumn2.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn2.get(10).longProblemDescriptionEng);



        List<AllTopics2> allTopicsMultiplyColumn3 = new ArrayList<>();

        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение двузначного числа на однозначное число в столбик.","Multiplication worksheet. 1 digit by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на однозначное число в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 2 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на однозначное число в столбик.",
                "Multiplication. Multiply 1 digit by a 2 digit in column.",
                "Умножь двузначное число на однозначное.",
                "Multiply 1 digit by a 2 digit numbers in column.",
                10, 99,0,9, 0, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(0).numberOneRangeStart, allTopicsMultiplyColumn3.get(0).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(0).numberTwoRangeStart, allTopicsMultiplyColumn3.get(0).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(0).freeLines, 6, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeRus, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(0).topicRus,
                allTopicsMultiplyColumn3.get(0).h2Rus, allTopicsMultiplyColumn3.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(0).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение однозначного числа на двузначное число в столбик.","Multiplication worksheet. 1 digit by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на двузначное число в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 2 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на двузначное число в столбик.",
                "Multiplication. Multiply 1 digit by a 2 digit in column.",
                "Умножь однозначное число на двузначное.",
                "Multiply 1 digit by a 2 digit numbers in column.",
                10, 99, 0, 9, 0, 6));


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(1).numberOneRangeStart, allTopicsMultiplyColumn3.get(1).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(1).numberTwoRangeStart, allTopicsMultiplyColumn3.get(1).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(1).freeLines, 8, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeRus, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(1).topicRus,
                allTopicsMultiplyColumn3.get(1).h2Rus, allTopicsMultiplyColumn3.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(1).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение однозначного числа на трехзначное число в столбик.","Multiplication worksheet. 1 digit by a 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на трехзначное число в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 3 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на трехзначное число в столбик.",
                "Multiplication. Multiply 1 digit by a 3 digit in column.",
                "Умножь однозначное число на трехзначное.",
                "Multiply 1 digit by a 3 digit numbers in column.",
                100, 999, 0, 9, 0, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(2).numberOneRangeStart, allTopicsMultiplyColumn3.get(2).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(2).numberTwoRangeStart, allTopicsMultiplyColumn3.get(2).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(2).freeLines, 6, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeRus, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(2).topicRus,
                allTopicsMultiplyColumn3.get(2).h2Rus, allTopicsMultiplyColumn3.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(2).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение однозначного числа на четырехзначное число в столбик.","Multiplication worksheet. 1 digit by a 4 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на четырехзначное число в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 4 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на четырехзначное число в столбик.",
                "Multiplication. Multiply 1 digit by a 4 digit in column.",
                "Умножь однозначное число на четырехзначное.",
                "Multiply 1 digit by a 4 digit numbers in column.",
                1000, 9999,0, 9, 0, 6));


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(3).numberOneRangeStart, allTopicsMultiplyColumn3.get(3).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(3).numberTwoRangeStart, allTopicsMultiplyColumn3.get(3).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(3).freeLines, 6, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeRus, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(3).topicRus,
                allTopicsMultiplyColumn3.get(3).h2Rus, allTopicsMultiplyColumn3.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(3).longProblemDescriptionRus);

        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение однозначного числа на многозначное число в столбик.","Multiplication worksheet. 1 digit by a multi digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на многозначное число в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a multi digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на многозначное число в столбик.",
                "Multiplication. Multiply 1 digit by a multi digit in column.",
                "Умножь однозначное число на многозначное.",
                "Multiply 1 digit by a multi digit numbers in column.",
                10, 999,0, 9,  0, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(4).numberOneRangeStart, allTopicsMultiplyColumn3.get(4).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(4).numberTwoRangeStart, allTopicsMultiplyColumn3.get(4).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(4).freeLines, 6, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeRus, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(4).topicRus,
                allTopicsMultiplyColumn3.get(4).h2Rus, allTopicsMultiplyColumn3.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(4).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение двузначного числа на двузначное число в столбик.","Multiplication worksheet. 2 digit by a 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение двузначного числа на двузначное число в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 digit by a 2 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение двузначного числа на двузначное число в столбик.",
                "Multiplication. Multiply 2 digit by a 2 digit in column.",
                "Умножь двузначное число на двузначное.",
                "Multiply 2 digit by a 2 digit numbers in column.",
                10, 99,10, 99, 2, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(5).numberOneRangeStart, allTopicsMultiplyColumn3.get(5).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(5).numberTwoRangeStart, allTopicsMultiplyColumn3.get(5).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(5).freeLines, 5, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeRus, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(5).topicRus,
                allTopicsMultiplyColumn3.get(5).h2Rus, allTopicsMultiplyColumn3.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(5).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение на двузначные числа в столбик.","Multiplication worksheet. 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение на двузначные числа в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение на двузначные числа в столбик.",
                "Multiplication. Multiply 2 digit numbers in column.",
                "Умножь двузначные числа.",
                "Multiply 2 digit numbers in column.",
                10, 99, 10, 99, 2, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(6).numberOneRangeStart, allTopicsMultiplyColumn3.get(6).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(6).numberTwoRangeStart, allTopicsMultiplyColumn3.get(6).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(6).freeLines, 5, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeRus, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(6).topicRus,
                allTopicsMultiplyColumn3.get(6).h2Rus, allTopicsMultiplyColumn3.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(6).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение трехзначных чисел в столбик.","Multiplication worksheet. 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение трехзначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение трехзначных чисел в столбик.",
                "Multiplication. Multiply 3 digit numbers in column.",
                "Умножь трехзначные числа.",
                "Multiply 3 digit numbers in column.",
                100, 999, 100, 999,3, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(7).numberOneRangeStart, allTopicsMultiplyColumn3.get(7).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(7).numberTwoRangeStart, allTopicsMultiplyColumn3.get(7).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(7).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeRus, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(7).topicRus,
                allTopicsMultiplyColumn3.get(7).h2Rus, allTopicsMultiplyColumn3.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(7).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение многозначных чисел в столбик.","Multiplication worksheet. multi digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение многозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply multi digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение многозначных чисел в столбик.",
                "Multiplication. Multiply multi digit numbers in column.",
                "Умножь многозначные числа.",
                "Multiply multi digit numbers in column.",
                100,999,10, 99, 3, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(8).numberOneRangeStart, allTopicsMultiplyColumn3.get(8).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(8).numberTwoRangeStart, allTopicsMultiplyColumn3.get(8).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(8).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeRus, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(8).topicRus,
                allTopicsMultiplyColumn3.get(8).h2Rus, allTopicsMultiplyColumn3.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(8).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Примеры на умножение многозначных чисел в столбик.","Multiplication worksheet. multi digit numbers in column.",
                "Задачи по математике на тему:<br />Примеры на умножение многозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply multi digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Примеры на умножение многозначных чисел в столбик.",
                "Multiplication. Multiply multi digit numbers in column.",
                "Реши примеры на умножение многозначных чисел в столбик.",
                "Multiply multi digit numbers in column.",
                100, 999, 10, 999,  3, 6));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(9).numberOneRangeStart, allTopicsMultiplyColumn3.get(9).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(9).numberTwoRangeStart, allTopicsMultiplyColumn3.get(9).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(9).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeRus, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(9).topicRus,
                allTopicsMultiplyColumn3.get(9).h2Rus, allTopicsMultiplyColumn3.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(9).longProblemDescriptionRus);


        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Примеры на умножение трехначных чисел в столбик.","Multiplication problems. 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Примеры на умножение трехзначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Multiplication problems:<br />Multiply 3 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Примеры на умножение трехзначных чисел в столбик.",
                "Multiplication problems. Multiply 3 digit numbers in column.",
                "Реши примеры на умножение трехзначных чисел в столбик.",
                "Multiply 3 digit numbers in column.",
                100, 999, 100, 999,3, 10));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(10).numberOneRangeStart, allTopicsMultiplyColumn3.get(10).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(10).numberTwoRangeStart, allTopicsMultiplyColumn3.get(10).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(10).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeRus, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(10).topicRus,
                allTopicsMultiplyColumn3.get(10).h2Rus, allTopicsMultiplyColumn3.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(10).longProblemDescriptionRus);

        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Умножение двух чисел в столбик.","Multiplication problems. Multiply two numbers in column.",
                "Задачи по математике на тему:<br />Примеры на умножение двух чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Multiplication problems:<br />Multiply two numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Примеры на умножение двух чисел в столбик.",
                "Multiplication problems. Multiply two numbers in column.",
                "Реши примеры на умножение двух чисел в столбик.",
                "Multiply two numbers in column.",
                100, 999, 10, 999, 4, 10));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(11).numberOneRangeStart, allTopicsMultiplyColumn3.get(11).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(11).numberTwoRangeStart, allTopicsMultiplyColumn3.get(11).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(11).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeRus, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(11).topicRus,
                allTopicsMultiplyColumn3.get(11).h2Rus, allTopicsMultiplyColumn3.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(11).longProblemDescriptionRus);



        allTopicsMultiplyColumn3.add( new AllTopics2(
                "", "&nbsp",
                "Операции на умножение чисел в столбик.","Complete multiplication problems. Multiply numbers in column.",
                "Операции на умножение чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Complete multiplication problems:<br />Multiply numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Выполни операции умножения. Примеры на умножение чисел в столбик.",
                "Complete multiplication problems. Multiply numbers in column.",
                "Выполни умножение чисел в столбик. Числа до 10000.",
                "Complete multiplication numbers in column.",
                100, 9999,1, 9999, 4, 10));

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus,
                allTopicsMultiplyColumn3.get(12).numberOneRangeStart, allTopicsMultiplyColumn3.get(12).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(12).numberTwoRangeStart, allTopicsMultiplyColumn3.get(12).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(12).freeLines, 3, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeRus, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(12).topicRus,
                allTopicsMultiplyColumn3.get(12).h2Rus, allTopicsMultiplyColumn3.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn3.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(0).numberOneRangeStart, allTopicsMultiplyColumn3.get(0).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(0).numberTwoRangeStart, allTopicsMultiplyColumn3.get(0).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(0).freeLines, 6, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(0).gradeEng, allTopicsMultiplyColumn3.get(0).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(0).topicEng,
                allTopicsMultiplyColumn3.get(0).h2Eng, allTopicsMultiplyColumn3.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(1).numberOneRangeStart, allTopicsMultiplyColumn3.get(1).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(1).numberTwoRangeStart, allTopicsMultiplyColumn3.get(1).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(1).freeLines, 8, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(1).gradeEng, allTopicsMultiplyColumn3.get(1).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(1).topicEng,
                allTopicsMultiplyColumn3.get(1).h2Eng, allTopicsMultiplyColumn3.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(1).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(2).numberOneRangeStart, allTopicsMultiplyColumn3.get(2).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(2).numberTwoRangeStart, allTopicsMultiplyColumn3.get(2).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(2).freeLines, 6, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(2).gradeEng, allTopicsMultiplyColumn3.get(2).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(2).topicEng,
                allTopicsMultiplyColumn3.get(2).h2Eng, allTopicsMultiplyColumn3.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(2).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(3).numberOneRangeStart, allTopicsMultiplyColumn3.get(3).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(3).numberTwoRangeStart, allTopicsMultiplyColumn3.get(3).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(3).freeLines, 6, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(3).gradeEng, allTopicsMultiplyColumn3.get(3).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(3).topicEng,
                allTopicsMultiplyColumn3.get(3).h2Eng, allTopicsMultiplyColumn3.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(4).numberOneRangeStart, allTopicsMultiplyColumn3.get(4).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(4).numberTwoRangeStart, allTopicsMultiplyColumn3.get(4).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(4).freeLines, 6, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(4).gradeEng, allTopicsMultiplyColumn3.get(4).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(4).topicEng,
                allTopicsMultiplyColumn3.get(4).h2Eng, allTopicsMultiplyColumn3.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(4).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(5).numberOneRangeStart, allTopicsMultiplyColumn3.get(5).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(5).numberTwoRangeStart, allTopicsMultiplyColumn3.get(5).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(5).freeLines, 5, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(5).gradeEng, allTopicsMultiplyColumn3.get(5).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(5).topicEng,
                allTopicsMultiplyColumn3.get(5).h2Eng, allTopicsMultiplyColumn3.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(6).numberOneRangeStart, allTopicsMultiplyColumn3.get(6).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(6).numberTwoRangeStart, allTopicsMultiplyColumn3.get(6).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(6).freeLines, 5, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(6).gradeEng, allTopicsMultiplyColumn3.get(6).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(6).topicEng,
                allTopicsMultiplyColumn3.get(6).h2Eng, allTopicsMultiplyColumn3.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(7).numberOneRangeStart, allTopicsMultiplyColumn3.get(7).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(7).numberTwoRangeStart, allTopicsMultiplyColumn3.get(7).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(7).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(7).gradeEng, allTopicsMultiplyColumn3.get(7).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(7).topicEng,
                allTopicsMultiplyColumn3.get(7).h2Eng, allTopicsMultiplyColumn3.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(7).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(8).numberOneRangeStart, allTopicsMultiplyColumn3.get(8).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(8).numberTwoRangeStart, allTopicsMultiplyColumn3.get(8).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(8).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(8).gradeEng, allTopicsMultiplyColumn3.get(8).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(8).topicEng,
                allTopicsMultiplyColumn3.get(8).h2Eng, allTopicsMultiplyColumn3.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(8).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(9).numberOneRangeStart, allTopicsMultiplyColumn3.get(9).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(9).numberTwoRangeStart, allTopicsMultiplyColumn3.get(9).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(9).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(9).gradeEng, allTopicsMultiplyColumn3.get(9).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(9).topicEng,
                allTopicsMultiplyColumn3.get(9).h2Eng, allTopicsMultiplyColumn3.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(10).numberOneRangeStart, allTopicsMultiplyColumn3.get(10).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(10).numberTwoRangeStart, allTopicsMultiplyColumn3.get(10).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(10).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(10).gradeEng, allTopicsMultiplyColumn3.get(10).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(10).topicEng,
                allTopicsMultiplyColumn3.get(10).h2Eng, allTopicsMultiplyColumn3.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(10).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(11).numberOneRangeStart, allTopicsMultiplyColumn3.get(11).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(11).numberTwoRangeStart, allTopicsMultiplyColumn3.get(11).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(11).freeLines, 4, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(11).gradeEng, allTopicsMultiplyColumn3.get(11).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(11).topicEng,
                allTopicsMultiplyColumn3.get(11).h2Eng, allTopicsMultiplyColumn3.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng );
        Matrix.multiplyA1_B1FreeLinesColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng,
                allTopicsMultiplyColumn3.get(12).numberOneRangeStart, allTopicsMultiplyColumn3.get(12).numberOneRangeEnd,
                allTopicsMultiplyColumn3.get(12).numberTwoRangeStart, allTopicsMultiplyColumn3.get(12).numberTwoRangeEnd,
                allTopicsMultiplyColumn3.get(12).freeLines, 3, 7);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn3.get(12).gradeEng, allTopicsMultiplyColumn3.get(12).totalPageOfWorksheets, allTopicsMultiplyColumn3.get(12).topicEng,
                allTopicsMultiplyColumn3.get(12).h2Eng, allTopicsMultiplyColumn3.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn3.get(12).longProblemDescriptionEng);




    }

}
