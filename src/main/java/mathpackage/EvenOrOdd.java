package mathpackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Generating EvenOrOdd worksheets for primary school (1-4 grade)
 * Author: Grigorii Andreev
 * Date: 02 February 2021
 */
public class EvenOrOdd {

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

    public EvenOrOdd(
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

        List<EvenOrOdd> evenOrOdd = new ArrayList<>();

        General.emptyAllFolders();

        evenOrOdd.add(new EvenOrOdd(
                "&ensp;", "&nbsp;",
                "Сравнение чисел до 10.", "Compare numbers up to 10.",
                "Задачи по математике на тему:<br />Сравнение чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Compare numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сравнение чисел. Сравнение чисел до 10.",
                "Numbers comparing. Compare numbers up to 10.",
                "Сравни числа до 10 и поставь правильно знак.",
                "Compare numbers up to 10. Fill in the correct sign.",
                1, 10, 6));

        Matrix.topWorksheet(General.workingFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetPdf(General.workingFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus,
                evenOrOdd.get(0).numbersRangeStart, evenOrOdd.get(0).numbersRangeEnd, 10, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeRus, evenOrOdd.get(0).totalPageOfWorksheets, evenOrOdd.get(0).topicRus,
                evenOrOdd.get(0).h2Rus, evenOrOdd.get(0).shortProblemDescriptionRus, evenOrOdd.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetPdf(General.workingFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.compareNumbersA1_B1WorksheetA4(General.workingFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng,
                evenOrOdd.get(0).numbersRangeStart, evenOrOdd.get(0).numbersRangeEnd, 10, 12, 6);
        Matrix.bottomWorksheet(General.workingFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets,
                evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, evenOrOdd.get(0).gradeEng, evenOrOdd.get(0).totalPageOfWorksheets, evenOrOdd.get(0).topicEng,
                evenOrOdd.get(0).h2Eng, evenOrOdd.get(0).shortProblemDescriptionEng, evenOrOdd.get(0).longProblemDescriptionEng);


    }

}
