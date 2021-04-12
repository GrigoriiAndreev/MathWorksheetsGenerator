package MathPackage;

import java.util.ArrayList;
import java.util.List;

public class AdditionTopic {
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

    public AdditionTopic(
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




// Сложение - закончено

        List<AllTopics> allTopicsAdd = new ArrayList<>();

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 100.","Addition. Addition numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100.",
                "Addition of numbers up to 100.",
                "Сложи числа до 100.",
                "Add numbers up to 100.",
                0, 99, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение однозначных чисел.","Addition. Addition 1 digit numbers in columns.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers in columns. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел.",
                "Addition 1 digit numbers in columns.",
                "Сложи однозначные числа.",
                "Add 1 digit numbers in columns.",
                0, 9, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение двузначных чисел.","Addition. Two digit numbers addition.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Two-digit numbers addition. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел.",
                "Two-digit numbers addition.",
                "Сложи двузначные числа.",
                "Add two-digit numbers.",
                10, 99, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение однозначных чисел в стролбик.","Addition. Addition 1 digit numbers in columns in column.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers in columns in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел в столбик.",
                "Addition 1 digit numbers in columns in column.",
                "Сложи однозначные числа в столбик.",
                "Add 1 digit numbers in columns in column.",
                0, 9, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение двузначных чисел в стролбик.","Addition. Addition 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел в столбик.",
                "Addition two digit numbers in column.",
                "Сложи двузначные числа в столбик.",
                "Add two digit numbers in column.",
                10, 99, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение трехзначных чисел в стролбик.","Addition. Addition 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение трехначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 3 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение трехзначных чисел в столбик.",
                "Addition three digit numbers in column.",
                "Сложи трехзначные числа в столбик.",
                "Add three digit numbers in column.",
                100, 999, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение четырехзначных чисел в стролбик.","Addition. Addition 4 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение четырехзначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 4 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четырехзначных чисел в столбик.",
                "Addition four digit numbers in column.",
                "Сложи четырехзначные числа в столбик.",
                "Add four digit numbers in column.",
                1000, 9999, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение многозначных чисел в стролбик.","Addition. Addition multi digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение многозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition multi digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение многозначных чисел в столбик.",
                "Addition multi digit numbers in column.",
                "Сложи многозначные числа в столбик.",
                "Add multi digit numbers in column.",
                100000, 9999999, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение четных чисел в стролбик.","Addition. Addition even numbers in column.",
                "Задачи по математике на тему:<br />Сложение четных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition even numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четных чисел в столбик.",
                "Addition even numbers in column.",
                "Сложи четные числа в столбик.",
                "Add even numbers in column.",
                100, 9999, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение нечетных чисел в стролбик.","Addition. Addition odd numbers in column.",
                "Задачи по математике на тему:<br />Сложение нечетных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition odd numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение нечетных чисел в столбик.",
                "Addition odd numbers in column.",
                "Сложи нечетные числа в столбик.",
                "Add odd numbers in column.",
                100, 9999, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 10.","Addition. Addition numbers up to 10 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 10 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10 в столбик.",
                "Addition numbers up to 10 in column.",
                "Сложи числа до 10.",
                "Add numbers up to 10 in column.",
                0, 10, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 20.","Addition. Addition numbers up to 20 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 20 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 20 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 20 в столбик.",
                "Addition numbers up to 20 in column.",
                "Сложи числа до 20.",
                "Add numbers up to 20 in column.",
                0, 20, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 50.","Addition. Addition numbers up to 50 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 50 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 50 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 50 в столбик.",
                "Addition numbers up to 50 in column.",
                "Сложи числа до 50.",
                "Add numbers up to 50 in column.",
                0, 50, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 100.","Addition. Addition numbers up to 100 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 100 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100 в столбик.",
                "Addition numbers up to 100 in column.",
                "Сложи числа до 100 в столбик.",
                "Add numbers up to 100 in column.",
                0, 100, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 1000.","Addition. Addition numbers up to 1000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 1000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 1000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 1000 в столбик.",
                "Addition numbers up to 1000 in column.",
                "Сложи числа до 1000.",
                "Add numbers up to 1000 in column.",
                0, 1000, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 10000.","Addition. Addition numbers up to 1000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 10000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10000 в столбик.",
                "Addition numbers up to 10000 in column.",
                "Сложи числа до 10000.",
                "Add numbers up to 10000 in column.",
                0, 10000, 6));


        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 100000.","Addition. Addition numbers up to 10000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 100000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100000 в столбик.",
                "Addition numbers up to 100000 in column.",
                "Сложи числа до 100000.",
                "Add numbers up to 100000 in column.",
                0, 100000, 6));

        allTopicsAdd.add( new AllTopics(
                "", "&nbsp",
                "Сложение. Сложение чисел до 1000000.","Addition. Addition numbers up to 100000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 1000000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 1000000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 1000000 в столбик.",
                "Addition numbers up to 1000000 in column.",
                "Сложи числа до 1000000.",
                "Add numbers up to 1000000 in column.",
                0, 1000000, 6));



        General.emptyAllFolders();

