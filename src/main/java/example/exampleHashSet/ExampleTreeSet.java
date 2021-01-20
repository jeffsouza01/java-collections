package example.exampleHashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {

        TreeSet<String> stateList = new TreeSet<>();

        stateList.add("São Paulo");
        stateList.add("Quebec");
        stateList.add("Carapicuiba");
        stateList.add("Florianópolis");


        // Principal diferença para o TreeSet seria a ordenação
        System.out.println(stateList);

        System.out.println(
                stateList.size()
        );

        Iterator<String> newList = stateList.iterator();


        while (newList.hasNext()) {
            System.out.println(newList.next());
        }

        System.out.println(stateList.first());

        System.out.println(stateList.last());

        System.out.println(stateList.pollFirst());

        System.out.println(stateList);
    }
}
