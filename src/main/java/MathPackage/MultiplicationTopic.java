package MathPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Class generating Multiplication topics
 * Author: Grigorii Andreev
 * Date: 03 January
 */

public class MultiplicationTopic extends MainAbstractClass{

    public MultiplicationTopic(
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

        readyFilesFolder = "d:/Java_Math/ReadyWorksheets/Multiplication";
        readyFilesFolderPdf = "d:/Java_Math/Pdf/Multiplication";
        readyFilesFolderHtml = "d:/Java_Math/Html/Multiplication";
    }

    public static void main(String[] args) throws Exception {

        General.emptyAllFolders();

        List<MultiplicationTopic> allTopicsMultiply = new ArrayList<>();

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 0.","Multiplication 0 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 0 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 0.",
                "Multiplication. Multiply 0 by numbers.",
                "Умножь число 0 на заданное число.",
                "Multiply 0 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 1.","Multiplication 1 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 1.",
                "Multiplication. Multiply 1 by numbers.",
                "Умножь число 1 на заданное число.",
                "Multiply 1 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 2.","Multiplication 2 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 0.",
                "Multiplication. Multiply 2 by numbers.",
                "Умножь число 2 на заданное число.",
                "Multiply 2 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 3.","Multiplication 3 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 3.",
                "Multiplication. Multiply 3 by numbers.",
                "Умножь число 3 на заданное число.",
                "Multiply 3 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 4.","Multiplication 4 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 4 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 4.",
                "Multiplication. Multiply 4 by numbers.",
                "Умножь число 4 на заданное число.",
                "Multiply 4 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 0.","Multiplication 5 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 5 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 5.",
                "Multiplication. Multiply 5 by numbers.",
                "Умножь число 5 на заданное число.",
                "Multiply 5 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 0.","Multiplication 6 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 6 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 6.",
                "Multiplication. Multiply 6 by numbers.",
                "Умножь число 6 на заданное число.",
                "Multiply 6 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 7.","Multiplication 7 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 7 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 7.",
                "Multiplication. Multiply 7 by numbers.",
                "Умножь число 7 на заданное число.",
                "Multiply 7 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 8.","Multiplication 8 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 8 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 8.",
                "Multiplication. Multiply 8 by numbers.",
                "Умножь число 8 на заданное число.",
                "Multiply 8 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 9.","Multiplication 9 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 9 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 9.",
                "Multiplication. Multiply 9 by numbers.",
                "Умножь число 9 на заданное число.",
                "Multiply 9 by numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение числа 10.","Multiplication 10 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 10 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 10.",
                "Multiplication. Multiply 10 by numbers.",
                "Умножь число 10 на заданное число.",
                "Multiply 10 by numbers.",
                0, 9, 6));


        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 0.","Multiplication 0 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 0 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 0.",
                "Multiplication. Multiply 0 by a 1 digit numbers.",
                "Умножь число 0 на заданное однозначное число.",
                "Multiply 0 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 1.","Multiplication 1 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 1.",
                "Multiplication. Multiply 1 by a 1 digit numbers.",
                "Умножь число 1 на заданное однозначное число.",
                "Multiply 1 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 2.","Multiplication 2 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 0.",
                "Multiplication. Multiply 2 by a 1 digit numbers.",
                "Умножь число 2 на заданное однозначное число.",
                "Multiply 2 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 3.","Multiplication 3 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 3.",
                "Multiplication. Multiply 3 by a 1 digit numbers.",
                "Умножь число 3 на заданное однозначное число.",
                "Multiply 3 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 4.","Multiplication 4 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 4 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 4.",
                "Multiplication. Multiply 4 by a 1 digit numbers.",
                "Умножь число 4 на заданное однозначное число.",
                "Multiply 4 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 5.","Multiplication 5 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 5 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 5.",
                "Multiplication. Multiply 5 by a 1 digit numbers.",
                "Умножь число 5 на заданное однозначное число.",
                "Multiply 5 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 6.","Multiplication 6 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 6 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 6.",
                "Multiplication. Multiply 6 by a 1 digit numbers.",
                "Умножь число 6 на заданное однозначное число.",
                "Multiply 6 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 7.","Multiplication 7 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 7 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 7.",
                "Multiplication. Multiply 7 by a 1 digit numbers.",
                "Умножь число 7 на заданное однозначное число.",
                "Multiply 7 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 8.","Multiplication 8 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 8 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 8.",
                "Multiplication. Multiply 8 by a 1 digit numbers.",
                "Умножь число 8 на заданное однозначное число.",
                "Multiply 8 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 9.","Multiplication 9 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 9 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 9.",
                "Multiplication. Multiply 9 by a 1 digit numbers.",
                "Умножь число 9 на заданное однозначное число.",
                "Multiply 9 by a 1 digit numbers.",
                0, 9, 6));

        allTopicsMultiply.add( new MultiplicationTopic(
                "", "&nbsp",
                "Умножение однозначного числа на число 10.","Multiplication 10 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 10 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 10.",
                "Multiplication. Multiply 10 by a 1 digit numbers.",
                "Умножь число 10 на заданное однозначное число.",
                "Multiply 10 by a 1 digit numbers.",
                0, 9, 6));

