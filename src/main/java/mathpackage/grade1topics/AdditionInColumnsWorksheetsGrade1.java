package mathpackage.grade1topics;

import mathpackage.Matrix;
import mathpackage.WorksheetTemplate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;
import static mathpackage.General.*;

/**
 * Class generating addition worksheets. Part 1
 * Author: Grigorii Andreev
 * Date: 05 January 2021
 */

public class AdditionInColumnsWorksheetsGrade1 extends WorksheetTemplate implements Serializable{

    static public String diskRus = "https://disk.yandex.ru/d/gge-fTPut8AEtA";
    static public String diskEng = "https://drive.google.com/drive/folders/1Nzt8h-2NT_FxK_l3nRrOCEcISWsDPs6y?usp=sharing";
    static public String adsBlockRus = "<div id=”ad1?>\n" +
            "<script async src=\"https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n" +
            "<!-- netboard_580x400_1_kl_All -->\n" +
            "<ins class=\"adsbygoogle\"\n" +
            "     style=\"display:block\"\n" +
            "     data-ad-client=\"ca-pub-3061518079340402\"\n" +
            "     data-ad-slot=\"4709942115\"\n" +
            "     data-ad-format=\"auto\"\n" +
            "     data-full-width-responsive=\"true\"></ins>\n" +
            "<script>\n" +
            "     (adsbygoogle = window.adsbygoogle || []).push({});\n" +
            "</script>\n" +
            "</div>";

    static public String adsBlockEng = "<script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n" +
            "<script>\n" +
            "     (adsbygoogle = window.adsbygoogle || []).push({\n" +
            "          google_ad_client: \"ca-pub-3061518079340402\",\n" +
            "          enable_page_level_ads: true\n" +
            "     });\n" +
            "</script>";


