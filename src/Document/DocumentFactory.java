package Document;

import Document.Components.*;

import java.util.List;

public class DocumentFactory implements DocumentFactoryInterface {

    @Override
    public Header createHeader(String text) {
        return new Header(text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new Paragraph(text);
    }

    @Override
    public DocumentList createDocumentList(List<String> items) {
        return new DocumentList(items) ;
    }

    @Override
    public Footer createFooter(String text) {
        return new Footer(text);
    }

    @Override
    public PlainText createPlainText(String text) {
        return new PlainText(text);
    }
}
