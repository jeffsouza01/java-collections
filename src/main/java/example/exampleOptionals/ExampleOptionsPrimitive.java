package example.exampleOptionals;

import java.io.OptionalDataException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExampleOptionsPrimitive {

    public static void main(String[] args) {

        System.out.println("-Valor decimal opcional -");
        OptionalDouble.of(55.3).ifPresent(System.out::println);
        System.out.println("-Valor inteiro opcional -");
        OptionalInt.of(22).ifPresent(System.out::println);
        System.out.println("-Valor longo opcional -");
        OptionalLong.of(15L).ifPresent(System.out::println);

    }
}
