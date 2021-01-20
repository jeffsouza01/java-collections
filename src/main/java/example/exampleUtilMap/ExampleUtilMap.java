package example.exampleUtilMap;

import java.util.HashMap;
import java.util.Map;

public class ExampleUtilMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa  =new HashMap<>();

        // Adicionando valores
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);


        System.out.println(campeoesMundialFifa);

        //Atualizando o valor
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        //retornando valor expecifico
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // Retorna se existe a chave informada
        System.out.println("Contem o França: " + campeoesMundialFifa.containsKey("Franca"));


        // Retorna se existe o valor informado
        System.out.println("Possui o valor 6:" + campeoesMundialFifa.containsValue(6));

        // Remoção
        campeoesMundialFifa.remove("França");

        // Retorna o tamanho do mapa
        System.out.println("Tamanho do mapa: " + campeoesMundialFifa.size());


        // Navegando entre os registros

        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

        for (String value : campeoesMundialFifa.keySet()) {
            System.out.println(value + " < -- > " + campeoesMundialFifa.get(value));
        }

    }
}
