public class MainForHuman {
    public static void main(String[] args) {
        Human Maksim = new Human("Максим", 35, "Минск", "Бренд-менеджер");
        Human Anna = new Human("Аня", 29, "Москва", "Методист образовательных программ");
        Human Katya = new Human("Катя", 28, "Калининград", "Продакт- менеджер");
        Human Artem = new Human("Артем", 27, "Москва", "Директор по развитию бизнеса");
        Human Vladimir = new Human("Владимир", 21, "Казань", "Безработный");

        System.out.println(Maksim.toString());
        System.out.println(Anna.toString());
        System.out.println(Katya.toString());
        System.out.println(Artem.toString());
        System.out.println(Vladimir.toString());
    }
}
