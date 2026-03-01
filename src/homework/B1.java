package homework;
import java.util.*;

public class B1 {
    public static void main(String[] args) {
        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };

        Set<String> list = new LinkedHashSet<>();

        for (String name : input) {
            list.add(name);
        }

        System.out.println("Danh sách gọi khám:");
        for (String ten : list) {
            System.out.print(ten + ", ");
        }
    }
}
