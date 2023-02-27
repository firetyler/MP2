package Document;

import Document.Components.*;
import Document.DocumentFactoryInterface;

import java.util.ArrayList;
import java.util.List;

public class Markdown implements DocumentFactoryInterface {
    private List<ListItem> itemList;
    private List<String> item;

    @Override
    public Header createHeader(String text) {

        return new Header("#"+ text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new Paragraph(text + "\n");
    }

    @Override
    public DocumentList createDocumentList() {
        ArrayList<ListItem> list = new ArrayList<>();
        list.add(new ListItem("-"));
        list.add(new ListItem("-"));
        return new DocumentList(list);
    }

    @Override
    public ListItem addDocumentListItem(String item) {
    //   this.item.add("-" + item + "\n");
        return new ListItem("-" + item + "\n");
    }

    @Override
    public Footer createFooter(String text) {
        return new Footer(text + "\n");
    }

    @Override
    public PlainText createPlainText(String text) {
        return new PlainText(text + "\n");
    }
}
