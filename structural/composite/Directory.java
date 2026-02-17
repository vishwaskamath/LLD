package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem{

    private final String name;

    public Directory(String name) {
        this.name = name;
    }

    private List<FileSystemItem> items = new ArrayList<>();

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void showDetails() {
        System.out.println("This is a directory:" + name);

        for(FileSystemItem item:items){
            item.showDetails();
        }
    }
}
