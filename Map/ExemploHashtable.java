package Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashtable {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        estudantes.remove("Pedro");
        System.out.println(estudantes);

        int idadeEstudantes = estudantes.get("Mariana");
        System.out.println(idadeEstudantes);
        System.out.println(estudantes.size());

        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        for (String key : estudantes.keySet()){
            System.out.println(key + "--" + estudantes.get(key));
        }
    }
}