//Multiplication in line
        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus,
                allTopicsMultiply.get(0).numbersRangeStart, allTopicsMultiply.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeRus, allTopicsMultiply.get(0).totalPageOfWorksheets, allTopicsMultiply.get(0).topicRus,
                allTopicsMultiply.get(0).h2Rus, allTopicsMultiply.get(0).shortProblemDescriptionRus, allTopicsMultiply.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus,
                allTopicsMultiply.get(1).numbersRangeStart, allTopicsMultiply.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeRus, allTopicsMultiply.get(1).totalPageOfWorksheets, allTopicsMultiply.get(1).topicRus,
                allTopicsMultiply.get(1).h2Rus, allTopicsMultiply.get(1).shortProblemDescriptionRus, allTopicsMultiply.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus,
                allTopicsMultiply.get(2).numbersRangeStart, allTopicsMultiply.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeRus, allTopicsMultiply.get(2).totalPageOfWorksheets, allTopicsMultiply.get(2).topicRus,
                allTopicsMultiply.get(2).h2Rus, allTopicsMultiply.get(2).shortProblemDescriptionRus, allTopicsMultiply.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus,
                allTopicsMultiply.get(3).numbersRangeStart, allTopicsMultiply.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeRus, allTopicsMultiply.get(3).totalPageOfWorksheets, allTopicsMultiply.get(3).topicRus,
                allTopicsMultiply.get(3).h2Rus, allTopicsMultiply.get(3).shortProblemDescriptionRus, allTopicsMultiply.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus,
                allTopicsMultiply.get(4).numbersRangeStart, allTopicsMultiply.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeRus, allTopicsMultiply.get(4).totalPageOfWorksheets, allTopicsMultiply.get(4).topicRus,
                allTopicsMultiply.get(4).h2Rus, allTopicsMultiply.get(4).shortProblemDescriptionRus, allTopicsMultiply.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus,
                allTopicsMultiply.get(5).numbersRangeStart, allTopicsMultiply.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeRus, allTopicsMultiply.get(5).totalPageOfWorksheets, allTopicsMultiply.get(5).topicRus,
                allTopicsMultiply.get(5).h2Rus, allTopicsMultiply.get(5).shortProblemDescriptionRus, allTopicsMultiply.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus,
                allTopicsMultiply.get(6).numbersRangeStart, allTopicsMultiply.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeRus, allTopicsMultiply.get(6).totalPageOfWorksheets, allTopicsMultiply.get(6).topicRus,
                allTopicsMultiply.get(6).h2Rus, allTopicsMultiply.get(6).shortProblemDescriptionRus, allTopicsMultiply.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus,
                allTopicsMultiply.get(7).numbersRangeStart, allTopicsMultiply.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeRus, allTopicsMultiply.get(7).totalPageOfWorksheets, allTopicsMultiply.get(7).topicRus,
                allTopicsMultiply.get(7).h2Rus, allTopicsMultiply.get(7).shortProblemDescriptionRus, allTopicsMultiply.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus,
                allTopicsMultiply.get(8).numbersRangeStart, allTopicsMultiply.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeRus, allTopicsMultiply.get(8).totalPageOfWorksheets, allTopicsMultiply.get(8).topicRus,
                allTopicsMultiply.get(8).h2Rus, allTopicsMultiply.get(8).shortProblemDescriptionRus, allTopicsMultiply.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus,
                allTopicsMultiply.get(9).numbersRangeStart, allTopicsMultiply.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeRus, allTopicsMultiply.get(9).totalPageOfWorksheets, allTopicsMultiply.get(9).topicRus,
                allTopicsMultiply.get(9).h2Rus, allTopicsMultiply.get(9).shortProblemDescriptionRus, allTopicsMultiply.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus,
                allTopicsMultiply.get(10).numbersRangeStart, allTopicsMultiply.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeRus, allTopicsMultiply.get(10).totalPageOfWorksheets, allTopicsMultiply.get(10).topicRus,
                allTopicsMultiply.get(10).h2Rus, allTopicsMultiply.get(10).shortProblemDescriptionRus, allTopicsMultiply.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus,
                allTopicsMultiply.get(11).numbersRangeStart, allTopicsMultiply.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeRus, allTopicsMultiply.get(11).totalPageOfWorksheets, allTopicsMultiply.get(11).topicRus,
                allTopicsMultiply.get(11).h2Rus, allTopicsMultiply.get(11).shortProblemDescriptionRus, allTopicsMultiply.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus,
                allTopicsMultiply.get(12).numbersRangeStart, allTopicsMultiply.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeRus, allTopicsMultiply.get(12).totalPageOfWorksheets, allTopicsMultiply.get(12).topicRus,
                allTopicsMultiply.get(12).h2Rus, allTopicsMultiply.get(12).shortProblemDescriptionRus, allTopicsMultiply.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus,
                allTopicsMultiply.get(13).numbersRangeStart, allTopicsMultiply.get(13).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeRus, allTopicsMultiply.get(13).totalPageOfWorksheets, allTopicsMultiply.get(13).topicRus,
                allTopicsMultiply.get(13).h2Rus, allTopicsMultiply.get(13).shortProblemDescriptionRus, allTopicsMultiply.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus,
                allTopicsMultiply.get(14).numbersRangeStart, allTopicsMultiply.get(14).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeRus, allTopicsMultiply.get(14).totalPageOfWorksheets, allTopicsMultiply.get(14).topicRus,
                allTopicsMultiply.get(14).h2Rus, allTopicsMultiply.get(14).shortProblemDescriptionRus, allTopicsMultiply.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus,
                allTopicsMultiply.get(15).numbersRangeStart, allTopicsMultiply.get(15).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeRus, allTopicsMultiply.get(15).totalPageOfWorksheets, allTopicsMultiply.get(15).topicRus,
                allTopicsMultiply.get(15).h2Rus, allTopicsMultiply.get(15).shortProblemDescriptionRus, allTopicsMultiply.get(15).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus,
                allTopicsMultiply.get(16).numbersRangeStart, allTopicsMultiply.get(16).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeRus, allTopicsMultiply.get(16).totalPageOfWorksheets, allTopicsMultiply.get(16).topicRus,
                allTopicsMultiply.get(16).h2Rus, allTopicsMultiply.get(16).shortProblemDescriptionRus, allTopicsMultiply.get(16).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus,
                allTopicsMultiply.get(17).numbersRangeStart, allTopicsMultiply.get(17).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeRus, allTopicsMultiply.get(17).totalPageOfWorksheets, allTopicsMultiply.get(17).topicRus,
                allTopicsMultiply.get(17).h2Rus, allTopicsMultiply.get(17).shortProblemDescriptionRus, allTopicsMultiply.get(17).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus,
                allTopicsMultiply.get(18).numbersRangeStart, allTopicsMultiply.get(18).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeRus, allTopicsMultiply.get(18).totalPageOfWorksheets, allTopicsMultiply.get(18).topicRus,
                allTopicsMultiply.get(18).h2Rus, allTopicsMultiply.get(18).shortProblemDescriptionRus, allTopicsMultiply.get(18).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus,
                allTopicsMultiply.get(19).numbersRangeStart, allTopicsMultiply.get(19).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeRus, allTopicsMultiply.get(19).totalPageOfWorksheets, allTopicsMultiply.get(19).topicRus,
                allTopicsMultiply.get(19).h2Rus, allTopicsMultiply.get(19).shortProblemDescriptionRus, allTopicsMultiply.get(19).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus,
                allTopicsMultiply.get(20).numbersRangeStart, allTopicsMultiply.get(20).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeRus, allTopicsMultiply.get(20).totalPageOfWorksheets, allTopicsMultiply.get(20).topicRus,
                allTopicsMultiply.get(20).h2Rus, allTopicsMultiply.get(20).shortProblemDescriptionRus, allTopicsMultiply.get(20).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus,
                allTopicsMultiply.get(21).numbersRangeStart, allTopicsMultiply.get(21).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeRus, allTopicsMultiply.get(21).totalPageOfWorksheets, allTopicsMultiply.get(21).topicRus,
                allTopicsMultiply.get(21).h2Rus, allTopicsMultiply.get(21).shortProblemDescriptionRus, allTopicsMultiply.get(21).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng,
                allTopicsMultiply.get(0).numbersRangeStart, allTopicsMultiply.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets,
                allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(0).gradeEng, allTopicsMultiply.get(0).totalPageOfWorksheets, allTopicsMultiply.get(0).topicEng,
                allTopicsMultiply.get(0).h2Eng, allTopicsMultiply.get(0).shortProblemDescriptionEng, allTopicsMultiply.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng,
                allTopicsMultiply.get(1).numbersRangeStart, allTopicsMultiply.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets,
                allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(1).gradeEng, allTopicsMultiply.get(1).totalPageOfWorksheets, allTopicsMultiply.get(1).topicEng,
                allTopicsMultiply.get(1).h2Eng, allTopicsMultiply.get(1).shortProblemDescriptionEng, allTopicsMultiply.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng,
                allTopicsMultiply.get(2).numbersRangeStart, allTopicsMultiply.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets,
                allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(2).gradeEng, allTopicsMultiply.get(2).totalPageOfWorksheets, allTopicsMultiply.get(2).topicEng,
                allTopicsMultiply.get(2).h2Eng, allTopicsMultiply.get(2).shortProblemDescriptionEng, allTopicsMultiply.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng,
                allTopicsMultiply.get(3).numbersRangeStart, allTopicsMultiply.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets,
                allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(3).gradeEng, allTopicsMultiply.get(3).totalPageOfWorksheets, allTopicsMultiply.get(3).topicEng,
                allTopicsMultiply.get(3).h2Eng, allTopicsMultiply.get(3).shortProblemDescriptionEng, allTopicsMultiply.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng,
                allTopicsMultiply.get(4).numbersRangeStart, allTopicsMultiply.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets,
                allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(4).gradeEng, allTopicsMultiply.get(4).totalPageOfWorksheets, allTopicsMultiply.get(4).topicEng,
                allTopicsMultiply.get(4).h2Eng, allTopicsMultiply.get(4).shortProblemDescriptionEng, allTopicsMultiply.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng,
                allTopicsMultiply.get(5).numbersRangeStart, allTopicsMultiply.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets,
                allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(5).gradeEng, allTopicsMultiply.get(5).totalPageOfWorksheets, allTopicsMultiply.get(5).topicEng,
                allTopicsMultiply.get(5).h2Eng, allTopicsMultiply.get(5).shortProblemDescriptionEng, allTopicsMultiply.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng,
                allTopicsMultiply.get(6).numbersRangeStart, allTopicsMultiply.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets,
                allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(6).gradeEng, allTopicsMultiply.get(6).totalPageOfWorksheets, allTopicsMultiply.get(6).topicEng,
                allTopicsMultiply.get(6).h2Eng, allTopicsMultiply.get(6).shortProblemDescriptionEng, allTopicsMultiply.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng,
                allTopicsMultiply.get(7).numbersRangeStart, allTopicsMultiply.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets,
                allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(7).gradeEng, allTopicsMultiply.get(7).totalPageOfWorksheets, allTopicsMultiply.get(7).topicEng,
                allTopicsMultiply.get(7).h2Eng, allTopicsMultiply.get(7).shortProblemDescriptionEng, allTopicsMultiply.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng,
                allTopicsMultiply.get(8).numbersRangeStart, allTopicsMultiply.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets,
                allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(8).gradeEng, allTopicsMultiply.get(8).totalPageOfWorksheets, allTopicsMultiply.get(8).topicEng,
                allTopicsMultiply.get(8).h2Eng, allTopicsMultiply.get(8).shortProblemDescriptionEng, allTopicsMultiply.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng,
                allTopicsMultiply.get(9).numbersRangeStart, allTopicsMultiply.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets,
                allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(9).gradeEng, allTopicsMultiply.get(9).totalPageOfWorksheets, allTopicsMultiply.get(9).topicEng,
                allTopicsMultiply.get(9).h2Eng, allTopicsMultiply.get(9).shortProblemDescriptionEng, allTopicsMultiply.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng,
                allTopicsMultiply.get(10).numbersRangeStart, allTopicsMultiply.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets,
                allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(10).gradeEng, allTopicsMultiply.get(10).totalPageOfWorksheets, allTopicsMultiply.get(10).topicEng,
                allTopicsMultiply.get(10).h2Eng, allTopicsMultiply.get(10).shortProblemDescriptionEng, allTopicsMultiply.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng,
                allTopicsMultiply.get(11).numbersRangeStart, allTopicsMultiply.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets,
                allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(11).gradeEng, allTopicsMultiply.get(11).totalPageOfWorksheets, allTopicsMultiply.get(11).topicEng,
                allTopicsMultiply.get(11).h2Eng, allTopicsMultiply.get(11).shortProblemDescriptionEng, allTopicsMultiply.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng,
                allTopicsMultiply.get(12).numbersRangeStart, allTopicsMultiply.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets,
                allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(12).gradeEng, allTopicsMultiply.get(12).totalPageOfWorksheets, allTopicsMultiply.get(12).topicEng,
                allTopicsMultiply.get(12).h2Eng, allTopicsMultiply.get(12).shortProblemDescriptionEng, allTopicsMultiply.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng,
                allTopicsMultiply.get(13).numbersRangeStart, allTopicsMultiply.get(13).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets,
                allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(13).gradeEng, allTopicsMultiply.get(13).totalPageOfWorksheets, allTopicsMultiply.get(13).topicEng,
                allTopicsMultiply.get(13).h2Eng, allTopicsMultiply.get(13).shortProblemDescriptionEng, allTopicsMultiply.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng,
                allTopicsMultiply.get(14).numbersRangeStart, allTopicsMultiply.get(14).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets,
                allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(14).gradeEng, allTopicsMultiply.get(14).totalPageOfWorksheets, allTopicsMultiply.get(14).topicEng,
                allTopicsMultiply.get(14).h2Eng, allTopicsMultiply.get(14).shortProblemDescriptionEng, allTopicsMultiply.get(14).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng,
                allTopicsMultiply.get(15).numbersRangeStart, allTopicsMultiply.get(15).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets,
                allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(15).gradeEng, allTopicsMultiply.get(15).totalPageOfWorksheets, allTopicsMultiply.get(15).topicEng,
                allTopicsMultiply.get(15).h2Eng, allTopicsMultiply.get(15).shortProblemDescriptionEng, allTopicsMultiply.get(15).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng,
                allTopicsMultiply.get(16).numbersRangeStart, allTopicsMultiply.get(16).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets,
                allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(16).gradeEng, allTopicsMultiply.get(16).totalPageOfWorksheets, allTopicsMultiply.get(16).topicEng,
                allTopicsMultiply.get(16).h2Eng, allTopicsMultiply.get(16).shortProblemDescriptionEng, allTopicsMultiply.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng,
                allTopicsMultiply.get(17).numbersRangeStart, allTopicsMultiply.get(17).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets,
                allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(17).gradeEng, allTopicsMultiply.get(17).totalPageOfWorksheets, allTopicsMultiply.get(17).topicEng,
                allTopicsMultiply.get(17).h2Eng, allTopicsMultiply.get(17).shortProblemDescriptionEng, allTopicsMultiply.get(17).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng,
                allTopicsMultiply.get(18).numbersRangeStart, allTopicsMultiply.get(18).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets,
                allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(18).gradeEng, allTopicsMultiply.get(18).totalPageOfWorksheets, allTopicsMultiply.get(18).topicEng,
                allTopicsMultiply.get(18).h2Eng, allTopicsMultiply.get(18).shortProblemDescriptionEng, allTopicsMultiply.get(18).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng,
                allTopicsMultiply.get(19).numbersRangeStart, allTopicsMultiply.get(19).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets,
                allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(19).gradeEng, allTopicsMultiply.get(19).totalPageOfWorksheets, allTopicsMultiply.get(19).topicEng,
                allTopicsMultiply.get(19).h2Eng, allTopicsMultiply.get(19).shortProblemDescriptionEng, allTopicsMultiply.get(19).longProblemDescriptionEng);



        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng,
                allTopicsMultiply.get(20).numbersRangeStart, allTopicsMultiply.get(20).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets,
                allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(20).gradeEng, allTopicsMultiply.get(20).totalPageOfWorksheets, allTopicsMultiply.get(20).topicEng,
                allTopicsMultiply.get(20).h2Eng, allTopicsMultiply.get(20).shortProblemDescriptionEng, allTopicsMultiply.get(20).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng );
        Matrix.multiplyA1_B1LineWorksheetA4(General.workingFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng,
                allTopicsMultiply.get(21).numbersRangeStart, allTopicsMultiply.get(21).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets,
                allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsMultiply.get(21).gradeEng, allTopicsMultiply.get(21).totalPageOfWorksheets, allTopicsMultiply.get(21).topicEng,
                allTopicsMultiply.get(21).h2Eng, allTopicsMultiply.get(21).shortProblemDescriptionEng, allTopicsMultiply.get(21).longProblemDescriptionEng);
    }
}
