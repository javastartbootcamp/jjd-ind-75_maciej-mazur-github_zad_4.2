package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task("Sprzątanie", "Sprzątanie pokojów i łazienek",
                50, new Person("Jan", "Kowalski"));
        Task task2 = new Task("Odkurzanie", "Odkurzanie odkurzaczem i ścieranie kurzów", -20);
        Task task3 = new Task("Zakupy", "Zakupy spożywcze i odzieżowe");

        System.out.println("Czy task1 ma wysoki priorytet?\t\t" + task1.highPriority());
        System.out.println("Czy task1 ma średni priorytet?\t\t" + task1.mediumPriority());
        System.out.println("Czy task1 ma niski priorytet?\t\t" + task1.lowPriority());
        System.out.println("**********************************");
        System.out.println("Czy task2 ma wysoki priorytet?\t\t" + task2.highPriority());
        System.out.println("Czy task2 ma średni priorytet?\t\t" + task2.mediumPriority());
        System.out.println("Czy task2 ma niski priorytet?\t\t" + task2.lowPriority());
        System.out.println("**********************************");
        System.out.println("Czy task3 ma wysoki priorytet?\t\t" + task3.highPriority());
        System.out.println("Czy task3 ma średni priorytet?\t\t" + task3.mediumPriority());
        System.out.println("Czy task3 ma niski priorytet?\t\t" + task3.lowPriority());
    }
}
