package behavioral.template;

public class PDFMiner extends DataMiner{

    @Override
    protected void extractData() {
        System.out.println("Extracting data from PDF file");
    }

    @Override
    protected void analyzeData() {
        System.out.println("Analyzing data from PDF file");
    }
}
