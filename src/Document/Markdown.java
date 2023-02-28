package Document;

import Document.Components.*;

import java.util.ArrayList;

public class Markdown implements DocumentFactoryInterface {

    @Override
    public Header createHeader(String text) {

        return new Header("#"+ text + "\n");
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new Paragraph(text + "\n");
    }

    @Override
    public DocumentList createDocumentList() {
        ArrayList<ListItem> list = new ArrayList<>();
        list.add(new ListItem(""));
        return new DocumentList(list);
    }

    @Override
    public ListItem addDocumentListItem(String item) {
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