// Сложение в строчку
        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus,
                allTopicsAdd.get(0).numbersRangeStart, allTopicsAdd.get(0).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeRus, allTopicsAdd.get(0).totalPageOfWorksheets, allTopicsAdd.get(0).topicRus,
                allTopicsAdd.get(0).h2Rus, allTopicsAdd.get(0).shortProblemDescriptionRus, allTopicsAdd.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng,
                allTopicsAdd.get(0).numbersRangeStart, allTopicsAdd.get(0).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets,
                allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(0).gradeEng, allTopicsAdd.get(0).totalPageOfWorksheets, allTopicsAdd.get(0).topicEng,
                allTopicsAdd.get(0).h2Eng, allTopicsAdd.get(0).shortProblemDescriptionEng, allTopicsAdd.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus,
                allTopicsAdd.get(1).numbersRangeStart, allTopicsAdd.get(1).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeRus, allTopicsAdd.get(1).totalPageOfWorksheets, allTopicsAdd.get(1).topicRus,
                allTopicsAdd.get(1).h2Rus, allTopicsAdd.get(1).shortProblemDescriptionRus, allTopicsAdd.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng,
                allTopicsAdd.get(1).numbersRangeStart, allTopicsAdd.get(1).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets,
                allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(1).gradeEng, allTopicsAdd.get(1).totalPageOfWorksheets, allTopicsAdd.get(1).topicEng,
                allTopicsAdd.get(1).h2Eng, allTopicsAdd.get(1).shortProblemDescriptionEng, allTopicsAdd.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus,
                allTopicsAdd.get(2).numbersRangeStart, allTopicsAdd.get(2).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeRus, allTopicsAdd.get(2).totalPageOfWorksheets, allTopicsAdd.get(2).topicRus,
                allTopicsAdd.get(2).h2Rus, allTopicsAdd.get(2).shortProblemDescriptionRus, allTopicsAdd.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng );
        Matrix.addA1_B1LineWorksheetA4(General.workingFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng,
                allTopicsAdd.get(2).numbersRangeStart, allTopicsAdd.get(2).numbersRangeEnd, 10, 13, 5);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets,
                allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(2).gradeEng, allTopicsAdd.get(2).totalPageOfWorksheets, allTopicsAdd.get(2).topicEng,
                allTopicsAdd.get(2).h2Eng, allTopicsAdd.get(2).shortProblemDescriptionEng, allTopicsAdd.get(2).longProblemDescriptionEng);

