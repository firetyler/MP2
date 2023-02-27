package Client;

import Document.*;
import Document.Components.DocumentList;
import Document.Components.Header;
import Document.Components.ListItem;

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
                .addFooter("Footer")
                .undo()
                .undo()
                .undo()
                .undo()
                .undo()
                .undo()

                .redo()
                .redo()
                .redo()
                .redo()
                .redo()
                .redo()
                .undo()
                .redo()

                .addListItem("3. Tre")
                .undo()
                .build()
                .getText());

        System.out.println("-------------------------------------------------");
        System.out.println(facade.getFacade("markDown").addHeader("h")
                .addParagraph("j").undo().createList().addListItem("1").addListItem("2")



                .build().getText());
        // System.out.println(facade.getFacade("html")
        //         .addHeader("Detta är en rubrik")
        //         .addParagraph("Detta är en paragraph")
        //         .addPlainText("Plaintext")
        //         .addFooter("Detta är en footer")
        //         .build().getText());

        // System.out.println("-------------------------------------------------");
        // List<DocumentInterface> document= facade.getFacade("html")
        //         .addHeader("Detta är en rubrik")
        //         .addParagraph("Detta är en paragraph")
        //         .addPlainText("Plaintext")
        //         .createList()
        //         .addListItem("1. Etta")
        //         .addListItem("2. Tvåa")
        //         .createList()
        //         .addListItem("1. Etta")
        //         .addListItem("2. Tvåa")
        //         .addListItem("3. Tre")
        //         .addFooter("Detta är en footer")
        //         .build().getList();
        // document.get(0).setText("<header> Ny Rubrik </header>");
        // document.forEach(e -> System.out.println(e.getText()));
    }
}