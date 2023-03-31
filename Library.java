/* This is a stub for the Library class */
import java.util.Hashtable; 

public class Library extends Building {
  private Hashtable<String, Boolean> collection; 

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
    }
    
    public void addTitle(String title){
      this.collection.put(title, true);
    }
    public String removeTitle(String title){
      Boolean removed = this.collection.remove(title);
      if (removed == null){
        return null; 
      } else {
        return title; 
      }
    }
    public void checkOut(String title){
      this.collection.replace(title,false);

    }

    public void returnBook(String title){
      this.collection.replace(title, true);
    }

    public boolean containsTitle(String title){
      return collection.containsKey(title); 
    }

    public boolean isAvailable(String title){
      if (containsTitle(title)){
        return collection.get(title);
      } else {
        return false;
      }
    }
    
    public void printCollection(){
      for(String title: collection.keySet()){
        String status = collection.get(title) ? "Available" : "Checked out";
        System.out.println(title + ": " + status);
      }
    }

    public static void main(String[] args) {
      // new Library();
    }
  
  }