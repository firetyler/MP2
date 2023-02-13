package Document;


import java.util.ArrayList;
import java.util.List;

public  abstract class Document implements DocumentInterface{

    protected List<DocumentInterface> element = new ArrayList<>();
    protected String title;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){return title;}

    public void add(DocumentInterface element) {
        this.element.add(element);
    }


    public void remove(DocumentInterface element) {
        this.element.remove(element);
    }


    public DocumentInterface getChild(int index) {
        return this.element.get(index);
    }

    public List<DocumentInterface> getList(){
        return this.element;
    }


    public String getText() {
        return null;
    }
}
