package mathpackage.multiplicationdivision;

import mathpackage.General;
import mathpackage.Matrix;
import mathpackage.WorksheetTemplate;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class generating Multiplication topics
 * @ Grigorii Andreev
 * Date: 03 January
 */

public class MultiplicationWorksheets extends WorksheetTemplate {

    public MultiplicationWorksheets(
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

        General.emptyAllFolders();

        List<MultiplicationWorksheets> multiplicationWorksheets = new ArrayList<>();

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 0.", "Multiplication 0 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 0 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 0.",
                "Multiplication. Multiply 0 by numbers.",
                "Умножь число 0 на заданное число.",
                "Multiply 0 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 1.", "Multiplication 1 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 1.",
                "Multiplication. Multiply 1 by numbers.",
                "Умножь число 1 на заданное число.",
                "Multiply 1 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 2.", "Multiplication 2 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 0.",
                "Multiplication. Multiply 2 by numbers.",
                "Умножь число 2 на заданное число.",
                "Multiply 2 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 3.", "Multiplication 3 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 3.",
                "Multiplication. Multiply 3 by numbers.",
                "Умножь число 3 на заданное число.",
                "Multiply 3 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 4.", "Multiplication 4 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 4 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 4.",
                "Multiplication. Multiply 4 by numbers.",
                "Умножь число 4 на заданное число.",
                "Multiply 4 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 0.", "Multiplication 5 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 5 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 5.",
                "Multiplication. Multiply 5 by numbers.",
                "Умножь число 5 на заданное число.",
                "Multiply 5 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 0.", "Multiplication 6 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 6 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 6.",
                "Multiplication. Multiply 6 by numbers.",
                "Умножь число 6 на заданное число.",
                "Multiply 6 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 7.", "Multiplication 7 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 7 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 7.",
                "Multiplication. Multiply 7 by numbers.",
                "Умножь число 7 на заданное число.",
                "Multiply 7 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 8.", "Multiplication 8 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 8 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 8.",
                "Multiplication. Multiply 8 by numbers.",
                "Умножь число 8 на заданное число.",
                "Multiply 8 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 9.", "Multiplication 9 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 9 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 9.",
                "Multiplication. Multiply 9 by numbers.",
                "Умножь число 9 на заданное число.",
                "Multiply 9 by numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение числа 10.", "Multiplication 10 by numbers.",
                "Задачи по математике на тему:<br />Умножение числа 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 10 by numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение числа 10.",
                "Multiplication. Multiply 10 by numbers.",
                "Умножь число 10 на заданное число.",
                "Multiply 10 by numbers.",
                0, 9, 6));


        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 0.", "Multiplication 0 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 0 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 0.",
                "Multiplication. Multiply 0 by a 1 digit numbers.",
                "Умножь число 0 на заданное однозначное число.",
                "Multiply 0 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 1.", "Multiplication 1 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 1 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 1.",
                "Multiplication. Multiply 1 by a 1 digit numbers.",
                "Умножь число 1 на заданное однозначное число.",
                "Multiply 1 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 2.", "Multiplication 2 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 2 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 0.",
                "Multiplication. Multiply 2 by a 1 digit numbers.",
                "Умножь число 2 на заданное однозначное число.",
                "Multiply 2 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 3.", "Multiplication 3 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 3 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 3.",
                "Multiplication. Multiply 3 by a 1 digit numbers.",
                "Умножь число 3 на заданное однозначное число.",
                "Multiply 3 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 4.", "Multiplication 4 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 4 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 4.",
                "Multiplication. Multiply 4 by a 1 digit numbers.",
                "Умножь число 4 на заданное однозначное число.",
                "Multiply 4 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 5.", "Multiplication 5 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 5 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 5.",
                "Multiplication. Multiply 5 by a 1 digit numbers.",
                "Умножь число 5 на заданное однозначное число.",
                "Multiply 5 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 6.", "Multiplication 6 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 6 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 6.",
                "Multiplication. Multiply 6 by a 1 digit numbers.",
                "Умножь число 6 на заданное однозначное число.",
                "Multiply 6 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 7.", "Multiplication 7 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 7 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 7.",
                "Multiplication. Multiply 7 by a 1 digit numbers.",
                "Умножь число 7 на заданное однозначное число.",
                "Multiply 7 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 8.", "Multiplication 8 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 8 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 8.",
                "Multiplication. Multiply 8 by a 1 digit numbers.",
                "Умножь число 8 на заданное однозначное число.",
                "Multiply 8 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 9.", "Multiplication 9 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 9 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 9.",
                "Multiplication. Multiply 9 by a 1 digit numbers.",
                "Умножь число 9 на заданное однозначное число.",
                "Multiply 9 by a 1 digit numbers.",
                0, 9, 6));

        multiplicationWorksheets.add(new MultiplicationWorksheets(
                "", "&nbsp",
                "Умножение однозначного числа на число 10.", "Multiplication 10 by a 1 digit numbers.",
                "Задачи по математике на тему:<br />Умножение однозначного числа на число 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Multiply 10 by a 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Умножение. Умножение однозначного числа на число 10.",
                "Multiplication. Multiply 10 by a 1 digit numbers.",
                "Умножь число 10 на заданное однозначное число.",
                "Multiply 10 by a 1 digit numbers.",
                0, 9, 6));

