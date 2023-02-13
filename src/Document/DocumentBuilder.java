package Document;

import Document.Components.Header;

import javax.print.Doc;
import java.util.List;
public class DocumentBuilder {
    private DocumentInterface document;
    private DocumentFactoryInterface factory;

    public DocumentBuilder(DocumentFactoryInterface factory){
        this.factory = factory;
        this.document = new Document() {
            
        };
    }

    public DocumentBuilder(String title){
        document.setTitle(title);
    }
    public DocumentBuilder addHeader(String text){
        document.add(this.factory.createHeader(text));
        return this;
    }
    public DocumentBuilder addParagraph(String text){
        document.add(this.factory.createParagraph(text));
        return this;
    }
    public DocumentBuilder addList(List<String> item){
        document.add(this.factory.createDocumentList(item));
    return this;
    }
    public DocumentBuilder addFooter(String text){
        document.add(this.factory.createFooter(text));
    return this;
    }
    public DocumentBuilder addPlainText(String text){
        document.add(this.factory.createPlainText(text));
        return this;
    }
    public DocumentInterface build(){
        return document;
    }
}
