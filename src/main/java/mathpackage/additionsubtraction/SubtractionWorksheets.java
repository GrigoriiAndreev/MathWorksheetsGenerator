package mathpackage.additionsubtraction;

import mathpackage.General;
import mathpackage.Matrix;
import mathpackage.WorksheetTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Class generating subtraction worksheets. Part 1
 * Author: Grigorii Andreev
 * Date: 07 January 2021
 */

public class SubtractionWorksheets extends WorksheetTemplate {

    public SubtractionWorksheets(
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

        List<SubtractionWorksheets> subtractionWorksheets = new ArrayList<>();

        General.emptyAllFolders();

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 0.", "Subtract. Subtract 0 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 0 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 0.",
                "Subtract 0 from a number.",
                "Вычти число 0 из заданного числа.",
                "Subtract 0 from a number.",
                0, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 1.", "Subtract. Subtract 1 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 1.",
                "Subtract 1 from a number.",
                "Вычти число 1 из заданного числа.",
                "Subtract 1 from a number.",
                1, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 2.", "Subtract. Subtract 2 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 2 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 2.",
                "Subtract 2 from a number.",
                "Вычти число 2 из заданного числа.",
                "Subtract 2 from a number.",
                2, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 3.", "Subtract. Subtract 3 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 3 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 3.",
                "Subtract 3 from a number.",
                "Вычти число 3 из заданного числа.",
                "Subtract 3 from a number.",
                3, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 4.", "Subtract. Subtract 4 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 4 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 4.",
                "Subtract 4 from a number.",
                "Вычти число 4 из заданного числа.",
                "Subtract 4 from a number.",
                4, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 5.", "Subtract. Subtract 5 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 5 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 5.",
                "Subtract 5 from a number.",
                "Вычти число 5 из заданного числа.",
                "Subtract 5 from a number.",
                5, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 6.", "Subtract. Subtract 6 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 6 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 6.",
                "Subtract 6 from a number.",
                "Вычти число 6 из заданного числа.",
                "Subtract 6 from a number.",
                6, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 7.", "Subtract. Subtract 7 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 7.",
                "Subtract 7 from a number.",
                "Вычти число 7 из заданного числа.",
                "Subtract 7 from a number.",
                7, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 8.", "Subtract. Subtract 8 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 8 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 8.",
                "Subtract 8 from a number.",
                "Вычти число 8 из заданного числа.",
                "Subtract 8 from a number.",
                8, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 9.", "Subtract. Subtract 9 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 9 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 9.",
                "Subtract 9 from a number.",
                "Вычти число 9 из заданного числа.",
                "Subtract 9 from a number.",
                9, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 10.", "Subtract. Subtract 10 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 10 from a number. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 10.",
                "Subtract 10 from a number from a number.",
                "Вычти число 10 из заданного числа.",
                "Subtract 10 from a number from a number.",
                10, 99, 6));

        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание однозначных чисел.", "Subtract. Subtract 1 digit numbers in columns.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 digit numbers in columns. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание однозначных чисел.",
                "Subtract 1 digit numbers in columns.",
                "Вычти однозначные числа.",
                "Subtract 1 digit numbers in columns.",
                0, 9, 6));


        subtractionWorksheets.add(new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание чисел до 10.", "Subtract. Subtract numbers up to 10.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 10. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 10.",
                "Subtract numbers up to 10.",
                "Вычти числа до 10.",
                "Subtract numbers up to 10.",
                0, 10, 6));


        // Subtraction in line
        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus,
                subtractionWorksheets.get(0).numbersRangeStart, subtractionWorksheets.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeRus, subtractionWorksheets.get(0).totalPageOfWorksheets, subtractionWorksheets.get(0).topicRus,
                subtractionWorksheets.get(0).h2Rus, subtractionWorksheets.get(0).shortProblemDescriptionRus, subtractionWorksheets.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus,
                subtractionWorksheets.get(1).numbersRangeStart, subtractionWorksheets.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeRus, subtractionWorksheets.get(1).totalPageOfWorksheets, subtractionWorksheets.get(1).topicRus,
                subtractionWorksheets.get(1).h2Rus, subtractionWorksheets.get(1).shortProblemDescriptionRus, subtractionWorksheets.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus,
                subtractionWorksheets.get(2).numbersRangeStart, subtractionWorksheets.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeRus, subtractionWorksheets.get(2).totalPageOfWorksheets, subtractionWorksheets.get(2).topicRus,
                subtractionWorksheets.get(2).h2Rus, subtractionWorksheets.get(2).shortProblemDescriptionRus, subtractionWorksheets.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus,
                subtractionWorksheets.get(3).numbersRangeStart, subtractionWorksheets.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeRus, subtractionWorksheets.get(3).totalPageOfWorksheets, subtractionWorksheets.get(3).topicRus,
                subtractionWorksheets.get(3).h2Rus, subtractionWorksheets.get(3).shortProblemDescriptionRus, subtractionWorksheets.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus,
                subtractionWorksheets.get(4).numbersRangeStart, subtractionWorksheets.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeRus, subtractionWorksheets.get(4).totalPageOfWorksheets, subtractionWorksheets.get(4).topicRus,
                subtractionWorksheets.get(4).h2Rus, subtractionWorksheets.get(4).shortProblemDescriptionRus, subtractionWorksheets.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus,
                subtractionWorksheets.get(5).numbersRangeStart, subtractionWorksheets.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeRus, subtractionWorksheets.get(5).totalPageOfWorksheets, subtractionWorksheets.get(5).topicRus,
                subtractionWorksheets.get(5).h2Rus, subtractionWorksheets.get(5).shortProblemDescriptionRus, subtractionWorksheets.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus,
                subtractionWorksheets.get(6).numbersRangeStart, subtractionWorksheets.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeRus, subtractionWorksheets.get(6).totalPageOfWorksheets, subtractionWorksheets.get(6).topicRus,
                subtractionWorksheets.get(6).h2Rus, subtractionWorksheets.get(6).shortProblemDescriptionRus, subtractionWorksheets.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus,
                subtractionWorksheets.get(7).numbersRangeStart, subtractionWorksheets.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeRus, subtractionWorksheets.get(7).totalPageOfWorksheets, subtractionWorksheets.get(7).topicRus,
                subtractionWorksheets.get(7).h2Rus, subtractionWorksheets.get(7).shortProblemDescriptionRus, subtractionWorksheets.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus,
                subtractionWorksheets.get(8).numbersRangeStart, subtractionWorksheets.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeRus, subtractionWorksheets.get(8).totalPageOfWorksheets, subtractionWorksheets.get(8).topicRus,
                subtractionWorksheets.get(8).h2Rus, subtractionWorksheets.get(8).shortProblemDescriptionRus, subtractionWorksheets.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus,
                subtractionWorksheets.get(9).numbersRangeStart, subtractionWorksheets.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeRus, subtractionWorksheets.get(9).totalPageOfWorksheets, subtractionWorksheets.get(9).topicRus,
                subtractionWorksheets.get(9).h2Rus, subtractionWorksheets.get(9).shortProblemDescriptionRus, subtractionWorksheets.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus,
                subtractionWorksheets.get(10).numbersRangeStart, subtractionWorksheets.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeRus, subtractionWorksheets.get(10).totalPageOfWorksheets, subtractionWorksheets.get(10).topicRus,
                subtractionWorksheets.get(10).h2Rus, subtractionWorksheets.get(10).shortProblemDescriptionRus, subtractionWorksheets.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus,
                subtractionWorksheets.get(11).numbersRangeStart, subtractionWorksheets.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeRus, subtractionWorksheets.get(11).totalPageOfWorksheets, subtractionWorksheets.get(11).topicRus,
                subtractionWorksheets.get(11).h2Rus, subtractionWorksheets.get(11).shortProblemDescriptionRus, subtractionWorksheets.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus,
                subtractionWorksheets.get(12).numbersRangeStart, subtractionWorksheets.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeRus, subtractionWorksheets.get(12).totalPageOfWorksheets, subtractionWorksheets.get(12).topicRus,
                subtractionWorksheets.get(12).h2Rus, subtractionWorksheets.get(12).shortProblemDescriptionRus, subtractionWorksheets.get(12).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng,
                subtractionWorksheets.get(0).numbersRangeStart, subtractionWorksheets.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets,
                subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(0).gradeEng, subtractionWorksheets.get(0).totalPageOfWorksheets, subtractionWorksheets.get(0).topicEng,
                subtractionWorksheets.get(0).h2Eng, subtractionWorksheets.get(0).shortProblemDescriptionEng, subtractionWorksheets.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng,
                subtractionWorksheets.get(1).numbersRangeStart, subtractionWorksheets.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets,
                subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(1).gradeEng, subtractionWorksheets.get(1).totalPageOfWorksheets, subtractionWorksheets.get(1).topicEng,
                subtractionWorksheets.get(1).h2Eng, subtractionWorksheets.get(1).shortProblemDescriptionEng, subtractionWorksheets.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng,
                subtractionWorksheets.get(2).numbersRangeStart, subtractionWorksheets.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets,
                subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(2).gradeEng, subtractionWorksheets.get(2).totalPageOfWorksheets, subtractionWorksheets.get(2).topicEng,
                subtractionWorksheets.get(2).h2Eng, subtractionWorksheets.get(2).shortProblemDescriptionEng, subtractionWorksheets.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng,
                subtractionWorksheets.get(3).numbersRangeStart, subtractionWorksheets.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets,
                subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(3).gradeEng, subtractionWorksheets.get(3).totalPageOfWorksheets, subtractionWorksheets.get(3).topicEng,
                subtractionWorksheets.get(3).h2Eng, subtractionWorksheets.get(3).shortProblemDescriptionEng, subtractionWorksheets.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng,
                subtractionWorksheets.get(4).numbersRangeStart, subtractionWorksheets.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets,
                subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(4).gradeEng, subtractionWorksheets.get(4).totalPageOfWorksheets, subtractionWorksheets.get(4).topicEng,
                subtractionWorksheets.get(4).h2Eng, subtractionWorksheets.get(4).shortProblemDescriptionEng, subtractionWorksheets.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng,
                subtractionWorksheets.get(5).numbersRangeStart, subtractionWorksheets.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets,
                subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(5).gradeEng, subtractionWorksheets.get(5).totalPageOfWorksheets, subtractionWorksheets.get(5).topicEng,
                subtractionWorksheets.get(5).h2Eng, subtractionWorksheets.get(5).shortProblemDescriptionEng, subtractionWorksheets.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng,
                subtractionWorksheets.get(6).numbersRangeStart, subtractionWorksheets.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets,
                subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(6).gradeEng, subtractionWorksheets.get(6).totalPageOfWorksheets, subtractionWorksheets.get(6).topicEng,
                subtractionWorksheets.get(6).h2Eng, subtractionWorksheets.get(6).shortProblemDescriptionEng, subtractionWorksheets.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng,
                subtractionWorksheets.get(7).numbersRangeStart, subtractionWorksheets.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets,
                subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(7).gradeEng, subtractionWorksheets.get(7).totalPageOfWorksheets, subtractionWorksheets.get(7).topicEng,
                subtractionWorksheets.get(7).h2Eng, subtractionWorksheets.get(7).shortProblemDescriptionEng, subtractionWorksheets.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng,
                subtractionWorksheets.get(8).numbersRangeStart, subtractionWorksheets.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets,
                subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(8).gradeEng, subtractionWorksheets.get(8).totalPageOfWorksheets, subtractionWorksheets.get(8).topicEng,
                subtractionWorksheets.get(8).h2Eng, subtractionWorksheets.get(8).shortProblemDescriptionEng, subtractionWorksheets.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng,
                subtractionWorksheets.get(9).numbersRangeStart, subtractionWorksheets.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets,
                subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(9).gradeEng, subtractionWorksheets.get(9).totalPageOfWorksheets, subtractionWorksheets.get(9).topicEng,
                subtractionWorksheets.get(9).h2Eng, subtractionWorksheets.get(9).shortProblemDescriptionEng, subtractionWorksheets.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng,
                subtractionWorksheets.get(10).numbersRangeStart, subtractionWorksheets.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets,
                subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(10).gradeEng, subtractionWorksheets.get(10).totalPageOfWorksheets, subtractionWorksheets.get(10).topicEng,
                subtractionWorksheets.get(10).h2Eng, subtractionWorksheets.get(10).shortProblemDescriptionEng, subtractionWorksheets.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng,
                subtractionWorksheets.get(11).numbersRangeStart, subtractionWorksheets.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets,
                subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(11).gradeEng, subtractionWorksheets.get(11).totalPageOfWorksheets, subtractionWorksheets.get(11).topicEng,
                subtractionWorksheets.get(11).h2Eng, subtractionWorksheets.get(11).shortProblemDescriptionEng, subtractionWorksheets.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng,
                subtractionWorksheets.get(12).numbersRangeStart, subtractionWorksheets.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets,
                subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheets.get(12).gradeEng, subtractionWorksheets.get(12).totalPageOfWorksheets, subtractionWorksheets.get(12).topicEng,
                subtractionWorksheets.get(12).h2Eng, subtractionWorksheets.get(12).shortProblemDescriptionEng, subtractionWorksheets.get(12).longProblemDescriptionEng);

        //Subtraction in columns

        List<SubtractionWorksheets> subtractionWorksheetsColumn = new ArrayList<>();

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 0 столбиком.","Subtract. Subtract 0 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 0 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 0 столбиком.",
                "Subtract 0 from a number in column.",
                "вычти число 0 из заданного числа столбиком.",
                "Subtract 0 from a number in column.",
                0, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 1 столбиком.","Subtract. Subtract 1 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 1 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 1 столбиком.",
                "Subtract 1 from a number in column.",
                "вычти число 1 из заданного числа столбиком.",
                "Subtract 1 from a number in column.",
                1, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 2.","Subtract. Subtract 2 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 2 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 2 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 2 столбиком.",
                "Subtract 2 from a number in column.",
                "вычти число 2 из заданного числа столбиком.",
                "Subtract 2 from a number in column.",
                2, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 3 столбиком.","Subtract in column. Subtract 3 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 3 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 3 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 3 столбиком.",
                "Subtract 3 from a number in column.",
                "вычти число 3 из заданного числа столбиком.",
                "Subtract 3 from a number in column.",
                3, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 4 столбиком.","Subtract. Subtract 4 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 4 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 4 столбиком.",
                "Subtract 4 from a number in column.",
                "вычти число 4 из заданного числа столбиком.",
                "Subtract 4 from a number in column.",
                4, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 5 столбиком.","Subtract. Subtract 5 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 5. Задачи с ответами столбиком. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 5 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 5 столбиком.",
                "Subtract 5 from a number in column.",
                "вычти число 5 из заданного числа столбиком.",
                "Subtract 5 from a number in column.",
                5, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 6 столбиком.","Subtract. Subtract 6 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 6 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 6 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 6 столбиком.",
                "Subtract 6 from a number in column.",
                "вычти число 6 из заданного числа столбиком.",
                "Subtract 6 from a number in column.",
                6, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 7 столбиком.","Subtract. Subtract 7 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 7 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 7 столбиком.",
                "Subtract 7 from a number in column.",
                "вычти число 7 из заданного числа столбиком.",
                "Subtract 7 from a number in column.",
                7, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 8 столбиком.","Subtract. Subtract 8 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 8 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 8 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 8 столбиком.",
                "Subtract 8 from a number in column.",
                "вычти число 8 из заданного числа столбиком.",
                "Subtract 8 from a number in column.",
                8, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 9 столбиком.","Subtract. Subtract 9 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 9 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 9 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 9 столбиком.",
                "Subtract 9 from a number in column.",
                "вычти число 9 из заданного числа столбиком.",
                "Subtract 9 from a number in column.",
                9, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание числа 10 столбиком.","Subtract. Subtract 10 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 10 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 10 from a number in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 10 столбиком.",
                "Subtract 10 from a number in column.",
                "вычти число 10 из заданного числа столбиком.",
                "Subtract 10 from a number in column.",
                10, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание однозначных чисел столбиком.","Subtract. Subtract 1 digit numbers in columns in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание однозначных чисел столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 digit numbers in columns in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание однозначных чисел столбиком.",
                "Subtract 1 digit numbers in columns in column.",
                "Вычти однозначные числа столбиком.",
                "Subtract 1 digit numbers in columns in column.",
                0, 9, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание двузначных чисел.","Subtract. Subtract 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание двузначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 2 digit numbers in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание двузначных чисел.",
                "Subtract 2 digit numbers in column.",
                "Вычти двузначные числа.",
                "Subtract 2 digit numbers in column.",
                0, 99, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание трехзначных чисел.","Subtract. Subtract 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание трехзначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 3 digit numbers in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание трехзначных чисел.",
                "Subtract 3 digit numbers in column.",
                "Вычти трехзначные числа.",
                "Subtract 3 digit numbers in column.",
                0, 999, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание многозначных чисел.","Subtract. Subtract multi digit numbers in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание многозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract multi digit numbers in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание многозначных чисел.",
                "Subtract multi digit numbers in column.",
                "Вычти многозначные числа.",
                "Subtract multi digit numbers in column.",
                0, 9999, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание чисел до 10 столбиком.","Subtract. Subtract numbers up to 10 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 10 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 10 столбиком.",
                "Subtract numbers up to 10 in column.",
                "Вычти числа до 10 столбиком.",
                "Subtract numbers up to 10 in column.",
                0, 10, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание чисел до 20.","Subtract. Subtract numbers up to 20 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 20. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 20 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 20.",
                "Subtract numbers up to 20 in column.",
                "Вычти числа до 20.",
                "Subtract numbers up to 20 in column.",
                0, 20, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание чисел до 50.","Subtract. Subtract numbers up to 50 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 50. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 50 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 50.",
                "Subtract numbers up to 50 in column.",
                "Вычти числа до 50.",
                "Subtract numbers up to 50 in column.",
                0, 50, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание чисел до 100.","Subtract. Subtract numbers up to 100 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 100 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 100.",
                "Subtract numbers up to 100 in column.",
                "Вычти числа до 100.",
                "Subtract numbers up to 100 in column.",
                0, 100, 6));

        subtractionWorksheetsColumn.add( new SubtractionWorksheets(
                "&thinsp;", "&nbsp",
                "Вычитание. Вычитание чисел до 1000.","Subtract. Subtract numbers up to 1000.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 1000. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 1000 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 1000.",
                "Subtract numbers up to 1000 in column.",
                "Вычти числа до 1000.",
                "Subtract numbers up to 1000 in column.",
                0, 1000, 6));


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(0).numbersRangeStart, subtractionWorksheetsColumn.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeRus, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets, subtractionWorksheetsColumn.get(0).topicRus,
                subtractionWorksheetsColumn.get(0).h2Rus, subtractionWorksheetsColumn.get(0).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(1).numbersRangeStart, subtractionWorksheetsColumn.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeRus, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets, subtractionWorksheetsColumn.get(1).topicRus,
                subtractionWorksheetsColumn.get(1).h2Rus, subtractionWorksheetsColumn.get(1).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(2).numbersRangeStart, subtractionWorksheetsColumn.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeRus, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets, subtractionWorksheetsColumn.get(2).topicRus,
                subtractionWorksheetsColumn.get(2).h2Rus, subtractionWorksheetsColumn.get(2).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(3).numbersRangeStart, subtractionWorksheetsColumn.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeRus, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets, subtractionWorksheetsColumn.get(3).topicRus,
                subtractionWorksheetsColumn.get(3).h2Rus, subtractionWorksheetsColumn.get(3).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(4).numbersRangeStart, subtractionWorksheetsColumn.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeRus, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets, subtractionWorksheetsColumn.get(4).topicRus,
                subtractionWorksheetsColumn.get(4).h2Rus, subtractionWorksheetsColumn.get(4).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(5).numbersRangeStart, subtractionWorksheetsColumn.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeRus, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets, subtractionWorksheetsColumn.get(5).topicRus,
                subtractionWorksheetsColumn.get(5).h2Rus, subtractionWorksheetsColumn.get(5).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(6).numbersRangeStart, subtractionWorksheetsColumn.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeRus, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets, subtractionWorksheetsColumn.get(6).topicRus,
                subtractionWorksheetsColumn.get(6).h2Rus, subtractionWorksheetsColumn.get(6).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(7).numbersRangeStart, subtractionWorksheetsColumn.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeRus, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets, subtractionWorksheetsColumn.get(7).topicRus,
                subtractionWorksheetsColumn.get(7).h2Rus, subtractionWorksheetsColumn.get(7).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(8).numbersRangeStart, subtractionWorksheetsColumn.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeRus, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets, subtractionWorksheetsColumn.get(8).topicRus,
                subtractionWorksheetsColumn.get(8).h2Rus, subtractionWorksheetsColumn.get(8).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(9).numbersRangeStart, subtractionWorksheetsColumn.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeRus, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets, subtractionWorksheetsColumn.get(9).topicRus,
                subtractionWorksheetsColumn.get(9).h2Rus, subtractionWorksheetsColumn.get(9).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(10).numbersRangeStart, subtractionWorksheetsColumn.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeRus, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets, subtractionWorksheetsColumn.get(10).topicRus,
                subtractionWorksheetsColumn.get(10).h2Rus, subtractionWorksheetsColumn.get(10).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(11).numbersRangeStart, subtractionWorksheetsColumn.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeRus, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets, subtractionWorksheetsColumn.get(11).topicRus,
                subtractionWorksheetsColumn.get(11).h2Rus, subtractionWorksheetsColumn.get(11).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(12).numbersRangeStart, subtractionWorksheetsColumn.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeRus, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets, subtractionWorksheetsColumn.get(12).topicRus,
                subtractionWorksheetsColumn.get(12).h2Rus, subtractionWorksheetsColumn.get(12).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(13).numbersRangeStart, subtractionWorksheetsColumn.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeRus, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets, subtractionWorksheetsColumn.get(13).topicRus,
                subtractionWorksheetsColumn.get(13).h2Rus, subtractionWorksheetsColumn.get(13).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(14).numbersRangeStart, subtractionWorksheetsColumn.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeRus, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets, subtractionWorksheetsColumn.get(14).topicRus,
                subtractionWorksheetsColumn.get(14).h2Rus, subtractionWorksheetsColumn.get(14).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(15).numbersRangeStart, subtractionWorksheetsColumn.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeRus, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets, subtractionWorksheetsColumn.get(15).topicRus,
                subtractionWorksheetsColumn.get(15).h2Rus, subtractionWorksheetsColumn.get(15).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(15).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(16).numbersRangeStart, subtractionWorksheetsColumn.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeRus, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets, subtractionWorksheetsColumn.get(16).topicRus,
                subtractionWorksheetsColumn.get(16).h2Rus, subtractionWorksheetsColumn.get(16).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(16).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(17).numbersRangeStart, subtractionWorksheetsColumn.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeRus, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets, subtractionWorksheetsColumn.get(17).topicRus,
                subtractionWorksheetsColumn.get(17).h2Rus, subtractionWorksheetsColumn.get(17).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(17).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(18).numbersRangeStart, subtractionWorksheetsColumn.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeRus, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets, subtractionWorksheetsColumn.get(18).topicRus,
                subtractionWorksheetsColumn.get(18).h2Rus, subtractionWorksheetsColumn.get(18).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(18).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus,
                subtractionWorksheetsColumn.get(19).numbersRangeStart, subtractionWorksheetsColumn.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeRus, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets, subtractionWorksheetsColumn.get(19).topicRus,
                subtractionWorksheetsColumn.get(19).h2Rus, subtractionWorksheetsColumn.get(19).shortProblemDescriptionRus, subtractionWorksheetsColumn.get(19).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(0).numbersRangeStart, subtractionWorksheetsColumn.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(0).gradeEng, subtractionWorksheetsColumn.get(0).totalPageOfWorksheets, subtractionWorksheetsColumn.get(0).topicEng,
                subtractionWorksheetsColumn.get(0).h2Eng, subtractionWorksheetsColumn.get(0).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(1).numbersRangeStart, subtractionWorksheetsColumn.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(1).gradeEng, subtractionWorksheetsColumn.get(1).totalPageOfWorksheets, subtractionWorksheetsColumn.get(1).topicEng,
                subtractionWorksheetsColumn.get(1).h2Eng, subtractionWorksheetsColumn.get(1).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(2).numbersRangeStart, subtractionWorksheetsColumn.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(2).gradeEng, subtractionWorksheetsColumn.get(2).totalPageOfWorksheets, subtractionWorksheetsColumn.get(2).topicEng,
                subtractionWorksheetsColumn.get(2).h2Eng, subtractionWorksheetsColumn.get(2).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(3).numbersRangeStart, subtractionWorksheetsColumn.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(3).gradeEng, subtractionWorksheetsColumn.get(3).totalPageOfWorksheets, subtractionWorksheetsColumn.get(3).topicEng,
                subtractionWorksheetsColumn.get(3).h2Eng, subtractionWorksheetsColumn.get(3).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(4).numbersRangeStart, subtractionWorksheetsColumn.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(4).gradeEng, subtractionWorksheetsColumn.get(4).totalPageOfWorksheets, subtractionWorksheetsColumn.get(4).topicEng,
                subtractionWorksheetsColumn.get(4).h2Eng, subtractionWorksheetsColumn.get(4).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(5).numbersRangeStart, subtractionWorksheetsColumn.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(5).gradeEng, subtractionWorksheetsColumn.get(5).totalPageOfWorksheets, subtractionWorksheetsColumn.get(5).topicEng,
                subtractionWorksheetsColumn.get(5).h2Eng, subtractionWorksheetsColumn.get(5).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(6).numbersRangeStart, subtractionWorksheetsColumn.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(6).gradeEng, subtractionWorksheetsColumn.get(6).totalPageOfWorksheets, subtractionWorksheetsColumn.get(6).topicEng,
                subtractionWorksheetsColumn.get(6).h2Eng, subtractionWorksheetsColumn.get(6).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(7).numbersRangeStart, subtractionWorksheetsColumn.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(7).gradeEng, subtractionWorksheetsColumn.get(7).totalPageOfWorksheets, subtractionWorksheetsColumn.get(7).topicEng,
                subtractionWorksheetsColumn.get(7).h2Eng, subtractionWorksheetsColumn.get(7).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(8).numbersRangeStart, subtractionWorksheetsColumn.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(8).gradeEng, subtractionWorksheetsColumn.get(8).totalPageOfWorksheets, subtractionWorksheetsColumn.get(8).topicEng,
                subtractionWorksheetsColumn.get(8).h2Eng, subtractionWorksheetsColumn.get(8).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(9).numbersRangeStart, subtractionWorksheetsColumn.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(9).gradeEng, subtractionWorksheetsColumn.get(9).totalPageOfWorksheets, subtractionWorksheetsColumn.get(9).topicEng,
                subtractionWorksheetsColumn.get(9).h2Eng, subtractionWorksheetsColumn.get(9).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(10).numbersRangeStart, subtractionWorksheetsColumn.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(10).gradeEng, subtractionWorksheetsColumn.get(10).totalPageOfWorksheets, subtractionWorksheetsColumn.get(10).topicEng,
                subtractionWorksheetsColumn.get(10).h2Eng, subtractionWorksheetsColumn.get(10).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(11).numbersRangeStart, subtractionWorksheetsColumn.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(11).gradeEng, subtractionWorksheetsColumn.get(11).totalPageOfWorksheets, subtractionWorksheetsColumn.get(11).topicEng,
                subtractionWorksheetsColumn.get(11).h2Eng, subtractionWorksheetsColumn.get(11).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(12).numbersRangeStart, subtractionWorksheetsColumn.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(12).gradeEng, subtractionWorksheetsColumn.get(12).totalPageOfWorksheets, subtractionWorksheetsColumn.get(12).topicEng,
                subtractionWorksheetsColumn.get(12).h2Eng, subtractionWorksheetsColumn.get(12).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(13).numbersRangeStart, subtractionWorksheetsColumn.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(13).gradeEng, subtractionWorksheetsColumn.get(13).totalPageOfWorksheets, subtractionWorksheetsColumn.get(13).topicEng,
                subtractionWorksheetsColumn.get(13).h2Eng, subtractionWorksheetsColumn.get(13).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(14).numbersRangeStart, subtractionWorksheetsColumn.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(14).gradeEng, subtractionWorksheetsColumn.get(14).totalPageOfWorksheets, subtractionWorksheetsColumn.get(14).topicEng,
                subtractionWorksheetsColumn.get(14).h2Eng, subtractionWorksheetsColumn.get(14).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(14).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(15).numbersRangeStart, subtractionWorksheetsColumn.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(15).gradeEng, subtractionWorksheetsColumn.get(15).totalPageOfWorksheets, subtractionWorksheetsColumn.get(15).topicEng,
                subtractionWorksheetsColumn.get(15).h2Eng, subtractionWorksheetsColumn.get(15).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(15).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(16).numbersRangeStart, subtractionWorksheetsColumn.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(16).gradeEng, subtractionWorksheetsColumn.get(16).totalPageOfWorksheets, subtractionWorksheetsColumn.get(16).topicEng,
                subtractionWorksheetsColumn.get(16).h2Eng, subtractionWorksheetsColumn.get(16).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(17).numbersRangeStart, subtractionWorksheetsColumn.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(17).gradeEng, subtractionWorksheetsColumn.get(17).totalPageOfWorksheets, subtractionWorksheetsColumn.get(17).topicEng,
                subtractionWorksheetsColumn.get(17).h2Eng, subtractionWorksheetsColumn.get(17).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(17).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(18).numbersRangeStart, subtractionWorksheetsColumn.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(18).gradeEng, subtractionWorksheetsColumn.get(18).totalPageOfWorksheets, subtractionWorksheetsColumn.get(18).topicEng,
                subtractionWorksheetsColumn.get(18).h2Eng, subtractionWorksheetsColumn.get(18).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(18).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng,
                subtractionWorksheetsColumn.get(19).numbersRangeStart, subtractionWorksheetsColumn.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets,
                subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, subtractionWorksheetsColumn.get(19).gradeEng, subtractionWorksheetsColumn.get(19).totalPageOfWorksheets, subtractionWorksheetsColumn.get(19).topicEng,
                subtractionWorksheetsColumn.get(19).h2Eng, subtractionWorksheetsColumn.get(19).shortProblemDescriptionEng, subtractionWorksheetsColumn.get(19).longProblemDescriptionEng);

        General.finalRenameFiles("d:/Java_Math/Html/");
        General.finalRenameFiles("D:\\Java_Math\\Pdf");
    }
}
