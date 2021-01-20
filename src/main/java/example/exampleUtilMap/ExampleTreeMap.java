package example.exampleUtilMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> estados = new TreeMap<>();

        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("DF", "Distrito Federal");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceara");


        String result = estados.get("Rio de Janeiro");

        estados.put(null, "São Paulo");

        System.out.println(estados);
        System.out.println("Result: " + result);

        System.out.println(estados.firstEntry());
        System.out.println(estados.firstKey());

        System.out.println(estados.lastEntry());
        System.out.println(estados.lastKey());

        System.out.println(
                "Lower Key of SP: " + estados.lowerKey("SP") +
                        " -- UpperKey: " + estados.higherKey("SP")
        );

        System.out.println(
                "Primeiro Valor: " +
                estados.firstEntry().getValue() + " - " +
                estados.firstEntry().getKey()
        );

        System.out.println(
                "Ultimo Valor: " +
                        estados.lastEntry().getValue() + " - " +
                        estados.lastEntry().getKey()
        );

        Map.Entry<String, String> firstEntry = estados.pollFirstEntry();
        Map.Entry<String, String> lastEntry = estados.pollLastEntry();

        System.out.println(estados);

        Iterator<String> iterator = estados.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(estados.get(key) + " - " + key );
        }

        for (String capital: estados.keySet()) {
            System.out.println(capital + " - " + estados.get(capital));
        }

        for (Map.Entry<String, String> capital: estados.entrySet()) {
            System.out.println(capital.getValue() + " -- " + capital.getKey());
        }


    }
}
