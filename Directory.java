import java.util.ArrayList;
import java.util.List;

public class Directory extends FileName {

    private List<File> files = new ArrayList<>();
    private List<Directory> directories = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addFiles(File file) {
        files.add(file);
    }

    public void addDirectories(Directory directory) {
        directories.add(directory);
    }

    @Override
    public long getSize() {
        long size = getDirSize();
        for(File file : files) {
            size += file.getSize();
        }
        return size;
    }

    public long getDirSize() {
        long dir = 0;
        for(Directory directory : directories) {
            dir += directory.getSize();
        }
        return dir;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "files=" + files +
                ", directories=" + directories +
                '}';
    }
}

