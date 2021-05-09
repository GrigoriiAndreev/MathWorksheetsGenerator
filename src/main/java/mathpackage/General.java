package mathpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Class contains all general settings and utils for all classes
 */

public class General {

    //Static important date for project
    static public String mathSiteNameRu = "https://mathematics-tests.com";
    static public String mathSiteNameEn = "https://mathematics-tests.com";
    static public String shopSiteName = "https://magazin-integral.ru";
    static public String mainRoot = "d:/Java_Math";
    static public String workingFolder = "d:/Java_Math/Temp/";
    static public String readyFilesFolder = "d:/Java_Math/ReadyWorksheets/";
    static public String readyFilesFolderPdf = "d:/Java_Math/Pdf/";
    static public String readyFilesFolderHtml = "d:/Java_Math/Html/";
    static public String googleDrive = "https://drive.google.com/drive/folders/1qZ8_2nDdjA7_e9EpdQaJTQIqehY4E5s0?usp=sharing";
    static public String yandexDisk = "https://disk.yandex.ru/d/VYRDjGJEYcxGKA?w=1";

/*
        public final static String x1="один";
        public final static String xx1="одина";

        public final static String x2="два";
        public final static String xx2="две";


        public final static String x3="три";
        public final static String x4="четыре";
        public final static String x5="пять";
        public final static String x6="шесть";
        public final static String x7="семь";
        public final static String x8="восемь";
        public final static String x9="девять";
        public final static String x10="десять";

        public final static String x11="одинадцать";
        public final static String x12="двенадцать";
        public final static String x13="тринадцать";
        public final static String x14="четырнадцать";
        public final static String x15="пятнадцать";
        public final static String x16="шеснадцать";
        public final static String x17="сернадцать";
        public final static String x18="восемнадцать";
        public final static String x19="девятнадцать";

        public final static String x20="двадцать";
        public final static String x30="тридцать";
        public final static String x40="сорок";
        public final static String x50="пятдесят";
        public final static String x60="шесдесят";
        public final static String x70="семдесят";
        public final static String x80="восемдесят";
        public final static String x90="девяноста";

        public final static String x100="сто";
        public final static String x200="двести";
        public final static String x300="триста";
        public final static String x400="четыреста";
        public final static String x500="пятсот";
        public final static String x600="шестсот";
        public final static String x700="семсот";
        public final static String x800="восемсот";
        public final static String x900="девятсот";

        public final static String x1000="тысяча";
        public final static String xx1000="тысячи";
        public final static String xхx1000="тысяч";

    public static final String[] BELOW_TWENTY = { "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
    public static final String[] TENS = { "сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
    public static final String[] HUNDREDS = { "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "деятьсот", "тысяча" };
*/

    public static void main(String[] args) throws IOException {
        finalRenameFiles("d:/Java_Math/Html/");
        finalRenameFiles("D:\\Java_Math\\Pdf");
    }

    public static double stringEvaluate(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    public static void generatingHtmlPdfWorksheetsPart1(String workingFolder, String gradeRus, int totalPageOfWorksheets,
            String shortProblemDescriptionRus, String longProblemDescriptionRus) throws IOException {
        
        Matrix.topWorksheet(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.topWorksheetPdf(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.topWorksheetHtmlAnswers(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
    }

    public static void generatingHtmlPdfWorksheetsPart2(String workingFolder, String gradeRus, int totalPageOfWorksheets,
            String shortProblemDescriptionRus, String longProblemDescriptionRus) throws IOException {

        Matrix.bottomWorksheet(General.workingFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.fullWorksheet(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.fullWorksheetPdf(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.fullWorksheetHtmlAnswer(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
        Matrix.allSameWorksheets(General.workingFolder, General.readyFilesFolder, gradeRus, totalPageOfWorksheets, shortProblemDescriptionRus, longProblemDescriptionRus );
    }


    // Empty destination folder. Old version
    public static void emptyFolder(String folder) throws Exception {

            for (File file: new File(folder).listFiles()) {
                if (file.isFile()) file.delete();
            }
        }

    //Empty all destination folders. New version
    public static void emptyAllFolders() throws Exception {

        emptyFolder("d:/Java_Math/Temp/");
        emptyFolder("d:/Java_Math/ReadyWorksheets/");
        emptyFolder("d:/Java_Math/Pdf/");
        emptyFolder("d:/Java_Math/Html/");
    }

    //Remove extra spaces "&nbsp" and "&thinsp;" in filenames
    public static void finalRenameFiles(String folder) throws IOException {
        String newName, oldName;

        for (final File fileEntry : new File(folder).listFiles()) {
            oldName = fileEntry.toString();
            if (oldName.contains("&nbsp; ")) {
                newName = oldName.replaceFirst("&nbsp; ","");
                fileEntry.renameTo(new File(newName));
            }
            if (oldName.contains("&thinsp; ")) {
                newName = oldName.replaceFirst("&thinsp; ","");
                fileEntry.renameTo(new File(newName));
            }
            if (folder.contains("Pdf")) {
                newName = oldName.replaceFirst(".html","");
                fileEntry.renameTo(new File(newName));

            }

        }

    }

    //Convert digits to Words. Numbers up to 100
/*
    public static String digitToWord100Rus(int number) {

        if ( number < 20 )
             return BELOW_TWENTY[number];
        else if ( number < 100 ) {
            int high = number / 10;
            int low = number % 10;
            String text = TENS[high];
            if ( low != 0 )
                text = text + " " + BELOW_TWENTY[low];
            return text;
        }
        else
            return TENS[0];
    }
*/

    public static void saveObject(Object object) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/Java_Math/SavedObjects/" + object.getClass().getName() + ".dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);
        fos.close();
        oos.close();
        System.out.println("Object = " + object.getClass().getName() + " saved.");
    }


}
