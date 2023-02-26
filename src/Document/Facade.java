package Document;

public class Facade {

    public DocumentBuilder getFacade(String input){
        if(input == "html")
            return new DocumentBuilder(new DocumentFactory(new HTMLDocument()));
        else if(input == "markDown")
            return new DocumentBuilder(new DocumentFactory(new Markdown()));
        else
            return null;
    }

}
