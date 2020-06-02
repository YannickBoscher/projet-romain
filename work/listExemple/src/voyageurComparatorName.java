import java.util.Comparator;

public class voyageurComparatorName implements Comparator<Voyageur> {
    @Override
    public int compare(Voyageur o1, Voyageur o2) {

            return (o1.name.compareTo(o2.name));

    }
}
