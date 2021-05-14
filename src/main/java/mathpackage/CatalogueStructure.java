package mathpackage;

/*
There are the methods for creating folders and files structure and archiving all kind of important files
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CatalogueStructure extends General {

    public static List<String> firstLevelFoldersRu = new ArrayList<>();     //Grades in Russian
    public static List<String> firstLevelFoldersEn = new ArrayList<>();     //Grades in English
    public static List<String> secondLevelFoldersRu = new ArrayList<>();    //Explicit topics in Russian
    public static List<String> secondLevelFoldersEn = new ArrayList<>();    //Explicit topics in English
    public static List<String> allTypesOfFiles = new ArrayList<>();
    public static List<String> additionalFolders = new ArrayList<>();
//    public static List<String> topics4GradeRus = new ArrayList<>();
//    public static List<String> topics4GradeEng = new ArrayList<>();

    static {
        // Creating grades folders - Rus
        firstLevelFoldersRu.add(mainRoot + "/Темы");
        firstLevelFoldersRu.add(mainRoot + "/Детский сад");
        firstLevelFoldersRu.add(mainRoot + "/1 класс");
        firstLevelFoldersRu.add(mainRoot + "/2 класс");
        firstLevelFoldersRu.add(mainRoot + "/3 класс");
        firstLevelFoldersRu.add(mainRoot + "/4 класс");
        firstLevelFoldersRu.add(mainRoot + "/5 класс");
        firstLevelFoldersRu.add(mainRoot + "/6 класс");
        firstLevelFoldersRu.add(mainRoot + "/7 класс");
        firstLevelFoldersRu.add(mainRoot + "/8 класс");
        firstLevelFoldersRu.add(mainRoot + "/9 класс");
        firstLevelFoldersRu.add(mainRoot + "/10 класс");
        firstLevelFoldersRu.add(mainRoot + "/11 класс");

        //Creating grades folders - Eng
        firstLevelFoldersEn.add(mainRoot + "/Topics");
        firstLevelFoldersEn.add(mainRoot + "/Kindergarten");
        firstLevelFoldersEn.add(mainRoot + "/Grade-1");
        firstLevelFoldersEn.add(mainRoot + "/Grade-2");
        firstLevelFoldersEn.add(mainRoot + "/Grade-3");
        firstLevelFoldersEn.add(mainRoot + "/Grade-4");
        firstLevelFoldersEn.add(mainRoot + "/Grade-5");
        firstLevelFoldersEn.add(mainRoot + "/Grade-6");

        //There are the topics (inside of grades)
//        topics4GradeRus.add(firstLevelFoldersRu.get(4) + "/Числа и счет");
//        topics4GradeEng.add(firstLevelFoldersEn.get(4) + "/Numbers and count");

        //Math topics without grades
        secondLevelFoldersRu.add(firstLevelFoldersRu.get(0) + "/Сложение");
        secondLevelFoldersEn.add(firstLevelFoldersEn.get(0) + "/Addition");

        //Math topics for 1 grade
        secondLevelFoldersRu.add(firstLevelFoldersRu.get(2) + "/Сложение");
        secondLevelFoldersEn.add(firstLevelFoldersEn.get(2) + "/Addition");

        //Types of topics (inside of topics)
        allTypesOfFiles.add("/Pdf");
        allTypesOfFiles.add("/Html");
        allTypesOfFiles.add("/Jpg");
        allTypesOfFiles.add("/Zip");
        allTypesOfFiles.add("/Archived");
        allTypesOfFiles.add("/Temporary");
        allTypesOfFiles.add("/SocialNetworks");

        //Additional folders to create html, pdf pages an archives
        additionalFolders.add(mainRoot + "/Pdf");
        additionalFolders.add(mainRoot + "/Html");
        additionalFolders.add(mainRoot + "/ReadyWorksheets");
        additionalFolders.add(mainRoot + "/Temp");
        additionalFolders.add(mainRoot + "/UsefulScripts");
        additionalFolders.add(mainRoot + "/SavedObjects");

    }

    public static void main(String[] args) throws IOException {

        //Creating all folders structure for project.
        //Main root
        if (new File(mainRoot).exists()) {
            System.out.println("Main root exists");
        } else {
            new File(mainRoot).mkdir();
        }
        System.out.println("Main root created");

        //Grades - Russian
        for (String gradeFolders : firstLevelFoldersRu) {
            if (!new File(gradeFolders).exists()) {
                new File(gradeFolders).mkdir();
            }
        }

        //Grades -English
        for (String gradeFolders : firstLevelFoldersEn) {
            if (!new File(gradeFolders).exists()) {
                new File(gradeFolders).mkdir();
            }
        }
        System.out.println("Grades' folders are created");

        //Additional folders
        for (String topics : additionalFolders) {
            if (!new File(topics).exists()) {
                new File(topics).mkdir();
            }
        }

        //Second level folders - English
        for (String gradeFolders : secondLevelFoldersEn) {
            if (!new File(gradeFolders).exists()) {
                new File(gradeFolders).mkdir();
            }
        }

        //Third level folders - Russian
        for (String gradeFolders : secondLevelFoldersRu) {
            if (!new File(gradeFolders).exists()) {
                new File(gradeFolders).mkdir();

            for (String subFolders : allTypesOfFiles) {
                if (! new File(gradeFolders + subFolders).exists()) {
                    new File(gradeFolders + subFolders).mkdir();
                }
                System.out.println(gradeFolders + subFolders);
            }

            }
        }


    }
}

