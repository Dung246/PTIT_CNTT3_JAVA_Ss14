package homework;
import java.util.*;

class PatientRecord {
    String name;
    int age;
    String department;

    public PatientRecord(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

public class B6 {
    public static void main(String[] args) {

        List<PatientRecord> patientList = Arrays.asList(
                new PatientRecord("Lan", 30, "Tim mạch"),
                new PatientRecord("Hùng", 45, "Nội tiết"),
                new PatientRecord("Mai", 28, "Tim mạch")
        );
        Map<String, List<PatientRecord>> departmentMap = new HashMap<>();
        for (PatientRecord p : patientList) {
            departmentMap
                    .computeIfAbsent(p.department, k -> new ArrayList<>())
                    .add(p);
        }
        for (String dept : departmentMap.keySet()) {
            System.out.println("Khoa " + dept + " -> " + departmentMap.get(dept));
        }
        String busiestDept = null;
        int max = 0;
        for (Map.Entry<String, List<PatientRecord>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > max) {
                max = entry.getValue().size();
                busiestDept = entry.getKey();
            }
        }
        System.out.println("Khoa " + busiestDept + " đang đông nhất (" + max + " bệnh nhân)");
    }
}
