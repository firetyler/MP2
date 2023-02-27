package Document;


import Document.Components.DocumentList;
import Document.Components.ListItem;

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


    public boolean remove(DocumentInterface element) {
        return this.element.remove(element);
    }


    public DocumentInterface getChild(int index) {
        return this.element.get(index);
    }

    public List<DocumentInterface> getList(){
        return this.element;
    }

    public void setText(String text){
    }

    public DocumentList getLastList(){
        //Find the latest occuring DocumentList in the list
        for(int i = this.element.size() - 1; i >= 0; i--){
            if(this.element.get(i) instanceof DocumentList){
                return (DocumentList) this.element.get(i);
            }
        }
        return null;
    }


    public String getText() {        
        StringBuilder res = new StringBuilder();

        this.element.forEach((e)->{
            res.append(e.getText());
        });
        return res.toString();

    }
}
