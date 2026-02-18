package behavioral.template;

public class CSVMiner extends DataMiner{

    @Override
    protected void extractData() {
        System.out.println("Extracting data from CSV file");
    }

    @Override
    protected void analyzeData() {
        System.out.println("Analyzing data from CSV file");
    }
}
