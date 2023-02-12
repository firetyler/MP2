package Client;

import Document.Document;
import Document.DocumentBuilder;
import Document.DocumentFactory;

public class app {
    public static void main(String[] args){

        DocumentFactory factory = new DocumentFactory();
        DocumentBuilder documentBuilder = new DocumentBuilder(factory);

        documentBuilder.addHeader("")
                .addParagraph("")
                .addPlainText("")
                .addFooter("")
                .build()
                .getList()
                .forEach(e ->{System.out.println(e);});



    }
}
