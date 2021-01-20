package example.exampleHashSet;

import java.util.LinkedHashSet;

public class ExampleLinkedHash {

    public static void main(String[] args) {

        LinkedHashSet<Integer> anotherList = new LinkedHashSet<>();

        anotherList.add(2);
        anotherList.add(7);
        anotherList.add(1);
        anotherList.add(4);
        anotherList.add(9);

        System.out.println(anotherList);

        anotherList.remove(2);

        System.out.println(anotherList);
    }
}
