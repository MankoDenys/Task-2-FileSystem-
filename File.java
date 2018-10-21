public class File extends FileName {

    private long size;

    public File(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                '}';
    }
}
