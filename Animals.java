package JC_HW4;
import java.util.*;
public class Animals {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elk");
        animals.add("Beaver");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Elk");
        animals.add("Beaver");
        animals.add("Bear");
        animals.add("Bear");
        Set<String> unique = new HashSet<>(animals);
        System.out.println("Виды животных: " + unique.toString());
        for (String key : unique) {
            System.out.println("Количество животных " + key +": " + Collections.frequency(animals, key));
        }
    }

}
