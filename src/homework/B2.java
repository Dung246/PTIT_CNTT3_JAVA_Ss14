package homework;

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> drugCatalog = new HashMap<>();
        drugCatalog.put("T01", "Paracetamol");
        drugCatalog.put("T02", "Ibuprofen");
        drugCatalog.put("T03", "Axxit amin");
        drugCatalog.put("T04", "Vitamin C");
        drugCatalog.put("T05", "Aspirin");

        System.out.print("Nhập tên thuốc: ");
        String drugCode = scanner.nextLine().trim().toUpperCase();
        if (drugCatalog.containsKey(drugCode)) {
            System.out.println("Tên thuốc: " + drugCatalog.get(drugCode));
        } else {
            System.out.println("Không tồn tại thuốc này");
        }
        scanner.close();
    }
}
