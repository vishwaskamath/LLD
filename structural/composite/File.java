package structural.composite;

public class File implements FileSystemItem{

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("This is a file:" + name);
    }
}
