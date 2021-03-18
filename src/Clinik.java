import java.util.*;

public class Clinik {
    Map<Integer, Pets> petsMap = new HashMap<>();

    public void petAdd(Pets pets) {
        try {
            if (petsMap.putIfAbsent(pets.getNumber(),pets)!=null);
            throw new DuplicateItemsException("Такое животное уже существует");
        } catch (DuplicateItemsException dIE) {
            System.out.println(dIE.getMessage());
        }
    }
    public List<Pets>petsSer(String petName){

    }

  public void petsChan(Pets petsCh) {
        for (Pets pets: petsMap){

      }
  }

    public void petsSort() {

    }
}
