import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> telBook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        Boolean run = true;
        while (run) {
            String str = scanner.nextLine();
            if (str.equals("q")) {
                System.out.println("Вышли)))");
                break;
            }
            String[] person = str.split(" ");
            telBook.putIfAbsent(person[0], new ArrayList<>());
            telBook.get(person[0]).add(person[1]);

        }

        System.out.println(telBook);


    }
}
