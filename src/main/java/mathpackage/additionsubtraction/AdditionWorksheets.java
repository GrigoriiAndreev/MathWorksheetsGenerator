package mathpackage.additionsubtraction;

import mathpackage.WorksheetTemplate;

import java.io.*;
import java.util.ArrayList;
import static mathpackage.General.*;
import static mathpackage.General.workingFolder;
import static mathpackage.Matrix.*;

/**
 * Class generating addition worksheets. Part 1, addition in line
 * @ Grigorii Andreev
 * Date: 05 January 2021
 */

public class AdditionWorksheets extends WorksheetTemplate implements Serializable{

    static public String diskRus = "https://disk.yandex.ru/d/IrYNy1rdUnTPgg";
    static public String diskEng = "https://drive.google.com/drive/folders/1bCcQcAeggiH28hnMduHXIrXrWdZ5NTNl?usp=sharing";
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

    public AdditionWorksheets(
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

        ArrayList<AdditionWorksheets> additionWorksheets = new ArrayList<>();

        emptyAllFolders();

        //All topics for primary school. Addition in line
        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение чисел до 10.","Addition. Addition numbers up to 10.",
                "Задачи по математике на тему:<br />Сложение чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10.",
                "Addition of numbers up to 10.",
                "Сложи числа до 10.",
                "Add numbers up to 10.",
                0, 10, 11));

        topWorksheet(workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).longProblemDescriptionRus,
                additionWorksheets.get(0).numbersRangeStart, additionWorksheets.get(0).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionRus, additionWorksheets.get(0).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeRus, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).topicRus, additionWorksheets.get(0).h2Rus, additionWorksheets.get(0).shortProblemDescriptionRus,
                additionWorksheets.get(0).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).longProblemDescriptionEng,
                additionWorksheets.get(0).numbersRangeStart, additionWorksheets.get(0).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).shortProblemDescriptionEng, additionWorksheets.get(0).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(0).gradeEng, additionWorksheets.get(0).totalPageOfWorksheets,
                additionWorksheets.get(0).topicEng, additionWorksheets.get(0).h2Eng, additionWorksheets.get(0).shortProblemDescriptionEng,
                additionWorksheets.get(0).longProblemDescriptionEng, diskEng, adsBlockEng);
        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение чисел до 20.","Addition. Addition numbers up to 20.",
                "Задачи по математике на тему:<br />Сложение чисел до 20. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 20. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 20.",
                "Addition of numbers up to 20.",
                "Сложи числа до 20.",
                "Add numbers up to 20.",
                0, 20, 11));

        topWorksheet(workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).longProblemDescriptionRus,
                additionWorksheets.get(1).numbersRangeStart, additionWorksheets.get(1).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeRus, additionWorksheets.get(1).totalPageOfWorksheets, additionWorksheets.get(1).topicRus,
                additionWorksheets.get(1).h2Rus, additionWorksheets.get(1).shortProblemDescriptionRus, additionWorksheets.get(1).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).longProblemDescriptionEng,
                additionWorksheets.get(1).numbersRangeStart, additionWorksheets.get(1).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets,
                additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(1).gradeEng, additionWorksheets.get(1).totalPageOfWorksheets, additionWorksheets.get(1).topicEng,
                additionWorksheets.get(1).h2Eng, additionWorksheets.get(1).shortProblemDescriptionEng, additionWorksheets.get(1).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение двузначных чисел.","Addition. Two digit numbers addition.",
                "Задачи по математике на тему:<br />Сложение двузначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Two-digit numbers addition. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение двузначных чисел.",
                "Two-digit numbers addition.",
                "Сложи двузначные числа.",
                "Add two-digit numbers.",
                10, 99, 11));

        topWorksheet(workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).longProblemDescriptionRus,
                additionWorksheets.get(2).numbersRangeStart, additionWorksheets.get(2).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeRus, additionWorksheets.get(2).totalPageOfWorksheets, additionWorksheets.get(2).topicRus,
                additionWorksheets.get(2).h2Rus, additionWorksheets.get(2).shortProblemDescriptionRus, additionWorksheets.get(2).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).longProblemDescriptionEng,
                additionWorksheets.get(2).numbersRangeStart, additionWorksheets.get(2).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets,
                additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(2).gradeEng, additionWorksheets.get(2).totalPageOfWorksheets, additionWorksheets.get(2).topicEng,
                additionWorksheets.get(2).h2Eng, additionWorksheets.get(2).shortProblemDescriptionEng, additionWorksheets.get(2).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение чисел до 100.","Addition. Addition numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 100.",
                "Addition of numbers up to 100.",
                "Сложи числа до 100.",
                "Add numbers up to 100.",
                0, 99, 11));

        topWorksheet(workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).longProblemDescriptionRus,
                additionWorksheets.get(3).numbersRangeStart, additionWorksheets.get(3).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeRus, additionWorksheets.get(3).totalPageOfWorksheets, additionWorksheets.get(3).topicRus,
                additionWorksheets.get(3).h2Rus, additionWorksheets.get(3).shortProblemDescriptionRus, additionWorksheets.get(3).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).longProblemDescriptionEng,
                additionWorksheets.get(3).numbersRangeStart, additionWorksheets.get(3).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets,
                additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(3).gradeEng, additionWorksheets.get(3).totalPageOfWorksheets, additionWorksheets.get(3).topicEng,
                additionWorksheets.get(3).h2Eng, additionWorksheets.get(3).shortProblemDescriptionEng, additionWorksheets.get(3).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение однозначных чисел.","Addition. Addition 1 digit numbers.",
                "Задачи по математике на тему:<br />Сложение однозначных чисел. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition 1 digit numbers. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение однозначных чисел.",
                "Addition 1 digit numbers.",
                "Сложи однозначные числа.",
                "Add 1 digit numbers.",
                0, 9, 11));

        topWorksheet(workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).longProblemDescriptionRus,
                additionWorksheets.get(4).numbersRangeStart, additionWorksheets.get(4).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeRus, additionWorksheets.get(4).totalPageOfWorksheets, additionWorksheets.get(4).topicRus,
                additionWorksheets.get(4).h2Rus, additionWorksheets.get(4).shortProblemDescriptionRus, additionWorksheets.get(4).longProblemDescriptionRus, diskEng, adsBlockEng);

        topWorksheet(workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).longProblemDescriptionEng,
                additionWorksheets.get(4).numbersRangeStart, additionWorksheets.get(4).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets,
                additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(4).gradeEng, additionWorksheets.get(4).totalPageOfWorksheets, additionWorksheets.get(4).topicEng,
                additionWorksheets.get(4).h2Eng, additionWorksheets.get(4).shortProblemDescriptionEng, additionWorksheets.get(4).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение одинаковых чисел до 10.","Addition. Add doubles. Numbers up to 10.",
                "Задачи по математике на тему:<br />Сложение одинаковых чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add doubles. Numbers up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 10.",
                "Addition doubles up to 10.",
                "Сложи одинаковые числа до 10.",
                "Add doubles. Numbers up to 10.",
                0, 10, 11));

        topWorksheet(workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).longProblemDescriptionRus,
                additionWorksheets.get(5).numbersRangeStart, additionWorksheets.get(5).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeRus, additionWorksheets.get(5).totalPageOfWorksheets, additionWorksheets.get(5).topicRus,
                additionWorksheets.get(5).h2Rus, additionWorksheets.get(5).shortProblemDescriptionRus, additionWorksheets.get(5).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).longProblemDescriptionEng,
                additionWorksheets.get(5).numbersRangeStart, additionWorksheets.get(5).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets,
                additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(5).gradeEng, additionWorksheets.get(5).totalPageOfWorksheets, additionWorksheets.get(5).topicEng,
                additionWorksheets.get(5).h2Eng, additionWorksheets.get(5).shortProblemDescriptionEng, additionWorksheets.get(5).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение четных чисел до 100.","Addition. Add even numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение четных чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add even numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение четных чисел до 100.",
                "Addition of even numbers up to 100.",
                "Сложи четные числа до 100.",
                "Add even numbers. Numbers up to 100.",
                0, 100, 11));

        topWorksheet(workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).longProblemDescriptionRus,
                additionWorksheets.get(6).numbersRangeStart, additionWorksheets.get(6).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeRus, additionWorksheets.get(6).totalPageOfWorksheets, additionWorksheets.get(6).topicRus,
                additionWorksheets.get(6).h2Rus, additionWorksheets.get(6).shortProblemDescriptionRus, additionWorksheets.get(6).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).longProblemDescriptionEng,
                additionWorksheets.get(6).numbersRangeStart, additionWorksheets.get(6).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets,
                additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(6).gradeEng, additionWorksheets.get(6).totalPageOfWorksheets, additionWorksheets.get(6).topicEng,
                additionWorksheets.get(6).h2Eng, additionWorksheets.get(6).shortProblemDescriptionEng, additionWorksheets.get(6).longProblemDescriptionEng,  diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение нечетных чисел до 100.","Addition. Add odd numbers up to 100.",
                "Задачи по математике на тему:<br />Сложение нечетных чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Add odd numbers up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение нечетных чисел до 100.",
                "Addition of odd numbers up to 100.",
                "Сложи нечетные числа до 100.",
                "Add odd numbers. Numbers up to 100.",
                0, 100, 11));

        topWorksheet(workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).longProblemDescriptionRus,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeRus, additionWorksheets.get(7).totalPageOfWorksheets, additionWorksheets.get(7).topicRus,
                additionWorksheets.get(7).h2Rus, additionWorksheets.get(7).shortProblemDescriptionRus, additionWorksheets.get(7).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).longProblemDescriptionEng,
                additionWorksheets.get(7).numbersRangeStart, additionWorksheets.get(7).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets,
                additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(7).gradeEng, additionWorksheets.get(7).totalPageOfWorksheets, additionWorksheets.get(7).topicEng,
                additionWorksheets.get(7).h2Eng, additionWorksheets.get(7).shortProblemDescriptionEng, additionWorksheets.get(7).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение. Сложение чисел до 50.","Addition. Addition numbers up to 50.",
                "Задачи по математике на тему:<br />Сложение чисел до 50. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers up to 50. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел до 50.",
                "Addition of numbers up to 50.",
                "Сложи числа до 50.",
                "Add numbers up to 50.",
                0, 50, 11));

        topWorksheet(workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).longProblemDescriptionRus,
                additionWorksheets.get(8).numbersRangeStart, additionWorksheets.get(8).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeRus, additionWorksheets.get(8).totalPageOfWorksheets, additionWorksheets.get(8).topicRus,
                additionWorksheets.get(8).h2Rus, additionWorksheets.get(8).shortProblemDescriptionRus, additionWorksheets.get(8).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).longProblemDescriptionEng,
                additionWorksheets.get(8).numbersRangeStart, additionWorksheets.get(8).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets,
                additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(8).gradeEng, additionWorksheets.get(8).totalPageOfWorksheets, additionWorksheets.get(8).topicEng,
                additionWorksheets.get(8).h2Eng, additionWorksheets.get(8).shortProblemDescriptionEng, additionWorksheets.get(8).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение, сумма чисел до 50.","Addition numbers. Sums up to 50.",
                "Задачи по математике на тему:<br />Сложение, сумма чисел до 50. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers. Sums up to 50. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел. Сумма чисел до 50.",
                "Addition of numbers. Sums up to 50.",
                "Сложи числа. Сумма чисел до 50.",
                "Add numbers. Sums up to 50.",
                0, 50, 11));

        topWorksheet(workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).longProblemDescriptionRus,
                additionWorksheets.get(9).numbersRangeStart, additionWorksheets.get(9).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeRus, additionWorksheets.get(9).totalPageOfWorksheets, additionWorksheets.get(9).topicRus,
                additionWorksheets.get(9).h2Rus, additionWorksheets.get(9).shortProblemDescriptionRus, additionWorksheets.get(9).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).longProblemDescriptionEng,
                additionWorksheets.get(9).numbersRangeStart, additionWorksheets.get(9).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets,
                additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(9).gradeEng, additionWorksheets.get(9).totalPageOfWorksheets, additionWorksheets.get(9).topicEng,
                additionWorksheets.get(9).h2Eng, additionWorksheets.get(9).shortProblemDescriptionEng, additionWorksheets.get(9).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение, сумма чисел до 100.","Addition numbers. Sums up to 100.",
                "Задачи по математике на тему:<br />Сложение, сумма чисел до 100. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers. Sums up to 100. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел. Сумма чисел до 100.",
                "Addition of numbers. Sums up to 100.",
                "Сложи числа. Сумма чисел до 100.",
                "Add numbers. Sums up to 100.",
                0, 100, 11));

        topWorksheet(workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).longProblemDescriptionRus,
                additionWorksheets.get(10).numbersRangeStart, additionWorksheets.get(10).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeRus, additionWorksheets.get(10).totalPageOfWorksheets, additionWorksheets.get(10).topicRus,
                additionWorksheets.get(10).h2Rus, additionWorksheets.get(10).shortProblemDescriptionRus, additionWorksheets.get(10).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).longProblemDescriptionEng,
                additionWorksheets.get(10).numbersRangeStart, additionWorksheets.get(10).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets,
                additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(10).gradeEng, additionWorksheets.get(10).totalPageOfWorksheets, additionWorksheets.get(10).topicEng,
                additionWorksheets.get(10).h2Eng, additionWorksheets.get(10).shortProblemDescriptionEng, additionWorksheets.get(10).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение, сумма чисел до 10.","Addition numbers. Sums up to 10.",
                "Задачи по математике на тему:<br />Сложение, сумма чисел до 10. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers. Sums up to 10. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел. Сумма чисел до 10.",
                "Addition of numbers. Sums up to 10.",
                "Сложи числа. Сумма чисел до 10.",
                "Add numbers. Sums up to 10.",
                0, 10, 11));

        topWorksheet(workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).longProblemDescriptionRus,
                additionWorksheets.get(11).numbersRangeStart, additionWorksheets.get(11).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeRus, additionWorksheets.get(11).totalPageOfWorksheets, additionWorksheets.get(11).topicRus,
                additionWorksheets.get(11).h2Rus, additionWorksheets.get(11).shortProblemDescriptionRus, additionWorksheets.get(11).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).longProblemDescriptionEng,
                additionWorksheets.get(11).numbersRangeStart, additionWorksheets.get(11).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets,
                additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(11).gradeEng, additionWorksheets.get(11).totalPageOfWorksheets, additionWorksheets.get(11).topicEng,
                additionWorksheets.get(11).h2Eng, additionWorksheets.get(11).shortProblemDescriptionEng, additionWorksheets.get(11).longProblemDescriptionEng, diskEng, adsBlockEng);

        additionWorksheets.add( new AdditionWorksheets(
                "&thinsp;", "&nbsp;",
                "Сложение, сумма чисел до 20.","Addition numbers. Sums up to 20.",
                "Задачи по математике на тему:<br />Сложение, сумма чисел до 20. Задачи с ответами. Скачать pdf или jpg.",
                "Mathematics worksheets:<br />Addition numbers. Sums up to 20. Worksheets with answers. Download pdf or jpg.",
                "", "",
                "Сложение чисел. Сумма чисел до 20.",
                "Addition of numbers. Sums up to 20.",
                "Сложи числа. Сумма чисел до 20.",
                "Add numbers. Sums up to 20.",
                0, 20, 11));

        topWorksheet(workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus );
        topWorksheetPdf(workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).longProblemDescriptionRus,
                additionWorksheets.get(12).numbersRangeStart, additionWorksheets.get(12).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeRus, additionWorksheets.get(12).totalPageOfWorksheets, additionWorksheets.get(12).topicRus,
                additionWorksheets.get(12).h2Rus, additionWorksheets.get(12).shortProblemDescriptionRus, additionWorksheets.get(12).longProblemDescriptionRus, diskRus, adsBlockRus);

        topWorksheet(workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng );
        topWorksheetPdf(workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng );
        topWorksheetHtmlAnswers(workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng );
        addA1_B1LineWorksheetA4(workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).longProblemDescriptionEng,
                additionWorksheets.get(12).numbersRangeStart, additionWorksheets.get(12).numbersRangeEnd, 13, 5);
        bottomWorksheet(workingFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        fullWorksheet(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        fullWorksheetPdf(workingFolder, readyFilesFolderPdf, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        fullWorksheetHtmlAnswer(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        allSameWorksheets(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets,
                additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng);
        finalHtmlPageSingleTopic2(workingFolder, readyFilesFolder, additionWorksheets.get(12).gradeEng, additionWorksheets.get(12).totalPageOfWorksheets, additionWorksheets.get(12).topicEng,
                additionWorksheets.get(12).h2Eng, additionWorksheets.get(12).shortProblemDescriptionEng, additionWorksheets.get(12).longProblemDescriptionEng, diskEng, adsBlockEng);


        finalRenameFiles(readyFilesFolderHtml);

// Serialization of Objects
        try{
            FileOutputStream fos= new FileOutputStream("D:/Java_Math/SavedObjects/" + "additionWorksheets.dat");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            for(WorksheetTemplate item : additionWorksheets) {
                oos.writeObject(item.gradeRus);
                oos.writeObject(item.gradeEng);
                oos.writeObject(item.topicRus);
                oos.writeObject(item.topicEng);
                oos.writeObject(item.h2Rus);
                oos.writeObject(item.h2Eng);
                oos.writeObject(item.numberRus);
                oos.writeObject(item.numberEng);
                oos.writeObject(item.shortProblemDescriptionRus);
                oos.writeObject(item.shortProblemDescriptionEng);
                oos.writeObject(item.longProblemDescriptionRus);
                oos.writeObject(item.longProblemDescriptionEng);
                oos.writeObject(item.numbersRangeStart);
                oos.writeObject(item.numbersRangeEnd);
                oos.writeObject(item.totalPageOfWorksheets);
                oos.flush();
            }
                oos.close();
                fos.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void addA1_B1LineWorksheetA4(String workingFolder, String grade, int totalPageNumbers, String longTaskNameWorksheet,
                                               int numbersRangeStart, int numbersRangeEnd, int problemsLines, int problemsCols) throws IOException {
        System.out.println("Тема: " + longTaskNameWorksheet);

        int[][] argument1 = new int[problemsLines][problemsCols];
        int[][] argument2 = new int[problemsLines][problemsCols];

        for (int k = 1; k < totalPageNumbers ; k++) {
            for (int i = 0; i < problemsLines; i++) {
                for (int j = 0; j < problemsCols; j++) {
                    argument1[i][j] = (int) (Math.random() * (numbersRangeEnd - numbersRangeStart) + numbersRangeStart);
                    argument2[i][j] = (int) (Math.random() * (numbersRangeEnd - numbersRangeStart) + numbersRangeStart);
                }
            }

            if (longTaskNameWorksheet.contains("четные") || longTaskNameWorksheet.contains("even")) {
                int tempNumber;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * (numbersRangeEnd - numbersRangeStart) + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * (numbersRangeEnd - numbersRangeStart) + numbersRangeStart);
                        if ((tempNumber % 2) == 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
                    }
            }

            if (longTaskNameWorksheet.contains("нечетные") || longTaskNameWorksheet.contains("odd")) {
                int tempNumber;
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        tempNumber = (int) (Math.random() * (numbersRangeEnd - numbersRangeStart) + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument1[i][j] = tempNumber;
                        else argument1[i][j] = tempNumber + 1;
                        tempNumber = (int) (Math.random() * (numbersRangeEnd - numbersRangeStart) + numbersRangeStart);
                        if ((tempNumber % 2) != 0) argument2[i][j] = tempNumber;
                        else argument2[i][j] = tempNumber + 1;
                    }
            }

            if (longTaskNameWorksheet.contains("одинаковые") || longTaskNameWorksheet.contains("double")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * (numbersRangeEnd - numbersRangeStart) + numbersRangeStart);
                        argument2[i][j] = argument1[i][j];
                    }
            }

            if (longTaskNameWorksheet.contains("Сумма чисел до 10") || longTaskNameWorksheet.contains("Sums up to 10")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * 10);
                        argument2[i][j] = (int) (Math.random() * (10 - argument1[i][j]));
                    }
            }

            if (longTaskNameWorksheet.contains("Сумма чисел до 20") || longTaskNameWorksheet.contains("Sums up to 20")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * 20);
                        argument2[i][j] = (int) (Math.random() * (20 - argument1[i][j]));
                    }
            }

            if (longTaskNameWorksheet.contains("Сумма чисел до 50") || longTaskNameWorksheet.contains("Sums up to 50")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * 50);
                        argument2[i][j] = (int) (Math.random() * (50 - argument1[i][j]));
                    }
            }

            if (longTaskNameWorksheet.contains("Сумма чисел до 100") || longTaskNameWorksheet.contains("Sums up to 100")) {
                for (int i = 0; i < problemsLines; i++)
                    for (int j = 0; j < problemsCols; j++) {
                        argument1[i][j] = (int) (Math.random() * 100);
                        argument2[i][j] = (int) (Math.random() * (100 - argument1[i][j]));
                    }
            }

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream
                    (workingFolder + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyTxtBlock__" + ".txt"));
            FileWriter fileWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlock__" + ".html");
            FileWriter fileAnswerWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlockAnswer__" + ".html");

            //Create problems page
            fileWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\"><tbody>\n ");
            fileAnswerWriter.write("<table style=\"border-collapse: collapse; width: 100%;\" border=\"0\"><tbody>\n ");

            for (int i = 0; i < problemsLines; i++) {
                fileWriter.write("<tr>");
                fileAnswerWriter.write("<tr>");

                //Create problems line
                for (int j = 0; j < problemsCols; j++) {
                    fileWriter.write("<td style=\"width: 20%;\">");
                    fileAnswerWriter.write("<td style=\"width: 20%;\">");

                    fileWriter.write(((i * problemsCols) + (j + 1)) + ") " + argument1[i][j] + " + ");
                    fileAnswerWriter.write(((i * problemsCols) + (j + 1)) + ") " + argument1[i][j]  + " + ");

                    fileWriter.write(argument2[i][j] + " = ____ </td>");
                    fileAnswerWriter.write(argument2[i][j] + " = " + (argument1[i][j] + argument2[i][j]) + "</td>");
                }

                outputStream.write('\n');
                fileWriter.write("</tr>\n");
                fileAnswerWriter.write("</tr>\n");

                //Empty line in html table
                fileWriter.write("<tr><td colspan=\"5\">&nbsp;<br /><br /></td> </tr>\n");
                fileAnswerWriter.write("<tr><td colspan=\"5\">&nbsp;<br /><br /></td> </tr>\n");
            }

            fileWriter.write("</tbody></table>\n");
            fileAnswerWriter.write("</tbody></table>\n");
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
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlock__" + ".html");
            FileWriter fileHtmlWriterAnswer = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyHtmlBlockAnswer__" + ".html");
            FileWriter fileTxtWriter = new FileWriter(workingFolder
                    + grade + " " + longTaskNameWorksheet + " Стр. " + k + "bodyTxtBlock__" + ".txt");

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