package mathpackage.counting;

import mathpackage.General;
import mathpackage.Matrix;
import mathpackage.WorksheetTemplate;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static mathpackage.Matrix.*;
import static mathpackage.RandomGenerator.intNumbersRandomRangeSet;
import static mathpackage.usefullmethods.NumberToWordsEng.convertLessThanOneThousandEng;
import static mathpackage.usefullmethods.NumberToWordsRus.convertLessThanOneThousandRus;
import static java.lang.String.valueOf;

/**
 * Class generating numbers in words to numbers in digits worksheets
 * @GrigoriiAnreev
 */

public class WordsToDigitsWorksheets extends WorksheetTemplate {

    public WordsToDigitsWorksheets(
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

        List<WordsToDigitsWorksheets> wordsToDigitsWorksheets = new ArrayList<>();

        General.emptyAllFolders();

        //All topics for primary school.
        wordsToDigitsWorksheets.add(new WordsToDigitsWorksheets(
                "&thinsp;", "&nbsp;",
                "?????????? ?? ????????. ?????????????????? ?????????? ??????????????. ?????????? ???? 10.", "Counting. Writing numbers in words. Numbers up to 10.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? ??????????????. ?????????? ???? 10. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Counting. Writing numbers in words. Numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "?????????????????? ?????????? ??????????????. ?????????? ???? 10.",
                "Writing numbers in words. Numbers up to 10.",
                "???????????? ??????????, ?????????????? ???????????????? ??????????????.",
                "How do you write this number using digits.",
                0, 10, 6));

        topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        wordsToDigitsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus,
                wordsToDigitsWorksheets.get(0).numbersRangeStart, wordsToDigitsWorksheets.get(0).numbersRangeEnd,10, 5);
        bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);
        finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeRus, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets, wordsToDigitsWorksheets.get(0).topicRus,
                wordsToDigitsWorksheets.get(0).h2Rus, wordsToDigitsWorksheets.get(0).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(0).longProblemDescriptionRus);

        topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        wordsToDigitsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng,
                wordsToDigitsWorksheets.get(0).numbersRangeStart, wordsToDigitsWorksheets.get(0).numbersRangeEnd, 10, 5);
        bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);
        finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(0).gradeEng, wordsToDigitsWorksheets.get(0).totalPageOfWorksheets, wordsToDigitsWorksheets.get(0).topicEng,
                wordsToDigitsWorksheets.get(0).h2Eng, wordsToDigitsWorksheets.get(0).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(0).longProblemDescriptionEng);

        wordsToDigitsWorksheets.add(new WordsToDigitsWorksheets(
                "&thinsp;", "&nbsp;",
                "?????????? ?? ????????. ?????????????????? ?????????? ??????????????. ?????????? ???? 100.", "Counting. Writing numbers in words. Numbers up to 100.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? ??????????????. ?????????? ???? 100. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Counting. Writing numbers in words. Numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "?????????????????? ?????????? ??????????????. ?????????? ???? 100.",
                "Writing numbers in words. Numbers up to 100.",
                "???????????? ??????????, ?????????????? ???????????????? ??????????????. ?????????? ???? 100.",
                "How do you write this number using digits. Numbers up to 100.",
                0, 100, 6));

        topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        wordsToDigitsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus,
                wordsToDigitsWorksheets.get(1).numbersRangeStart, wordsToDigitsWorksheets.get(1).numbersRangeEnd,10, 5);
        bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);
        finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeRus, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets, wordsToDigitsWorksheets.get(1).topicRus,
                wordsToDigitsWorksheets.get(1).h2Rus, wordsToDigitsWorksheets.get(1).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(1).longProblemDescriptionRus);

        topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        wordsToDigitsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng,
                wordsToDigitsWorksheets.get(1).numbersRangeStart, wordsToDigitsWorksheets.get(1).numbersRangeEnd, 10, 5);
        bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);
        finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(1).gradeEng, wordsToDigitsWorksheets.get(1).totalPageOfWorksheets, wordsToDigitsWorksheets.get(1).topicEng,
                wordsToDigitsWorksheets.get(1).h2Eng, wordsToDigitsWorksheets.get(1).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(1).longProblemDescriptionEng);

        wordsToDigitsWorksheets.add(new WordsToDigitsWorksheets(
                "&thinsp;", "&nbsp;",
                "?????????? ?? ????????. ?????????????????? ?????????? ??????????????. ?????????? ???? 1000.", "Counting. Writing numbers in words. Numbers up to 1000.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? ??????????????. ?????????? ???? 1000. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Counting. Writing numbers in words. Numbers up to 1000. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "?????????????????? ?????????? ??????????????. ?????????? ???? 1000.",
                "Writing numbers in words. Numbers up to 1000.",
                "???????????? ??????????, ?????????????? ???????????????? ??????????????. ?????????? ???? 1000.",
                "How do you write this number using digits. Numbers up to 1000.",
                0, 1000, 6));

        topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        wordsToDigitsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus,
                wordsToDigitsWorksheets.get(2).numbersRangeStart, wordsToDigitsWorksheets.get(2).numbersRangeEnd,10, 5);
        bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);
        finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeRus, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets, wordsToDigitsWorksheets.get(2).topicRus,
                wordsToDigitsWorksheets.get(2).h2Rus, wordsToDigitsWorksheets.get(2).shortProblemDescriptionRus, wordsToDigitsWorksheets.get(2).longProblemDescriptionRus);

        topWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        topWorksheetPdf(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        topWorksheetHtmlAnswers(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        wordsToDigitsWorksheetA4(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng,
                wordsToDigitsWorksheets.get(2).numbersRangeStart, wordsToDigitsWorksheets.get(2).numbersRangeEnd, 10, 5);
        bottomWorksheet(General.workingFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        fullWorksheet(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        allSameWorksheets(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets,
                wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);
        finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, wordsToDigitsWorksheets.get(2).gradeEng, wordsToDigitsWorksheets.get(2).totalPageOfWorksheets, wordsToDigitsWorksheets.get(2).topicEng,
                wordsToDigitsWorksheets.get(2).h2Eng, wordsToDigitsWorksheets.get(2).shortProblemDescriptionEng, wordsToDigitsWorksheets.get(2).longProblemDescriptionEng);

    }

    public static void wordsToDigitsWorksheetA4(String workingFolder, String grade, int totalPageNumbers,
                                                String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                int numbersRangeStart, int numbersRangeEnd, int problemsLines,
                                                int problemsCols) throws IOException {

        int[] wordNumber1 = new int[problemsLines];
        int[] wordNumber2 = new int[problemsLines];
        int[][] digitNumbers1 = new int[problemsLines][problemsCols];
        int[][] digitNumbers2 = new int[problemsLines][problemsCols];
        HashSet<Integer> tempRandomNumbers;

        int pageNumber;
        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLines; i++) {
                wordNumber1[i] = (int) (Math.random() * problemsCols);
                wordNumber2[i] = (int) (Math.random() * problemsCols);
                tempRandomNumbers = intNumbersRandomRangeSet(problemsCols, numbersRangeStart, numbersRangeEnd);
                Iterator<Integer> iterator = tempRandomNumbers.iterator();

                int j = 0;
                while(iterator.hasNext()){
                    digitNumbers1[i][j] = iterator.next();
                    j++;
                }

                tempRandomNumbers = intNumbersRandomRangeSet(problemsCols, numbersRangeStart, numbersRangeEnd);
                iterator = tempRandomNumbers.iterator();

                j = 0;
                while(iterator.hasNext()){
                    digitNumbers2[i][j] = iterator.next();
                    j++;
                }
            }

            //Writing generated arrays to files
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " ??????. " + pageNumber + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " ??????. " + pageNumber + "bodyHtmlBlock__" + ".html");
            FileWriter fileAnswerWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " ??????. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");

            for (int i = 0; i < problemsLines; i++) {
                if (grade.contains("&thinsp;") || grade.contains("??????????")) {
                    fileWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\">\n" +
                            "<tbody><tr>\n" +
                            "<td style=\"width: 50%;\" colspan=\"6\">" +
                            convertLessThanOneThousandRus(digitNumbers1[i][wordNumber1[i]]) +
                            "</td>\n" +
                            "<td style=\"width: 50%;\" colspan=\"5\">" +
                            convertLessThanOneThousandRus(digitNumbers2[i][wordNumber2[i]]) +
                            "</td></tr>\n");
                    fileAnswerWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\">\n" +
                            "<tbody><tr>\n" +
                            "<td style=\"width: 50%;\" colspan=\"6\">" +
                            convertLessThanOneThousandRus(digitNumbers1[i][wordNumber1[i]]) +
                            "</td>\n" +
                            "<td style=\"width: 50%;\" colspan=\"5\">\n" +
                            convertLessThanOneThousandRus(digitNumbers2[i][wordNumber2[i]]) +
                            "</td></tr>\n");

                } else {
                    fileWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\">\n" +
                            "<tbody><tr>" +
                            "<td style=\"width: 50%;\" colspan=\"6\">" +
                            convertLessThanOneThousandEng(digitNumbers1[i][wordNumber1[i]]) +
                            "</td>" +
                            "<td style=\"width: 50%;\" colspan=\"5\">" +
                            convertLessThanOneThousandEng(digitNumbers2[i][wordNumber2[i]]) +
                            "</td>\n" +
                            "</tr>");
                    fileAnswerWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\">\n" +
                            "<tbody><tr>" +
                            "<td style=\"width: 50%;\" colspan=\"6\">" +
                            convertLessThanOneThousandEng(digitNumbers1[i][wordNumber1[i]]) +
                            "</td>" +
                            "<td style=\"width: 50%;\" colspan=\"5\">" +
                            convertLessThanOneThousandEng(digitNumbers2[i][wordNumber2[i]]) +
                            "</td>\n" +
                            "</tr>");
                }
                fileWriter.write( "<br /><br />\n\n");
                fileAnswerWriter.write("<br /><br />\n\n");

                fileWriter.write("<tr>");
                for (int j = 0; j < problemsCols; j++) {
                    fileWriter.write("<td style=\"width: 8%;\">" + digitNumbers1[i][j] + "</td>\n");
                    fileAnswerWriter.write("<td style=\"width: 8%;\">" + digitNumbers1[i][j] + "</td>\n");
                    outputStream.write(valueOf(digitNumbers1[i][j]).getBytes());
                }

                fileWriter.write("<td style=\"width: 10%;\"> &nbsp;</td>");
                fileAnswerWriter.write("<td style=\"width: 10%;\"> &nbsp; </td>");

                for (int j = 0; j < problemsCols; j++) {
                    fileWriter.write("<td style=\"width: 8%;\">" + digitNumbers2[i][j] + "</td>");
                    fileAnswerWriter.write("<td style=\"width: 8%;\">" + digitNumbers2[i][j] + "</td>");
                    outputStream.write(valueOf(digitNumbers2[i][j]).getBytes());
                }
                fileWriter.write(" </tr>\n" +
                        "</tbody>\n" +
                        "</table>\n");
                fileAnswerWriter.write(" </tr>\n" +
                        "</tbody>\n" +
                        "</table>\n");

                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n\n");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }
}
