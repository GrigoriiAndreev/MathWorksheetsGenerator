package MathPackage;

import java.util.ArrayList;
import java.util.List;

public class SubtractionTopic extends MainAbstractClass{

    public SubtractionTopic(
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

        readyFilesFolder = "d:/Java_Math/ReadyWorksheets/Subtraction";
        readyFilesFolderPdf = "d:/Java_Math/Pdf/Subtraction";
        readyFilesFolderHtml = "d:/Java_Math/Html/Subtraction";
    }

    public static void main(String[] args) throws Exception {

        //Вычитание - закончено
        List<SubtractionTopic> allTopicsSubtract = new ArrayList<>();

/*
        Matrix.emptyFolder(General.workingFolder);
        Matrix.emptyFolder(General.readyFilesFolder);
        Matrix.emptyFolder(General.readyFilesFolderPdf);
        Matrix.emptyFolder(General.readyFilesFolderHtml);
*/


        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 0.", "Subtract. Subtract 0 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 0 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 0.",
                "Subtract 0 from a number.",
                "Вычти число 0 из заданного числа.",
                "Subtract 0 from a number.",
                0, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 1.", "Subtract. Subtract 1 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 1. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 1.",
                "Subtract 1 from a number.",
                "Вычти число 1 из заданного числа.",
                "Subtract 1 from a number.",
                1, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 2.", "Subtract. Subtract 2 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 2. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 2 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 2.",
                "Subtract 2 from a number.",
                "Вычти число 2 из заданного числа.",
                "Subtract 2 from a number.",
                2, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 3.", "Subtract. Subtract 3 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 3. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 3 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 3.",
                "Subtract 3 from a number.",
                "Вычти число 3 из заданного числа.",
                "Subtract 3 from a number.",
                3, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 4.", "Subtract. Subtract 4 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 4 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 4.",
                "Subtract 4 from a number.",
                "Вычти число 4 из заданного числа.",
                "Subtract 4 from a number.",
                4, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 5.", "Subtract. Subtract 5 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 5. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 5 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 5.",
                "Subtract 5 from a number.",
                "Вычти число 5 из заданного числа.",
                "Subtract 5 from a number.",
                5, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 6.", "Subtract. Subtract 6 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 6. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 6 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 6.",
                "Subtract 6 from a number.",
                "Вычти число 6 из заданного числа.",
                "Subtract 6 from a number.",
                6, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 7.", "Subtract. Subtract 7 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 7. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 7.",
                "Subtract 7 from a number.",
                "Вычти число 7 из заданного числа.",
                "Subtract 7 from a number.",
                7, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 8.", "Subtract. Subtract 8 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 8. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 8 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 8.",
                "Subtract 8 from a number.",
                "Вычти число 8 из заданного числа.",
                "Subtract 8 from a number.",
                8, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 9.", "Subtract. Subtract 9 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 9. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 9 from a number. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 9.",
                "Subtract 9 from a number.",
                "Вычти число 9 из заданного числа.",
                "Subtract 9 from a number.",
                9, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 10.", "Subtract. Subtract 10 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 10 from a number. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 10.",
                "Subtract 10 from a number from a number.",
                "Вычти число 10 из заданного числа.",
                "Subtract 10 from a number from a number.",
                10, 99, 6));

        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание однозначных чисел.", "Subtract. Subtract 1 digit numbers in columns.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 digit numbers in columns. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание однозначных чисел.",
                "Subtract 1 digit numbers in columns.",
                "Вычти однозначные числа.",
                "Subtract 1 digit numbers in columns.",
                0, 9, 6));


        allTopicsSubtract.add(new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание чисел до 10.", "Subtract. Subtract numbers up to 10.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 10. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 10.",
                "Subtract numbers up to 10.",
                "Вычти числа до 10.",
                "Subtract numbers up to 10.",
                0, 10, 6));


        // Вычитание в строчку
        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus,
                allTopicsSubtract.get(0).numbersRangeStart, allTopicsSubtract.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeRus, allTopicsSubtract.get(0).totalPageOfWorksheets, allTopicsSubtract.get(0).topicRus,
                allTopicsSubtract.get(0).h2Rus, allTopicsSubtract.get(0).shortProblemDescriptionRus, allTopicsSubtract.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus,
                allTopicsSubtract.get(1).numbersRangeStart, allTopicsSubtract.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeRus, allTopicsSubtract.get(1).totalPageOfWorksheets, allTopicsSubtract.get(1).topicRus,
                allTopicsSubtract.get(1).h2Rus, allTopicsSubtract.get(1).shortProblemDescriptionRus, allTopicsSubtract.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus,
                allTopicsSubtract.get(2).numbersRangeStart, allTopicsSubtract.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeRus, allTopicsSubtract.get(2).totalPageOfWorksheets, allTopicsSubtract.get(2).topicRus,
                allTopicsSubtract.get(2).h2Rus, allTopicsSubtract.get(2).shortProblemDescriptionRus, allTopicsSubtract.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus,
                allTopicsSubtract.get(3).numbersRangeStart, allTopicsSubtract.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeRus, allTopicsSubtract.get(3).totalPageOfWorksheets, allTopicsSubtract.get(3).topicRus,
                allTopicsSubtract.get(3).h2Rus, allTopicsSubtract.get(3).shortProblemDescriptionRus, allTopicsSubtract.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus,
                allTopicsSubtract.get(4).numbersRangeStart, allTopicsSubtract.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeRus, allTopicsSubtract.get(4).totalPageOfWorksheets, allTopicsSubtract.get(4).topicRus,
                allTopicsSubtract.get(4).h2Rus, allTopicsSubtract.get(4).shortProblemDescriptionRus, allTopicsSubtract.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus,
                allTopicsSubtract.get(5).numbersRangeStart, allTopicsSubtract.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeRus, allTopicsSubtract.get(5).totalPageOfWorksheets, allTopicsSubtract.get(5).topicRus,
                allTopicsSubtract.get(5).h2Rus, allTopicsSubtract.get(5).shortProblemDescriptionRus, allTopicsSubtract.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus,
                allTopicsSubtract.get(6).numbersRangeStart, allTopicsSubtract.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeRus, allTopicsSubtract.get(6).totalPageOfWorksheets, allTopicsSubtract.get(6).topicRus,
                allTopicsSubtract.get(6).h2Rus, allTopicsSubtract.get(6).shortProblemDescriptionRus, allTopicsSubtract.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus,
                allTopicsSubtract.get(7).numbersRangeStart, allTopicsSubtract.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeRus, allTopicsSubtract.get(7).totalPageOfWorksheets, allTopicsSubtract.get(7).topicRus,
                allTopicsSubtract.get(7).h2Rus, allTopicsSubtract.get(7).shortProblemDescriptionRus, allTopicsSubtract.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus,
                allTopicsSubtract.get(8).numbersRangeStart, allTopicsSubtract.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeRus, allTopicsSubtract.get(8).totalPageOfWorksheets, allTopicsSubtract.get(8).topicRus,
                allTopicsSubtract.get(8).h2Rus, allTopicsSubtract.get(8).shortProblemDescriptionRus, allTopicsSubtract.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus,
                allTopicsSubtract.get(9).numbersRangeStart, allTopicsSubtract.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeRus, allTopicsSubtract.get(9).totalPageOfWorksheets, allTopicsSubtract.get(9).topicRus,
                allTopicsSubtract.get(9).h2Rus, allTopicsSubtract.get(9).shortProblemDescriptionRus, allTopicsSubtract.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus,
                allTopicsSubtract.get(10).numbersRangeStart, allTopicsSubtract.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeRus, allTopicsSubtract.get(10).totalPageOfWorksheets, allTopicsSubtract.get(10).topicRus,
                allTopicsSubtract.get(10).h2Rus, allTopicsSubtract.get(10).shortProblemDescriptionRus, allTopicsSubtract.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus,
                allTopicsSubtract.get(11).numbersRangeStart, allTopicsSubtract.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeRus, allTopicsSubtract.get(11).totalPageOfWorksheets, allTopicsSubtract.get(11).topicRus,
                allTopicsSubtract.get(11).h2Rus, allTopicsSubtract.get(11).shortProblemDescriptionRus, allTopicsSubtract.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus,
                allTopicsSubtract.get(12).numbersRangeStart, allTopicsSubtract.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeRus, allTopicsSubtract.get(12).totalPageOfWorksheets, allTopicsSubtract.get(12).topicRus,
                allTopicsSubtract.get(12).h2Rus, allTopicsSubtract.get(12).shortProblemDescriptionRus, allTopicsSubtract.get(12).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng,
                allTopicsSubtract.get(0).numbersRangeStart, allTopicsSubtract.get(0).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets,
                allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(0).gradeEng, allTopicsSubtract.get(0).totalPageOfWorksheets, allTopicsSubtract.get(0).topicEng,
                allTopicsSubtract.get(0).h2Eng, allTopicsSubtract.get(0).shortProblemDescriptionEng, allTopicsSubtract.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng,
                allTopicsSubtract.get(1).numbersRangeStart, allTopicsSubtract.get(1).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets,
                allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(1).gradeEng, allTopicsSubtract.get(1).totalPageOfWorksheets, allTopicsSubtract.get(1).topicEng,
                allTopicsSubtract.get(1).h2Eng, allTopicsSubtract.get(1).shortProblemDescriptionEng, allTopicsSubtract.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng,
                allTopicsSubtract.get(2).numbersRangeStart, allTopicsSubtract.get(2).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets,
                allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(2).gradeEng, allTopicsSubtract.get(2).totalPageOfWorksheets, allTopicsSubtract.get(2).topicEng,
                allTopicsSubtract.get(2).h2Eng, allTopicsSubtract.get(2).shortProblemDescriptionEng, allTopicsSubtract.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng,
                allTopicsSubtract.get(3).numbersRangeStart, allTopicsSubtract.get(3).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets,
                allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(3).gradeEng, allTopicsSubtract.get(3).totalPageOfWorksheets, allTopicsSubtract.get(3).topicEng,
                allTopicsSubtract.get(3).h2Eng, allTopicsSubtract.get(3).shortProblemDescriptionEng, allTopicsSubtract.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng,
                allTopicsSubtract.get(4).numbersRangeStart, allTopicsSubtract.get(4).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets,
                allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(4).gradeEng, allTopicsSubtract.get(4).totalPageOfWorksheets, allTopicsSubtract.get(4).topicEng,
                allTopicsSubtract.get(4).h2Eng, allTopicsSubtract.get(4).shortProblemDescriptionEng, allTopicsSubtract.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng,
                allTopicsSubtract.get(5).numbersRangeStart, allTopicsSubtract.get(5).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets,
                allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(5).gradeEng, allTopicsSubtract.get(5).totalPageOfWorksheets, allTopicsSubtract.get(5).topicEng,
                allTopicsSubtract.get(5).h2Eng, allTopicsSubtract.get(5).shortProblemDescriptionEng, allTopicsSubtract.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng,
                allTopicsSubtract.get(6).numbersRangeStart, allTopicsSubtract.get(6).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets,
                allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(6).gradeEng, allTopicsSubtract.get(6).totalPageOfWorksheets, allTopicsSubtract.get(6).topicEng,
                allTopicsSubtract.get(6).h2Eng, allTopicsSubtract.get(6).shortProblemDescriptionEng, allTopicsSubtract.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng,
                allTopicsSubtract.get(7).numbersRangeStart, allTopicsSubtract.get(7).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets,
                allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(7).gradeEng, allTopicsSubtract.get(7).totalPageOfWorksheets, allTopicsSubtract.get(7).topicEng,
                allTopicsSubtract.get(7).h2Eng, allTopicsSubtract.get(7).shortProblemDescriptionEng, allTopicsSubtract.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng,
                allTopicsSubtract.get(8).numbersRangeStart, allTopicsSubtract.get(8).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets,
                allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(8).gradeEng, allTopicsSubtract.get(8).totalPageOfWorksheets, allTopicsSubtract.get(8).topicEng,
                allTopicsSubtract.get(8).h2Eng, allTopicsSubtract.get(8).shortProblemDescriptionEng, allTopicsSubtract.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng,
                allTopicsSubtract.get(9).numbersRangeStart, allTopicsSubtract.get(9).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets,
                allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(9).gradeEng, allTopicsSubtract.get(9).totalPageOfWorksheets, allTopicsSubtract.get(9).topicEng,
                allTopicsSubtract.get(9).h2Eng, allTopicsSubtract.get(9).shortProblemDescriptionEng, allTopicsSubtract.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng,
                allTopicsSubtract.get(10).numbersRangeStart, allTopicsSubtract.get(10).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets,
                allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(10).gradeEng, allTopicsSubtract.get(10).totalPageOfWorksheets, allTopicsSubtract.get(10).topicEng,
                allTopicsSubtract.get(10).h2Eng, allTopicsSubtract.get(10).shortProblemDescriptionEng, allTopicsSubtract.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng,
                allTopicsSubtract.get(11).numbersRangeStart, allTopicsSubtract.get(11).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets,
                allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(11).gradeEng, allTopicsSubtract.get(11).totalPageOfWorksheets, allTopicsSubtract.get(11).topicEng,
                allTopicsSubtract.get(11).h2Eng, allTopicsSubtract.get(11).shortProblemDescriptionEng, allTopicsSubtract.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.subtractA1_B1LineWorksheetA4(General.workingFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng,
                allTopicsSubtract.get(12).numbersRangeStart, allTopicsSubtract.get(12).numbersRangeEnd, 10, 14, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets,
                allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtract.get(12).gradeEng, allTopicsSubtract.get(12).totalPageOfWorksheets, allTopicsSubtract.get(12).topicEng,
                allTopicsSubtract.get(12).h2Eng, allTopicsSubtract.get(12).shortProblemDescriptionEng, allTopicsSubtract.get(12).longProblemDescriptionEng);


        //Вычитание в столбик

        List<SubtractionTopic> allTopicsSubtractColumn = new ArrayList<>();

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 0 столбиком.","Subtract. Subtract 0 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 0. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 0 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 0 столбиком.",
                "Subtract 0 from a number in column.",
                "вычти число 0 из заданного числа столбиком.",
                "Subtract 0 from a number in column.",
                0, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 1 столбиком.","Subtract. Subtract 1 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 1 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 1 столбиком.",
                "Subtract 1 from a number in column.",
                "вычти число 1 из заданного числа столбиком.",
                "Subtract 1 from a number in column.",
                1, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 2.","Subtract. Subtract 2 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 2 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 2 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 2 столбиком.",
                "Subtract 2 from a number in column.",
                "вычти число 2 из заданного числа столбиком.",
                "Subtract 2 from a number in column.",
                2, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 3 столбиком.","Subtract in column. Subtract 3 from a number.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 3 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 3 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 3 столбиком.",
                "Subtract 3 from a number in column.",
                "вычти число 3 из заданного числа столбиком.",
                "Subtract 3 from a number in column.",
                3, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 4 столбиком.","Subtract. Subtract 4 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 4. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 4 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 4 столбиком.",
                "Subtract 4 from a number in column.",
                "вычти число 4 из заданного числа столбиком.",
                "Subtract 4 from a number in column.",
                4, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 5 столбиком.","Subtract. Subtract 5 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 5. Задачи с ответами столбиком. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 5 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 5 столбиком.",
                "Subtract 5 from a number in column.",
                "вычти число 5 из заданного числа столбиком.",
                "Subtract 5 from a number in column.",
                5, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 6 столбиком.","Subtract. Subtract 6 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 6 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 6 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 6 столбиком.",
                "Subtract 6 from a number in column.",
                "вычти число 6 из заданного числа столбиком.",
                "Subtract 6 from a number in column.",
                6, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 7 столбиком.","Subtract. Subtract 7 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 7 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 7 столбиком.",
                "Subtract 7 from a number in column.",
                "вычти число 7 из заданного числа столбиком.",
                "Subtract 7 from a number in column.",
                7, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 8 столбиком.","Subtract. Subtract 8 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 8 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 8 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 8 столбиком.",
                "Subtract 8 from a number in column.",
                "вычти число 8 из заданного числа столбиком.",
                "Subtract 8 from a number in column.",
                8, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 9 столбиком.","Subtract. Subtract 9 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 9 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 9 from a number in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 9 столбиком.",
                "Subtract 9 from a number in column.",
                "вычти число 9 из заданного числа столбиком.",
                "Subtract 9 from a number in column.",
                9, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание числа 10 столбиком.","Subtract. Subtract 10 from a number in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание числа 10 столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 10 from a number in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание числа 10 столбиком.",
                "Subtract 10 from a number in column.",
                "вычти число 10 из заданного числа столбиком.",
                "Subtract 10 from a number in column.",
                10, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание однозначных чисел столбиком.","Subtract. Subtract 1 digit numbers in columns in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание однозначных чисел столбиком. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 1 digit numbers in columns in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание однозначных чисел столбиком.",
                "Subtract 1 digit numbers in columns in column.",
                "Вычти однозначные числа столбиком.",
                "Subtract 1 digit numbers in columns in column.",
                0, 9, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание двузначных чисел.","Subtract. Subtract 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание двузначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 2 digit numbers in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание двузначных чисел.",
                "Subtract 2 digit numbers in column.",
                "Вычти двузначные числа.",
                "Subtract 2 digit numbers in column.",
                0, 99, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание трехзначных чисел.","Subtract. Subtract 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание трехзначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract 3 digit numbers in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание трехзначных чисел.",
                "Subtract 3 digit numbers in column.",
                "Вычти трехзначные числа.",
                "Subtract 3 digit numbers in column.",
                0, 999, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание многозначных чисел.","Subtract. Subtract multi digit numbers in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание многозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract multi digit numbers in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание многозначных чисел.",
                "Subtract multi digit numbers in column.",
                "Вычти многозначные числа.",
                "Subtract multi digit numbers in column.",
                0, 9999, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание чисел до 10 столбиком.","Subtract. Subtract numbers up to 10 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 10 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 10 столбиком.",
                "Subtract numbers up to 10 in column.",
                "Вычти числа до 10 столбиком.",
                "Subtract numbers up to 10 in column.",
                0, 10, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание чисел до 20.","Subtract. Subtract numbers up to 20 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 20. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 20 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 20.",
                "Subtract numbers up to 20 in column.",
                "Вычти числа до 20.",
                "Subtract numbers up to 20 in column.",
                0, 20, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание чисел до 50.","Subtract. Subtract numbers up to 50 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 50. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 50 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 50.",
                "Subtract numbers up to 50 in column.",
                "Вычти числа до 50.",
                "Subtract numbers up to 50 in column.",
                0, 50, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание чисел до 100.","Subtract. Subtract numbers up to 100 in column.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 100 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 100.",
                "Subtract numbers up to 100 in column.",
                "Вычти числа до 100.",
                "Subtract numbers up to 100 in column.",
                0, 100, 6));

        allTopicsSubtractColumn.add( new SubtractionTopic(
                "", "&nbsp",
                "Вычитание. Вычитание чисел до 1000.","Subtract. Subtract numbers up to 1000.",
                "Задачи по математике на тему:<br />Вычитание. Вычитание чисел до 1000. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Subtract numbers up to 1000 in column. Worksheets with answers from a number. Download pdf or jpg.",
                "", "",
                "Вычитание. Вычитание чисел до 1000.",
                "Subtract numbers up to 1000 in column.",
                "Вычти числа до 1000.",
                "Subtract numbers up to 1000 in column.",
                0, 1000, 6));


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(0).numbersRangeStart, allTopicsSubtractColumn.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeRus, allTopicsSubtractColumn.get(0).totalPageOfWorksheets, allTopicsSubtractColumn.get(0).topicRus,
                allTopicsSubtractColumn.get(0).h2Rus, allTopicsSubtractColumn.get(0).shortProblemDescriptionRus, allTopicsSubtractColumn.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(1).numbersRangeStart, allTopicsSubtractColumn.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeRus, allTopicsSubtractColumn.get(1).totalPageOfWorksheets, allTopicsSubtractColumn.get(1).topicRus,
                allTopicsSubtractColumn.get(1).h2Rus, allTopicsSubtractColumn.get(1).shortProblemDescriptionRus, allTopicsSubtractColumn.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(2).numbersRangeStart, allTopicsSubtractColumn.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeRus, allTopicsSubtractColumn.get(2).totalPageOfWorksheets, allTopicsSubtractColumn.get(2).topicRus,
                allTopicsSubtractColumn.get(2).h2Rus, allTopicsSubtractColumn.get(2).shortProblemDescriptionRus, allTopicsSubtractColumn.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(3).numbersRangeStart, allTopicsSubtractColumn.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeRus, allTopicsSubtractColumn.get(3).totalPageOfWorksheets, allTopicsSubtractColumn.get(3).topicRus,
                allTopicsSubtractColumn.get(3).h2Rus, allTopicsSubtractColumn.get(3).shortProblemDescriptionRus, allTopicsSubtractColumn.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(4).numbersRangeStart, allTopicsSubtractColumn.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeRus, allTopicsSubtractColumn.get(4).totalPageOfWorksheets, allTopicsSubtractColumn.get(4).topicRus,
                allTopicsSubtractColumn.get(4).h2Rus, allTopicsSubtractColumn.get(4).shortProblemDescriptionRus, allTopicsSubtractColumn.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(5).numbersRangeStart, allTopicsSubtractColumn.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeRus, allTopicsSubtractColumn.get(5).totalPageOfWorksheets, allTopicsSubtractColumn.get(5).topicRus,
                allTopicsSubtractColumn.get(5).h2Rus, allTopicsSubtractColumn.get(5).shortProblemDescriptionRus, allTopicsSubtractColumn.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(6).numbersRangeStart, allTopicsSubtractColumn.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeRus, allTopicsSubtractColumn.get(6).totalPageOfWorksheets, allTopicsSubtractColumn.get(6).topicRus,
                allTopicsSubtractColumn.get(6).h2Rus, allTopicsSubtractColumn.get(6).shortProblemDescriptionRus, allTopicsSubtractColumn.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(7).numbersRangeStart, allTopicsSubtractColumn.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeRus, allTopicsSubtractColumn.get(7).totalPageOfWorksheets, allTopicsSubtractColumn.get(7).topicRus,
                allTopicsSubtractColumn.get(7).h2Rus, allTopicsSubtractColumn.get(7).shortProblemDescriptionRus, allTopicsSubtractColumn.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(8).numbersRangeStart, allTopicsSubtractColumn.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeRus, allTopicsSubtractColumn.get(8).totalPageOfWorksheets, allTopicsSubtractColumn.get(8).topicRus,
                allTopicsSubtractColumn.get(8).h2Rus, allTopicsSubtractColumn.get(8).shortProblemDescriptionRus, allTopicsSubtractColumn.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(9).numbersRangeStart, allTopicsSubtractColumn.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeRus, allTopicsSubtractColumn.get(9).totalPageOfWorksheets, allTopicsSubtractColumn.get(9).topicRus,
                allTopicsSubtractColumn.get(9).h2Rus, allTopicsSubtractColumn.get(9).shortProblemDescriptionRus, allTopicsSubtractColumn.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(10).numbersRangeStart, allTopicsSubtractColumn.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeRus, allTopicsSubtractColumn.get(10).totalPageOfWorksheets, allTopicsSubtractColumn.get(10).topicRus,
                allTopicsSubtractColumn.get(10).h2Rus, allTopicsSubtractColumn.get(10).shortProblemDescriptionRus, allTopicsSubtractColumn.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(11).numbersRangeStart, allTopicsSubtractColumn.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeRus, allTopicsSubtractColumn.get(11).totalPageOfWorksheets, allTopicsSubtractColumn.get(11).topicRus,
                allTopicsSubtractColumn.get(11).h2Rus, allTopicsSubtractColumn.get(11).shortProblemDescriptionRus, allTopicsSubtractColumn.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(12).numbersRangeStart, allTopicsSubtractColumn.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeRus, allTopicsSubtractColumn.get(12).totalPageOfWorksheets, allTopicsSubtractColumn.get(12).topicRus,
                allTopicsSubtractColumn.get(12).h2Rus, allTopicsSubtractColumn.get(12).shortProblemDescriptionRus, allTopicsSubtractColumn.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(13).numbersRangeStart, allTopicsSubtractColumn.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeRus, allTopicsSubtractColumn.get(13).totalPageOfWorksheets, allTopicsSubtractColumn.get(13).topicRus,
                allTopicsSubtractColumn.get(13).h2Rus, allTopicsSubtractColumn.get(13).shortProblemDescriptionRus, allTopicsSubtractColumn.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(14).numbersRangeStart, allTopicsSubtractColumn.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeRus, allTopicsSubtractColumn.get(14).totalPageOfWorksheets, allTopicsSubtractColumn.get(14).topicRus,
                allTopicsSubtractColumn.get(14).h2Rus, allTopicsSubtractColumn.get(14).shortProblemDescriptionRus, allTopicsSubtractColumn.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(15).numbersRangeStart, allTopicsSubtractColumn.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeRus, allTopicsSubtractColumn.get(15).totalPageOfWorksheets, allTopicsSubtractColumn.get(15).topicRus,
                allTopicsSubtractColumn.get(15).h2Rus, allTopicsSubtractColumn.get(15).shortProblemDescriptionRus, allTopicsSubtractColumn.get(15).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(16).numbersRangeStart, allTopicsSubtractColumn.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeRus, allTopicsSubtractColumn.get(16).totalPageOfWorksheets, allTopicsSubtractColumn.get(16).topicRus,
                allTopicsSubtractColumn.get(16).h2Rus, allTopicsSubtractColumn.get(16).shortProblemDescriptionRus, allTopicsSubtractColumn.get(16).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(17).numbersRangeStart, allTopicsSubtractColumn.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeRus, allTopicsSubtractColumn.get(17).totalPageOfWorksheets, allTopicsSubtractColumn.get(17).topicRus,
                allTopicsSubtractColumn.get(17).h2Rus, allTopicsSubtractColumn.get(17).shortProblemDescriptionRus, allTopicsSubtractColumn.get(17).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(18).numbersRangeStart, allTopicsSubtractColumn.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeRus, allTopicsSubtractColumn.get(18).totalPageOfWorksheets, allTopicsSubtractColumn.get(18).topicRus,
                allTopicsSubtractColumn.get(18).h2Rus, allTopicsSubtractColumn.get(18).shortProblemDescriptionRus, allTopicsSubtractColumn.get(18).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus,
                allTopicsSubtractColumn.get(19).numbersRangeStart, allTopicsSubtractColumn.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeRus, allTopicsSubtractColumn.get(19).totalPageOfWorksheets, allTopicsSubtractColumn.get(19).topicRus,
                allTopicsSubtractColumn.get(19).h2Rus, allTopicsSubtractColumn.get(19).shortProblemDescriptionRus, allTopicsSubtractColumn.get(19).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(0).numbersRangeStart, allTopicsSubtractColumn.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(0).gradeEng, allTopicsSubtractColumn.get(0).totalPageOfWorksheets, allTopicsSubtractColumn.get(0).topicEng,
                allTopicsSubtractColumn.get(0).h2Eng, allTopicsSubtractColumn.get(0).shortProblemDescriptionEng, allTopicsSubtractColumn.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(1).numbersRangeStart, allTopicsSubtractColumn.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(1).gradeEng, allTopicsSubtractColumn.get(1).totalPageOfWorksheets, allTopicsSubtractColumn.get(1).topicEng,
                allTopicsSubtractColumn.get(1).h2Eng, allTopicsSubtractColumn.get(1).shortProblemDescriptionEng, allTopicsSubtractColumn.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(2).numbersRangeStart, allTopicsSubtractColumn.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(2).gradeEng, allTopicsSubtractColumn.get(2).totalPageOfWorksheets, allTopicsSubtractColumn.get(2).topicEng,
                allTopicsSubtractColumn.get(2).h2Eng, allTopicsSubtractColumn.get(2).shortProblemDescriptionEng, allTopicsSubtractColumn.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(3).numbersRangeStart, allTopicsSubtractColumn.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(3).gradeEng, allTopicsSubtractColumn.get(3).totalPageOfWorksheets, allTopicsSubtractColumn.get(3).topicEng,
                allTopicsSubtractColumn.get(3).h2Eng, allTopicsSubtractColumn.get(3).shortProblemDescriptionEng, allTopicsSubtractColumn.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(4).numbersRangeStart, allTopicsSubtractColumn.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(4).gradeEng, allTopicsSubtractColumn.get(4).totalPageOfWorksheets, allTopicsSubtractColumn.get(4).topicEng,
                allTopicsSubtractColumn.get(4).h2Eng, allTopicsSubtractColumn.get(4).shortProblemDescriptionEng, allTopicsSubtractColumn.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(5).numbersRangeStart, allTopicsSubtractColumn.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(5).gradeEng, allTopicsSubtractColumn.get(5).totalPageOfWorksheets, allTopicsSubtractColumn.get(5).topicEng,
                allTopicsSubtractColumn.get(5).h2Eng, allTopicsSubtractColumn.get(5).shortProblemDescriptionEng, allTopicsSubtractColumn.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(6).numbersRangeStart, allTopicsSubtractColumn.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(6).gradeEng, allTopicsSubtractColumn.get(6).totalPageOfWorksheets, allTopicsSubtractColumn.get(6).topicEng,
                allTopicsSubtractColumn.get(6).h2Eng, allTopicsSubtractColumn.get(6).shortProblemDescriptionEng, allTopicsSubtractColumn.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(7).numbersRangeStart, allTopicsSubtractColumn.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(7).gradeEng, allTopicsSubtractColumn.get(7).totalPageOfWorksheets, allTopicsSubtractColumn.get(7).topicEng,
                allTopicsSubtractColumn.get(7).h2Eng, allTopicsSubtractColumn.get(7).shortProblemDescriptionEng, allTopicsSubtractColumn.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(8).numbersRangeStart, allTopicsSubtractColumn.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(8).gradeEng, allTopicsSubtractColumn.get(8).totalPageOfWorksheets, allTopicsSubtractColumn.get(8).topicEng,
                allTopicsSubtractColumn.get(8).h2Eng, allTopicsSubtractColumn.get(8).shortProblemDescriptionEng, allTopicsSubtractColumn.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(9).numbersRangeStart, allTopicsSubtractColumn.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(9).gradeEng, allTopicsSubtractColumn.get(9).totalPageOfWorksheets, allTopicsSubtractColumn.get(9).topicEng,
                allTopicsSubtractColumn.get(9).h2Eng, allTopicsSubtractColumn.get(9).shortProblemDescriptionEng, allTopicsSubtractColumn.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(10).numbersRangeStart, allTopicsSubtractColumn.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(10).gradeEng, allTopicsSubtractColumn.get(10).totalPageOfWorksheets, allTopicsSubtractColumn.get(10).topicEng,
                allTopicsSubtractColumn.get(10).h2Eng, allTopicsSubtractColumn.get(10).shortProblemDescriptionEng, allTopicsSubtractColumn.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(11).numbersRangeStart, allTopicsSubtractColumn.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(11).gradeEng, allTopicsSubtractColumn.get(11).totalPageOfWorksheets, allTopicsSubtractColumn.get(11).topicEng,
                allTopicsSubtractColumn.get(11).h2Eng, allTopicsSubtractColumn.get(11).shortProblemDescriptionEng, allTopicsSubtractColumn.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(12).numbersRangeStart, allTopicsSubtractColumn.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(12).gradeEng, allTopicsSubtractColumn.get(12).totalPageOfWorksheets, allTopicsSubtractColumn.get(12).topicEng,
                allTopicsSubtractColumn.get(12).h2Eng, allTopicsSubtractColumn.get(12).shortProblemDescriptionEng, allTopicsSubtractColumn.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(13).numbersRangeStart, allTopicsSubtractColumn.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(13).gradeEng, allTopicsSubtractColumn.get(13).totalPageOfWorksheets, allTopicsSubtractColumn.get(13).topicEng,
                allTopicsSubtractColumn.get(13).h2Eng, allTopicsSubtractColumn.get(13).shortProblemDescriptionEng, allTopicsSubtractColumn.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(14).numbersRangeStart, allTopicsSubtractColumn.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(14).gradeEng, allTopicsSubtractColumn.get(14).totalPageOfWorksheets, allTopicsSubtractColumn.get(14).topicEng,
                allTopicsSubtractColumn.get(14).h2Eng, allTopicsSubtractColumn.get(14).shortProblemDescriptionEng, allTopicsSubtractColumn.get(14).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(15).numbersRangeStart, allTopicsSubtractColumn.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(15).gradeEng, allTopicsSubtractColumn.get(15).totalPageOfWorksheets, allTopicsSubtractColumn.get(15).topicEng,
                allTopicsSubtractColumn.get(15).h2Eng, allTopicsSubtractColumn.get(15).shortProblemDescriptionEng, allTopicsSubtractColumn.get(15).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(16).numbersRangeStart, allTopicsSubtractColumn.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(16).gradeEng, allTopicsSubtractColumn.get(16).totalPageOfWorksheets, allTopicsSubtractColumn.get(16).topicEng,
                allTopicsSubtractColumn.get(16).h2Eng, allTopicsSubtractColumn.get(16).shortProblemDescriptionEng, allTopicsSubtractColumn.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(17).numbersRangeStart, allTopicsSubtractColumn.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(17).gradeEng, allTopicsSubtractColumn.get(17).totalPageOfWorksheets, allTopicsSubtractColumn.get(17).topicEng,
                allTopicsSubtractColumn.get(17).h2Eng, allTopicsSubtractColumn.get(17).shortProblemDescriptionEng, allTopicsSubtractColumn.get(17).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(18).numbersRangeStart, allTopicsSubtractColumn.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(18).gradeEng, allTopicsSubtractColumn.get(18).totalPageOfWorksheets, allTopicsSubtractColumn.get(18).topicEng,
                allTopicsSubtractColumn.get(18).h2Eng, allTopicsSubtractColumn.get(18).shortProblemDescriptionEng, allTopicsSubtractColumn.get(18).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng );
        Matrix.subtractA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng,
                allTopicsSubtractColumn.get(19).numbersRangeStart, allTopicsSubtractColumn.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets,
                allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsSubtractColumn.get(19).gradeEng, allTopicsSubtractColumn.get(19).totalPageOfWorksheets, allTopicsSubtractColumn.get(19).topicEng,
                allTopicsSubtractColumn.get(19).h2Eng, allTopicsSubtractColumn.get(19).shortProblemDescriptionEng, allTopicsSubtractColumn.get(19).longProblemDescriptionEng);

    }
}
