/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author eduardoasilvestre
 */
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * First iText example: Hello World.
 */
public class AHelloWorld {

    /**
     * Path to the resulting PDF file.
     */
    //public static final String RESULT = "C:\\EduardoASilvestre\\IFTM\\EclipseWorkspace\\NetBeans\\" "31ReportsiText\\AHelloWorld.pdf";
    public static final String RESULT = "reports/AHelloWorld.pdf";

    public static void main(String[] args)
            throws DocumentException, IOException {
        AHelloWorld a = new AHelloWorld();
        a.createPdf(RESULT);
    }

    
    public void createPdf(String filename)
            throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // ste p 3
        document.open();
        // step 4
        document.add(new Paragraph("Hello World!"));
        
        // step 5
        document.close();
    }
}
