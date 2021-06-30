package JC_HW4;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "12345");
        phonebook.add("Петров", "23456");
        phonebook.add("Петров", "34567");
        phonebook.add("Сидоров", "45678");
        phonebook.add("Иванов", "56789");
        phonebook.add("Максимов", "67890");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Информация из справочника");
        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Максимов"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Информация не из справочника");
        System.out.println(phonebook.get("Кукушкин"));
        System.out.println(phonebook.get("Мартышкин"));
        System.out.println("--------------------------");
        phonebook.add("Иванов", "12345");
    }
}
