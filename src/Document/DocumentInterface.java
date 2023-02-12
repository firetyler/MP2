package Document;

public interface DocumentInterface{
 public void add(DocumentInterface d);
 public  void remove(DocumentInterface d);
 public DocumentInterface getChild(int index);
 public String getText();
}
