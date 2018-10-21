public class FileSystemRunner {
    public static void main(String[] args) {
        Directory d1 = new Directory("80-e");
        d1.addFiles(new File("Vodogray", 9000 ));

        Directory d2 = new Directory("Pop");
        d2.addFiles(new File("Trimay", 8000 ));
        d2.addFiles(new File("Vishivanka", 7000 ));

        Directory musicDir = new Directory("Music");
        musicDir.addDirectories(d1);
        musicDir.addDirectories(d2);
        musicDir.addFiles(new File("Freedom", 10000));

        System.out.println(d1.getSize());
        System.out.println(d2.getSize());
        System.out.println(musicDir.getSize());
    }
}
