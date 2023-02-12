package Document.Components;

import Document.Document;

public class Paragraph extends Document {
    public String text;
    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