//Сложение в столбик
        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus,
                allTopicsAdd.get(3).numbersRangeStart, allTopicsAdd.get(3).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeRus, allTopicsAdd.get(3).totalPageOfWorksheets, allTopicsAdd.get(3).topicRus,
                allTopicsAdd.get(3).h2Rus, allTopicsAdd.get(3).shortProblemDescriptionRus, allTopicsAdd.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng,
                allTopicsAdd.get(3).numbersRangeStart, allTopicsAdd.get(3).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets,
                allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(3).gradeEng, allTopicsAdd.get(3).totalPageOfWorksheets, allTopicsAdd.get(3).topicEng,
                allTopicsAdd.get(3).h2Eng, allTopicsAdd.get(3).shortProblemDescriptionEng, allTopicsAdd.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus,
                allTopicsAdd.get(4).numbersRangeStart, allTopicsAdd.get(4).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeRus, allTopicsAdd.get(4).totalPageOfWorksheets, allTopicsAdd.get(4).topicRus,
                allTopicsAdd.get(4).h2Rus, allTopicsAdd.get(4).shortProblemDescriptionRus, allTopicsAdd.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng,
                allTopicsAdd.get(4).numbersRangeStart, allTopicsAdd.get(4).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets,
                allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(4).gradeEng, allTopicsAdd.get(4).totalPageOfWorksheets, allTopicsAdd.get(4).topicEng,
                allTopicsAdd.get(4).h2Eng, allTopicsAdd.get(4).shortProblemDescriptionEng, allTopicsAdd.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus,
                allTopicsAdd.get(5).numbersRangeStart, allTopicsAdd.get(5).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeRus, allTopicsAdd.get(5).totalPageOfWorksheets, allTopicsAdd.get(5).topicRus,
                allTopicsAdd.get(5).h2Rus, allTopicsAdd.get(5).shortProblemDescriptionRus, allTopicsAdd.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng,
                allTopicsAdd.get(5).numbersRangeStart, allTopicsAdd.get(5).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets,
                allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(5).gradeEng, allTopicsAdd.get(5).totalPageOfWorksheets, allTopicsAdd.get(5).topicEng,
                allTopicsAdd.get(5).h2Eng, allTopicsAdd.get(5).shortProblemDescriptionEng, allTopicsAdd.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus,
                allTopicsAdd.get(6).numbersRangeStart, allTopicsAdd.get(6).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeRus, allTopicsAdd.get(6).totalPageOfWorksheets, allTopicsAdd.get(6).topicRus,
                allTopicsAdd.get(6).h2Rus, allTopicsAdd.get(6).shortProblemDescriptionRus, allTopicsAdd.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng,
                allTopicsAdd.get(6).numbersRangeStart, allTopicsAdd.get(6).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets,
                allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(6).gradeEng, allTopicsAdd.get(6).totalPageOfWorksheets, allTopicsAdd.get(6).topicEng,
                allTopicsAdd.get(6).h2Eng, allTopicsAdd.get(6).shortProblemDescriptionEng, allTopicsAdd.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus,
                allTopicsAdd.get(7).numbersRangeStart, allTopicsAdd.get(7).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeRus, allTopicsAdd.get(7).totalPageOfWorksheets, allTopicsAdd.get(7).topicRus,
                allTopicsAdd.get(7).h2Rus, allTopicsAdd.get(7).shortProblemDescriptionRus, allTopicsAdd.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng,
                allTopicsAdd.get(7).numbersRangeStart, allTopicsAdd.get(7).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets,
                allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(7).gradeEng, allTopicsAdd.get(7).totalPageOfWorksheets, allTopicsAdd.get(7).topicEng,
                allTopicsAdd.get(7).h2Eng, allTopicsAdd.get(7).shortProblemDescriptionEng, allTopicsAdd.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus,
                allTopicsAdd.get(8).numbersRangeStart, allTopicsAdd.get(8).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeRus, allTopicsAdd.get(8).totalPageOfWorksheets, allTopicsAdd.get(8).topicRus,
                allTopicsAdd.get(8).h2Rus, allTopicsAdd.get(8).shortProblemDescriptionRus, allTopicsAdd.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng,
                allTopicsAdd.get(8).numbersRangeStart, allTopicsAdd.get(8).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets,
                allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(8).gradeEng, allTopicsAdd.get(8).totalPageOfWorksheets, allTopicsAdd.get(8).topicEng,
                allTopicsAdd.get(8).h2Eng, allTopicsAdd.get(8).shortProblemDescriptionEng, allTopicsAdd.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus,
                allTopicsAdd.get(9).numbersRangeStart, allTopicsAdd.get(9).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeRus, allTopicsAdd.get(9).totalPageOfWorksheets, allTopicsAdd.get(9).topicRus,
                allTopicsAdd.get(9).h2Rus, allTopicsAdd.get(9).shortProblemDescriptionRus, allTopicsAdd.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng,
                allTopicsAdd.get(9).numbersRangeStart, allTopicsAdd.get(9).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets,
                allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(9).gradeEng, allTopicsAdd.get(9).totalPageOfWorksheets, allTopicsAdd.get(9).topicEng,
                allTopicsAdd.get(9).h2Eng, allTopicsAdd.get(9).shortProblemDescriptionEng, allTopicsAdd.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus,
                allTopicsAdd.get(10).numbersRangeStart, allTopicsAdd.get(10).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeRus, allTopicsAdd.get(10).totalPageOfWorksheets, allTopicsAdd.get(10).topicRus,
                allTopicsAdd.get(10).h2Rus, allTopicsAdd.get(10).shortProblemDescriptionRus, allTopicsAdd.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng,
                allTopicsAdd.get(10).numbersRangeStart, allTopicsAdd.get(10).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets,
                allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(10).gradeEng, allTopicsAdd.get(10).totalPageOfWorksheets, allTopicsAdd.get(10).topicEng,
                allTopicsAdd.get(10).h2Eng, allTopicsAdd.get(10).shortProblemDescriptionEng, allTopicsAdd.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus,
                allTopicsAdd.get(11).numbersRangeStart, allTopicsAdd.get(11).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeRus, allTopicsAdd.get(11).totalPageOfWorksheets, allTopicsAdd.get(11).topicRus,
                allTopicsAdd.get(11).h2Rus, allTopicsAdd.get(11).shortProblemDescriptionRus, allTopicsAdd.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng,
                allTopicsAdd.get(11).numbersRangeStart, allTopicsAdd.get(11).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets,
                allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(11).gradeEng, allTopicsAdd.get(11).totalPageOfWorksheets, allTopicsAdd.get(11).topicEng,
                allTopicsAdd.get(11).h2Eng, allTopicsAdd.get(11).shortProblemDescriptionEng, allTopicsAdd.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus,
                allTopicsAdd.get(12).numbersRangeStart, allTopicsAdd.get(12).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeRus, allTopicsAdd.get(12).totalPageOfWorksheets, allTopicsAdd.get(12).topicRus,
                allTopicsAdd.get(12).h2Rus, allTopicsAdd.get(12).shortProblemDescriptionRus, allTopicsAdd.get(12).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng,
                allTopicsAdd.get(12).numbersRangeStart, allTopicsAdd.get(12).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets,
                allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(12).gradeEng, allTopicsAdd.get(12).totalPageOfWorksheets, allTopicsAdd.get(12).topicEng,
                allTopicsAdd.get(12).h2Eng, allTopicsAdd.get(12).shortProblemDescriptionEng, allTopicsAdd.get(12).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus,
                allTopicsAdd.get(13).numbersRangeStart, allTopicsAdd.get(13).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeRus, allTopicsAdd.get(13).totalPageOfWorksheets, allTopicsAdd.get(13).topicRus,
                allTopicsAdd.get(13).h2Rus, allTopicsAdd.get(13).shortProblemDescriptionRus, allTopicsAdd.get(13).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng,
                allTopicsAdd.get(13).numbersRangeStart, allTopicsAdd.get(13).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets,
                allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(13).gradeEng, allTopicsAdd.get(13).totalPageOfWorksheets, allTopicsAdd.get(13).topicEng,
                allTopicsAdd.get(13).h2Eng, allTopicsAdd.get(13).shortProblemDescriptionEng, allTopicsAdd.get(13).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus,
                allTopicsAdd.get(14).numbersRangeStart, allTopicsAdd.get(14).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeRus, allTopicsAdd.get(14).totalPageOfWorksheets, allTopicsAdd.get(14).topicRus,
                allTopicsAdd.get(14).h2Rus, allTopicsAdd.get(14).shortProblemDescriptionRus, allTopicsAdd.get(14).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng,
                allTopicsAdd.get(14).numbersRangeStart, allTopicsAdd.get(14).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets,
                allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(14).gradeEng, allTopicsAdd.get(14).totalPageOfWorksheets, allTopicsAdd.get(14).topicEng,
                allTopicsAdd.get(14).h2Eng, allTopicsAdd.get(14).shortProblemDescriptionEng, allTopicsAdd.get(14).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus,
                allTopicsAdd.get(15).numbersRangeStart, allTopicsAdd.get(15).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeRus, allTopicsAdd.get(15).totalPageOfWorksheets, allTopicsAdd.get(15).topicRus,
                allTopicsAdd.get(15).h2Rus, allTopicsAdd.get(15).shortProblemDescriptionRus, allTopicsAdd.get(15).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng,
                allTopicsAdd.get(15).numbersRangeStart, allTopicsAdd.get(15).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets,
                allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(15).gradeEng, allTopicsAdd.get(15).totalPageOfWorksheets, allTopicsAdd.get(15).topicEng,
                allTopicsAdd.get(15).h2Eng, allTopicsAdd.get(15).shortProblemDescriptionEng, allTopicsAdd.get(15).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus,
                allTopicsAdd.get(16).numbersRangeStart, allTopicsAdd.get(16).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeRus, allTopicsAdd.get(16).totalPageOfWorksheets, allTopicsAdd.get(16).topicRus,
                allTopicsAdd.get(16).h2Rus, allTopicsAdd.get(16).shortProblemDescriptionRus, allTopicsAdd.get(16).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng,
                allTopicsAdd.get(16).numbersRangeStart, allTopicsAdd.get(16).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets,
                allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(16).gradeEng, allTopicsAdd.get(16).totalPageOfWorksheets, allTopicsAdd.get(16).topicEng,
                allTopicsAdd.get(16).h2Eng, allTopicsAdd.get(16).shortProblemDescriptionEng, allTopicsAdd.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus,
                allTopicsAdd.get(17).numbersRangeStart, allTopicsAdd.get(17).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeRus, allTopicsAdd.get(17).totalPageOfWorksheets, allTopicsAdd.get(17).topicRus,
                allTopicsAdd.get(17).h2Rus, allTopicsAdd.get(17).shortProblemDescriptionRus, allTopicsAdd.get(17).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng );
        Matrix.addA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng,
                allTopicsAdd.get(17).numbersRangeStart, allTopicsAdd.get(17).numbersRangeEnd, 10, 7, 8);
        Matrix.bottomWorksheet(General.workingFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets,
                allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, allTopicsAdd.get(17).gradeEng, allTopicsAdd.get(17).totalPageOfWorksheets, allTopicsAdd.get(17).topicEng,
                allTopicsAdd.get(17).h2Eng, allTopicsAdd.get(17).shortProblemDescriptionEng, allTopicsAdd.get(17).longProblemDescriptionEng);
    }

}
