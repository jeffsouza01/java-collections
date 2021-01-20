package example.exampleQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Jamal");
        filaBanco.add("Jordan");
        filaBanco.add("Adriana");
        filaBanco.add("Monique");
        filaBanco.add("Jefferson");

        System.out.println(filaBanco);

        String first = filaBanco.peek();

        System.out.println(first);

    }
}
