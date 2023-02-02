package Factory;

import Document.Document;

public class CreateFactory {

    public Document createDocument(){
        return new Document();
    }
}
