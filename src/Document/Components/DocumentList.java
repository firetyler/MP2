package Document.Components;


import Document.Document;

import java.util.List;

public class DocumentList extends Document {
    private List<ListItem> items;

    public DocumentList(List<ListItem> items) {
        this.items = items;
    }

    public List<ListItem> getItems() {
        return items;
    }

    @Override
    public String getText() {

        return items.toString();
    }

    public void setItems(List<ListItem> items) {
        this.items = items;
    }
}
