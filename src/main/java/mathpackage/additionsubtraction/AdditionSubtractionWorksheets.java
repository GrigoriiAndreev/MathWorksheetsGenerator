package mathpackage.additionsubtraction;

import mathpackage.General;
import mathpackage.Matrix;
import mathpackage.WorksheetTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Class generating Addition and Subtraction in column topics. Part 1
 * Author: Grigorii Andreev
 * Date: 03 January 2021
 */

public class AdditionSubtractionWorksheets extends WorksheetTemplate {

    public AdditionSubtractionWorksheets(
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

        //Addition and Subtraction in line

        List<AdditionSubtractionWorksheets> additionSubtractionWorksheets = new ArrayList<>();

        General.emptyAllFolders();

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 0.", "Addition and subtraction 0 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 0 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 0.",
                "Addition and Subtraction. Add or subtract 0 from a number.",
                "Сложи или вычти число 0 из заданного числа.",
                "Add or subtract 0 from a number.",
                0, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 1.", "Addition and subtraction 1 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 1 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 1.",
                "Addition and Subtraction. Add or subtract 1 from a number.",
                "Сложи или вычти число 1 из заданного числа.",
                "Add or subtract 1 from a number.",
                1, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 2.", "Addition and subtraction 2 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 2 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 0.",
                "Addition and Subtraction. Add or subtract 2 from a number.",
                "Сложи или вычти число 2 из заданного числа.",
                "Add or subtract 2 from a number.",
                2, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 3.", "Addition and subtraction 3 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 3 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 3.",
                "Addition and Subtraction. Add or subtract 3 from a number.",
                "Сложи или вычти число 3 из заданного числа.",
                "Add or subtract 3 from a number.",
                3, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 4.", "Addition and subtraction 4 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 4 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 4.",
                "Addition and Subtraction. Add or subtract 4 from a number.",
                "Сложи или вычти число 4 из заданного числа.",
                "Add or subtract 4 from a number.",
                4, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 0.", "Addition and subtraction 5 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 5 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 5.",
                "Addition and Subtraction. Add or subtract 5 from a number.",
                "Сложи или вычти число 5 из заданного числа.",
                "Add or subtract 5 from a number.",
                5, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 0.", "Addition and subtraction 6 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 6 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 6.",
                "Addition and Subtraction. Add or subtract 6 from a number.",
                "Сложи или вычти число 6 из заданного числа.",
                "Add or subtract 6 from a number.",
                6, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 7.", "Addition and subtraction 7 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 7 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 7.",
                "Addition and Subtraction. Add or subtract 7 from a number.",
                "Сложи или вычти число 7 из заданного числа.",
                "Add or subtract 7 from a number.",
                7, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 8.", "Addition and subtraction 8 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 8 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 8.",
                "Addition and Subtraction. Add or subtract 8 from a number.",
                "Сложи или вычти число 8 из заданного числа.",
                "Add or subtract 8 from a number.",
                8, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 9.", "Addition and subtraction 9 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 9 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 9.",
                "Addition and Subtraction. Add or subtract 9 from a number.",
                "Сложи или вычти число 9 из заданного числа.",
                "Add or subtract 9 from a number.",
                9, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 10.", "Addition and subtraction 10 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание числа 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 10 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание числа 10.",
                "Addition and Subtraction. Add or subtract 10 from a number.",
                "Сложи или вычти число 10 из заданного числа.",
                "Add or subtract 10 from a number.",
                10, 99, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание чисел в пределах 10.", "Addition and subtraction numbers up to 10.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание чисел в пределах 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание чисел в пределах 10.",
                "Addition and Subtraction. Add or subtract numbers up to 10.",
                "Сложи или вычти числа в пределах 10.",
                "Add or subtract numbers up to 10.",
                0, 10, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание чисел в пределах 20.", "Addition and subtraction numbers up to 20.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание чисел в пределах 20. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract numbers up to 20. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание чисел в пределах 20.",
                "Addition and Subtraction. Add or subtract numbers up to 20.",
                "Сложи или вычти числа в пределах 20.",
                "Add or subtract numbers up to 20.",
                0, 20, 6));


        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание однозначных чисел.", "Addition and subtraction 1 digit numbers in columns.",
                "Задачи по математике на тему:<br />Вычитание. Сложение и вычитание однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 1 digit numbers in columns. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание. Сложение и вычитание однозначных чисел.",
                "Addition and Subtraction. Add or subtract 1 digit numbers in columns.",
                "Сложи или вычти однозначные числа из заданного числа.",
                "Add or subtract 1 digit numbers in columns.",
                0, 9, 6));

        additionSubtractionWorksheets.add(new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Устное сложение и вычитание чисел.", "Mental addition and subtraction.",
                "Задачи по математике на тему:<br />Устное сложение и вычитание чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Mental addition and subtraction. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Устное сложение и вычитание чисел.",
                "Mental addition and subtraction.",
                "Сложи или вычти устно числа до 100.",
                "Add or subtract numbers up to 100.",
                0, 100, 6));


