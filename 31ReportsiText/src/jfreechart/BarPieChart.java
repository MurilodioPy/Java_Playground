/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechart;

import com.itextpdf.awt.DefaultFontMapper;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
//https://www.viralpatel.net/generate-pie-chart-bar-graph-in-pdf-using-itext-jfreechart/

/**
 *
 * @author eduardoasilvestre
 */
public class BarPieChart {

    public static void main(String[] args)
            throws DocumentException, IOException {
        String RESULT = "reports/BarPieChart.pdf";
        BarPieChart b = new BarPieChart();
        b.createPdf(RESULT);
    }

    /**
     * Creates a PDF document.
     *
     * @param filename the path to the new PDF document
     * @throws DocumentException
     * @throws IOException
     */
    public void createPdf(String filename)
            throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        
        // step 4
        Paragraph p1 = new Paragraph("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        p1.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        
        document.add(p1);
        
        int width = 480;
        int height = 480;

        JFreeChart barChart = generateBarChart();
        BufferedImage bufferedImageB = barChart.createBufferedImage(width, height);
        Image imageB = Image.getInstance(pdfWriter, bufferedImageB, 1.0f);

        document.add(imageB);

        JFreeChart pieChart = generatePieChart();
        BufferedImage bufferedImageP = pieChart.createBufferedImage(width, height);
        Image imageP = Image.getInstance(pdfWriter, bufferedImageP, 1.0f);

        document.add(imageP);

        JFreeChart barChartT = generateBarChartTeachers();
        BufferedImage bufferedImageBT = barChartT.createBufferedImage(width, height);
        Image imageBT = Image.getInstance(pdfWriter, bufferedImageBT, 1.0f);

        document.add(imageBT);

        document.add(createFirstTable());

        // step 5
        document.close();
    }

    public static PdfPTable createFirstTable() {
        // a table with three columns
        PdfPTable table = new PdfPTable(3);
        // the cell object
        PdfPCell cell;
        // we add a cell with colspan 3
        cell = new PdfPCell(new Phrase("Cell with colspan 3"));
        cell.setColspan(3);
        table.addCell(cell);
        // now we add a cell with rowspan 2
        cell = new PdfPCell(new Phrase("Cell with rowspan 2"));
        cell.setRowspan(2);
        table.addCell(cell);
        // we add the four remaining cells with addCell()
        table.addCell("row 1; cell 1");
        table.addCell("row 1; cell 2");
        table.addCell("row 2; cell 1");
        table.addCell("row 2; cell 2");
        return table;
    }

    public static JFreeChart generatePieChart() {
        DefaultPieDataset dataSet = new DefaultPieDataset();
        dataSet.setValue("China", 19.64);
        dataSet.setValue("India", 17.3);
        dataSet.setValue("United States", 4.54);
        dataSet.setValue("Indonesia", 3.4);
        dataSet.setValue("Brazil", 2.83);
        dataSet.setValue("Pakistan", 2.48);
        dataSet.setValue("Bangladesh", 2.38);

        JFreeChart chart = ChartFactory.createPieChart(
                "World Population by countries", dataSet, true, true, false);

        return chart;
    }

    public static JFreeChart generateBarChart() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.setValue(791, "Population", "1750 AD");
        dataSet.setValue(978, "Population", "1800 AD");
        dataSet.setValue(1262, "Population", "1850 AD");
        dataSet.setValue(1650, "Population", "1900 AD");
        dataSet.setValue(2519, "Population", "1950 AD");
        dataSet.setValue(6070, "Population", "2000 AD");

        JFreeChart chart = ChartFactory.createBarChart(
                "World Population growth", "Year", "Population in millions",
                dataSet, PlotOrientation.VERTICAL, false, true, false);

        return chart;
    }

    public static JFreeChart generateBarChartTeachers() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.setValue(9, "Population", "Eduardo");
        dataSet.setValue(12, "Population", "Jefferson");
        dataSet.setValue(11, "Population", "Alexandre");
        dataSet.setValue(15, "Population", "Daniela");
        dataSet.setValue(14, "Population", "Rogério");
        dataSet.setValue(16, "Population", "Ernani");
        dataSet.setValue(15, "Population", "Vinícius");
        dataSet.setValue(6, "Population", "Rafael");
        dataSet.setValue(4, "Population", "Ernani V");
        dataSet.setValue(5, "Population", "Marcelo Ponciano");

        JFreeChart chart = ChartFactory.createBarChart(
                "Professores e número de aulas", "Professores", "Número de Aulas",
                dataSet, PlotOrientation.HORIZONTAL, false, true, false);

        return chart;
    }

}
