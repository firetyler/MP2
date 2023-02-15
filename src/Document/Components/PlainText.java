package Document.Components;

import Document.Document;

public class PlainText extends Document {
    public String text ;

    public PlainText(String text) {
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
