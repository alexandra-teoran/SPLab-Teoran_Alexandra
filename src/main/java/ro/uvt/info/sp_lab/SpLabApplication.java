package ro.uvt.info.sp_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.sp_lab.model.Author;
import ro.uvt.info.sp_lab.model.Book;
import ro.uvt.info.sp_lab.model.Chapter;
import ro.uvt.info.sp_lab.model.SubChapter;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpLabApplication.class, args);
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(author);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.print();
    }

}
