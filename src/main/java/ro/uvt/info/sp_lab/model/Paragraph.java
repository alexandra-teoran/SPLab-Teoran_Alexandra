package ro.uvt.info.sp_lab.model;

import lombok.Data;

@Data
public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Text: " + text);
    }
}