    public AdditionInColumnsWorksheetsGrade1(
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

        List<AdditionInColumnsWorksheetsGrade1> additionInColumnWorksheetsGrade1 = new ArrayList<>();

        emptyAllFolders();

        //All topics for primary school. Addition in line
        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 100.","Addition. Addition numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100.",
                "Addition of numbers up to 100.",
                "Сложи числа до 100.",
                "Add numbers up to 100.",
                0, 99, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(0).numbersRangeStart, additionInColumnWorksheetsGrade1.get(0).numbersRangeEnd, 13, 5);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeRus, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(0).topicRus,
                additionInColumnWorksheetsGrade1.get(0).h2Rus, additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(0).numbersRangeStart, additionInColumnWorksheetsGrade1.get(0).numbersRangeEnd, 13, 5);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(0).gradeEng, additionInColumnWorksheetsGrade1.get(0).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(0).topicEng,
                additionInColumnWorksheetsGrade1.get(0).h2Eng, additionInColumnWorksheetsGrade1.get(0).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(0).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение однозначных чисел.","Addition. Addition 1 digit numbers.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел.",
                "Addition 1 digit numbers.",
                "Сложи однозначные числа.",
                "Add 1 digit numbers.",
                0, 9, 11));


        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(1).numbersRangeStart, additionInColumnWorksheetsGrade1.get(1).numbersRangeEnd, 13, 5);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeRus, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(1).topicRus,
                additionInColumnWorksheetsGrade1.get(1).h2Rus, additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(1).numbersRangeStart, additionInColumnWorksheetsGrade1.get(1).numbersRangeEnd, 13, 5);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(1).gradeEng, additionInColumnWorksheetsGrade1.get(1).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(1).topicEng,
                additionInColumnWorksheetsGrade1.get(1).h2Eng, additionInColumnWorksheetsGrade1.get(1).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(1).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение двузначных чисел.","Addition. Two digit numbers addition.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Two-digit numbers addition. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел.",
                "Two-digit numbers addition.",
                "Сложи двузначные числа.",
                "Add two-digit numbers.",
                10, 99, 11));


        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(2).numbersRangeStart, additionInColumnWorksheetsGrade1.get(2).numbersRangeEnd, 13, 5);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeRus, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(2).topicRus,
                additionInColumnWorksheetsGrade1.get(2).h2Rus, additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(2).numbersRangeStart, additionInColumnWorksheetsGrade1.get(2).numbersRangeEnd, 13, 5);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(2).gradeEng, additionInColumnWorksheetsGrade1.get(2).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(2).topicEng,
                additionInColumnWorksheetsGrade1.get(2).h2Eng, additionInColumnWorksheetsGrade1.get(2).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(2).longProblemDescriptionEng, diskEng, adsBlockEng);

        //Addition in columns
        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение однозначных чисел в стролбик.","Addition. Addition 1 digit numbers.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers in columns. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел в столбик.",
                "Addition 1 digit numbers in columns.",
                "Сложи однозначные числа в столбик.",
                "Add 1 digit numbers in columns.",
                0, 9, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(3).numbersRangeStart, additionInColumnWorksheetsGrade1.get(3).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeRus, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(3).topicRus,
                additionInColumnWorksheetsGrade1.get(3).h2Rus, additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(3).numbersRangeStart, additionInColumnWorksheetsGrade1.get(3).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(3).gradeEng, additionInColumnWorksheetsGrade1.get(3).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(3).topicEng,
                additionInColumnWorksheetsGrade1.get(3).h2Eng, additionInColumnWorksheetsGrade1.get(3).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(3).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение двузначных чисел в стролбик.","Addition. Addition 2 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 2 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел в столбик.",
                "Addition two digit numbers in column.",
                "Сложи двузначные числа в столбик.",
                "Add two digit numbers in column.",
                10, 99, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(4).numbersRangeStart, additionInColumnWorksheetsGrade1.get(4).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeRus, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(4).topicRus,
                additionInColumnWorksheetsGrade1.get(4).h2Rus, additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(4).numbersRangeStart, additionInColumnWorksheetsGrade1.get(4).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(4).gradeEng, additionInColumnWorksheetsGrade1.get(4).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(4).topicEng,
                additionInColumnWorksheetsGrade1.get(4).h2Eng, additionInColumnWorksheetsGrade1.get(4).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(4).longProblemDescriptionEng, diskEng, adsBlockEng);



        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение трехзначных чисел в стролбик.","Addition. Addition 3 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение трехначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 3 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение трехзначных чисел в столбик.",
                "Addition three digit numbers in column.",
                "Сложи трехзначные числа в столбик.",
                "Add three digit numbers in column.",
                100, 999, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(5).numbersRangeStart, additionInColumnWorksheetsGrade1.get(5).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeRus, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(5).topicRus,
                additionInColumnWorksheetsGrade1.get(5).h2Rus, additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(5).numbersRangeStart, additionInColumnWorksheetsGrade1.get(5).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(5).gradeEng, additionInColumnWorksheetsGrade1.get(5).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(5).topicEng,
                additionInColumnWorksheetsGrade1.get(5).h2Eng, additionInColumnWorksheetsGrade1.get(5).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(5).longProblemDescriptionEng, diskEng, adsBlockEng);


        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение четырехзначных чисел в стролбик.","Addition. Addition 4 digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение четырехзначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 4 digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четырехзначных чисел в столбик.",
                "Addition four digit numbers in column.",
                "Сложи четырехзначные числа в столбик.",
                "Add four digit numbers in column.",
                1000, 9999, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(6).numbersRangeStart, additionInColumnWorksheetsGrade1.get(6).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeRus, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(6).topicRus,
                additionInColumnWorksheetsGrade1.get(6).h2Rus, additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(6).numbersRangeStart, additionInColumnWorksheetsGrade1.get(6).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(6).gradeEng, additionInColumnWorksheetsGrade1.get(6).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(6).topicEng,
                additionInColumnWorksheetsGrade1.get(6).h2Eng, additionInColumnWorksheetsGrade1.get(6).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(6).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение многозначных чисел в стролбик.","Addition. Addition multi digit numbers in column.",
                "Задачи по математике на тему:<br />Сложение многозначных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition multi digit numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение многозначных чисел в столбик.",
                "Addition multi digit numbers in column.",
                "Сложи многозначные числа в столбик.",
                "Add multi digit numbers in column.",
                100000, 9999999, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(7).numbersRangeStart, additionInColumnWorksheetsGrade1.get(7).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeRus, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(7).topicRus,
                additionInColumnWorksheetsGrade1.get(7).h2Rus, additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(7).numbersRangeStart, additionInColumnWorksheetsGrade1.get(7).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(7).gradeEng, additionInColumnWorksheetsGrade1.get(7).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(7).topicEng,
                additionInColumnWorksheetsGrade1.get(7).h2Eng, additionInColumnWorksheetsGrade1.get(7).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(7).longProblemDescriptionEng, diskEng, adsBlockEng);


        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение четных чисел в стролбик.","Addition. Addition even numbers in column.",
                "Задачи по математике на тему:<br />Сложение четных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition even numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четных чисел в столбик.",
                "Addition even numbers in column.",
                "Сложи четные числа в столбик.",
                "Add even numbers in column.",
                100, 9999, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(8).numbersRangeStart, additionInColumnWorksheetsGrade1.get(8).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeRus, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(8).topicRus,
                additionInColumnWorksheetsGrade1.get(8).h2Rus, additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(8).numbersRangeStart, additionInColumnWorksheetsGrade1.get(8).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(8).gradeEng, additionInColumnWorksheetsGrade1.get(8).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(8).topicEng,
                additionInColumnWorksheetsGrade1.get(8).h2Eng, additionInColumnWorksheetsGrade1.get(8).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(8).longProblemDescriptionEng, diskEng, adsBlockEng);



        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение нечетных чисел в стролбик.","Addition. Addition odd numbers in column.",
                "Задачи по математике на тему:<br />Сложение нечетных чисел в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition odd numbers in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение нечетных чисел в столбик.",
                "Addition odd numbers in column.",
                "Сложи нечетные числа в столбик.",
                "Add odd numbers in column.",
                100, 9999, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(9).numbersRangeStart, additionInColumnWorksheetsGrade1.get(9).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeRus, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(9).topicRus,
                additionInColumnWorksheetsGrade1.get(9).h2Rus, additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(9).numbersRangeStart, additionInColumnWorksheetsGrade1.get(9).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(9).gradeEng, additionInColumnWorksheetsGrade1.get(9).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(9).topicEng,
                additionInColumnWorksheetsGrade1.get(9).h2Eng, additionInColumnWorksheetsGrade1.get(9).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(9).longProblemDescriptionEng, diskEng, adsBlockEng);


        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 10.","Addition. Addition numbers up to 10 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 10 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10 в столбик.",
                "Addition numbers up to 10 in column.",
                "Сложи числа до 10.",
                "Add numbers up to 10 in column.",
                0, 10, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(10).numbersRangeStart, additionInColumnWorksheetsGrade1.get(10).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeRus, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(10).topicRus,
                additionInColumnWorksheetsGrade1.get(10).h2Rus, additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(10).numbersRangeStart, additionInColumnWorksheetsGrade1.get(10).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(10).gradeEng, additionInColumnWorksheetsGrade1.get(10).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(10).topicEng,
                additionInColumnWorksheetsGrade1.get(10).h2Eng, additionInColumnWorksheetsGrade1.get(10).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(10).longProblemDescriptionEng, diskEng, adsBlockEng);




        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 20.","Addition. Addition numbers up to 20 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 20 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 20 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 20 в столбик.",
                "Addition numbers up to 20 in column.",
                "Сложи числа до 20.",
                "Add numbers up to 20 in column.",
                0, 20, 11));



        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(11).numbersRangeStart, additionInColumnWorksheetsGrade1.get(11).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeRus, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(11).topicRus,
                additionInColumnWorksheetsGrade1.get(11).h2Rus, additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(11).numbersRangeStart, additionInColumnWorksheetsGrade1.get(11).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(11).gradeEng, additionInColumnWorksheetsGrade1.get(11).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(11).topicEng,
                additionInColumnWorksheetsGrade1.get(11).h2Eng, additionInColumnWorksheetsGrade1.get(11).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(11).longProblemDescriptionEng, diskEng, adsBlockEng);


        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 50.","Addition. Addition numbers up to 50 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 50 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 50 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 50 в столбик.",
                "Addition numbers up to 50 in column.",
                "Сложи числа до 50.",
                "Add numbers up to 50 in column.",
                0, 50, 11));



        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(12).numbersRangeStart, additionInColumnWorksheetsGrade1.get(12).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeRus, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(12).topicRus,
                additionInColumnWorksheetsGrade1.get(12).h2Rus, additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(12).numbersRangeStart, additionInColumnWorksheetsGrade1.get(12).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(12).gradeEng, additionInColumnWorksheetsGrade1.get(12).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(12).topicEng,
                additionInColumnWorksheetsGrade1.get(12).h2Eng, additionInColumnWorksheetsGrade1.get(12).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(12).longProblemDescriptionEng, diskEng, adsBlockEng);


        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 100.","Addition. Addition numbers up to 100 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 100 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100 в столбик.",
                "Addition numbers up to 100 in column.",
                "Сложи числа до 100 в столбик.",
                "Add numbers up to 100 in column.",
                0, 100, 11));




        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(13).numbersRangeStart, additionInColumnWorksheetsGrade1.get(13).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeRus, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(13).topicRus,
                additionInColumnWorksheetsGrade1.get(13).h2Rus, additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(13).numbersRangeStart, additionInColumnWorksheetsGrade1.get(13).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(13).gradeEng, additionInColumnWorksheetsGrade1.get(13).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(13).topicEng,
                additionInColumnWorksheetsGrade1.get(13).h2Eng, additionInColumnWorksheetsGrade1.get(13).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(13).longProblemDescriptionEng, diskEng, adsBlockEng);




        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 1000.","Addition. Addition numbers up to 1000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 1000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 1000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 1000 в столбик.",
                "Addition numbers up to 1000 in column.",
                "Сложи числа до 1000.",
                "Add numbers up to 1000 in column.",
                0, 1000, 11));



        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(14).numbersRangeStart, additionInColumnWorksheetsGrade1.get(14).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeRus, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(14).topicRus,
                additionInColumnWorksheetsGrade1.get(14).h2Rus, additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(14).numbersRangeStart, additionInColumnWorksheetsGrade1.get(14).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(14).gradeEng, additionInColumnWorksheetsGrade1.get(14).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(14).topicEng,
                additionInColumnWorksheetsGrade1.get(14).h2Eng, additionInColumnWorksheetsGrade1.get(14).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(14).longProblemDescriptionEng, diskEng, adsBlockEng);



        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 10000.","Addition. Addition numbers up to 1000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 10000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10000 в столбик.",
                "Addition numbers up to 10000 in column.",
                "Сложи числа до 10000.",
                "Add numbers up to 10000 in column.",
                0, 10000, 11));



        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(15).numbersRangeStart, additionInColumnWorksheetsGrade1.get(15).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeRus, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(15).topicRus,
                additionInColumnWorksheetsGrade1.get(15).h2Rus, additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(15).numbersRangeStart, additionInColumnWorksheetsGrade1.get(15).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(15).gradeEng, additionInColumnWorksheetsGrade1.get(15).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(15).topicEng,
                additionInColumnWorksheetsGrade1.get(15).h2Eng, additionInColumnWorksheetsGrade1.get(15).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(15).longProblemDescriptionEng, diskEng, adsBlockEng);



        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 100000.","Addition. Addition numbers up to 10000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 100000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100000 в столбик.",
                "Addition numbers up to 100000 in column.",
                "Сложи числа до 100000.",
                "Add numbers up to 100000 in column.",
                0, 100000, 11));


        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(16).numbersRangeStart, additionInColumnWorksheetsGrade1.get(16).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeRus, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(16).topicRus,
                additionInColumnWorksheetsGrade1.get(16).h2Rus, additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(16).numbersRangeStart, additionInColumnWorksheetsGrade1.get(16).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(16).gradeEng, additionInColumnWorksheetsGrade1.get(16).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(16).topicEng,
                additionInColumnWorksheetsGrade1.get(16).h2Eng, additionInColumnWorksheetsGrade1.get(16).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(16).longProblemDescriptionEng, diskEng, adsBlockEng);




        additionInColumnWorksheetsGrade1.add( new AdditionInColumnsWorksheetsGrade1(
                "1 класс.", "Grade 1.",
                "Сложение. Сложение чисел до 1000000.","Addition. Addition numbers up to 100000 in column.",
                "Задачи по математике на тему:<br />Сложение чисел до 1000000 в столбик. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 1000000 in column. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 1000000 в столбик.",
                "Addition numbers up to 1000000 in column.",
                "Сложи числа до 1000000.",
                "Add numbers up to 1000000 in column.",
                0, 1000000, 11));

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus,
                additionInColumnWorksheetsGrade1.get(17).numbersRangeStart, additionInColumnWorksheetsGrade1.get(17).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeRus, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(17).topicRus,
                additionInColumnWorksheetsGrade1.get(17).h2Rus, additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionRus, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionRus, diskRus, adsBlockRus);

        Matrix.topWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetPdf(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng );
        Matrix.topWorksheetHtmlAnswers(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng );
        addA1_B1ColumnWorksheetA4(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng,
                additionInColumnWorksheetsGrade1.get(17).numbersRangeStart, additionInColumnWorksheetsGrade1.get(17).numbersRangeEnd, 7, 7);
        Matrix.bottomWorksheet(workingFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheet(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng);
        Matrix.fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng);
        Matrix.allSameWorksheets(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets,
                additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng);
        Matrix.finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionInColumnWorksheetsGrade1.get(17).gradeEng, additionInColumnWorksheetsGrade1.get(17).totalPageOfWorksheets, additionInColumnWorksheetsGrade1.get(17).topicEng,
                additionInColumnWorksheetsGrade1.get(17).h2Eng, additionInColumnWorksheetsGrade1.get(17).shortProblemDescriptionEng, additionInColumnWorksheetsGrade1.get(17).longProblemDescriptionEng, diskEng, adsBlockEng);

        finalRenameFiles("d:/Java_Math/Html/");
        finalRenameFiles("d:/Java_Math/Pdf");
        finalRenameFiles("d:/Java_Math/ReadyWorksheets");
