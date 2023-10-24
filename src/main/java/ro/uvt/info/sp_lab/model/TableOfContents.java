package ro.uvt.info.sp_lab.model;


public class TableOfContents implements Element{
    private String something;

    @Override
    public void print() {
        System.out.println("Something: " + something);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int id) {
        return null;
    }
}
