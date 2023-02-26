package Document;

import Document.Components.*;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument implements DocumentFactoryInterface {

    private List<ListItem> items;

    @Override
    public Header createHeader(String text) {
        return new Header("<header>" + text + "</header>");
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new Paragraph("<p>" + text + "</p>");
    }

    @Override
    public DocumentList createDocumentList() {
        this.items = new ArrayList<>();
        this.items.add(new ListItem("<ul>"));
        this.items.add(new ListItem("</ul>"));
        return new DocumentList(this.items);
    }


    @Override
    public ListItem addDocumentListItem(String item) {
        this.items.add(this.items.size() - 1, new ListItem("<li>" +item+ "</li>") );
        return this.items.get(this.items.size() - 2);
    }

    @Override
    public Footer createFooter(String text) {
        return new Footer("<footer>" + text + "</footer>");
    }

    @Override
    public PlainText createPlainText(String text) {
        return new PlainText("<a>" + text + "</a>");
    }
}