package Document.Components;


import Document.Document;
import Document.DocumentInterface;

import java.util.ArrayList;
import java.util.List;

public class DocumentList extends Document {
    private List<ListItem> items;

    public DocumentList(List<ListItem> items) {
        this.items = items;
    }
    
    public DocumentList() {
        this.items = new ArrayList<>();
    }

    public List<ListItem> getItems() {
        return items;
    }

    @Override
    public boolean remove(DocumentInterface element) {
        return this.items.remove(this.items.get(this.items.size() - 2));
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

    public Document add(String string) {
        if(this.items.size() > 0)
            this.items.add(this.items.size() - 1, new ListItem(string));
        else
            this.items.add(new ListItem(string));
        return this;
    }
}
