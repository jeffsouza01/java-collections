package example.comparators;

import java.util.Comparator;

public class EstudanteComparableReverseOrder implements Comparator<Estudante> {


    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getAge() - o1.getAge();
    }


}
