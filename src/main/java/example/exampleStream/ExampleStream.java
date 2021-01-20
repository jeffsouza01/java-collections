package example.exampleStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExampleStream {

    public static void main(String[] args) {

        List<String> pessoas = new ArrayList<>();

        pessoas.add("Jefferson");
        pessoas.add("Adriana");
        pessoas.add("Monique");
        pessoas.add("Jamal");
        pessoas.add("Jordan");

        System.out.println("Contagem: " + pessoas.stream().count());

        System.out.println("Maior Numero de letras: " + pessoas.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor Numero de letras: " + pessoas.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Retorna list com pessoas que tenham 'J' no nome: " +
                pessoas.stream().filter((pessoa) -> pessoa.toLowerCase().contains("j")).collect(Collectors.toList()));

        System.out.println("Agrupa nome com a quantidade de letras: " +
                pessoas.stream().map(pessoa -> pessoa.concat(" - ").concat(String.valueOf(pessoa.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os 2 primeiros elementos - Setado pelo limitador: " + pessoas.stream().limit(2).collect(Collectors.toList()));

        System.out.println("Retorno dos elementos com peek: " +
                pessoas.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorno de elementos com ForEach: ");
        pessoas.stream().forEach(System.out::println);


        System.out.println("Todos as pessoas tem A no nome? " + pessoas.stream().allMatch(el -> el.contains("a")));

        System.out.println("Alguma pessoa tem J no nome? " + pessoas.stream().anyMatch(el -> el.toLowerCase().contains("j")));

        System.out.println("Nenhuma pessoa tem Z no nome? " + pessoas.stream().noneMatch(el -> el.contains("z")));

        System.out.println("Retorna o primeiro valor da coleção: ");
        pessoas.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Encadeamento de operações: ");


        System.out.println(pessoas.stream()
            .peek(System.out::println)
                .map(pessoa ->
                        pessoa.concat(" - ").concat(String.valueOf(pessoa.length())))
                .peek(System.out::println)
                .filter(pessoa ->
                        pessoa.toLowerCase().contains("j"))
                // coletores possiveis
//                .collect(Collectors.toList())
//                .collect(Collectors.joining(", "))
//                .collect(Collectors.toSet())
                .collect(Collectors.groupingBy(pessoa -> pessoa.substring(pessoa.indexOf("-") + 1)))
        );


    }
}
