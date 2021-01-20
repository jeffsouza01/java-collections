package example.exampleOptionals;

import java.util.Optional;

public class ExampleOptionals {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Optional value present");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não esta presente"));

        System.out.println("Valor opcional que não esta presente");

        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null - valor não presente"));

        System.out.println("--------------");

        System.out.println("Valor opcional vazia");
        Optional<String> optionalEmpty = Optional.empty();
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Empty - valor não esta presente"));

        System.out.println("--------------");
        System.out.println("Valor com erro");

        Optional<String> optionalError = Optional.of(null);
        optionalError.ifPresentOrElse(System.out::println, () -> System.out.println("Error"));



    }
}
