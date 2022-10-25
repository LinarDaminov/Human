public class MainForAuto {
    public static void main(String[] args) {

        Car lada = new Car("lada", "Granta", 1.7, "Желтый", 2015, "Россия", "седан");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "седан");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "седан");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "седан");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "седан");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }
}















