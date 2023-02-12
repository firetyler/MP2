package Document.Components;

import Document.Document;

public class Footer extends Document {
    public String text ;

    public Footer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
