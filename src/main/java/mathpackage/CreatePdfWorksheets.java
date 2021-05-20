package mathpackage;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class CreatePdfWorksheets {

    static public String mainRoot = "d:/Java_Math/";
    static public String workingFolder = mainRoot + "Temp/";
    static public String readyFilesFolder = mainRoot + "ReadyWorksheets/";
    static public String readyFilesFolderPdf = mainRoot + "Pdf/";
    static public String finalPdfWorksheets = mainRoot + "Pdf/FullPdfWorksheetsWithAnswers/";
    static public String readyFilesFolderHtml = mainRoot + "Html/";

    static public Set<File> listOfPdfFolders = new HashSet<>();

    public static void main(String[] args) throws IOException {

        new File(finalPdfWorksheets).mkdir();
        transferPdfFiles();
        System.out.println(Arrays.toString(new Set[]{listOfPdfFolders}));
/*
        for(File folder : listOfPdfFolders) {
//            renamePdfFiles(folder);
            System.out.println(folder);
        }
*/
    }

    //Transfer pdf files from root Pdf to topics folders
    public static void transferPdfFiles() throws IOException {
        List<File> listOfPdfFiles;
        listOfPdfFiles = Arrays.asList(new File(readyFilesFolderPdf).listFiles());

        for (final File fileEntry : listOfPdfFiles) {

            if(fileEntry.getName().endsWith(".pdf")) {
                if (fileEntry.getName().contains("Version")) {
                    String tempName = fileEntry.getName().replaceFirst(".Version.{2,30}", "");
                    String directoryName = tempName.substring(0, tempName.length() - 1);

                    if (!fileEntry.isDirectory())  {
                        new File(readyFilesFolderPdf + directoryName).mkdir();
                        listOfPdfFolders.add(new File(directoryName));
                    }

                    Path destinationFile = Paths.get(readyFilesFolderPdf + directoryName + "/" + fileEntry.getName());
                    Path sourcesFile = Paths.get(readyFilesFolderPdf + fileEntry.getName());
                    Files.copy(sourcesFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);

//                    System.out.println(directoryName);
                }
                if (fileEntry.getName().contains("Вариант")) {
                    String tempName = fileEntry.getName().replaceFirst(".Вариант.{2,30}", "");
                    String directoryName = tempName.substring(0, tempName.length() - 1);

                    if (!fileEntry.isDirectory())  {
                        new File(readyFilesFolderPdf + directoryName).mkdir();
                        listOfPdfFolders.add(new File(directoryName));
                    }

                    Path destinationFile = Paths.get(readyFilesFolderPdf + directoryName + "/" + fileEntry.getName());
                    Path sourcesFile = Paths.get(readyFilesFolderPdf + fileEntry.getName());
                    Files.copy(sourcesFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);

//                    System.out.println(directoryName);
                }
            }
        }

        for(File folders : listOfPdfFolders) {
            System.out.println(readyFilesFolderPdf + folders);
            mergePDF(readyFilesFolderPdf + folders);
            System.out.println("Pdf files are ready");
        }

    }


    public static void renamePdfFiles(File pdfFilesFolder) {

        String oldName, newName;

        for (final File fileEntry : pdfFilesFolder.listFiles()) {
            oldName = fileEntry.toString();
            if (oldName.contains(".html")) {
                newName = oldName.replaceFirst(".html", "");
                fileEntry.renameTo(new File(newName));
            }


        }
    }


    // Merge Pdf files
    public static void mergePDF(String folderOfPdfFiles) throws IOException {
        String mergedFilesName = "", newMergedFilesName = "", newPdfSinglePageName = "";
        PDFMergerUtility mergePdfFiles = new PDFMergerUtility();
        List<File> listOfPdfFiles = new ArrayList<>();
        listOfPdfFiles = Arrays.asList(new File(folderOfPdfFiles).listFiles());
        Collections.sort(listOfPdfFiles);

        for (final File fileEntry : listOfPdfFiles) {

            if(fileEntry.getName().endsWith(".pdf")) {
                mergePdfFiles.addSource(fileEntry);
                mergedFilesName = fileEntry.getName();
            }
        }
        if (mergedFilesName.contains("Version")) {
            newMergedFilesName = mergedFilesName.replaceFirst(".Version.{2,20}", "");
            mergePdfFiles.setDestinationFileName(finalPdfWorksheets + newMergedFilesName + " Full version with answers.pdf");
            mergePdfFiles.mergeDocuments();

        }
        if (mergedFilesName.contains("Вариант")) {
            newMergedFilesName = mergedFilesName.replaceFirst(".Вариант.{2,20}", "");
            mergePdfFiles.setDestinationFileName(finalPdfWorksheets + newMergedFilesName + " Полная версия с ответами.pdf");
            mergePdfFiles.mergeDocuments();

        }

    }


}
