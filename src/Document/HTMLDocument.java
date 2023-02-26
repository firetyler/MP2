package Document;

import Document.Components.*;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument implements DocumentFactoryInterface {

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
        ArrayList<ListItem> list = new ArrayList<>();
        list.add(new ListItem("<ul>"));
        list.add(new ListItem("</ul>"));
        return  new DocumentList(list);
    }


    @Override
    public ListItem addDocumentListItem(String item) {
        return new ListItem("<li>" +item+ "</li>");
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