package behavioral.template;

public abstract class DataMiner {

    public final void mine(String path){
        openFile(path);
        extractData();
        analyzeData();
        closeFile();
    }

    private void openFile(String path){
        System.out.println("Opening file: " + path);
    }

    private void closeFile(){
        System.out.println("Closing file");
    }

    protected abstract void extractData();
    protected abstract void analyzeData();
}
