package Document.Components;

import Document.Document;

public class Paragraph extends Document {
    public String text;
    public Paragraph(String text) {
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