//Сложение или вычитание в строчку
        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(0).numbersRangeStart, additionSubtractionWorksheets.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeRus, additionSubtractionWorksheets.get(0).totalPageOfWorksheets, additionSubtractionWorksheets.get(0).topicRus,
                additionSubtractionWorksheets.get(0).h2Rus, additionSubtractionWorksheets.get(0).shortProblemDescriptionRus, additionSubtractionWorksheets.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(1).numbersRangeStart, additionSubtractionWorksheets.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeRus, additionSubtractionWorksheets.get(1).totalPageOfWorksheets, additionSubtractionWorksheets.get(1).topicRus,
                additionSubtractionWorksheets.get(1).h2Rus, additionSubtractionWorksheets.get(1).shortProblemDescriptionRus, additionSubtractionWorksheets.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(2).numbersRangeStart, additionSubtractionWorksheets.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeRus, additionSubtractionWorksheets.get(2).totalPageOfWorksheets, additionSubtractionWorksheets.get(2).topicRus,
                additionSubtractionWorksheets.get(2).h2Rus, additionSubtractionWorksheets.get(2).shortProblemDescriptionRus, additionSubtractionWorksheets.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(3).numbersRangeStart, additionSubtractionWorksheets.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeRus, additionSubtractionWorksheets.get(3).totalPageOfWorksheets, additionSubtractionWorksheets.get(3).topicRus,
                additionSubtractionWorksheets.get(3).h2Rus, additionSubtractionWorksheets.get(3).shortProblemDescriptionRus, additionSubtractionWorksheets.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(4).numbersRangeStart, additionSubtractionWorksheets.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeRus, additionSubtractionWorksheets.get(4).totalPageOfWorksheets, additionSubtractionWorksheets.get(4).topicRus,
                additionSubtractionWorksheets.get(4).h2Rus, additionSubtractionWorksheets.get(4).shortProblemDescriptionRus, additionSubtractionWorksheets.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(5).numbersRangeStart, additionSubtractionWorksheets.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeRus, additionSubtractionWorksheets.get(5).totalPageOfWorksheets, additionSubtractionWorksheets.get(5).topicRus,
                additionSubtractionWorksheets.get(5).h2Rus, additionSubtractionWorksheets.get(5).shortProblemDescriptionRus, additionSubtractionWorksheets.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(6).numbersRangeStart, additionSubtractionWorksheets.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeRus, additionSubtractionWorksheets.get(6).totalPageOfWorksheets, additionSubtractionWorksheets.get(6).topicRus,
                additionSubtractionWorksheets.get(6).h2Rus, additionSubtractionWorksheets.get(6).shortProblemDescriptionRus, additionSubtractionWorksheets.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(7).numbersRangeStart, additionSubtractionWorksheets.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeRus, additionSubtractionWorksheets.get(7).totalPageOfWorksheets, additionSubtractionWorksheets.get(7).topicRus,
                additionSubtractionWorksheets.get(7).h2Rus, additionSubtractionWorksheets.get(7).shortProblemDescriptionRus, additionSubtractionWorksheets.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(8).numbersRangeStart, additionSubtractionWorksheets.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeRus, additionSubtractionWorksheets.get(8).totalPageOfWorksheets, additionSubtractionWorksheets.get(8).topicRus,
                additionSubtractionWorksheets.get(8).h2Rus, additionSubtractionWorksheets.get(8).shortProblemDescriptionRus, additionSubtractionWorksheets.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(9).numbersRangeStart, additionSubtractionWorksheets.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeRus, additionSubtractionWorksheets.get(9).totalPageOfWorksheets, additionSubtractionWorksheets.get(9).topicRus,
                additionSubtractionWorksheets.get(9).h2Rus, additionSubtractionWorksheets.get(9).shortProblemDescriptionRus, additionSubtractionWorksheets.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(10).numbersRangeStart, additionSubtractionWorksheets.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeRus, additionSubtractionWorksheets.get(10).totalPageOfWorksheets, additionSubtractionWorksheets.get(10).topicRus,
                additionSubtractionWorksheets.get(10).h2Rus, additionSubtractionWorksheets.get(10).shortProblemDescriptionRus, additionSubtractionWorksheets.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(11).numbersRangeStart, additionSubtractionWorksheets.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeRus, additionSubtractionWorksheets.get(11).totalPageOfWorksheets, additionSubtractionWorksheets.get(11).topicRus,
                additionSubtractionWorksheets.get(11).h2Rus, additionSubtractionWorksheets.get(11).shortProblemDescriptionRus, additionSubtractionWorksheets.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(12).numbersRangeStart, additionSubtractionWorksheets.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeRus, additionSubtractionWorksheets.get(12).totalPageOfWorksheets, additionSubtractionWorksheets.get(12).topicRus,
                additionSubtractionWorksheets.get(12).h2Rus, additionSubtractionWorksheets.get(12).shortProblemDescriptionRus, additionSubtractionWorksheets.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(13).numbersRangeStart, additionSubtractionWorksheets.get(13).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeRus, additionSubtractionWorksheets.get(13).totalPageOfWorksheets, additionSubtractionWorksheets.get(13).topicRus,
                additionSubtractionWorksheets.get(13).h2Rus, additionSubtractionWorksheets.get(13).shortProblemDescriptionRus, additionSubtractionWorksheets.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus,
                additionSubtractionWorksheets.get(14).numbersRangeStart, additionSubtractionWorksheets.get(14).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeRus, additionSubtractionWorksheets.get(14).totalPageOfWorksheets, additionSubtractionWorksheets.get(14).topicRus,
                additionSubtractionWorksheets.get(14).h2Rus, additionSubtractionWorksheets.get(14).shortProblemDescriptionRus, additionSubtractionWorksheets.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(0).numbersRangeStart, additionSubtractionWorksheets.get(0).numbersRangeEnd, 10, 15, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(0).gradeEng, additionSubtractionWorksheets.get(0).totalPageOfWorksheets, additionSubtractionWorksheets.get(0).topicEng,
                additionSubtractionWorksheets.get(0).h2Eng, additionSubtractionWorksheets.get(0).shortProblemDescriptionEng, additionSubtractionWorksheets.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(1).numbersRangeStart, additionSubtractionWorksheets.get(1).numbersRangeEnd, 10, 15, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(1).gradeEng, additionSubtractionWorksheets.get(1).totalPageOfWorksheets, additionSubtractionWorksheets.get(1).topicEng,
                additionSubtractionWorksheets.get(1).h2Eng, additionSubtractionWorksheets.get(1).shortProblemDescriptionEng, additionSubtractionWorksheets.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(2).numbersRangeStart, additionSubtractionWorksheets.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(2).gradeEng, additionSubtractionWorksheets.get(2).totalPageOfWorksheets, additionSubtractionWorksheets.get(2).topicEng,
                additionSubtractionWorksheets.get(2).h2Eng, additionSubtractionWorksheets.get(2).shortProblemDescriptionEng, additionSubtractionWorksheets.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(3).numbersRangeStart, additionSubtractionWorksheets.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(3).gradeEng, additionSubtractionWorksheets.get(3).totalPageOfWorksheets, additionSubtractionWorksheets.get(3).topicEng,
                additionSubtractionWorksheets.get(3).h2Eng, additionSubtractionWorksheets.get(3).shortProblemDescriptionEng, additionSubtractionWorksheets.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(4).numbersRangeStart, additionSubtractionWorksheets.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(4).gradeEng, additionSubtractionWorksheets.get(4).totalPageOfWorksheets, additionSubtractionWorksheets.get(4).topicEng,
                additionSubtractionWorksheets.get(4).h2Eng, additionSubtractionWorksheets.get(4).shortProblemDescriptionEng, additionSubtractionWorksheets.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(5).numbersRangeStart, additionSubtractionWorksheets.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(5).gradeEng, additionSubtractionWorksheets.get(5).totalPageOfWorksheets, additionSubtractionWorksheets.get(5).topicEng,
                additionSubtractionWorksheets.get(5).h2Eng, additionSubtractionWorksheets.get(5).shortProblemDescriptionEng, additionSubtractionWorksheets.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(6).numbersRangeStart, additionSubtractionWorksheets.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(6).gradeEng, additionSubtractionWorksheets.get(6).totalPageOfWorksheets, additionSubtractionWorksheets.get(6).topicEng,
                additionSubtractionWorksheets.get(6).h2Eng, additionSubtractionWorksheets.get(6).shortProblemDescriptionEng, additionSubtractionWorksheets.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(7).numbersRangeStart, additionSubtractionWorksheets.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(7).gradeEng, additionSubtractionWorksheets.get(7).totalPageOfWorksheets, additionSubtractionWorksheets.get(7).topicEng,
                additionSubtractionWorksheets.get(7).h2Eng, additionSubtractionWorksheets.get(7).shortProblemDescriptionEng, additionSubtractionWorksheets.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(8).numbersRangeStart, additionSubtractionWorksheets.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(8).gradeEng, additionSubtractionWorksheets.get(8).totalPageOfWorksheets, additionSubtractionWorksheets.get(8).topicEng,
                additionSubtractionWorksheets.get(8).h2Eng, additionSubtractionWorksheets.get(8).shortProblemDescriptionEng, additionSubtractionWorksheets.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(9).numbersRangeStart, additionSubtractionWorksheets.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(9).gradeEng, additionSubtractionWorksheets.get(9).totalPageOfWorksheets, additionSubtractionWorksheets.get(9).topicEng,
                additionSubtractionWorksheets.get(9).h2Eng, additionSubtractionWorksheets.get(9).shortProblemDescriptionEng, additionSubtractionWorksheets.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(10).numbersRangeStart, additionSubtractionWorksheets.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(10).gradeEng, additionSubtractionWorksheets.get(10).totalPageOfWorksheets, additionSubtractionWorksheets.get(10).topicEng,
                additionSubtractionWorksheets.get(10).h2Eng, additionSubtractionWorksheets.get(10).shortProblemDescriptionEng, additionSubtractionWorksheets.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(11).numbersRangeStart, additionSubtractionWorksheets.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(11).gradeEng, additionSubtractionWorksheets.get(11).totalPageOfWorksheets, additionSubtractionWorksheets.get(11).topicEng,
                additionSubtractionWorksheets.get(11).h2Eng, additionSubtractionWorksheets.get(11).shortProblemDescriptionEng, additionSubtractionWorksheets.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(12).numbersRangeStart, additionSubtractionWorksheets.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(12).gradeEng, additionSubtractionWorksheets.get(12).totalPageOfWorksheets, additionSubtractionWorksheets.get(12).topicEng,
                additionSubtractionWorksheets.get(12).h2Eng, additionSubtractionWorksheets.get(12).shortProblemDescriptionEng, additionSubtractionWorksheets.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(13).numbersRangeStart, additionSubtractionWorksheets.get(13).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(13).gradeEng, additionSubtractionWorksheets.get(13).totalPageOfWorksheets, additionSubtractionWorksheets.get(13).topicEng,
                additionSubtractionWorksheets.get(13).h2Eng, additionSubtractionWorksheets.get(13).shortProblemDescriptionEng, additionSubtractionWorksheets.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.addSubtractA1_B1LineWorksheetA4(General.workingFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng,
                additionSubtractionWorksheets.get(14).numbersRangeStart, additionSubtractionWorksheets.get(14).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets,
                additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, additionSubtractionWorksheets.get(14).gradeEng, additionSubtractionWorksheets.get(14).totalPageOfWorksheets, additionSubtractionWorksheets.get(14).topicEng,
                additionSubtractionWorksheets.get(14).h2Eng, additionSubtractionWorksheets.get(14).shortProblemDescriptionEng, additionSubtractionWorksheets.get(14).longProblemDescriptionEng);

        //Addition and subtraction in column

        List<AdditionSubtractionWorksheets> allTopicsAddSubtractColumn = new ArrayList<>();

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 0 в столбик.","Addition and subtraction 0 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 0 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 0 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 0.",
                "Addition and Subtraction in column. Add or subtract 0 from a number.",
                "Сложи или вычти число 0 из заданного числа в столбик.",
                "Add or subtract 0 from a number in column.",
                0, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 1 в столбик.","Addition and subtraction 1 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 1 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 1 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 1.",
                "Addition and Subtraction in column. Add or subtract 1 from a number.",
                "Сложи или вычти число 1 из заданного числа в столбик.",
                "Add or subtract 1 from a number in column.",
                1, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 2 в столбик.","Addition and subtraction 2 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 2 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 2 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 2.",
                "Addition and Subtraction in column. Add or subtract 2 from a number.",
                "Сложи или вычти число 2 из заданного числа в столбик.",
                "Add or subtract 2 from a number in column.",
                2, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 3 в столбик.","Addition and subtraction 3 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 3 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 3 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 3.",
                "Addition and Subtraction in column. Add or subtract 3 from a number.",
                "Сложи или вычти число 3 из заданного числа в столбик.",
                "Add or subtract 3 from a number in column.",
                3, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 4 в столбик.","Addition and subtraction 4 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 4 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 4 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 4.",
                "Addition and Subtraction in column. Add or subtract 4 from a number.",
                "Сложи или вычти число 4 из заданного числа в столбик.",
                "Add or subtract 4 from a number in column.",
                4, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 5 в столбик.","Addition and subtraction 5 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 5 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 5 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 5.",
                "Addition and Subtraction in column. Add or subtract 5 from a number.",
                "Сложи или вычти число 5 из заданного числа в столбик.",
                "Add or subtract 5 from a number in column.",
                5, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 6 в столбик.","Addition and subtraction 6 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 6 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 6 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 6.",
                "Addition and Subtraction in column. Add or subtract 6 from a number.",
                "Сложи или вычти число 6 из заданного числа в столбик.",
                "Add or subtract 6 from a number in column.",
                6, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 7 в столбик.","Addition and subtraction 7 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 7 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 7 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 7.",
                "Addition and Subtraction in column. Add or subtract 7 from a number.",
                "Сложи или вычти число 7 из заданного числа в столбик.",
                "Add or subtract 7 from a number in column.",
                7, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 8 в столбик.","Addition and subtraction 8 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 8 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 8 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 8.",
                "Addition and Subtraction in column. Add or subtract 8 from a number.",
                "Сложи или вычти число 8 из заданного числа в столбик.",
                "Add or subtract 8 from a number in column.",
                8, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 9 в столбик.","Addition and subtraction 9 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 9 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 9 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 9.",
                "Addition and Subtraction in column. Add or subtract 9 from a number.",
                "Сложи или вычти число 9 из заданного числа в столбик.",
                "Add or subtract 9 from a number in column.",
                9, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание числа 10 в столбик.","Addition and subtraction 10 from a number in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание числа 10 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract 10 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание в столбик. Сложение и вычитание числа 10.",
                "Addition and Subtraction in column. Add or subtract 10 from a number.",
                "Сложи или вычти число 10 из заданного числа в столбик.",
                "Add or subtract 10 from a number in column.",
                10, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание чисел в пределах 10.","Addition and subtraction numbers up to 10.",
                "Задачи по математике на тему:<br />Сложение и вычитание чисел в пределах 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract  numbers up to 10 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание чисел в пределах 10 в столбик.",
                "Addition and Subtraction numbers up to 10.",
                "Сложи или вычти числа в пределах 10.",
                "Add or subtract numbers up to 10 in column.",
                0, 9, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание чисел в пределах 100.","Addition and subtraction numbers up to 100 in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание чисел в пределах 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract numbers up to 100 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание чисел в пределах 100.",
                "Addition and Subtraction in column. Add or subtract numbers up to 100 .",
                "Сложи или вычти числа в пределах 100 в столбик.",
                "Add or subtract numbers up to 100 in column.",
                10, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание чисел в пределах 1000.","Addition and subtraction numbers up to 1000 in column.",
                "Задачи по математике на тему:<br />Сложение и вычитание чисел в пределах 1000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract numbers up to 1000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание чисел в пределах 1000.",
                "Addition and Subtraction in column. Add or subtract numbers up to 1000 .",
                "Сложи или вычти числа в пределах 1000.",
                "Add or subtract numbers up to 1000 in column.",
                100, 999, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Распечатать примеры на сложение и вычитание.","Print addition and subtraction problems.",
                "Распечатать задачи по математике на тему:<br />Сложение и вычитание. Задачи с ответами. Скачать pdf или jpg.",
                "Print mathematics worksheets:<br />Add or subtract numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Распечатать примеры на сложение и вычитание.",
                "Print addition and subtraction problems in column.",
                "Сложи или вычти числа до 200.",
                "Add or subtract numbers up to 200 in column.",
                10, 200, 11));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Тренажер на сложение и вычитание чисел.","Skills building. Addition and subtraction numbers in column.",
                "Тренажер по математике на тему:<br />Сложение и вычитание чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics skills building:<br />Addition and subtraction numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Тренажер на сложение и вычитание чисел в столбик.",
                "Addition and Subtraction numbers skills builder.",
                "Сложи или вычти числа до 500 в столбик.",
                "Add or subtract number up to 500.",
                10, 500, 11));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Действие на сложение и вычитание чисел.","Addition and subtraction ---.",
                "Задачи по математике на тему:<br />Действие на сложение и вычитание чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract ---. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Действие на сложение и вычитание чисел в столбик.",
                "Addition and Subtraction in column. ---.",
                "Выполние действия на сложение и вычитание чисел",
                "Add or subtract 0 from ---.",
                0, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание чисел.","Addition and subtraction numbers.",
                "Задачи по математике на тему:<br />Сложение и вычитание чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание чисел.",
                "Addition and Subtraction in column.",
                "Сложи или вычти числа до 1000.",
                "Add or subtract numbers u to 1000.",
                0, 99, 16));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Операции на сложение и вычитание чисел.","Addition and subtraction operations with numbers.",
                "Операции на тему:<br />Сложение и вычитание чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition and subtraction operations with numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Операции на сложение и вычитание в столбик.",
                "Addition and subtraction operations with numbers in column.",
                "Выполни операции сложения или вычитания числа в столбик.",
                "Complete the add or subtract operation with numbers.",
                0, 99, 16));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Примеры на сложение и вычитание чисел.","Addition and subtraction numbers examples.",
                "Примеры по математике на тему:<br />Сложение и вычитание чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics problems examples:<br />Add or subtract number in column. With answers. Download pdf or jpg.",
                "", "",
                "Примеры на сложение и вычитание чисел в столбик.",
                "Problems examples of addition and subtraction in column.",
                "Реши примеры на сложение или вычитание числа в столбик. ",
                "Solve the problems of addition or subtraction of numbers in column.",
                0, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание чисел до 20.","Addition and subtraction numbers up to 20.",
                "Примеры по математике на тему:<br />Сложение и вычитание чисел до 20. столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics problems examples:<br />Add or subtract number up to 20 in column. With answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание чисел до 20.",
                "Addition and subtraction numbers up to 20 in column.",
                "Сложи или вычти числа до 20.",
                "Add or subtract numbers up to 20 in column.",
                0, 20, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание однозначных чисел.","Addition and subtraction 1 digit numbers in columns.",
                "Примеры по математике на тему:<br />Сложение и вычитание однозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics problems examples:<br />Add or subtract 1 digit numbers in columns in column. With answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание однозначных чисел в столбик.",
                "Addition and subtraction 1 digit numbers in columns in column.",
                "Сложи или вычти однозначные числа.",
                "Add or subtract 1 digit numbers in columns.",
                0, 9, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание двузначных чисел.","Addition and subtraction 2 digit numbers.",
                "Примеры по математике на тему:<br />Сложение и вычитание двузначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics problems examples:<br />Add or subtract 2 digit numbers in column. With answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание двузначных чисел в столбик.",
                "Addition and subtraction 2 digit numbers in column.",
                "Сложи или вычти двузначные числа.",
                "Add or subtract 2 digit numbers.",
                10, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание трехзначных чисел.","Addition and subtraction 3 digit numbers.",
                "Примеры по математике на тему:<br />Сложение и вычитание трехзначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics problems examples:<br />Add or subtract 3 digit numbers in column. With answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание трехзначных чисел в столбик.",
                "Addition and subtraction 3 digit numbers in column.",
                "Сложи или вычти трехзначные числа.",
                "Add or subtract 3 digit numbers.",
                100, 999, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Сложение и вычитание многозначных чисел.","Addition and subtraction multi digit numbers.",
                "Примеры по математике на тему:<br />Сложение и вычитание многозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add or subtract multi digit numbers in column. With answers. Download pdf or jpg.",
                "", "",
                "Сложение и вычитание многозначных чисел в столбик.",
                "Addition and subtraction multi digit numbers in column.",
                "Сложи или вычти многозначные числа.",
                "Add or subtract multi digit numbers.",
                1000, 9999, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Карточки на сложение и вычитание чисел.","Addition and subtraction ------.",
                "Карточки по математике на тему:<br />Сложение и вычитание чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics problems examples:<br />Add or subtract number ------. With answers. Download pdf or jpg.",
                "", "",
                "Карточки на сложение и вычитание чисел в столбик.",
                "Problems examples of addition and subtraction ------.",
                "Карточки чисел до 1000. Сложи или вычти числа.",
                "Add or subtract numbers ------.",
                100, 1000, 11));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Задания на закрепление сложения и вычитания чисел.","Revision of addition and subtraction numbers.",
                "Задания на закрепление сложения и вычитания чисел. С ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Revision of addition and subtraction numbers in column. With answers. Download pdf or jpg.",
                "", "",
                "Задания на закрепление сложения и вычитания чисел в столбик.",
                "Revision of addition and subtraction numbers.",
                "Реши задания на сложение или вычитание чисел.",
                "Numbers up to 1000. Add or subtract numbers.",
                10, 999, 11));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",

                "Примеры на сложение и вычитание чисел.","Addition and subtraction numbers examples.",
                "Примеры по математике на тему:<br />Сложение и вычитание чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics problems examples:<br />Add or subtract number in column. With answers. Download pdf or jpg.",
                "", "",
                "Примеры на сложение и вычитание чисел в столбик.",
                "Problems examples of addition and subtraction in column.",
                "Примеры с числами до 100. Сложи или вычти числа в столбик.",
                "Problems with numbers up to 100. Add or subtract numbers in column.",
                0, 99, 6));

        allTopicsAddSubtractColumn.add( new AdditionSubtractionWorksheets(
                "", "&nbsp",
                "Устное сложение и вычитание чисел.","Mental arithmetics. Addition and subtraction numbers examples.",
                "Устное сложение и вычитание чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mental arithmetics:<br />Add or subtract number in column. With answers. Download pdf or jpg.",
                "", "",
                "Устное сложение и вычитание чисел в столбик.",
                "Mental arithmetic. Addition and subtraction in column.",
                "Устно сложи или вычти числа в столбик.",
                "Mental arithmetic. Add or subtract numbers.",
                0, 99, 11));


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(0).numbersRangeStart, allTopicsAddSubtractColumn.get(0).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeRus, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(0).topicRus,
                allTopicsAddSubtractColumn.get(0).h2Rus, allTopicsAddSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(1).numbersRangeStart, allTopicsAddSubtractColumn.get(1).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeRus, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(1).topicRus,
                allTopicsAddSubtractColumn.get(1).h2Rus, allTopicsAddSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(2).numbersRangeStart, allTopicsAddSubtractColumn.get(2).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeRus, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(2).topicRus,
                allTopicsAddSubtractColumn.get(2).h2Rus, allTopicsAddSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(3).numbersRangeStart, allTopicsAddSubtractColumn.get(3).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeRus, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(3).topicRus,
                allTopicsAddSubtractColumn.get(3).h2Rus, allTopicsAddSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(4).numbersRangeStart, allTopicsAddSubtractColumn.get(4).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeRus, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(4).topicRus,
                allTopicsAddSubtractColumn.get(4).h2Rus, allTopicsAddSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(5).numbersRangeStart, allTopicsAddSubtractColumn.get(5).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeRus, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(5).topicRus,
                allTopicsAddSubtractColumn.get(5).h2Rus, allTopicsAddSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(6).numbersRangeStart, allTopicsAddSubtractColumn.get(6).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeRus, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(6).topicRus,
                allTopicsAddSubtractColumn.get(6).h2Rus, allTopicsAddSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(7).numbersRangeStart, allTopicsAddSubtractColumn.get(7).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeRus, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(7).topicRus,
                allTopicsAddSubtractColumn.get(7).h2Rus, allTopicsAddSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(8).numbersRangeStart, allTopicsAddSubtractColumn.get(8).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeRus, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(8).topicRus,
                allTopicsAddSubtractColumn.get(8).h2Rus, allTopicsAddSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(9).numbersRangeStart, allTopicsAddSubtractColumn.get(9).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeRus, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(9).topicRus,
                allTopicsAddSubtractColumn.get(9).h2Rus, allTopicsAddSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(10).numbersRangeStart, allTopicsAddSubtractColumn.get(10).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeRus, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(10).topicRus,
                allTopicsAddSubtractColumn.get(10).h2Rus, allTopicsAddSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(11).numbersRangeStart, allTopicsAddSubtractColumn.get(11).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeRus, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(11).topicRus,
                allTopicsAddSubtractColumn.get(11).h2Rus, allTopicsAddSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(12).numbersRangeStart, allTopicsAddSubtractColumn.get(12).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeRus, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(12).topicRus,
                allTopicsAddSubtractColumn.get(12).h2Rus, allTopicsAddSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(13).numbersRangeStart, allTopicsAddSubtractColumn.get(13).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeRus, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(13).topicRus,
                allTopicsAddSubtractColumn.get(13).h2Rus, allTopicsAddSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(14).numbersRangeStart, allTopicsAddSubtractColumn.get(14).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeRus, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(14).topicRus,
                allTopicsAddSubtractColumn.get(14).h2Rus, allTopicsAddSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(15).numbersRangeStart, allTopicsAddSubtractColumn.get(15).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeRus, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(15).topicRus,
                allTopicsAddSubtractColumn.get(15).h2Rus, allTopicsAddSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(15).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(16).numbersRangeStart, allTopicsAddSubtractColumn.get(16).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeRus, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(16).topicRus,
                allTopicsAddSubtractColumn.get(16).h2Rus, allTopicsAddSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(16).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(17).numbersRangeStart, allTopicsAddSubtractColumn.get(17).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeRus, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(17).topicRus,
                allTopicsAddSubtractColumn.get(17).h2Rus, allTopicsAddSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(17).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(18).numbersRangeStart, allTopicsAddSubtractColumn.get(18).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeRus, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(18).topicRus,
                allTopicsAddSubtractColumn.get(18).h2Rus, allTopicsAddSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(18).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(19).numbersRangeStart, allTopicsAddSubtractColumn.get(19).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeRus, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(19).topicRus,
                allTopicsAddSubtractColumn.get(19).h2Rus, allTopicsAddSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(19).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(20).numbersRangeStart, allTopicsAddSubtractColumn.get(20).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeRus, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(20).topicRus,
                allTopicsAddSubtractColumn.get(20).h2Rus, allTopicsAddSubtractColumn.get(20).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(20).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(21).numbersRangeStart, allTopicsAddSubtractColumn.get(21).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeRus, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(21).topicRus,
                allTopicsAddSubtractColumn.get(21).h2Rus, allTopicsAddSubtractColumn.get(21).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(21).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(22).numbersRangeStart, allTopicsAddSubtractColumn.get(22).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeRus, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(22).topicRus,
                allTopicsAddSubtractColumn.get(22).h2Rus, allTopicsAddSubtractColumn.get(22).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(22).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(23).numbersRangeStart, allTopicsAddSubtractColumn.get(23).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeRus, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(23).topicRus,
                allTopicsAddSubtractColumn.get(23).h2Rus, allTopicsAddSubtractColumn.get(23).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(23).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(24).numbersRangeStart, allTopicsAddSubtractColumn.get(24).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeRus, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(24).topicRus,
                allTopicsAddSubtractColumn.get(24).h2Rus, allTopicsAddSubtractColumn.get(24).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(24).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(25).numbersRangeStart, allTopicsAddSubtractColumn.get(25).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeRus, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(25).topicRus,
                allTopicsAddSubtractColumn.get(25).h2Rus, allTopicsAddSubtractColumn.get(25).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(25).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(26).numbersRangeStart, allTopicsAddSubtractColumn.get(26).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeRus, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(26).topicRus,
                allTopicsAddSubtractColumn.get(26).h2Rus, allTopicsAddSubtractColumn.get(26).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(26).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(27).numbersRangeStart, allTopicsAddSubtractColumn.get(27).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeRus, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(27).topicRus,
                allTopicsAddSubtractColumn.get(27).h2Rus, allTopicsAddSubtractColumn.get(27).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(27).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus,
                allTopicsAddSubtractColumn.get(28).numbersRangeStart, allTopicsAddSubtractColumn.get(28).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeRus, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(28).topicRus,
                allTopicsAddSubtractColumn.get(28).h2Rus, allTopicsAddSubtractColumn.get(28).shortProblemDescriptionRus, allTopicsAddSubtractColumn.get(28).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(0).numbersRangeStart, allTopicsAddSubtractColumn.get(0).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(0).gradeEng, allTopicsAddSubtractColumn.get(0).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(0).topicEng,
                allTopicsAddSubtractColumn.get(0).h2Eng, allTopicsAddSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(1).numbersRangeStart, allTopicsAddSubtractColumn.get(1).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(1).gradeEng, allTopicsAddSubtractColumn.get(1).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(1).topicEng,
                allTopicsAddSubtractColumn.get(1).h2Eng, allTopicsAddSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(2).numbersRangeStart, allTopicsAddSubtractColumn.get(2).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(2).gradeEng, allTopicsAddSubtractColumn.get(2).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(2).topicEng,
                allTopicsAddSubtractColumn.get(2).h2Eng, allTopicsAddSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(3).numbersRangeStart, allTopicsAddSubtractColumn.get(3).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(3).gradeEng, allTopicsAddSubtractColumn.get(3).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(3).topicEng,
                allTopicsAddSubtractColumn.get(3).h2Eng, allTopicsAddSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(4).numbersRangeStart, allTopicsAddSubtractColumn.get(4).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(4).gradeEng, allTopicsAddSubtractColumn.get(4).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(4).topicEng,
                allTopicsAddSubtractColumn.get(4).h2Eng, allTopicsAddSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(5).numbersRangeStart, allTopicsAddSubtractColumn.get(5).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(5).gradeEng, allTopicsAddSubtractColumn.get(5).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(5).topicEng,
                allTopicsAddSubtractColumn.get(5).h2Eng, allTopicsAddSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(6).numbersRangeStart, allTopicsAddSubtractColumn.get(6).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(6).gradeEng, allTopicsAddSubtractColumn.get(6).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(6).topicEng,
                allTopicsAddSubtractColumn.get(6).h2Eng, allTopicsAddSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(7).numbersRangeStart, allTopicsAddSubtractColumn.get(7).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(7).gradeEng, allTopicsAddSubtractColumn.get(7).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(7).topicEng,
                allTopicsAddSubtractColumn.get(7).h2Eng, allTopicsAddSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(8).numbersRangeStart, allTopicsAddSubtractColumn.get(8).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(8).gradeEng, allTopicsAddSubtractColumn.get(8).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(8).topicEng,
                allTopicsAddSubtractColumn.get(8).h2Eng, allTopicsAddSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(9).numbersRangeStart, allTopicsAddSubtractColumn.get(9).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(9).gradeEng, allTopicsAddSubtractColumn.get(9).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(9).topicEng,
                allTopicsAddSubtractColumn.get(9).h2Eng, allTopicsAddSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(10).numbersRangeStart, allTopicsAddSubtractColumn.get(10).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(10).gradeEng, allTopicsAddSubtractColumn.get(10).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(10).topicEng,
                allTopicsAddSubtractColumn.get(10).h2Eng, allTopicsAddSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(11).numbersRangeStart, allTopicsAddSubtractColumn.get(11).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(11).gradeEng, allTopicsAddSubtractColumn.get(11).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(11).topicEng,
                allTopicsAddSubtractColumn.get(11).h2Eng, allTopicsAddSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(12).numbersRangeStart, allTopicsAddSubtractColumn.get(12).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(12).gradeEng, allTopicsAddSubtractColumn.get(12).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(12).topicEng,
                allTopicsAddSubtractColumn.get(12).h2Eng, allTopicsAddSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(13).numbersRangeStart, allTopicsAddSubtractColumn.get(13).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(13).gradeEng, allTopicsAddSubtractColumn.get(13).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(13).topicEng,
                allTopicsAddSubtractColumn.get(13).h2Eng, allTopicsAddSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(14).numbersRangeStart, allTopicsAddSubtractColumn.get(14).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(14).gradeEng, allTopicsAddSubtractColumn.get(14).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(14).topicEng,
                allTopicsAddSubtractColumn.get(14).h2Eng, allTopicsAddSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(14).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(15).numbersRangeStart, allTopicsAddSubtractColumn.get(15).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(15).gradeEng, allTopicsAddSubtractColumn.get(15).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(15).topicEng,
                allTopicsAddSubtractColumn.get(15).h2Eng, allTopicsAddSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(15).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(16).numbersRangeStart, allTopicsAddSubtractColumn.get(16).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(16).gradeEng, allTopicsAddSubtractColumn.get(16).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(16).topicEng,
                allTopicsAddSubtractColumn.get(16).h2Eng, allTopicsAddSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(17).numbersRangeStart, allTopicsAddSubtractColumn.get(17).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(17).gradeEng, allTopicsAddSubtractColumn.get(17).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(17).topicEng,
                allTopicsAddSubtractColumn.get(17).h2Eng, allTopicsAddSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(17).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(18).numbersRangeStart, allTopicsAddSubtractColumn.get(18).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(18).gradeEng, allTopicsAddSubtractColumn.get(18).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(18).topicEng,
                allTopicsAddSubtractColumn.get(18).h2Eng, allTopicsAddSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(18).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(19).numbersRangeStart, allTopicsAddSubtractColumn.get(19).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(19).gradeEng, allTopicsAddSubtractColumn.get(19).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(19).topicEng,
                allTopicsAddSubtractColumn.get(19).h2Eng, allTopicsAddSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(19).longProblemDescriptionEng);



        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(20).numbersRangeStart, allTopicsAddSubtractColumn.get(20).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(20).gradeEng, allTopicsAddSubtractColumn.get(20).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(20).topicEng,
                allTopicsAddSubtractColumn.get(20).h2Eng, allTopicsAddSubtractColumn.get(20).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(20).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(21).numbersRangeStart, allTopicsAddSubtractColumn.get(21).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(21).gradeEng, allTopicsAddSubtractColumn.get(21).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(21).topicEng,
                allTopicsAddSubtractColumn.get(21).h2Eng, allTopicsAddSubtractColumn.get(21).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(21).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(22).numbersRangeStart, allTopicsAddSubtractColumn.get(22).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(22).gradeEng, allTopicsAddSubtractColumn.get(22).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(22).topicEng,
                allTopicsAddSubtractColumn.get(22).h2Eng, allTopicsAddSubtractColumn.get(22).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(22).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(23).numbersRangeStart, allTopicsAddSubtractColumn.get(23).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(23).gradeEng, allTopicsAddSubtractColumn.get(23).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(23).topicEng,
                allTopicsAddSubtractColumn.get(23).h2Eng, allTopicsAddSubtractColumn.get(23).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(23).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(24).numbersRangeStart, allTopicsAddSubtractColumn.get(24).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(24).gradeEng, allTopicsAddSubtractColumn.get(24).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(24).topicEng,
                allTopicsAddSubtractColumn.get(24).h2Eng, allTopicsAddSubtractColumn.get(24).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(24).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(25).numbersRangeStart, allTopicsAddSubtractColumn.get(25).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(25).gradeEng, allTopicsAddSubtractColumn.get(25).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(25).topicEng,
                allTopicsAddSubtractColumn.get(25).h2Eng, allTopicsAddSubtractColumn.get(25).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(25).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(26).numbersRangeStart, allTopicsAddSubtractColumn.get(26).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(26).gradeEng, allTopicsAddSubtractColumn.get(26).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(26).topicEng,
                allTopicsAddSubtractColumn.get(26).h2Eng, allTopicsAddSubtractColumn.get(26).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(26).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(27).numbersRangeStart, allTopicsAddSubtractColumn.get(27).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(27).gradeEng, allTopicsAddSubtractColumn.get(27).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(27).topicEng,
                allTopicsAddSubtractColumn.get(27).h2Eng, allTopicsAddSubtractColumn.get(27).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(27).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng );
        Matrix.addSubtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng,
                allTopicsAddSubtractColumn.get(28).numbersRangeStart, allTopicsAddSubtractColumn.get(28).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets,
                allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAddSubtractColumn.get(28).gradeEng, allTopicsAddSubtractColumn.get(28).totalPageOfWorksheets, allTopicsAddSubtractColumn.get(28).topicEng,
                allTopicsAddSubtractColumn.get(28).h2Eng, allTopicsAddSubtractColumn.get(28).shortProblemDescriptionEng, allTopicsAddSubtractColumn.get(28).longProblemDescriptionEng);

        General.finalRenameFiles("d:/Java_Math/Html/");
        General.finalRenameFiles("D:\\Java_Math\\Pdf");
    }
}