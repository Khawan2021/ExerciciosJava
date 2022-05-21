package Map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, Integer> estadosBrasileiros = new HashMap<>();

        estadosBrasileiros.put("São Paulo", 1);
        estadosBrasileiros.put("Rio de Jarneiro", 2);
        estadosBrasileiros.put("Minas Gerais", 3);
        estadosBrasileiros.put("Espírito Santo", 4);
        estadosBrasileiros.put("Rio Grande do Sul", 5);
        estadosBrasileiros.put("Santa Catarina", 6);
        estadosBrasileiros.put("Paraná", 7);
        estadosBrasileiros.put("Mato Grosso do Sul", 8);
        estadosBrasileiros.put("Goiás", 9);
        estadosBrasileiros.put("DF", 10);
        estadosBrasileiros.put("Tocantins", 11);
        estadosBrasileiros.put("Rio Grande do Norte", 12);
        estadosBrasileiros.put("Sergipe", 13);
        estadosBrasileiros.put("Alagoas", 14);
        estadosBrasileiros.put("Bahia", 15);
        estadosBrasileiros.put("Amapá", 16);
        estadosBrasileiros.put("Amazonas", 17);
        estadosBrasileiros.put("Mato Grosso do Norte", 18);
        estadosBrasileiros.put("Roraima", 19);
        estadosBrasileiros.put("Acre", 20);
        estadosBrasileiros.put("Curitiba", 21);
        estadosBrasileiros.put("Paraíba", 22);
        estadosBrasileiros.put("Maranhão", 23);
        estadosBrasileiros.put("Ceará", 24);
        estadosBrasileiros.put("Rondônia", 25);
        estadosBrasileiros.put("Piauí", 26);
        System.out.println(estadosBrasileiros);

        estadosBrasileiros.remove("Minas Gerais");
        System.out.println(estadosBrasileiros.size());
        estadosBrasileiros.remove("Mato Grosso do Sul");
        System.out.println(estadosBrasileiros.containsKey("Santa Catarina"));
        System.out.println(estadosBrasileiros.containsKey("Maranhão"));

        for(Map.Entry<String, Integer> entry : estadosBrasileiros.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        for(String key : estadosBrasileiros.keySet()){
            System.out.println(key + "--" + estadosBrasileiros.get(key));
        }

        System.out.println(estadosBrasileiros.containsKey("Estaddos Unidos"));
        System.out.println(estadosBrasileiros.containsValue(5));
        System.out.println(estadosBrasileiros.size());
        estadosBrasileiros.clear();
        System.out.println(estadosBrasileiros.size());
    }
}
