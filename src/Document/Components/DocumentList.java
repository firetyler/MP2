package Document.Components;


import Document.Document;

import java.util.List;

public class DocumentList extends Document {
    private List<ListItem> items;

    public DocumentList(List<ListItem> items) {
        this.items = items;
    }
    
    public DocumentList() {
    }

    public List<ListItem> getItems() {
        return items;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        items.forEach(item -> sb.append(item.getText()));
        return sb.toString();
    }

    public void setItems(List<ListItem> items) {
        this.items = items;
    }
}
