package JavaOOPs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task12_LambdaWithCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Anita");
        names.add("David");
        names.add("Arjun");

        System.out.println("All names:");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nNames starting with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));

        System.out.println("\nSorted names alphabetically:");
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames, (a, b) -> a.compareTo(b));
        sortedNames.forEach(name -> System.out.println(name));
    }
}
