import java.util.*;

public class Clinik {
    Map<Integer, Pets> petsMap = new HashMap<>();

    public Map<Integer, Pets> petAdd(Pets pets) {
        try {
            if (petsMap.putIfAbsent(pets.getNumber(), pets) != null) ;
            throw new DuplicateItemsException("Такое животное уже существует");
        } catch (DuplicateItemsException dIE) {
            System.out.println(dIE.getMessage());
        }
        return petsMap;
    }

    List<Pets> petsSer(String petName) {
        List<Pets> list = new ArrayList<>();
        for (Map.Entry<Integer, Pets> entry : petsMap.entrySet()) {
            if (entry.getValue().getNickname().equals(petName)) {
                list.add(entry.getValue());
            }
        }
        return list;
    }

    public void petsChan(int number,String name,int weight) {
        if (!name.equals(""))petsMap.get(number).setNickname(name);
        if (weight!=0)petsMap.get(number).setWeight(weight);
    }

    public Map<Integer,Pets> petsSort() {
        List<Pets>list=new ArrayList<>();
        Collections.sort(list,Comparator.comparing(Pets::getNickname).thenComparing(Pets::getWeight));
        for (Pets pet:list){
            System.out.println(pet);
        }
        return petsMap;
    }
}
