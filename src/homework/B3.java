package homework;

import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Set<String> drugIngredients = new HashSet<>(
                Arrays.asList("Aspirin", "Caffeine", "Paracetamol")
        );
        Set<String> allergyList = new HashSet<>(
                Arrays.asList("Penicillin", "Aspirin")
        );
        Set<String> allergicSubstances = new HashSet<>(drugIngredients);
        allergicSubstances.retainAll(allergyList);
        Set<String> safeIngredients = new HashSet<>(drugIngredients);
        safeIngredients.removeAll(allergyList);

        System.out.println("THuốc: " + allergicSubstances);
        System.out.println("Dị ứng: " + safeIngredients);
    }
}
