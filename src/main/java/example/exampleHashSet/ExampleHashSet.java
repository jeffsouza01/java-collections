package example.exampleHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExampleHashSet {

    public static void main(String[] args) {

      LinkedHashSet<Integer> numberList = new LinkedHashSet<>();

      numberList.add(3);
      numberList.add(88);
      numberList.add(20);
      numberList.add(44);
      numberList.add(3);


        Iterator<Integer> newLister = numberList.iterator();

        while (newLister.hasNext()) {
            System.out.println(newLister.next());
        }


        TreeSet<Integer> numberListUpdated = new TreeSet<>();


        numberListUpdated.pollFirst();

        numberListUpdated.add(23);

        numberListUpdated.size();

        numberListUpdated.isEmpty();
    }
}
