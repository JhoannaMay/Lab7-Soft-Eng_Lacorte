public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdfDoc = registry.createPdfDocument();
        pdfDoc.open();
        System.out.println("Type: " + pdfDoc.getType());

        Document textDoc = registry.createTextDocument();
        textDoc.open();
        System.out.println("Type: " + textDoc.getType());

        Document spreadsheetDoc = registry.createSpreadsheetDocument();
        spreadsheetDoc.open();
        System.out.println("Type: " + spreadsheetDoc.getType());

        // Create a new PDF Document manually
        Document anotherPdf = new PdfDocument("summary_report.pdf", "Acme Corp", 30, "Summary Report");
        anotherPdf.open();
    }
}