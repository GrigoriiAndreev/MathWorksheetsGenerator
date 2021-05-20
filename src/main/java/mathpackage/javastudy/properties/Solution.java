package mathpackage.javastudy.properties;

//import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Знакомство с properties
*/

public class Solution {

    public static String htmlFiles = "d:/Java_Math/Pdf/Add two-digit numbers. Version 1.html";
    public static String pdfFiles = "d:/Java_Math/Pdf/Add two-digit numbers. Version 1.pdf";

    public static void main(String[] args) throws IOException, DocumentException {

        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document,
                new FileOutputStream(pdfFiles));
        document.open();
        XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(htmlFiles));
        document.close();
    }
}