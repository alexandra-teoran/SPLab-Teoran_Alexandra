package ro.uvt.info.sp_lab.model;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subchapters;

    public Chapter(String name) {
        this.name = name;
        this.subchapters = new ArrayList<>();
    }

    public void addSubchapter(String subchapterTitle) {
        SubChapter subchapter = new SubChapter(subchapterTitle);
        subchapters.add(subchapter);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        System.out.println("Subchapters:");
        for (SubChapter subchapter : subchapters) {
            subchapter.print();
        }
    }
}
