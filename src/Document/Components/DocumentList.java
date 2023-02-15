package Document.Components;


import Document.Document;

import java.util.List;

public class DocumentList extends Document {
    private List<String> items;

    public DocumentList(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public String getText() {

        return items.toString();
    }
    @Override
    public void setText(String text) {
        this.items = items;
    }
}
