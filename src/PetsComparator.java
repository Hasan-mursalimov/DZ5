import java.util.Comparator;

public class PetsComparator implements Comparator<Pets> {
    @Override
    public int compare(Pets o1, Pets o2) {
        int res1=o1.getOwner().getName().compareTo(o2.getOwner().getName());
        int res2=o1.getNickname().compareTo(o2.getNickname());
        Integer res3=o1.getWeight().compareTo(o2.getWeight());
        return 0;
    }
}
