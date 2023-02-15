package Document;

public class Facade {

    public DocumentBuilder getFacade(String input){
        if(input == "html")
            return new DocumentBuilder(new HTMLDocument());
        else
            return null;

    }

}
