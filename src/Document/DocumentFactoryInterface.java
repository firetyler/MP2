package Document;

import Document.Components.*;


public interface DocumentFactoryInterface {

    Header createHeader(String text);
    Paragraph createParagraph(String text);
    DocumentList createDocumentList();
    ListItem addDocumentListItem(String item);
    Footer createFooter(String text);
    PlainText createPlainText(String text);
}