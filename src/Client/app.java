package Client;

import Document.*;

import java.util.List;

public class app {
    public static void main(String[] args){
        Facade facade = new Facade();

        System.out.println("-------------------------------------------------");
        System.out.println(facade.getFacade("html")
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
        System.out.println("-------------------------------------------------");
        System.out.println(facade.getFacade("html")
                .addHeader("Detta är en rubrik")
                .addParagraph("Detta är en paragraph")
                .addPlainText("Plaintext")
                .addFooter("Detta är en footer")
                .build().getText());

        System.out.println("-------------------------------------------------");
        List<DocumentInterface> document= facade.getFacade("html")
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
        document.get(0).setText("<header> Ny Rubrik </header>");
        document.forEach(e -> System.out.println(e.getText()));
    }
}