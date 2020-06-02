import java.util.Collections;
import java.util.Comparator;

public class voyageurComparator implements Comparator<Voyageur>  {
    @Override
    public int compare(Voyageur o1, Voyageur o2) {
        if(o1.classe.ordinal() == o2.classe.ordinal()){
            if (o1.siegeNumber < o2.siegeNumber){
                return -1;
            }
            else {
                return 1;
            }
        }
        else {
            if(o1.classe.ordinal() < o2.classe.ordinal()){
                return -1;
            }
            else {
                return 1;
            }
        }

    }
}
