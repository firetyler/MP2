package Document;


import Document.Components.DocumentList;
import Document.Components.ListItem;

public class UndoRedo {
    
    DocumentInterface document;
    Document type;

    public UndoRedo(DocumentInterface document, Document type) {
        this.document = document;
        this.type = type;
    }

    public void undo(){
        if(type instanceof ListItem){
            DocumentList list =  document.getLastList();
            
            list.remove(type);
        }
        else
            document.remove(type);
    }

    public void redo(){
        if(type instanceof ListItem){
            DocumentList list =  document.getLastList();
            list.add(type.getText());
        }
        else
            document.add(type);
    }

}