//        saveObject((WorksheetTemplate) additionInColumnWorksheetsGrade1);

        

    }

    public static void addA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String longTaskNameWorksheet,
                                               int numbersRangeStart, int numbersRangeEnd, int problemsLines, int problemsCols) throws IOException {
        System.out.println("Тема: " + longTaskNameWorksheet);


        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            int pageNumber = k;


            for (int i = 0; i < problemsLines; i++)
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * numbersRangeEnd/10 + numbersRangeStart);
                }

            if (longTaskNameWorksheet.contains("четные")) {
                System.out.println("Четные числа");
                int tempNumber;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
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

                    outputStream.write(valueOf(argument1[i][j]).getBytes());
                    fileWriter.write(valueOf(argument1[i][j]));
                    fileAnswerWriter.write(valueOf(argument1[i][j]));

                    outputStream.write(' ');
                    outputStream.write('+');
                    outputStream.write(' ');

                    fileWriter.write(" + ");
                    fileAnswerWriter.write(" + ");

                    outputStream.write(valueOf(argument2[i][j]).getBytes());
                    fileWriter.write(valueOf(argument2[i][j]));
                    fileAnswerWriter.write(valueOf(argument2[i][j]));

                    outputStream.write(' ');
                    outputStream.write('=');
                    outputStream.write(' ');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write('_');
                    outputStream.write(' ');
                    outputStream.write(' ');
                    outputStream.write(' ');

                    fileWriter.write(" = ____ &nbsp; &nbsp; &nbsp; ");
                    fileAnswerWriter.write(" = " + (argument1[i][j] + argument2[i][j]) + " &nbsp;  &nbsp; ");
                }
                outputStream.write('\n');
                outputStream.write('\n');
                outputStream.write('\n');
                fileWriter.write("<br /><br /><br />\n\n\n");
                fileAnswerWriter.write("<br /><br /><br />\n\n\n");
            }
            outputStream.close();
            fileWriter.close();
            fileAnswerWriter.close();
        }
    }

    public static void addA1_B1ColumnWorksheetA4(String workingFolder, String grade, int totalPageNumbers,
                                                 String longTaskNameWorksheet,
                                                 int numbersRangeStart, int numbersRangeEnd,
                                                 int problemsLine, int problemsCol) throws IOException {

        Integer[][] argument1 = new Integer[problemsLine][problemsCol];
        Integer[][] argument2 = new Integer[problemsLine][problemsCol];

        for (int k = 1; k < totalPageNumbers; k++) {
            int pageNumber = k;
            for (int i = 0; i < problemsLine; i++)
                for (int j = 0; j < problemsCol; j++) {
                    argument1[i][j] = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * argument1[i][j]);
                }
            if (longTaskNameWorksheet.contains("четные") || longTaskNameWorksheet.contains("even")) {
                System.out.println("Четные числа");
                int tempNumber;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
                    }
            }

            if (longTaskNameWorksheet.contains("нечетные") || longTaskNameWorksheet.contains("odd")) {
                int tempNumber;
                for (int i = 0; i < problemsLine; i++)
                    for (int j = 0; j < problemsCol; j++) {
                        tempNumber = (int) (Math.random() * numbersRangeEnd + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * numbersRangeEnd / 10 + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
                    }
            }
            FileWriter fileHtmlWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlock__" + ".html");
            FileWriter fileHtmlWriterAnswer = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyHtmlBlockAnswer__" + ".html");
            FileWriter fileTxtWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + pageNumber + "bodyTxtBlock__" + ".txt");

            fileHtmlWriter.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            fileHtmlWriterAnswer.write("<table> <tr><td colspan=\"" + (problemsCol) + "\"></td></tr>");
            for (int i = 0; i < problemsLine; i++) {
                fileHtmlWriter.write("<tr align=\"right\">");
                fileHtmlWriterAnswer.write("<tr align=\"right\">");
                fileTxtWriter.write("\n ");
                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp; &nbsp; " + ((i * problemsCol) + (j + 1)) + ") &nbsp; &nbsp; " +
                            "" + argument1[i][j] + "</td>");
                    fileTxtWriter.write("    " + argument1[i][j]);
                }
                fileHtmlWriter.write("</tr> \n <tr align=\"right\">");
                fileHtmlWriterAnswer.write("</tr> \n <tr align=\"right\">");
                fileTxtWriter.write("\n");

                for (int j = 0; j < problemsCol; j++) {
                    fileHtmlWriter.write("<td> &nbsp;&nbsp; + " + argument2[i][j] + "</td>");
                    fileHtmlWriterAnswer.write("<td> &nbsp;&nbsp; + " + argument2[i][j] + "</td>");
                    fileTxtWriter.write("   + " + argument2[i][j]);
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
                    fileHtmlWriterAnswer.write("<td> " + (argument1[i][j] + argument2[i][j]) + " </td>");
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