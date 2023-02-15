package Client;

import Document.*;

import java.util.List;

public class app {
    public static void main(String[] args){
        Facade facede = new Facade();

        System.out.println("-------------------------------------------------");

       List<DocumentInterface> document= facede.getFacade("html")
                .addHeader("Detta är en rubrik")
                .addParagraph("Detta är en paragraph")
                .addPlainText("Plaintext")
                .createList()
                .addListItem("1. Etta")
                .addListItem("2. Tvåa")
                .createList()
                .addListItem("1. Etta")
                .addListItem("2. Tvåa")
                .addListItem("3. Tre")
                .addFooter("Detta är en footer")
                .build().getList();
       document.forEach(e -> System.out.println(e.getText()));
                 document.get(3).getText();
        System.out.println(document.get(3).getText());

        System.out.println(document.get(0).getText() );
        document.get(0).setText("ny rubrik");
        System.out.println();
        document.forEach(e -> System.out.println(e.getText()));

        System.out.println(facede.getFacade("html")
                .addHeader("Detta är en rubrik")
                .addParagraph("Detta är en paragraph")
                .addPlainText("Plaintext")
                .createList()
                .addListItem("1. Etta")
                .addListItem("2. Tvåa")
                .createList()
                .addListItem("1. Etta")
                .addListItem("2. Tvåa")
                .addListItem("3. Tre")
                .addFooter("Detta är en footer")
                .build().getText());

    }
}
