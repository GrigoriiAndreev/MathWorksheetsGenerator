package MathPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Class generating Multiplication in column topics. Part 1
 * Author: Grigorii Andreev
 * Date: 03 January
 */

public class MultiplicationInColumnTopic {

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

    public MultiplicationInColumnTopic(
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


//Multiplication in columns. Part 1


/*
        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);
        Matrix.emptyFolder(General.readyFilesFolderPdf);
        Matrix.emptyFolder(General.readyFilesFolderHtml);
*/

        List<AllTopics> allTopicsMultiplyColumn = new ArrayList<>();

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 0 в столбик.","Multiplication 0 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 0 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 0 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 0 в столбик.",
                "Multiplication. Multiply 0 by numbers in column.",
                "Умножь число 0 на заданное число в столбик.",
                "Multiply 0 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 1 в столбик.","Multiplication 1 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 1 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 1 в столбик.",
                "Multiplication. Multiply 1 by numbers in column.",
                "Умножь число 1 на заданное число в столбик.",
                "Multiply 1 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 2 в столбик.","Multiplication 2 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 2 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 2 в столбик.",
                "Multiplication. Multiply 2 by numbers in column.",
                "Умножь число 2 на заданное число в столбик.",
                "Multiply 2 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 3 в столбик.","Multiplication 3 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 3 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 3 в столбик.",
                "Multiplication. Multiply 3 by numbers in column.",
                "Умножь число 3 на заданное число в столбик.",
                "Multiply 3 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 4 в столбик.","Multiplication 4 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 4 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 4 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 4 в столбик.",
                "Multiplication. Multiply 4 by numbers in column.",
                "Умножь число 4 на заданное число в столбик.",
                "Multiply 4 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 0 в столбик.","Multiplication 5 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 5 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 5 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 5 в столбик.",
                "Multiplication. Multiply 5 by numbers in column.",
                "Умножь число 5 на заданное число в столбик.",
                "Multiply 5 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 0 в столбик.","Multiplication 6 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 6 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 6 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 6 в столбик.",
                "Multiplication. Multiply 6 by numbers in column.",
                "Умножь число 6 на заданное число в столбик.",
                "Multiply 6 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 7 в столбик.","Multiplication 7 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 7 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 7 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 7 в столбик.",
                "Multiplication. Multiply 7 by numbers in column.",
                "Умножь число 7 на заданное число в столбик.",
                "Multiply 7 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 8 в столбик.","Multiplication 8 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 8 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 8 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 8 в столбик.",
                "Multiplication. Multiply 8 by numbers in column.",
                "Умножь число 8 на заданное число в столбик.",
                "Multiply 8 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 9 в столбик.","Multiplication 9 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 9 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 9 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 9 в столбик.",
                "Multiplication. Multiply 9 by numbers in column.",
                "Умножь число 9 на заданное число в столбик.",
                "Multiply 9 by numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение числа 10 в столбик.","Multiplication 10 by numbers in column.",
                "Задачи по математике на тему:<br />Умножение числа 10 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 10 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 10 в столбик.",
                "Multiplication. Multiply 10 by numbers in column.",
                "Умножь число 10 на заданное число в столбик.",
                "Multiply 10 by numbers in column.",
                0, 9, 6));


        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 0 в столбик.","Multiplication 0 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 0 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 0 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 0 в столбик.",
                "Multiplication. Multiply 0 by a 1 digit numbers in column.",
                "Умножь число 0 на заданное однозначное число.",
                "Multiply 0 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 1 в столбик.","Multiplication 1 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 1 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 1 в столбик.",
                "Multiplication. Multiply 1 by a 1 digit numbers in column.",
                "Умножь число 1 на заданное однозначное число.",
                "Multiply 1 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 2 в столбик.","Multiplication 2 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 2 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 2 в столбик.",
                "Multiplication. Multiply 2 by a 1 digit numbers in column.",
                "Умножь число 2 на заданное однозначное число.",
                "Multiply 2 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 3 в столбик.","Multiplication 3 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 3 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 3 в столбик.",
                "Multiplication. Multiply 3 by a 1 digit numbers in column.",
                "Умножь число 3 на заданное однозначное число.",
                "Multiply 3 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 4 в столбик.","Multiplication 4 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 4 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 4 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 4 в столбик.",
                "Multiplication. Multiply 4 by a 1 digit numbers in column.",
                "Умножь число 4 на заданное однозначное число.",
                "Multiply 4 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 0 в столбик.","Multiplication 5 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 5 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 5 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 5 в столбик.",
                "Multiplication. Multiply 5 by a 1 digit numbers in column.",
                "Умножь число 5 на заданное однозначное число.",
                "Multiply 5 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 0 в столбик.","Multiplication 6 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 6 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 6 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 6 в столбик.",
                "Multiplication. Multiply 6 by a 1 digit numbers in column.",
                "Умножь число 6 на заданное однозначное число.",
                "Multiply 6 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 7 в столбик.","Multiplication 7 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 7 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 7 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 7 в столбик.",
                "Multiplication. Multiply 7 by a 1 digit numbers in column.",
                "Умножь число 7 на заданное однозначное число.",
                "Multiply 7 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 8 в столбик.","Multiplication 8 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 8 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 8 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 8 в столбик.",
                "Multiplication. Multiply 8 by a 1 digit numbers in column.",
                "Умножь число 8 на заданное однозначное число.",
                "Multiply 8 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 9 в столбик.","Multiplication 9 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 9 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 9 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 9 в столбик.",
                "Multiplication. Multiply 9 by a 1 digit numbers in column.",
                "Умножь число 9 на заданное однозначное число.",
                "Multiply 9 by a 1 digit numbers in column.",
                0, 9, 6));

        allTopicsMultiplyColumn.add( new AllTopics(
                "", "&nbsp",
                "Умножение однозначного числа на число 10 в столбик.","Multiplication 10 by a 1 digit numbers in column.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 10 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 10 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 10 в столбик.",
                "Multiplication. Multiply 10 by a 1 digit numbers in column.",
                "Умножь число 10 на заданное однозначное число.",
                "Multiply 10 by a 1 digit numbers in column.",
                0, 9, 6));


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(0).numbersRangeStart, allTopicsMultiplyColumn.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeRus, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets, allTopicsMultiplyColumn.get(0).topicRus,
                allTopicsMultiplyColumn.get(0).h2Rus, allTopicsMultiplyColumn.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(1).numbersRangeStart, allTopicsMultiplyColumn.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeRus, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets, allTopicsMultiplyColumn.get(1).topicRus,
                allTopicsMultiplyColumn.get(1).h2Rus, allTopicsMultiplyColumn.get(1).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(2).numbersRangeStart, allTopicsMultiplyColumn.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeRus, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets, allTopicsMultiplyColumn.get(2).topicRus,
                allTopicsMultiplyColumn.get(2).h2Rus, allTopicsMultiplyColumn.get(2).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(3).numbersRangeStart, allTopicsMultiplyColumn.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeRus, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets, allTopicsMultiplyColumn.get(3).topicRus,
                allTopicsMultiplyColumn.get(3).h2Rus, allTopicsMultiplyColumn.get(3).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(4).numbersRangeStart, allTopicsMultiplyColumn.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeRus, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets, allTopicsMultiplyColumn.get(4).topicRus,
                allTopicsMultiplyColumn.get(4).h2Rus, allTopicsMultiplyColumn.get(4).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(5).numbersRangeStart, allTopicsMultiplyColumn.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeRus, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets, allTopicsMultiplyColumn.get(5).topicRus,
                allTopicsMultiplyColumn.get(5).h2Rus, allTopicsMultiplyColumn.get(5).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(6).numbersRangeStart, allTopicsMultiplyColumn.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeRus, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets, allTopicsMultiplyColumn.get(6).topicRus,
                allTopicsMultiplyColumn.get(6).h2Rus, allTopicsMultiplyColumn.get(6).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(7).numbersRangeStart, allTopicsMultiplyColumn.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeRus, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets, allTopicsMultiplyColumn.get(7).topicRus,
                allTopicsMultiplyColumn.get(7).h2Rus, allTopicsMultiplyColumn.get(7).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(8).numbersRangeStart, allTopicsMultiplyColumn.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeRus, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets, allTopicsMultiplyColumn.get(8).topicRus,
                allTopicsMultiplyColumn.get(8).h2Rus, allTopicsMultiplyColumn.get(8).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(9).numbersRangeStart, allTopicsMultiplyColumn.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeRus, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets, allTopicsMultiplyColumn.get(9).topicRus,
                allTopicsMultiplyColumn.get(9).h2Rus, allTopicsMultiplyColumn.get(9).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(10).numbersRangeStart, allTopicsMultiplyColumn.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeRus, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets, allTopicsMultiplyColumn.get(10).topicRus,
                allTopicsMultiplyColumn.get(10).h2Rus, allTopicsMultiplyColumn.get(10).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(11).numbersRangeStart, allTopicsMultiplyColumn.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeRus, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets, allTopicsMultiplyColumn.get(11).topicRus,
                allTopicsMultiplyColumn.get(11).h2Rus, allTopicsMultiplyColumn.get(11).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(12).numbersRangeStart, allTopicsMultiplyColumn.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeRus, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets, allTopicsMultiplyColumn.get(12).topicRus,
                allTopicsMultiplyColumn.get(12).h2Rus, allTopicsMultiplyColumn.get(12).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(13).numbersRangeStart, allTopicsMultiplyColumn.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeRus, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets, allTopicsMultiplyColumn.get(13).topicRus,
                allTopicsMultiplyColumn.get(13).h2Rus, allTopicsMultiplyColumn.get(13).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(14).numbersRangeStart, allTopicsMultiplyColumn.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeRus, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets, allTopicsMultiplyColumn.get(14).topicRus,
                allTopicsMultiplyColumn.get(14).h2Rus, allTopicsMultiplyColumn.get(14).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(15).numbersRangeStart, allTopicsMultiplyColumn.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeRus, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets, allTopicsMultiplyColumn.get(15).topicRus,
                allTopicsMultiplyColumn.get(15).h2Rus, allTopicsMultiplyColumn.get(15).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(15).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(16).numbersRangeStart, allTopicsMultiplyColumn.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeRus, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets, allTopicsMultiplyColumn.get(16).topicRus,
                allTopicsMultiplyColumn.get(16).h2Rus, allTopicsMultiplyColumn.get(16).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(16).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(17).numbersRangeStart, allTopicsMultiplyColumn.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeRus, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets, allTopicsMultiplyColumn.get(17).topicRus,
                allTopicsMultiplyColumn.get(17).h2Rus, allTopicsMultiplyColumn.get(17).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(17).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(18).numbersRangeStart, allTopicsMultiplyColumn.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeRus, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets, allTopicsMultiplyColumn.get(18).topicRus,
                allTopicsMultiplyColumn.get(18).h2Rus, allTopicsMultiplyColumn.get(18).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(18).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(19).numbersRangeStart, allTopicsMultiplyColumn.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeRus, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets, allTopicsMultiplyColumn.get(19).topicRus,
                allTopicsMultiplyColumn.get(19).h2Rus, allTopicsMultiplyColumn.get(19).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(19).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(20).numbersRangeStart, allTopicsMultiplyColumn.get(20).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeRus, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets, allTopicsMultiplyColumn.get(20).topicRus,
                allTopicsMultiplyColumn.get(20).h2Rus, allTopicsMultiplyColumn.get(20).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(20).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus,
                allTopicsMultiplyColumn.get(21).numbersRangeStart, allTopicsMultiplyColumn.get(21).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeRus, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets, allTopicsMultiplyColumn.get(21).topicRus,
                allTopicsMultiplyColumn.get(21).h2Rus, allTopicsMultiplyColumn.get(21).shortProblemDescriptionRus, allTopicsMultiplyColumn.get(21).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(0).numbersRangeStart, allTopicsMultiplyColumn.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(0).gradeEng, allTopicsMultiplyColumn.get(0).totalPageOfWorksheets, allTopicsMultiplyColumn.get(0).topicEng,
                allTopicsMultiplyColumn.get(0).h2Eng, allTopicsMultiplyColumn.get(0).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(1).numbersRangeStart, allTopicsMultiplyColumn.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(1).gradeEng, allTopicsMultiplyColumn.get(1).totalPageOfWorksheets, allTopicsMultiplyColumn.get(1).topicEng,
                allTopicsMultiplyColumn.get(1).h2Eng, allTopicsMultiplyColumn.get(1).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(2).numbersRangeStart, allTopicsMultiplyColumn.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(2).gradeEng, allTopicsMultiplyColumn.get(2).totalPageOfWorksheets, allTopicsMultiplyColumn.get(2).topicEng,
                allTopicsMultiplyColumn.get(2).h2Eng, allTopicsMultiplyColumn.get(2).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(3).numbersRangeStart, allTopicsMultiplyColumn.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(3).gradeEng, allTopicsMultiplyColumn.get(3).totalPageOfWorksheets, allTopicsMultiplyColumn.get(3).topicEng,
                allTopicsMultiplyColumn.get(3).h2Eng, allTopicsMultiplyColumn.get(3).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(4).numbersRangeStart, allTopicsMultiplyColumn.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(4).gradeEng, allTopicsMultiplyColumn.get(4).totalPageOfWorksheets, allTopicsMultiplyColumn.get(4).topicEng,
                allTopicsMultiplyColumn.get(4).h2Eng, allTopicsMultiplyColumn.get(4).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(5).numbersRangeStart, allTopicsMultiplyColumn.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(5).gradeEng, allTopicsMultiplyColumn.get(5).totalPageOfWorksheets, allTopicsMultiplyColumn.get(5).topicEng,
                allTopicsMultiplyColumn.get(5).h2Eng, allTopicsMultiplyColumn.get(5).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(6).numbersRangeStart, allTopicsMultiplyColumn.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(6).gradeEng, allTopicsMultiplyColumn.get(6).totalPageOfWorksheets, allTopicsMultiplyColumn.get(6).topicEng,
                allTopicsMultiplyColumn.get(6).h2Eng, allTopicsMultiplyColumn.get(6).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(7).numbersRangeStart, allTopicsMultiplyColumn.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(7).gradeEng, allTopicsMultiplyColumn.get(7).totalPageOfWorksheets, allTopicsMultiplyColumn.get(7).topicEng,
                allTopicsMultiplyColumn.get(7).h2Eng, allTopicsMultiplyColumn.get(7).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(8).numbersRangeStart, allTopicsMultiplyColumn.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(8).gradeEng, allTopicsMultiplyColumn.get(8).totalPageOfWorksheets, allTopicsMultiplyColumn.get(8).topicEng,
                allTopicsMultiplyColumn.get(8).h2Eng, allTopicsMultiplyColumn.get(8).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(9).numbersRangeStart, allTopicsMultiplyColumn.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(9).gradeEng, allTopicsMultiplyColumn.get(9).totalPageOfWorksheets, allTopicsMultiplyColumn.get(9).topicEng,
                allTopicsMultiplyColumn.get(9).h2Eng, allTopicsMultiplyColumn.get(9).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(10).numbersRangeStart, allTopicsMultiplyColumn.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(10).gradeEng, allTopicsMultiplyColumn.get(10).totalPageOfWorksheets, allTopicsMultiplyColumn.get(10).topicEng,
                allTopicsMultiplyColumn.get(10).h2Eng, allTopicsMultiplyColumn.get(10).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(11).numbersRangeStart, allTopicsMultiplyColumn.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(11).gradeEng, allTopicsMultiplyColumn.get(11).totalPageOfWorksheets, allTopicsMultiplyColumn.get(11).topicEng,
                allTopicsMultiplyColumn.get(11).h2Eng, allTopicsMultiplyColumn.get(11).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(12).numbersRangeStart, allTopicsMultiplyColumn.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(12).gradeEng, allTopicsMultiplyColumn.get(12).totalPageOfWorksheets, allTopicsMultiplyColumn.get(12).topicEng,
                allTopicsMultiplyColumn.get(12).h2Eng, allTopicsMultiplyColumn.get(12).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(13).numbersRangeStart, allTopicsMultiplyColumn.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(13).gradeEng, allTopicsMultiplyColumn.get(13).totalPageOfWorksheets, allTopicsMultiplyColumn.get(13).topicEng,
                allTopicsMultiplyColumn.get(13).h2Eng, allTopicsMultiplyColumn.get(13).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(14).numbersRangeStart, allTopicsMultiplyColumn.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(14).gradeEng, allTopicsMultiplyColumn.get(14).totalPageOfWorksheets, allTopicsMultiplyColumn.get(14).topicEng,
                allTopicsMultiplyColumn.get(14).h2Eng, allTopicsMultiplyColumn.get(14).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(14).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(15).numbersRangeStart, allTopicsMultiplyColumn.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(15).gradeEng, allTopicsMultiplyColumn.get(15).totalPageOfWorksheets, allTopicsMultiplyColumn.get(15).topicEng,
                allTopicsMultiplyColumn.get(15).h2Eng, allTopicsMultiplyColumn.get(15).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(15).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(16).numbersRangeStart, allTopicsMultiplyColumn.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(16).gradeEng, allTopicsMultiplyColumn.get(16).totalPageOfWorksheets, allTopicsMultiplyColumn.get(16).topicEng,
                allTopicsMultiplyColumn.get(16).h2Eng, allTopicsMultiplyColumn.get(16).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(17).numbersRangeStart, allTopicsMultiplyColumn.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(17).gradeEng, allTopicsMultiplyColumn.get(17).totalPageOfWorksheets, allTopicsMultiplyColumn.get(17).topicEng,
                allTopicsMultiplyColumn.get(17).h2Eng, allTopicsMultiplyColumn.get(17).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(17).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(18).numbersRangeStart, allTopicsMultiplyColumn.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(18).gradeEng, allTopicsMultiplyColumn.get(18).totalPageOfWorksheets, allTopicsMultiplyColumn.get(18).topicEng,
                allTopicsMultiplyColumn.get(18).h2Eng, allTopicsMultiplyColumn.get(18).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(18).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(19).numbersRangeStart, allTopicsMultiplyColumn.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(19).gradeEng, allTopicsMultiplyColumn.get(19).totalPageOfWorksheets, allTopicsMultiplyColumn.get(19).topicEng,
                allTopicsMultiplyColumn.get(19).h2Eng, allTopicsMultiplyColumn.get(19).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(19).longProblemDescriptionEng);



        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(20).numbersRangeStart, allTopicsMultiplyColumn.get(20).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(20).gradeEng, allTopicsMultiplyColumn.get(20).totalPageOfWorksheets, allTopicsMultiplyColumn.get(20).topicEng,
                allTopicsMultiplyColumn.get(20).h2Eng, allTopicsMultiplyColumn.get(20).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(20).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng );
        Matrix.multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng,
                allTopicsMultiplyColumn.get(21).numbersRangeStart, allTopicsMultiplyColumn.get(21).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets,
                allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiplyColumn.get(21).gradeEng, allTopicsMultiplyColumn.get(21).totalPageOfWorksheets, allTopicsMultiplyColumn.get(21).topicEng,
                allTopicsMultiplyColumn.get(21).h2Eng, allTopicsMultiplyColumn.get(21).shortProblemDescriptionEng, allTopicsMultiplyColumn.get(21).longProblemDescriptionEng);



    }

}
