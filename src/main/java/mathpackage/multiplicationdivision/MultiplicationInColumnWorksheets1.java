package mathpackage.multiplicationdivision;

import mathpackage.General;
import mathpackage.Matrix;
import mathpackage.WorksheetTemplate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class generating Multiplication in column topics. Part 1
 * @ Grigorii Andreev
 * Date: 03 January
 */

public class MultiplicationInColumnWorksheets1 extends WorksheetTemplate {

    public MultiplicationInColumnWorksheets1(
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

        List<MultiplicationInColumnWorksheets1> multiplicationInColumnWorksheets1 = new ArrayList<>();

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 0 ?? ??????????????.","Multiplication 0 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 0 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 0 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 0 ?? ??????????????.",
                "Multiplication. Multiply 0 by numbers in column.",
                "???????????? ?????????? 0 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 0 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 1 ?? ??????????????.","Multiplication 1 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 1 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 1 ?? ??????????????.",
                "Multiplication. Multiply 1 by numbers in column.",
                "???????????? ?????????? 1 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 1 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 2 ?? ??????????????.","Multiplication 2 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 2 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 2 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 2 ?? ??????????????.",
                "Multiplication. Multiply 2 by numbers in column.",
                "???????????? ?????????? 2 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 2 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 3 ?? ??????????????.","Multiplication 3 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 3 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 3 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 3 ?? ??????????????.",
                "Multiplication. Multiply 3 by numbers in column.",
                "???????????? ?????????? 3 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 3 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 4 ?? ??????????????.","Multiplication 4 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 4 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 4 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 4 ?? ??????????????.",
                "Multiplication. Multiply 4 by numbers in column.",
                "???????????? ?????????? 4 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 4 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 0 ?? ??????????????.","Multiplication 5 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 5 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 5 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 5 ?? ??????????????.",
                "Multiplication. Multiply 5 by numbers in column.",
                "???????????? ?????????? 5 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 5 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 0 ?? ??????????????.","Multiplication 6 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 6 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 6 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 6 ?? ??????????????.",
                "Multiplication. Multiply 6 by numbers in column.",
                "???????????? ?????????? 6 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 6 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 7 ?? ??????????????.","Multiplication 7 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 7 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 7 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 7 ?? ??????????????.",
                "Multiplication. Multiply 7 by numbers in column.",
                "???????????? ?????????? 7 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 7 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 8 ?? ??????????????.","Multiplication 8 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 8 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 8 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 8 ?? ??????????????.",
                "Multiplication. Multiply 8 by numbers in column.",
                "???????????? ?????????? 8 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 8 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 9 ?? ??????????????.","Multiplication 9 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 9 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 9 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 9 ?? ??????????????.",
                "Multiplication. Multiply 9 by numbers in column.",
                "???????????? ?????????? 9 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 9 by numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ?????????? 10 ?? ??????????????.","Multiplication 10 by numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ?????????? 10 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 10 by numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ?????????? 10 ?? ??????????????.",
                "Multiplication. Multiply 10 by numbers in column.",
                "???????????? ?????????? 10 ???? ???????????????? ?????????? ?? ??????????????.",
                "Multiply 10 by numbers in column.",
                0, 9, 6));


        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.","Multiplication 0 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 0 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.",
                "Multiplication. Multiply 0 by a 1 digit numbers in column.",
                "???????????? ?????????? 0 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 0 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 1 ?? ??????????????.","Multiplication 1 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 1 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 1 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 1 ?? ??????????????.",
                "Multiplication. Multiply 1 by a 1 digit numbers in column.",
                "???????????? ?????????? 1 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 1 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 2 ?? ??????????????.","Multiplication 2 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 2 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 2 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 2 ?? ??????????????.",
                "Multiplication. Multiply 2 by a 1 digit numbers in column.",
                "???????????? ?????????? 2 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 2 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 3 ?? ??????????????.","Multiplication 3 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 3 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 3 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 3 ?? ??????????????.",
                "Multiplication. Multiply 3 by a 1 digit numbers in column.",
                "???????????? ?????????? 3 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 3 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 4 ?? ??????????????.","Multiplication 4 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 4 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 4 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 4 ?? ??????????????.",
                "Multiplication. Multiply 4 by a 1 digit numbers in column.",
                "???????????? ?????????? 4 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 4 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.","Multiplication 5 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 5 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 5 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 5 ?? ??????????????.",
                "Multiplication. Multiply 5 by a 1 digit numbers in column.",
                "???????????? ?????????? 5 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 5 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 0 ?? ??????????????.","Multiplication 6 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 6 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 6 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 6 ?? ??????????????.",
                "Multiplication. Multiply 6 by a 1 digit numbers in column.",
                "???????????? ?????????? 6 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 6 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 7 ?? ??????????????.","Multiplication 7 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 7 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 7 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 7 ?? ??????????????.",
                "Multiplication. Multiply 7 by a 1 digit numbers in column.",
                "???????????? ?????????? 7 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 7 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 8 ?? ??????????????.","Multiplication 8 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 8 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 8 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 8 ?? ??????????????.",
                "Multiplication. Multiply 8 by a 1 digit numbers in column.",
                "???????????? ?????????? 8 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 8 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 9 ?? ??????????????.","Multiplication 9 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 9 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 9 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 9 ?? ??????????????.",
                "Multiplication. Multiply 9 by a 1 digit numbers in column.",
                "???????????? ?????????? 9 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 9 by a 1 digit numbers in column.",
                0, 9, 6));

        multiplicationInColumnWorksheets1.add( new MultiplicationInColumnWorksheets1(
                "", "&nbsp",
                "?????????????????? ???????????????????????? ?????????? ???? ?????????? 10 ?? ??????????????.","Multiplication 10 by a 1 digit numbers in column.",
                "???????????? ???? ???????????????????? ???? ????????:<br />?????????????????? ???????????????????????? ?????????? ???? ?????????? 10 ?? ??????????????. ???????????? ?? ????????????????. ?????????????? pdf ?????? jpg.",
                "Mathematics worksheets:<br />Multiply 10 by a 1 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "??????????????????. ?????????????????? ???????????????????????? ?????????? ???? ?????????? 10 ?? ??????????????.",
                "Multiplication. Multiply 10 by a 1 digit numbers in column.",
                "???????????? ?????????? 10 ???? ???????????????? ?????????????????????? ??????????.",
                "Multiply 10 by a 1 digit numbers in column.",
                0, 9, 6));


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(0).numbersRangeStart, multiplicationInColumnWorksheets1.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeRus, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(0).topicRus,
                multiplicationInColumnWorksheets1.get(0).h2Rus, multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(1).numbersRangeStart, multiplicationInColumnWorksheets1.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeRus, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(1).topicRus,
                multiplicationInColumnWorksheets1.get(1).h2Rus, multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(2).numbersRangeStart, multiplicationInColumnWorksheets1.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeRus, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(2).topicRus,
                multiplicationInColumnWorksheets1.get(2).h2Rus, multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(3).numbersRangeStart, multiplicationInColumnWorksheets1.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeRus, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(3).topicRus,
                multiplicationInColumnWorksheets1.get(3).h2Rus, multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(4).numbersRangeStart, multiplicationInColumnWorksheets1.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeRus, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(4).topicRus,
                multiplicationInColumnWorksheets1.get(4).h2Rus, multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(5).numbersRangeStart, multiplicationInColumnWorksheets1.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeRus, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(5).topicRus,
                multiplicationInColumnWorksheets1.get(5).h2Rus, multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(6).numbersRangeStart, multiplicationInColumnWorksheets1.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeRus, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(6).topicRus,
                multiplicationInColumnWorksheets1.get(6).h2Rus, multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(7).numbersRangeStart, multiplicationInColumnWorksheets1.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeRus, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(7).topicRus,
                multiplicationInColumnWorksheets1.get(7).h2Rus, multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(8).numbersRangeStart, multiplicationInColumnWorksheets1.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeRus, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(8).topicRus,
                multiplicationInColumnWorksheets1.get(8).h2Rus, multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(9).numbersRangeStart, multiplicationInColumnWorksheets1.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeRus, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(9).topicRus,
                multiplicationInColumnWorksheets1.get(9).h2Rus, multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(10).numbersRangeStart, multiplicationInColumnWorksheets1.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeRus, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(10).topicRus,
                multiplicationInColumnWorksheets1.get(10).h2Rus, multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(11).numbersRangeStart, multiplicationInColumnWorksheets1.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeRus, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(11).topicRus,
                multiplicationInColumnWorksheets1.get(11).h2Rus, multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionRus);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(12).numbersRangeStart, multiplicationInColumnWorksheets1.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeRus, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(12).topicRus,
                multiplicationInColumnWorksheets1.get(12).h2Rus, multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(13).numbersRangeStart, multiplicationInColumnWorksheets1.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeRus, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(13).topicRus,
                multiplicationInColumnWorksheets1.get(13).h2Rus, multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(14).numbersRangeStart, multiplicationInColumnWorksheets1.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeRus, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(14).topicRus,
                multiplicationInColumnWorksheets1.get(14).h2Rus, multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(15).numbersRangeStart, multiplicationInColumnWorksheets1.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeRus, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(15).topicRus,
                multiplicationInColumnWorksheets1.get(15).h2Rus, multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(16).numbersRangeStart, multiplicationInColumnWorksheets1.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeRus, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(16).topicRus,
                multiplicationInColumnWorksheets1.get(16).h2Rus, multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(17).numbersRangeStart, multiplicationInColumnWorksheets1.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeRus, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(17).topicRus,
                multiplicationInColumnWorksheets1.get(17).h2Rus, multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(18).numbersRangeStart, multiplicationInColumnWorksheets1.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeRus, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(18).topicRus,
                multiplicationInColumnWorksheets1.get(18).h2Rus, multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(19).numbersRangeStart, multiplicationInColumnWorksheets1.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeRus, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(19).topicRus,
                multiplicationInColumnWorksheets1.get(19).h2Rus, multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(20).numbersRangeStart, multiplicationInColumnWorksheets1.get(20).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeRus, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(20).topicRus,
                multiplicationInColumnWorksheets1.get(20).h2Rus, multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionRus);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus,
                multiplicationInColumnWorksheets1.get(21).numbersRangeStart, multiplicationInColumnWorksheets1.get(21).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeRus, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(21).topicRus,
                multiplicationInColumnWorksheets1.get(21).h2Rus, multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionRus, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionRus);



        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(0).numbersRangeStart, multiplicationInColumnWorksheets1.get(0).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(0).gradeEng, multiplicationInColumnWorksheets1.get(0).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(0).topicEng,
                multiplicationInColumnWorksheets1.get(0).h2Eng, multiplicationInColumnWorksheets1.get(0).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(0).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(1).numbersRangeStart, multiplicationInColumnWorksheets1.get(1).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(1).gradeEng, multiplicationInColumnWorksheets1.get(1).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(1).topicEng,
                multiplicationInColumnWorksheets1.get(1).h2Eng, multiplicationInColumnWorksheets1.get(1).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(1).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(2).numbersRangeStart, multiplicationInColumnWorksheets1.get(2).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(2).gradeEng, multiplicationInColumnWorksheets1.get(2).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(2).topicEng,
                multiplicationInColumnWorksheets1.get(2).h2Eng, multiplicationInColumnWorksheets1.get(2).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(2).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(3).numbersRangeStart, multiplicationInColumnWorksheets1.get(3).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(3).gradeEng, multiplicationInColumnWorksheets1.get(3).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(3).topicEng,
                multiplicationInColumnWorksheets1.get(3).h2Eng, multiplicationInColumnWorksheets1.get(3).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(3).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(4).numbersRangeStart, multiplicationInColumnWorksheets1.get(4).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(4).gradeEng, multiplicationInColumnWorksheets1.get(4).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(4).topicEng,
                multiplicationInColumnWorksheets1.get(4).h2Eng, multiplicationInColumnWorksheets1.get(4).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(4).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(5).numbersRangeStart, multiplicationInColumnWorksheets1.get(5).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(5).gradeEng, multiplicationInColumnWorksheets1.get(5).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(5).topicEng,
                multiplicationInColumnWorksheets1.get(5).h2Eng, multiplicationInColumnWorksheets1.get(5).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(5).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(6).numbersRangeStart, multiplicationInColumnWorksheets1.get(6).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(6).gradeEng, multiplicationInColumnWorksheets1.get(6).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(6).topicEng,
                multiplicationInColumnWorksheets1.get(6).h2Eng, multiplicationInColumnWorksheets1.get(6).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(6).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(7).numbersRangeStart, multiplicationInColumnWorksheets1.get(7).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(7).gradeEng, multiplicationInColumnWorksheets1.get(7).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(7).topicEng,
                multiplicationInColumnWorksheets1.get(7).h2Eng, multiplicationInColumnWorksheets1.get(7).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(7).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(8).numbersRangeStart, multiplicationInColumnWorksheets1.get(8).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(8).gradeEng, multiplicationInColumnWorksheets1.get(8).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(8).topicEng,
                multiplicationInColumnWorksheets1.get(8).h2Eng, multiplicationInColumnWorksheets1.get(8).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(8).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(9).numbersRangeStart, multiplicationInColumnWorksheets1.get(9).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(9).gradeEng, multiplicationInColumnWorksheets1.get(9).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(9).topicEng,
                multiplicationInColumnWorksheets1.get(9).h2Eng, multiplicationInColumnWorksheets1.get(9).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(9).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(10).numbersRangeStart, multiplicationInColumnWorksheets1.get(10).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(10).gradeEng, multiplicationInColumnWorksheets1.get(10).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(10).topicEng,
                multiplicationInColumnWorksheets1.get(10).h2Eng, multiplicationInColumnWorksheets1.get(10).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(10).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(11).numbersRangeStart, multiplicationInColumnWorksheets1.get(11).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(11).gradeEng, multiplicationInColumnWorksheets1.get(11).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(11).topicEng,
                multiplicationInColumnWorksheets1.get(11).h2Eng, multiplicationInColumnWorksheets1.get(11).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(11).longProblemDescriptionEng);

        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(12).numbersRangeStart, multiplicationInColumnWorksheets1.get(12).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(12).gradeEng, multiplicationInColumnWorksheets1.get(12).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(12).topicEng,
                multiplicationInColumnWorksheets1.get(12).h2Eng, multiplicationInColumnWorksheets1.get(12).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(12).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(13).numbersRangeStart, multiplicationInColumnWorksheets1.get(13).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(13).gradeEng, multiplicationInColumnWorksheets1.get(13).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(13).topicEng,
                multiplicationInColumnWorksheets1.get(13).h2Eng, multiplicationInColumnWorksheets1.get(13).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(13).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(14).numbersRangeStart, multiplicationInColumnWorksheets1.get(14).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(14).gradeEng, multiplicationInColumnWorksheets1.get(14).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(14).topicEng,
                multiplicationInColumnWorksheets1.get(14).h2Eng, multiplicationInColumnWorksheets1.get(14).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(14).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(15).numbersRangeStart, multiplicationInColumnWorksheets1.get(15).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(15).gradeEng, multiplicationInColumnWorksheets1.get(15).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(15).topicEng,
                multiplicationInColumnWorksheets1.get(15).h2Eng, multiplicationInColumnWorksheets1.get(15).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(15).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(16).numbersRangeStart, multiplicationInColumnWorksheets1.get(16).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(16).gradeEng, multiplicationInColumnWorksheets1.get(16).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(16).topicEng,
                multiplicationInColumnWorksheets1.get(16).h2Eng, multiplicationInColumnWorksheets1.get(16).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(16).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(17).numbersRangeStart, multiplicationInColumnWorksheets1.get(17).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(17).gradeEng, multiplicationInColumnWorksheets1.get(17).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(17).topicEng,
                multiplicationInColumnWorksheets1.get(17).h2Eng, multiplicationInColumnWorksheets1.get(17).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(17).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(18).numbersRangeStart, multiplicationInColumnWorksheets1.get(18).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(18).gradeEng, multiplicationInColumnWorksheets1.get(18).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(18).topicEng,
                multiplicationInColumnWorksheets1.get(18).h2Eng, multiplicationInColumnWorksheets1.get(18).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(18).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(19).numbersRangeStart, multiplicationInColumnWorksheets1.get(19).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(19).gradeEng, multiplicationInColumnWorksheets1.get(19).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(19).topicEng,
                multiplicationInColumnWorksheets1.get(19).h2Eng, multiplicationInColumnWorksheets1.get(19).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(19).longProblemDescriptionEng);



        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(20).numbersRangeStart, multiplicationInColumnWorksheets1.get(20).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(20).gradeEng, multiplicationInColumnWorksheets1.get(20).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(20).topicEng,
                multiplicationInColumnWorksheets1.get(20).h2Eng, multiplicationInColumnWorksheets1.get(20).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(20).longProblemDescriptionEng);


        Matrix.topWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng );
        multiplyA1_B1ColumnWorksheetA4(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng,
                multiplicationInColumnWorksheets1.get(21).numbersRangeStart, multiplicationInColumnWorksheets1.get(21).numbersRangeEnd, 10, 7, 9);
        Matrix.bottomWorksheet(General.workingFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolderPdf, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng);
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets,
                multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic(General.workingFolder, General.readyFilesFolder, multiplicationInColumnWorksheets1.get(21).gradeEng, multiplicationInColumnWorksheets1.get(21).totalPageOfWorksheets, multiplicationInColumnWorksheets1.get(21).topicEng,
                multiplicationInColumnWorksheets1.get(21).h2Eng, multiplicationInColumnWorksheets1.get(21).shortProblemDescriptionEng, multiplicationInColumnWorksheets1.get(21).longProblemDescriptionEng);

        General.finalRenameFiles("d:/Java_Math/Html/");
        General.finalRenameFiles("d:/Java_Math/Pdf");

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
