package Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Document implements DocumentInterface {
    Optional<List<String>> document;
    String header ;
    String footer;
    String paragraph;
    String colum;
    String row;
    String headLine;
    String body;
    String Table;

    public Document(Optional <List<String>> document, String header, String footer, String paragraph, String colum, String row, String headLine, String body, String table) {
        this.document = document;
        this.header = header;
        this.footer = footer;
        this.paragraph = paragraph;
        this.colum = colum;
        this.row = row;
        this.headLine = headLine;
        this.body = body;
        Table = table;
    }

    public Document() {
    }

    /**
     *
     */
    @Override
    public void addHeader() {

    }

    /**
     *
     */
    @Override
    public void removeHeader() {

    }

    /**
     *
     */
    @Override
    public void addParagraph() {

    }

    /**
     *
     */
    @Override
    public void removeParagraph() {

    }

    /**
     *
     */
    @Override
    public void addList() {

    }

    /**
     *
     */
    @Override
    public void removeList() {

    }

    /**
     *
     */
    @Override
    public void addTable() {

    }

    /**
     *
     */
    @Override
    public void removeTable() {

    }

    /**
     *
     */
    @Override
    public void addColum() {

    }

    /**
     *
     */
    @Override
    public void removeColum() {

    }

    /**
     *
     */
    @Override
    public void addRow() {

    }

    /**
     *
     */
    @Override
    public void removeRow() {

    }

    /**
     *
     */
    @Override
    public void addHeadLine() {

    }

    /**
     *
     */
    @Override
    public void removeHeadLine() {

    }

    /**
     *
     */
    @Override
    public void addFooter() {

    }

    /**
     *
     */
    @Override
    public void removeFooter() {

    }

    /**
     *
     */
    @Override
    public void body() {

    }

    /**
     *
     */
    @Override
    public void removebody() {

    }
}
