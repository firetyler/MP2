package Document.Components;

import Document.Document;

public class ListItem extends Document {

    private String text;

    public ListItem(String text){
        this.text = text;
    }
    @Override
    public String getText() {
        return text;
    }
}