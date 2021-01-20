package example.comparators;
import java.util.*;

public class ExampleComparator {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Jefferson", 28));
        estudantes.add(new Estudante("Adriana", 40));
        estudantes.add(new Estudante("Monique", 14));
        estudantes.add(new Estudante("Jamal", 5));
        estudantes.add(new Estudante("Jordan", 3));
        estudantes.add(new Estudante("Astolfo", 12));
        estudantes.add(new Estudante("Magali", 19));

        System.out.println(estudantes);

        // Usando em função lambda
        estudantes.sort((first, second) -> first.getAge() - second.getAge());
        System.out.println(estudantes);

        //Ordem contraria
        estudantes.sort((first, second) -> second.getAge() - first.getAge());
        System.out.println(estudantes);

        // Using comparator
        estudantes.sort(Comparator.comparingInt(Estudante::getAge));
        System.out.println(estudantes);



        estudantes.sort(Comparator.comparingInt(Estudante::getAge).reversed());
        System.out.println(estudantes);

        //Ordem natural com interface comparable
        Collections.sort(estudantes);

        System.out.println(estudantes);

        // interface comparable reverso

        Collections.sort(estudantes, new EstudanteComparableReverseOrder());
        System.out.println(estudantes);
    }
}
