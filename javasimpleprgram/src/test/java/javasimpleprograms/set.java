package javasimpleprograms;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class set {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using an Iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Using for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
