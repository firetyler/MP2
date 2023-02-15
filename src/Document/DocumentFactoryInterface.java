package Document;

import Document.Components.*;

import java.util.List;

public interface DocumentFactoryInterface {

    Header createHeader(String text);
    Paragraph createParagraph(String text);
    DocumentList createDocumentList();
    void addDocumentListItem(String item);
    Footer createFooter(String text);
    PlainText createPlainText(String text);
}