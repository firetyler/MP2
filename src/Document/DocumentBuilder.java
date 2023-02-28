package Document;

import java.util.Stack;

import Document.Components.DocumentList;
import Document.Components.Footer;
import Document.Components.Header;
import Document.Components.ListItem;
import Document.Components.Paragraph;
import Document.Components.PlainText;


public class DocumentBuilder {
    private DocumentInterface document;
    private DocumentFactoryInterface factory;
    private Stack<Document> undo = new Stack<>();
    private Stack<Document> redo = new Stack<>();

    public DocumentBuilder(DocumentFactoryInterface factory){
        this.factory = factory;
        this.document = new Document() {
            
        };
    }

    public DocumentBuilder(String title){
        document.setTitle(title);
    }
    public DocumentBuilder addHeader(String text){
        Header header = this.factory.createHeader(text);
        document.add(header);
        undo.push(header);
        return this;
    }
    public DocumentBuilder addParagraph(String text){
        Paragraph paragraph = this.factory.createParagraph(text);
        document.add(paragraph);
        undo.push(paragraph);
        return this;
    }

    public DocumentBuilder createList(){
        DocumentList list = this.factory.createDocumentList();
        document.add(list);
        undo.push(list);
        return this;
    }

    public DocumentBuilder addListItem(String item){
        ListItem listItem = this.factory.addDocumentListItem(item);
        DocumentList list = this.document.getLastList();
        if(list != null) {
            list.add(listItem.getText());
            undo.push(listItem);
        }
        return this;
    }
    public DocumentBuilder addFooter(String text){
        Footer footer = this.factory.createFooter(text);
        document.add(footer);
        undo.push(footer);
        return this;
    }
    public DocumentBuilder addPlainText(String text){
        PlainText plainText = this.factory.createPlainText(text);
        document.add(plainText);
        undo.push(plainText);
        return this;
    }

    public DocumentInterface build(){
        return document;
    }

    public DocumentBuilder undo(){
        if(!undo.isEmpty()){
            UndoRedo undoRedo = new UndoRedo(document, undo.peek());
            redo.push(undo.pop());
            undoRedo.undo();
            return this;
        }
        return this;
    }

    public DocumentBuilder redo(){
        if(!redo.isEmpty()){
            UndoRedo undoRedo = new UndoRedo(document, redo.peek());
            undo.push(redo.pop());
            undoRedo.redo();
            return this;
        }
        return this;
    }

}
