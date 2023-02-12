package Document.Components;

import Document.Document;

public class Header extends Document {
    private String text;

    public Header(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
