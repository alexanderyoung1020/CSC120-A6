/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;

    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  public int nResidents() {
    return residents.size();
  }

  public void moveIn(String name) {
    residents.add(name);
  }

public String moveOut(String name) {
    residents.remove(name);
    return name;
  }

public boolean isResident(String person) {
    return residents.contains(person);
  }



  public static void main(String[] args) {
    // new House();
  }

}