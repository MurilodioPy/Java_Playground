package a;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CExemplos {
   String caminhoArquivo = "reports/";
    
   public static void main(String[] args) {
        CExemplos relatorioDAO = new CExemplos();

        //exemplo 1:
        relatorioDAO.relatorio1();

        //exemplo 2:
        relatorioDAO.relatorio2();

    }
    
    //preenche um texto para imprimir o texto como saída
    public void relatorio1() {
        String var1 = "bonjour";
        String var2 = "bonsoir";
        String texto = "Grupos e integrantes: \n\n";

        texto += "ID do trabalho: " + var1 + "\n";
        texto += "Título do trabalho: " + var2 + "\n";

        List<String> listaAlunos = new ArrayList();
        listaAlunos.add("joana");
        listaAlunos.add("priscila");

        texto += "Integrantes: \n";

        for (String object : listaAlunos) {
            texto += object + "\n";
        }

        texto += "\n";

        String nomeArquivo = "CExemplos1";

        try (OutputStream file = new FileOutputStream(new File(caminhoArquivo + nomeArquivo + ".pdf"));) {

            Document document = new Document();

            PdfWriter.getInstance(document, file);

            document.open();
            document.add(new Paragraph(texto, FontFactory.getFont(FontFactory.HELVETICA, 10)));
            document.close();

        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        System.out.println("Relatório gerado com sucesso!");
    }

    public void relatorio2() {

        PdfPTable table = new PdfPTable(2); //numero de colunas

        //area disponivel para a tabela
        table.setWidthPercentage(97);
        //altura das colunas
        int height = 60;

        String nomeArquivo = "CExemplos2";

        try (OutputStream file = new FileOutputStream(new File(caminhoArquivo + nomeArquivo + ".pdf"));) {

            PdfPCell titulo1 = new PdfPCell(new Paragraph("Trabalho", FontFactory.getFont(FontFactory.HELVETICA, 10)));
            titulo1.setColspan(1);
            titulo1.setHorizontalAlignment(Element.ALIGN_MIDDLE);
            titulo1.setPadding(3.0f);
            titulo1.setBackgroundColor(new BaseColor(255, 255, 255));
            titulo1.setFixedHeight(20);
            table.addCell(titulo1);

            PdfPCell titulo2 = new PdfPCell(new Paragraph("Orientadores", FontFactory.getFont(FontFactory.HELVETICA, 10)));
            titulo2.setColspan(1);
            titulo2.setHorizontalAlignment(Element.ALIGN_CENTER);
            titulo2.setPadding(3.0f);
            titulo2.setBackgroundColor(new BaseColor(255, 255, 255));
            titulo2.setFixedHeight(20);
            table.addCell(titulo2);

            Map<String, String> map = new HashMap();
            for (int i = 0; i < 200; i++) {
                map.put(i + "", "conteudo" + i);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                PdfPCell titulo3 = new PdfPCell(new Paragraph(key, FontFactory.getFont(FontFactory.HELVETICA, 10)));
                titulo3.setColspan(1);
                titulo3.setHorizontalAlignment(Element.ALIGN_MIDDLE);
                titulo3.setPadding(3.0f);
                titulo3.setBackgroundColor(new BaseColor(255, 255, 255));
                titulo3.setFixedHeight(height);
                table.addCell(titulo3);

                PdfPCell titulo4 = new PdfPCell(new Paragraph(value, FontFactory.getFont(FontFactory.HELVETICA, 10)));
                titulo4.setColspan(1);
                titulo4.setHorizontalAlignment(Element.ALIGN_CENTER);
                titulo4.setPadding(3.0f);
                titulo4.setBackgroundColor(new BaseColor(255, 255, 255));
                titulo4.setFixedHeight(height);
                table.addCell(titulo4);

            }

            Document document = new Document();

            PdfWriter.getInstance(document, file);

            document.open();
            
            document.add(table);
            
            document.close();

        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        System.out.println("Relatório gerado com sucesso!");

    }



}
