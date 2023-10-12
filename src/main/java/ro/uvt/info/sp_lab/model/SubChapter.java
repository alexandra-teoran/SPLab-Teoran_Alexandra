package ro.uvt.info.sp_lab.model;

public class SubChapter {
    private String name;

    public SubChapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Subchapter: " + name);
    }
}
