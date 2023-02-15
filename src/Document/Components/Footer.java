package Document.Components;

import Document.Document;

public class Footer extends Document {
    public String text ;

    public Footer(String text) {
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