//Multiplication in line
        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus,
                multiplicationWorksheets.get(0).numbersRangeStart, multiplicationWorksheets.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeRus, multiplicationWorksheets.get(0).totalPageOfWorksheets, multiplicationWorksheets.get(0).topicRus,
                multiplicationWorksheets.get(0).h2Rus, multiplicationWorksheets.get(0).shortProblemDescriptionRus, multiplicationWorksheets.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus,
                multiplicationWorksheets.get(1).numbersRangeStart, multiplicationWorksheets.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeRus, multiplicationWorksheets.get(1).totalPageOfWorksheets, multiplicationWorksheets.get(1).topicRus,
                multiplicationWorksheets.get(1).h2Rus, multiplicationWorksheets.get(1).shortProblemDescriptionRus, multiplicationWorksheets.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus,
                multiplicationWorksheets.get(2).numbersRangeStart, multiplicationWorksheets.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeRus, multiplicationWorksheets.get(2).totalPageOfWorksheets, multiplicationWorksheets.get(2).topicRus,
                multiplicationWorksheets.get(2).h2Rus, multiplicationWorksheets.get(2).shortProblemDescriptionRus, multiplicationWorksheets.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus,
                multiplicationWorksheets.get(3).numbersRangeStart, multiplicationWorksheets.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeRus, multiplicationWorksheets.get(3).totalPageOfWorksheets, multiplicationWorksheets.get(3).topicRus,
                multiplicationWorksheets.get(3).h2Rus, multiplicationWorksheets.get(3).shortProblemDescriptionRus, multiplicationWorksheets.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus,
                multiplicationWorksheets.get(4).numbersRangeStart, multiplicationWorksheets.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeRus, multiplicationWorksheets.get(4).totalPageOfWorksheets, multiplicationWorksheets.get(4).topicRus,
                multiplicationWorksheets.get(4).h2Rus, multiplicationWorksheets.get(4).shortProblemDescriptionRus, multiplicationWorksheets.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus,
                multiplicationWorksheets.get(5).numbersRangeStart, multiplicationWorksheets.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeRus, multiplicationWorksheets.get(5).totalPageOfWorksheets, multiplicationWorksheets.get(5).topicRus,
                multiplicationWorksheets.get(5).h2Rus, multiplicationWorksheets.get(5).shortProblemDescriptionRus, multiplicationWorksheets.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus,
                multiplicationWorksheets.get(6).numbersRangeStart, multiplicationWorksheets.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeRus, multiplicationWorksheets.get(6).totalPageOfWorksheets, multiplicationWorksheets.get(6).topicRus,
                multiplicationWorksheets.get(6).h2Rus, multiplicationWorksheets.get(6).shortProblemDescriptionRus, multiplicationWorksheets.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus,
                multiplicationWorksheets.get(7).numbersRangeStart, multiplicationWorksheets.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeRus, multiplicationWorksheets.get(7).totalPageOfWorksheets, multiplicationWorksheets.get(7).topicRus,
                multiplicationWorksheets.get(7).h2Rus, multiplicationWorksheets.get(7).shortProblemDescriptionRus, multiplicationWorksheets.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus,
                multiplicationWorksheets.get(8).numbersRangeStart, multiplicationWorksheets.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeRus, multiplicationWorksheets.get(8).totalPageOfWorksheets, multiplicationWorksheets.get(8).topicRus,
                multiplicationWorksheets.get(8).h2Rus, multiplicationWorksheets.get(8).shortProblemDescriptionRus, multiplicationWorksheets.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus,
                multiplicationWorksheets.get(9).numbersRangeStart, multiplicationWorksheets.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeRus, multiplicationWorksheets.get(9).totalPageOfWorksheets, multiplicationWorksheets.get(9).topicRus,
                multiplicationWorksheets.get(9).h2Rus, multiplicationWorksheets.get(9).shortProblemDescriptionRus, multiplicationWorksheets.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus,
                multiplicationWorksheets.get(10).numbersRangeStart, multiplicationWorksheets.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeRus, multiplicationWorksheets.get(10).totalPageOfWorksheets, multiplicationWorksheets.get(10).topicRus,
                multiplicationWorksheets.get(10).h2Rus, multiplicationWorksheets.get(10).shortProblemDescriptionRus, multiplicationWorksheets.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus,
                multiplicationWorksheets.get(11).numbersRangeStart, multiplicationWorksheets.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeRus, multiplicationWorksheets.get(11).totalPageOfWorksheets, multiplicationWorksheets.get(11).topicRus,
                multiplicationWorksheets.get(11).h2Rus, multiplicationWorksheets.get(11).shortProblemDescriptionRus, multiplicationWorksheets.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus,
                multiplicationWorksheets.get(12).numbersRangeStart, multiplicationWorksheets.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeRus, multiplicationWorksheets.get(12).totalPageOfWorksheets, multiplicationWorksheets.get(12).topicRus,
                multiplicationWorksheets.get(12).h2Rus, multiplicationWorksheets.get(12).shortProblemDescriptionRus, multiplicationWorksheets.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus,
                multiplicationWorksheets.get(13).numbersRangeStart, multiplicationWorksheets.get(13).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeRus, multiplicationWorksheets.get(13).totalPageOfWorksheets, multiplicationWorksheets.get(13).topicRus,
                multiplicationWorksheets.get(13).h2Rus, multiplicationWorksheets.get(13).shortProblemDescriptionRus, multiplicationWorksheets.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus,
                multiplicationWorksheets.get(14).numbersRangeStart, multiplicationWorksheets.get(14).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeRus, multiplicationWorksheets.get(14).totalPageOfWorksheets, multiplicationWorksheets.get(14).topicRus,
                multiplicationWorksheets.get(14).h2Rus, multiplicationWorksheets.get(14).shortProblemDescriptionRus, multiplicationWorksheets.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus,
                multiplicationWorksheets.get(15).numbersRangeStart, multiplicationWorksheets.get(15).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeRus, multiplicationWorksheets.get(15).totalPageOfWorksheets, multiplicationWorksheets.get(15).topicRus,
                multiplicationWorksheets.get(15).h2Rus, multiplicationWorksheets.get(15).shortProblemDescriptionRus, multiplicationWorksheets.get(15).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus,
                multiplicationWorksheets.get(16).numbersRangeStart, multiplicationWorksheets.get(16).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeRus, multiplicationWorksheets.get(16).totalPageOfWorksheets, multiplicationWorksheets.get(16).topicRus,
                multiplicationWorksheets.get(16).h2Rus, multiplicationWorksheets.get(16).shortProblemDescriptionRus, multiplicationWorksheets.get(16).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus,
                multiplicationWorksheets.get(17).numbersRangeStart, multiplicationWorksheets.get(17).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeRus, multiplicationWorksheets.get(17).totalPageOfWorksheets, multiplicationWorksheets.get(17).topicRus,
                multiplicationWorksheets.get(17).h2Rus, multiplicationWorksheets.get(17).shortProblemDescriptionRus, multiplicationWorksheets.get(17).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus,
                multiplicationWorksheets.get(18).numbersRangeStart, multiplicationWorksheets.get(18).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeRus, multiplicationWorksheets.get(18).totalPageOfWorksheets, multiplicationWorksheets.get(18).topicRus,
                multiplicationWorksheets.get(18).h2Rus, multiplicationWorksheets.get(18).shortProblemDescriptionRus, multiplicationWorksheets.get(18).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus,
                multiplicationWorksheets.get(19).numbersRangeStart, multiplicationWorksheets.get(19).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeRus, multiplicationWorksheets.get(19).totalPageOfWorksheets, multiplicationWorksheets.get(19).topicRus,
                multiplicationWorksheets.get(19).h2Rus, multiplicationWorksheets.get(19).shortProblemDescriptionRus, multiplicationWorksheets.get(19).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus,
                multiplicationWorksheets.get(20).numbersRangeStart, multiplicationWorksheets.get(20).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeRus, multiplicationWorksheets.get(20).totalPageOfWorksheets, multiplicationWorksheets.get(20).topicRus,
                multiplicationWorksheets.get(20).h2Rus, multiplicationWorksheets.get(20).shortProblemDescriptionRus, multiplicationWorksheets.get(20).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus,
                multiplicationWorksheets.get(21).numbersRangeStart, multiplicationWorksheets.get(21).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeRus, multiplicationWorksheets.get(21).totalPageOfWorksheets, multiplicationWorksheets.get(21).topicRus,
                multiplicationWorksheets.get(21).h2Rus, multiplicationWorksheets.get(21).shortProblemDescriptionRus, multiplicationWorksheets.get(21).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng,
                multiplicationWorksheets.get(0).numbersRangeStart, multiplicationWorksheets.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets,
                multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(0).gradeEng, multiplicationWorksheets.get(0).totalPageOfWorksheets, multiplicationWorksheets.get(0).topicEng,
                multiplicationWorksheets.get(0).h2Eng, multiplicationWorksheets.get(0).shortProblemDescriptionEng, multiplicationWorksheets.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng,
                multiplicationWorksheets.get(1).numbersRangeStart, multiplicationWorksheets.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets,
                multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(1).gradeEng, multiplicationWorksheets.get(1).totalPageOfWorksheets, multiplicationWorksheets.get(1).topicEng,
                multiplicationWorksheets.get(1).h2Eng, multiplicationWorksheets.get(1).shortProblemDescriptionEng, multiplicationWorksheets.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng,
                multiplicationWorksheets.get(2).numbersRangeStart, multiplicationWorksheets.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets,
                multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(2).gradeEng, multiplicationWorksheets.get(2).totalPageOfWorksheets, multiplicationWorksheets.get(2).topicEng,
                multiplicationWorksheets.get(2).h2Eng, multiplicationWorksheets.get(2).shortProblemDescriptionEng, multiplicationWorksheets.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng,
                multiplicationWorksheets.get(3).numbersRangeStart, multiplicationWorksheets.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets,
                multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(3).gradeEng, multiplicationWorksheets.get(3).totalPageOfWorksheets, multiplicationWorksheets.get(3).topicEng,
                multiplicationWorksheets.get(3).h2Eng, multiplicationWorksheets.get(3).shortProblemDescriptionEng, multiplicationWorksheets.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng,
                multiplicationWorksheets.get(4).numbersRangeStart, multiplicationWorksheets.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets,
                multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(4).gradeEng, multiplicationWorksheets.get(4).totalPageOfWorksheets, multiplicationWorksheets.get(4).topicEng,
                multiplicationWorksheets.get(4).h2Eng, multiplicationWorksheets.get(4).shortProblemDescriptionEng, multiplicationWorksheets.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng,
                multiplicationWorksheets.get(5).numbersRangeStart, multiplicationWorksheets.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets,
                multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(5).gradeEng, multiplicationWorksheets.get(5).totalPageOfWorksheets, multiplicationWorksheets.get(5).topicEng,
                multiplicationWorksheets.get(5).h2Eng, multiplicationWorksheets.get(5).shortProblemDescriptionEng, multiplicationWorksheets.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng,
                multiplicationWorksheets.get(6).numbersRangeStart, multiplicationWorksheets.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets,
                multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(6).gradeEng, multiplicationWorksheets.get(6).totalPageOfWorksheets, multiplicationWorksheets.get(6).topicEng,
                multiplicationWorksheets.get(6).h2Eng, multiplicationWorksheets.get(6).shortProblemDescriptionEng, multiplicationWorksheets.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng,
                multiplicationWorksheets.get(7).numbersRangeStart, multiplicationWorksheets.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets,
                multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(7).gradeEng, multiplicationWorksheets.get(7).totalPageOfWorksheets, multiplicationWorksheets.get(7).topicEng,
                multiplicationWorksheets.get(7).h2Eng, multiplicationWorksheets.get(7).shortProblemDescriptionEng, multiplicationWorksheets.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng,
                multiplicationWorksheets.get(8).numbersRangeStart, multiplicationWorksheets.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets,
                multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(8).gradeEng, multiplicationWorksheets.get(8).totalPageOfWorksheets, multiplicationWorksheets.get(8).topicEng,
                multiplicationWorksheets.get(8).h2Eng, multiplicationWorksheets.get(8).shortProblemDescriptionEng, multiplicationWorksheets.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng,
                multiplicationWorksheets.get(9).numbersRangeStart, multiplicationWorksheets.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets,
                multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(9).gradeEng, multiplicationWorksheets.get(9).totalPageOfWorksheets, multiplicationWorksheets.get(9).topicEng,
                multiplicationWorksheets.get(9).h2Eng, multiplicationWorksheets.get(9).shortProblemDescriptionEng, multiplicationWorksheets.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng,
                multiplicationWorksheets.get(10).numbersRangeStart, multiplicationWorksheets.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets,
                multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(10).gradeEng, multiplicationWorksheets.get(10).totalPageOfWorksheets, multiplicationWorksheets.get(10).topicEng,
                multiplicationWorksheets.get(10).h2Eng, multiplicationWorksheets.get(10).shortProblemDescriptionEng, multiplicationWorksheets.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng,
                multiplicationWorksheets.get(11).numbersRangeStart, multiplicationWorksheets.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets,
                multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(11).gradeEng, multiplicationWorksheets.get(11).totalPageOfWorksheets, multiplicationWorksheets.get(11).topicEng,
                multiplicationWorksheets.get(11).h2Eng, multiplicationWorksheets.get(11).shortProblemDescriptionEng, multiplicationWorksheets.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng,
                multiplicationWorksheets.get(12).numbersRangeStart, multiplicationWorksheets.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets,
                multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(12).gradeEng, multiplicationWorksheets.get(12).totalPageOfWorksheets, multiplicationWorksheets.get(12).topicEng,
                multiplicationWorksheets.get(12).h2Eng, multiplicationWorksheets.get(12).shortProblemDescriptionEng, multiplicationWorksheets.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng,
                multiplicationWorksheets.get(13).numbersRangeStart, multiplicationWorksheets.get(13).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets,
                multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(13).gradeEng, multiplicationWorksheets.get(13).totalPageOfWorksheets, multiplicationWorksheets.get(13).topicEng,
                multiplicationWorksheets.get(13).h2Eng, multiplicationWorksheets.get(13).shortProblemDescriptionEng, multiplicationWorksheets.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng,
                multiplicationWorksheets.get(14).numbersRangeStart, multiplicationWorksheets.get(14).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets,
                multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(14).gradeEng, multiplicationWorksheets.get(14).totalPageOfWorksheets, multiplicationWorksheets.get(14).topicEng,
                multiplicationWorksheets.get(14).h2Eng, multiplicationWorksheets.get(14).shortProblemDescriptionEng, multiplicationWorksheets.get(14).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng,
                multiplicationWorksheets.get(15).numbersRangeStart, multiplicationWorksheets.get(15).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets,
                multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(15).gradeEng, multiplicationWorksheets.get(15).totalPageOfWorksheets, multiplicationWorksheets.get(15).topicEng,
                multiplicationWorksheets.get(15).h2Eng, multiplicationWorksheets.get(15).shortProblemDescriptionEng, multiplicationWorksheets.get(15).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng,
                multiplicationWorksheets.get(16).numbersRangeStart, multiplicationWorksheets.get(16).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets,
                multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(16).gradeEng, multiplicationWorksheets.get(16).totalPageOfWorksheets, multiplicationWorksheets.get(16).topicEng,
                multiplicationWorksheets.get(16).h2Eng, multiplicationWorksheets.get(16).shortProblemDescriptionEng, multiplicationWorksheets.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng,
                multiplicationWorksheets.get(17).numbersRangeStart, multiplicationWorksheets.get(17).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets,
                multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(17).gradeEng, multiplicationWorksheets.get(17).totalPageOfWorksheets, multiplicationWorksheets.get(17).topicEng,
                multiplicationWorksheets.get(17).h2Eng, multiplicationWorksheets.get(17).shortProblemDescriptionEng, multiplicationWorksheets.get(17).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng,
                multiplicationWorksheets.get(18).numbersRangeStart, multiplicationWorksheets.get(18).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets,
                multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(18).gradeEng, multiplicationWorksheets.get(18).totalPageOfWorksheets, multiplicationWorksheets.get(18).topicEng,
                multiplicationWorksheets.get(18).h2Eng, multiplicationWorksheets.get(18).shortProblemDescriptionEng, multiplicationWorksheets.get(18).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng,
                multiplicationWorksheets.get(19).numbersRangeStart, multiplicationWorksheets.get(19).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets,
                multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(19).gradeEng, multiplicationWorksheets.get(19).totalPageOfWorksheets, multiplicationWorksheets.get(19).topicEng,
                multiplicationWorksheets.get(19).h2Eng, multiplicationWorksheets.get(19).shortProblemDescriptionEng, multiplicationWorksheets.get(19).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng,
                multiplicationWorksheets.get(20).numbersRangeStart, multiplicationWorksheets.get(20).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets,
                multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(20).gradeEng, multiplicationWorksheets.get(20).totalPageOfWorksheets, multiplicationWorksheets.get(20).topicEng,
                multiplicationWorksheets.get(20).h2Eng, multiplicationWorksheets.get(20).shortProblemDescriptionEng, multiplicationWorksheets.get(20).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        multiplyA1_B1LineWorksheetA4(General.workingFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng,
                multiplicationWorksheets.get(21).numbersRangeStart, multiplicationWorksheets.get(21).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets,
                multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationWorksheets.get(21).gradeEng, multiplicationWorksheets.get(21).totalPageOfWorksheets, multiplicationWorksheets.get(21).topicEng,
                multiplicationWorksheets.get(21).h2Eng, multiplicationWorksheets.get(21).shortProblemDescriptionEng, multiplicationWorksheets.get(21).longProblemDescriptionEng);

        General.finalRenameFiles("d:/Java_Math/Html/");
        General.finalRenameFiles("d:/Java_Math/Pdf");

    }

    public static void multiplyA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers,
                                                    String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                    int numbersRangeStart, int numbersRangeEnd, int sum,
                                                    int problemsLines, int problemsCols) throws IOException {

        int pageNumber;
        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) ((Math.random() * numbersRangeEnd) + numbersRangeStart);
                    argument2[i][j] = (int) (((Math.random() * numbersRangeEnd)) + numbersRangeStart);
                }
            if (longTaskNameWorksheet.contains("Умножь число 0") || longTaskNameWorksheet.contains("Multiply 0 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 1") || longTaskNameWorksheet.contains("Multiply 1 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 2") || longTaskNameWorksheet.contains("Multiply 2 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 3") || longTaskNameWorksheet.contains("Multiply 3 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 4") || longTaskNameWorksheet.contains("Multiply 4 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 5") || longTaskNameWorksheet.contains("Multiply 5 from")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 6") || longTaskNameWorksheet.contains("Multiply 6 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 7") || longTaskNameWorksheet.contains("Multiply 7 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 8") || longTaskNameWorksheet.contains("Multiply 8 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 9") || longTaskNameWorksheet.contains("Multiply 9 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("Умножь число 10") || longTaskNameWorksheet.contains("Multiply 10 to")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }


            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
            FileWriter fileAnswerWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");

            for (int i = 0; i < problemsLines; i++) {
                for (int j = 0; j < problemsCols; j++) {
                    fileWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " &#215; " + argument2[i][j]
                            + " = ____ &nbsp; &nbsp; &nbsp; ");
                    fileAnswerWriter.write(" &nbsp; " + ((i * problemsCols) + (j + 1)) + ") &nbsp;" + argument1[i][j] + " + " + argument2[i][j]
                            + " = " + (argument1[i][j] * argument2[i][j]) + " &nbsp; ");
                }
                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }


}

