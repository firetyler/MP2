package Document;

public class UndoRedo {
    
    DocumentInterface document;
    Document type;

    public UndoRedo(DocumentInterface document, Document type) {
        this.document = document;
        this.type = type;
    }

    public void undo(){
        document.remove(type);
    }

    public void redo(){
         document.add(type);
    }

}
