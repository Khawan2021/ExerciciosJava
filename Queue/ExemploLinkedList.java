package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Patrícia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        String ClienteAserAtendido = filaDeBanco.poll();

        System.out.println(ClienteAserAtendido);

        System.out.println(filaDeBanco);

        String primeiroCliente = filaDeBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);

        String primeiroClienteOuErro = filaDeBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaDeBanco);

        for(String client: filaDeBanco){
            System.out.println(client);
        }
        Iterator<String> iteratoFiladebanco = filaDeBanco.iterator();
        while (iteratoFiladebanco.hasNext()){
            System.out.println( "--->"+ iteratoFiladebanco.next());
        }
        System.out.println(filaDeBanco.size());
        System.out.println(filaDeBanco.isEmpty());
    }
}
