package Client;

import Document.*;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args){

        DocumentFactoryInterface factory = new DocumentFactory(new HTMLDocument());
        DocumentBuilder documentBuilder = new DocumentBuilder(factory);
        List<String> lista = new ArrayList();
        lista.add("1. Etta");
        lista.add("2. Tvåa");
        DocumentInterface documentImp = documentBuilder.addHeader("Detta är en rubrik")
                .addParagraph("Detta är en paragraph")
                .addPlainText("Plaintext")
                .addList(lista)
                .addFooter("Detta är en footer")
                .build();

        documentBuilder.addParagraph("hehe");
        documentBuilder.build();
        documentImp.getList().forEach(e ->{System.out.println(e.getText());});


    }
}
