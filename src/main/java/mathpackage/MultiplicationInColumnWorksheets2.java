package mathpackage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class generating Multiplication in column topics. Part 2
 * Author: Grigorii Andreev
 * Date: 03 January
 */

public class MultiplicationInColumnWorksheets2 extends WorksheetTemplate {

//    String gradeRus;
//    String gradeEng;
//    String topicRus;
//    String topicEng;
//    String h2Rus;
//    String h2Eng;
//    String numberRus;
//    String numberEng;
//    String shortProblemDescriptionRus;
//    String shortProblemDescriptionEng;
//    String longProblemDescriptionRus;
//    String longProblemDescriptionEng;
//    int numbersRangeStart;
//    int numbersRangeEnd;
//    int totalPageOfWorksheets;
//
    public MultiplicationInColumnWorksheets2(
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

        List<AllTopics> allTopicsMultiplyColumn2 = new ArrayList<>();

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.","Multiplication 0 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 0 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.",
                "Multiplication. Multiply 0 by a 2 digit numbers in column.",
                "???????????? ?????????? 0 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 0 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 1 ?? ??????????????.","Multiplication 1 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 1 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 1 ?? ??????????????.",
                "Multiplication. Multiply 1 by a 2 digit numbers in column.",
                "???????????? ?????????? 1 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 1 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 2 ?? ??????????????.","Multiplication 2 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 2 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 2 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 2 ?? ??????????????.",
                "Multiplication. Multiply 2 by a 2 digit numbers in column.",
                "???????????? ?????????? 2 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 2 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 3 ?? ??????????????.","Multiplication 3 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 3 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 3 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 3 ?? ??????????????.",
                "Multiplication. Multiply 3 by a 2 digit numbers in column.",
                "???????????? ?????????? 3 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 3 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 4 ?? ??????????????.","Multiplication 4 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 4 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 4 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 4 ?? ??????????????.",
                "Multiplication. Multiply 4 by a 2 digit numbers in column.",
                "???????????? ?????????? 4 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 4 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.","Multiplication 5 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 5 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 5 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 5 ?? ??????????????.",
                "Multiplication. Multiply 5 by a 2 digit numbers in column.",
                "???????????? ?????????? 5 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 5 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.","Multiplication 6 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 6 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 6 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 6 ?? ??????????????.",
                "Multiplication. Multiply 6 by a 2 digit numbers in column.",
                "???????????? ?????????? 6 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 6 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 7 ?? ??????????????.","Multiplication 7 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 7 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 7 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 7 ?? ??????????????.",
                "Multiplication. Multiply 7 by a 2 digit numbers in column.",
                "???????????? ?????????? 7 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 7 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 8 ?? ??????????????.","Multiplication 8 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 8 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 8 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 8 ?? ??????????????.",
                "Multiplication. Multiply 8 by a 2 digit numbers in column.",
                "???????????? ?????????? 8 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 8 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 9 ?? ??????????????.","Multiplication 9 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 9 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 9 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 9 ?? ??????????????.",
                "Multiplication. Multiply 9 by a 2 digit numbers in column.",
                "???????????? ?????????? 9 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 9 by a 2 digit numbers in column.",
                10, 99, 6));

        allTopicsMultiplyColumn2.add( new AllTopics(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????? 10 ?? ??????????????.","Multiplication 10 by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????? 10 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 10 by a 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????? 10 ?? ??????????????.",
                "Multiplication. Multiply 10 by a 2 digit numbers in column.",
                "???????????? ?????????? 10 ???? ???????????????? ???????????????????? ??????????.",
                "Multiply 10 by a 2 digit numbers in column.",
                10, 99, 6));

        //--------------------------

        Matrix.topWorksheet(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
                allTopicsMultiplyColumn2.get(0).shortProblemDescriptionRus, allTopicsMultiplyColumn2.get(0).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeRus, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeRus, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeRus, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeRus, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeRus, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeRus, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeRus, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeRus, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeRus, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeRus, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeRus, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(0).gradeEng, allTopicsMultiplyColumn2.get(0).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(1).gradeEng, allTopicsMultiplyColumn2.get(1).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(2).gradeEng, allTopicsMultiplyColumn2.get(2).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(3).gradeEng, allTopicsMultiplyColumn2.get(3).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(4).gradeEng, allTopicsMultiplyColumn2.get(4).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(5).gradeEng, allTopicsMultiplyColumn2.get(5).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(6).gradeEng, allTopicsMultiplyColumn2.get(6).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(7).gradeEng, allTopicsMultiplyColumn2.get(7).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(8).gradeEng, allTopicsMultiplyColumn2.get(8).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(9).gradeEng, allTopicsMultiplyColumn2.get(9).totalPageOfWorksheets,
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
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, allTopicsMultiplyColumn2.get(10).gradeEng, allTopicsMultiplyColumn2.get(10).totalPageOfWorksheets,
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



        List<AllTopics2Delete> allTopicsMultiplyColumn3 = new ArrayList<>();

        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ?????????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 1 digit by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ?????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 2 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ?????????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 1 digit by a 2 digit in column.",
                "???????????? ???????????????????? ?????????? ???? ??????????????????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ???????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 1 digit by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ???????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 2 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ???????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 1 digit by a 2 digit in column.",
                "???????????? ?????????????????????? ?????????? ???? ????????????????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 1 digit by a 3 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 3 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 1 digit by a 3 digit in column.",
                "???????????? ?????????????????????? ?????????? ???? ??????????????????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ???????????????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 1 digit by a 4 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ???????????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a 4 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ???????????????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 1 digit by a 4 digit in column.",
                "???????????? ?????????????????????? ?????????? ???? ????????????????????????????.",
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

        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ???????????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 1 digit by a multi digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ???????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 digit by a multi digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ???????????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 1 digit by a multi digit in column.",
                "???????????? ?????????????????????? ?????????? ???? ????????????????????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ???? ???????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 2 digit by a 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ???? ???????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 2 digit by a 2 digit in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ???? ???????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 2 digit by a 2 digit in column.",
                "???????????? ???????????????????? ?????????? ???? ????????????????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ???? ???????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 2 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???? ???????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???? ???????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 2 digit numbers in column.",
                "???????????? ???????????????????? ??????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ?????????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. 3 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 3 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply 3 digit numbers in column.",
                "???????????? ?????????????????????? ??????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. multi digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply multi digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply multi digit numbers in column.",
                "???????????? ???????????????????????? ??????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????? ???? ?????????????????? ???????????????????????? ?????????? ?? ??????????????.","Multiplication worksheet. multi digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????? ???? ?????????????????? ???????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply multi digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????? ???? ?????????????????? ???????????????????????? ?????????? ?? ??????????????.",
                "Multiplication. Multiply multi digit numbers in column.",
                "???????? ?????????????? ???? ?????????????????? ???????????????????????? ?????????? ?? ??????????????.",
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


        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????? ???? ?????????????????? ???????????????????? ?????????? ?? ??????????????.","Multiplication problems. 3 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????? ???? ?????????????????? ?????????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Multiplication problems:<br />Multiply 3 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????? ???? ?????????????????? ?????????????????????? ?????????? ?? ??????????????.",
                "Multiplication problems. Multiply 3 digit numbers in column.",
                "???????? ?????????????? ???? ?????????????????? ?????????????????????? ?????????? ?? ??????????????.",
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

        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "?????????????????? ???????? ?????????? ?? ??????????????.","Multiplication problems. Multiply two numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????? ???? ?????????????????? ???????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Multiplication problems:<br />Multiply two numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????? ???? ?????????????????? ???????? ?????????? ?? ??????????????.",
                "Multiplication problems. Multiply two numbers in column.",
                "???????? ?????????????? ???? ?????????????????? ???????? ?????????? ?? ??????????????.",
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



        allTopicsMultiplyColumn3.add( new AllTopics2Delete(
                "", "&nbsp",
                "???????????????? ???? ?????????????????? ?????????? ?? ??????????????.","Complete multiplication problems. Multiply numbers in column.",
                "???????????????? ???? ?????????????????? ?????????? ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Complete multiplication problems:<br />Multiply numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "?????????????? ???????????????? ??????????????????. ?????????????? ???? ?????????????????? ?????????? ?? ??????????????.",
                "Complete multiplication problems. Multiply numbers in column.",
                "?????????????? ?????????????????? ?????????? ?? ??????????????. ?????????? ???? 10000.",
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


    //Multiply two numbers in column
    public static void multiplyA1_B1ColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers,
                                                      String shortTaskNameWorksheet, String longTaskNameWorksheet,
                                                      int numbersRangeStart, int numbersRangeEnd, int sum, int problemsLine, int problemsCol) throws IOException {
        int pageNumber;
        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers ; k++) {
            pageNumber = k;

            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
                }


            if (longTaskNameWorksheet.contains("???????????? ?????????? 0") || longTaskNameWorksheet.contains("Multiply 0")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 0;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 1") || longTaskNameWorksheet.contains("Multiply 1")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 1;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 2") || longTaskNameWorksheet.contains("Multiply 2")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 2;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 3") || longTaskNameWorksheet.contains("Multiply 3")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 3;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 4") || longTaskNameWorksheet.contains("Multiply 4")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 4;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 5") || longTaskNameWorksheet.contains("Multiply 5")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 5;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 6") || longTaskNameWorksheet.contains("Multiply 6")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 6;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 7") || longTaskNameWorksheet.contains("Multiply 7")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 7;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 8") || longTaskNameWorksheet.contains("Multiply 8")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 8;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 9") || longTaskNameWorksheet.contains("Multiply 9")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 9;
                    }
            }

            if (longTaskNameWorksheet.contains("???????????? ?????????? 10") || longTaskNameWorksheet.contains("Multiply 10")) {
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        argument2[i][j] = 10;
                    }
            }


            FileWriter fileHtmlWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " ??????. " + pageNumber + "bodyHtmlBlock__" + ".html");
            FileWriter fileHtmlWriterAnswer = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " ??????. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");
            FileWriter fileTxtWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " ??????. " + pageNumber + "bodyTxtBlock__" + ".txt");

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; "+ ((i * problemsCol) + (j + 1)) +") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;&nbsp; x " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;&nbsp; x " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   * " + argument2[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ------ </td>");
                    fileHtmlWriterAnswer.write("<td> ------ </td>");
                    fileTxtWriter.write(" ----- ");
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write(" \n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> ... </td>");
                    fileHtmlWriterAnswer.write("<td> "+ (argument1[i][j] * argument2[i][j]) + " </td>");
                    fileTxtWriter.write(" ... ");
                }
                fileHtmlWriter.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileHtmlWriterAnswer.write("</tr> \n  <tr><td colspan=\"7\"><br /></td></tr>");
                fileTxtWriter.write(" \n\n ");
            }

            fileHtmlWriter.write("</table>");
            fileHtmlWriterAnswer.write("</table>");
            fileTxtWriter.close();
            fileHtmlWriter.close();
            fileHtmlWriterAnswer.close();
        }
    }


}
