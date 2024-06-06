import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 35);
        
        
        System.out.println("Recorrer el mapa usando stream:");
        ageMap.entrySet().stream()
            .forEach(entry -> System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue()));
    }
}
