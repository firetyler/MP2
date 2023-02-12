package Document;

import Document.Components.*;

import java.util.List;

public class DocumentHTML implements DocumentFactoryInterface {
    private DocumentFactoryInterface factory;

    public DocumentHTML(){
        this.factory = new DocumentFactory();
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
    public DocumentList createDocumentList(List<String> items) {
        return this.factory.createDocumentList(items);
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