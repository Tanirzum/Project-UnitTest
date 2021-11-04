import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<MilitaryPerson> unit = Arrays.asList(
                new MilitaryPerson("Макс", 25, Rank.Старшина),
                new MilitaryPerson("Вова", 33, Rank.Майор),
                new MilitaryPerson("Петя", 50, Rank.Генерал),
                new MilitaryPerson("Иван", 18, Rank.Рядовой),
                new MilitaryPerson("Саша", 22, Rank.Сержант));

        Comparator<MilitaryPerson> nameFilter = new NameFilter();
        Comparator<MilitaryPerson> ageFilter = new AgeFilter();
        Comparator<MilitaryPerson> rankFilter = new RankFilter();


        while (true) {
            System.out.println(
                            "Сортировка по имени:1 \n" +
                            "Сортировка по возрасту:2 \n" +
                            "Сортировка по рангу:3");

            int value = scanner.nextInt();

            if (value == 1) {
                unit.sort(nameFilter);
                for (MilitaryPerson element : unit) {
                    System.out.println(element);
                }
            } else if (value == 2) {
                unit.sort(ageFilter);
                for (MilitaryPerson element : unit) {
                    System.out.println(element);
                }
            } else if (value == 3) {
                unit.sort(rankFilter);
                for (MilitaryPerson element : unit) {
                    System.out.println(element);
                }
            }
        }
    }
}
