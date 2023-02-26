package Document;

import java.util.List;

import Document.Components.DocumentList;

public class UndoRedo {
    
    DocumentInterface document;
    Document type;

    public UndoRedo(DocumentInterface document, Document type) {
        this.document = document;
        this.type = type;
    }

    public void undo(){
        if(type.getText().contains("<li>")){
            System.out.println("Undo list item");
            DocumentList list =  document.getLastList();
            list.remove(type);
        }
        else
            document.remove(type);
    }

    public void redo(){
        document.add(type);
    }

}
