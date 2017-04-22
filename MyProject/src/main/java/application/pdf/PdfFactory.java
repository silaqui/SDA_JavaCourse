package application.pdf;

import application.model.Bill;
import application.model.Company;
import application.service.DataService;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;

public class PdfFactory {

    public void createPdf() {
        Properties properties = DataService.loadProperties();
        String pdfPath = properties.getProperty("pdfPath");

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath + File.separator + "company.pdf"));
            document.open();
            document.add(new Paragraph("Hello world"));
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createPdfCompany (Company company)
    {
        DataService dataService = new DataService();
        List<String> companyInfoList = dataService.printCompanyInfo(company);


        Properties properties = DataService.loadProperties();
        String pdfPath = properties.getProperty("pdfPath");

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath + File.separator + "company.pdf"));

            Font font = new Font(Font.TIMES_ROMAN, 18.0f, Font.NORMAL, Color.black);

            document.setPageSize(new Rectangle(180,240));
            document.setMargins(15,15,15,15);
            document.open();
            for(String e:companyInfoList)
                document.add(new Paragraph(e,font));
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createPdfBill (Bill bill)
    {
        DataService dataService = new DataService();
        List<String> companyInfoList = dataService.printBillInfo(bill);


        Properties properties = DataService.loadProperties();
        String pdfPath = properties.getProperty("pdfPath");

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath + File.separator + "bill.pdf"));

            Font font = new Font(Font.TIMES_ROMAN, 8.0f, Font.NORMAL, Color.black);

            document.setPageSize(new Rectangle(200,300));
            document.setMargins(15,15,15,15);
            document.open();
            for(String e:companyInfoList)
                document.add(new Paragraph(e,font));
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
