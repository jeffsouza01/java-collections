package example.exampleArrayList;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleArrayList {

    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();

        listNames.add("Jefferson");
        listNames.add("Adriana");
        listNames.add("Monique");
        listNames.add("Jamal");
        listNames.add("Dona Maria");
        listNames.add("Jordan");
        listNames.add("Xupirui");

        System.out.println(listNames);

        listNames.set(4, "Sheetaraa");

        Collections.sort(listNames);

        System.out.println(listNames);

        listNames.remove(5);

        System.out.println(listNames);

        listNames.remove("Xupirui");

        String oneName = listNames.get(2);

        int sizeList = listNames.size();

        System.out.println("Item incluso: " + oneName + "\nTamanho atual da Lista: " + sizeList);

        Boolean temAdriana = listNames.contains("Adriana");

        System.out.println(temAdriana);

        Boolean temXupiruda = listNames.contains("Xubiruda");

        System.out.println(temXupiruda);

        int listHashed = listNames.hashCode();

        int indexInfo = listNames.indexOf("Jefferson");

        System.out.println("Index Info: Jefferson position is " + indexInfo);

        System.out.println("Hashed list: "+ listHashed);

        System.out.println(
                "Print Add ALL" + listNames.addAll(listNames)
        );

        System.out.println("Lista Nomes: " + listNames);

        boolean emptyList = listNames.isEmpty();

        System.out.println(emptyList);

        Iterator<String> iterator = listNames.iterator();

        while (iterator.hasNext()) {
            System.out.println("--->>" + iterator.next());
        }


        for (String names: listNames) {
            System.out.println(names);
        }


        listNames.clear();

        emptyList = listNames.isEmpty();

        System.out.println(emptyList);




    }


}
