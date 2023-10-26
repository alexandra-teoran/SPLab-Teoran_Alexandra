package ro.uvt.info.sp_lab.model;

public class ImageProxy implements Element, Picture{
    String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("Image url: "+ url);
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

    @Override
    public String url() {
        return null;
    }

    Image loadImage(){
        if(realImage == null){
            realImage=new Image(url);
        }
        return realImage;
    }
}
