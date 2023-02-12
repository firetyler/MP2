package Document;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public  abstract class Document implements DocumentInterface{

    protected List<DocumentInterface> element = new ArrayList<>();
    protected String title;

    public void setTitle(String title){
        this.title = title;
    }

    public void add(DocumentInterface element) {
        this.element.add(element);
    }


    public void remove(DocumentInterface element) {
        this.element.remove(element);
    }


    public DocumentInterface getChild(int index) {
        return this.element.get(index);
    }

    @Override
    public String getText() {
        return null;
    }
}
