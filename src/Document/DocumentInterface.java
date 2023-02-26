package Document;

import java.util.List;

import Document.Components.DocumentList;

public interface DocumentInterface{
 public void add(DocumentInterface d);
 public  void remove(DocumentInterface d);
 public DocumentInterface getChild(int index);
 public String getText();
 public void setText(String text);
 public void setTitle(String title);
 public DocumentList getLastList();
 public List<DocumentInterface> getList();
}
