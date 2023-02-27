package Document;

import Document.Components.*;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument implements DocumentFactoryInterface {

    @Override
    public Header createHeader(String text) {
        return new Header("<header>" + text + "</header>" + "\n");
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new Paragraph("<p>" + text + "</p>" + "\n");
    }

    @Override
    public DocumentList createDocumentList() {
        ArrayList<ListItem> list = new ArrayList<>();
        list.add(new ListItem("<ul>" + "\n"));
        list.add(new ListItem("</ul>"   + "\n"));
        return  new DocumentList(list);
    }


    @Override
    public ListItem addDocumentListItem(String item) {
        return new ListItem("\t" + "<li>" +item+ "</li>" + "\n");
    }

    @Override
    public Footer createFooter(String text) {
        return new Footer("<footer>" + text + "</footer>" + "\n");
    }

    @Override
    public PlainText createPlainText(String text) {
        return new PlainText("<a>" + text + "</a>"  + "\n");
    }
}