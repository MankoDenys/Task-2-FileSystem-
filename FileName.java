public abstract class FileName {
    private String name;

    public FileName(String name) {
        this.name = name;
    }

    public abstract long getSize();

}
