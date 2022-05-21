package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String,Integer> campoesMundialFifa = new HashMap<>();
        campoesMundialFifa.put("Brasil", 5);
        campoesMundialFifa.put("Alemanha", 4);
        campoesMundialFifa.put("Itália", 4);
        campoesMundialFifa.put("Uruguai", 2);
        campoesMundialFifa.put("Argentina", 2);
        campoesMundialFifa.put("França", 2);
        campoesMundialFifa.put("Inglaterra", 1);
        campoesMundialFifa.put("Espanha", 1);

        System.out.println(campoesMundialFifa);

        campoesMundialFifa.put("Brasil", 6);
        System.out.println(campoesMundialFifa);

        System.out.println(campoesMundialFifa.get("Argentina"));
        System.out.println(campoesMundialFifa.containsKey("França"));
        campoesMundialFifa.remove("França");
        System.out.println(campoesMundialFifa.containsKey("França"));
        System.out.println(campoesMundialFifa.containsValue(6));
        System.out.println(campoesMundialFifa.size());
        System.out.println(campoesMundialFifa);

        for(Map.Entry<String, Integer> entry : campoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        for(String key : campoesMundialFifa.keySet()){
            System.out.println(key + "--" + campoesMundialFifa.get(key));
        }

        System.out.println(campoesMundialFifa);
        System.out.println(campoesMundialFifa.containsKey("Estaddos Unidos"));
        System.out.println(campoesMundialFifa.containsValue(5));
        System.out.println(campoesMundialFifa.size());
        campoesMundialFifa.clear();
        System.out.println(campoesMundialFifa.size());
    }
}
