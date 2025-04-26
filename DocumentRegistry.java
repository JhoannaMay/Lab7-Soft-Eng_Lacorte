public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report 2024");

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument(1, "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdfDocument() {
        return pdfPrototype.clone();
    }

    public Document createTextDocument() {
        return textDocumentPrototype.clone();
    }

    public Document createSpreadsheetDocument() {
        return spreadsheetPrototype.clone();
    }
}