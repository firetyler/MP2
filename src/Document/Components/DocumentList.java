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

    public void setItems(List<String> items) {
        this.items = items;
    }
}
