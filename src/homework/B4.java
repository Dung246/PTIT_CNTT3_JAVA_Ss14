package homework;
import java.util.*;
public class B4 {
    public static void main(String[] args) {
        List<String> diseaseList = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );
        Map<String, Integer> diseaseCount = new TreeMap<>();
        for (String disease : diseaseList) {
            diseaseCount.put(disease, diseaseCount.getOrDefault(disease, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : diseaseCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
