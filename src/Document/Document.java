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
        String res = "";
        boolean isBetweenHeaderAndFooter = false;
        for (DocumentInterface e : this.element) {
            if (e.getText().startsWith("<header>")) {
                res += e.getText() + "\n";
                isBetweenHeaderAndFooter = true;
            } else if (e.getText().startsWith("<footer>")) {
                res += e.getText() + "\n";
                isBetweenHeaderAndFooter = false;
            } else {
                if (isBetweenHeaderAndFooter) {
                    res += "    " + e.getText() + "\n";
                } else {
                    res += e.getText() + "\n";
                }
            }
        }
        return res;

    }
}
