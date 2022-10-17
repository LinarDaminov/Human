
public class Main {
    public static void main(String[] args) {
        Human Maksim = new Human("Максим", 35, "Минск", "Бренд-менеджер" );
        Human Anna = new Human("Аня", 29, "Москва", "Методист образовательных программ");
        Human Katya = new Human("Катя", 28, "Калининград", "Продакт- менеджер");
        Human Artem = new Human("Артем", 27, "Москва", "Директор по развитию бизнеса");
        System.out.println(Maksim.toString());
        System.out.println(Anna.toString());
        System.out.println(Katya.toString());
        System.out.println(Artem.toString());

        Auto lada = new Auto("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Auto bmw = new Auto("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Auto kia = new Auto("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

    }
}
