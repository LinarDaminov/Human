public class Main {

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
        System.out.println();
        Auto lada = new Auto("lada", "Granta", 1.7, "Желтый", 2015, "Россия", "седан");
                Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "седан");
        Auto bmw = new Auto("BMW", "Z8", 3.0, "черный", 2021, "Германия", "седан");
        Auto kia = new Auto("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "седан");
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "седан");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

        Flowers rose = new Flowers("Роза", "", "Голландия", 35.590, 2);
        Flowers chrysanthemum = new Flowers("Хризантема", "", "", 15.003025, 5);
        Flowers peony = new Flowers("Пион", "", "Англия", 69.9968, 1);
        Flowers gypsophila = new Flowers("Гипсофила", "", "Турция", 19.5012, 10);
        System.out.println(rose.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(peony.toString());
        System.out.println(gypsophila.toString());


        lada.setPlace(5);
        lada.setTransmission("Механика");



        bmw.setPlace(4);

        bmw.setTransmission("Автомат");
    }


}






