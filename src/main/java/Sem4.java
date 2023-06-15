

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sem4 {
    public static void main(String[] args) {
        Boolean run = true;
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<String> familia = new ArrayList<>();
        ArrayList<String> name= new ArrayList<>();
        ArrayList<String> batka = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        System.out.println("Введите фио, возраст и пол");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (run) {
            String str = scanner.nextLine();

            if (str.equals("q")) {
                System.out.println("Вышли)))");
                break;
            }

            String[] fio = str.split(" ");
            index.add(i);
            familia.add(fio[0]);
            name.add(fio[1]);
            batka.add(fio[2]);
            age.add(Integer.parseInt(fio[3]));
            gender.add(fio[4]);

            i++;
        }

        int max = age.get(0);
        for (int j = 0; j < age.size()-1; j++) {
            int temp;
            for (int k = 1; k < age.size()- 1 - j; k++) {
                if (age.get(k)>max) {
                    temp = index.get(k);

                }

            }

        }
        /*
//        scanner.close();
        for (String [] person : data) {
            char name = person[1].charAt(0);
            char batka = person[2].charAt(0);
            System.out.printf("%s %s.%s. %s %s \n", person[0], name, batka, person[3], person[4]);
        }
        System.out.println("Введите q для завершения или s для сортировки");
        String s;
        while (true){
            s = scanner.nextLine();
            if(s.equals("s")||s.equals("q")){
                break;
            }
        }
        if(s.equals("s")){
            data.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    int r = Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                    return r;
                }
            });
        }
        System.out.println();
        for (String [] person : data) {
            char name = person[1].charAt(0);
            char batka = person[2].charAt(0);
            System.out.printf("%s %s.%s. %s %s \n", person[0], name, batka, person[3], person[4]);
        }*/
    }
}
// 2 вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!
// 4. реализовать сортировку по возрасту с использованием индексов

