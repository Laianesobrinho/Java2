import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçâ");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana"); // Duplicata ignorada

        System.out.println("Frutas no conjuno: " + frutas); //Ordem não garantida
    }
}