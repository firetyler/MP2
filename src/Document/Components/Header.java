package Document.Components;

import Document.Document;

public class Header extends Document {
    private String text;

    public Header(String text){
        this.text = text;
    }
    @Override
    public String getText() {
        return text;
    }
    @Override
    public void setText(String text) {
        this.text = text;
    }
}
