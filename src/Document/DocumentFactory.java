package Document;

import Document.Components.*;

import java.util.List;

public class DocumentFactory implements DocumentFactoryInterface {

    private DocumentFactoryInterface factory;

    public DocumentFactory(DocumentFactoryInterface factory){
        this.factory = factory;
    }

    @Override
    public Header createHeader(String text) {
        return this.factory.createHeader(text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return this.factory.createParagraph(text);
    }

    @Override
    public DocumentList createDocumentList() {
        return this.factory.createDocumentList();
    }

    @Override
    public void addDocumentListItem(String item) {
        this.factory.addDocumentListItem(item);
    }

    @Override
    public Footer createFooter(String text) {
        return this.factory.createFooter(text);
    }

    @Override
    public PlainText createPlainText(String text) {
        return this.factory.createPlainText(text);
    }
}
